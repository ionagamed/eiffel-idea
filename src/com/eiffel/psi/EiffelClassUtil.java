package com.eiffel.psi;

import com.eiffel.EiffelSourceFileType;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class EiffelClassUtil {
    public static String formalizeName(String name) {
        if (name == null) return null;
        return name
                .replace("like", "$") // HACK well, you see it
                .replace(" ", "")
                .replace("[", " [")
                .replace(",", ", ")
                .replace(":", ": ")
                .replace(";", "; ")
                .replace("$", " like ");
    }

    public static String ungenerify(String className) {
        if (className == null) return null;
        return className.replaceAll("\\[.*]", "").trim();
    }

    public static List<EiffelClassDeclaration> findClassDeclarations(Project project) {
        return findClassDeclarationsWithPrefix(project, "");
    }

    public static List<EiffelClassDeclaration> findClassDeclarationsWithPrefix(Project project, String prefix) {
        List<EiffelClassDeclaration> result = new ArrayList<>();

        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(EiffelSourceFileType.INSTANCE, GlobalSearchScope.allScope(project));

        for (VirtualFile virtualFile : virtualFiles) {
            EiffelFile file = (EiffelFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                EiffelClassDeclaration[] classDeclarations = PsiTreeUtil.getChildrenOfType(file, EiffelClassDeclaration.class);
                if (classDeclarations != null && classDeclarations.length > 0) {
                    for (EiffelClassDeclaration declaration : classDeclarations) {
                        if (formalizeName(declaration.getName()).startsWith(prefix)) {
                            result.add(declaration);
                        }
                    }
                }
            }
        }

        return result;
    }

    /**
     * Find class declaration from any child element
     * @param element - child element
     * @return - ancestor class declaration
     */
    public static EiffelClassDeclaration findClassDeclaration(PsiElement element) {
        ASTNode classDeclaration = findParentOfType(element.getNode(), EiffelTypes.CLASS_DECLARATION);
        if (classDeclaration == null) return null;
        return classDeclaration.getPsi(EiffelClassDeclaration.class);
    }

    public static EiffelClassDeclaration findClassDeclaration(Project project, String name) {
        Collection<EiffelClassDeclaration> declarations = StubIndex.getElements(EiffelStubIndexKeys.CLASS_DECLARATION_KEY, ungenerify(name), project, GlobalSearchScope.allScope(project), EiffelClassDeclaration.class);
        if (declarations.size() == 0) return null;
        return declarations.toArray(new EiffelClassDeclaration[1])[0];
    }

    public static EiffelFeatureDeclaration findFeatureDeclaration(Project project, String className, String feature) {
        EiffelClassDeclaration classDeclaration = findClassDeclaration(project, className);
        if (classDeclaration == null) return null;
        List<EiffelFeatureDeclaration> featureDeclarations = classDeclaration.getFeatureDeclarations();
        for (EiffelFeatureDeclaration featureDeclaration : featureDeclarations) {
            for (EiffelNewFeature newFeature : featureDeclaration.getNewFeatureList()) {
                if (newFeature.getFeatureName().getText().equals(feature)) {
                    return featureDeclaration;
                }
            }
        }
        return null;
    }

    @Nullable
    public static String findFeatureReturnType(Project project, String className, String feature) {
        EiffelFeatureDeclaration featureDeclaration = findFeatureDeclaration(project, className, feature);
        if (featureDeclaration == null) return null;
        EiffelType typeList = featureDeclaration.getType();
        if (typeList != null) {
            return typeList.getText();
        }
        return null;
    }

    @Nullable
    public static ASTNode findParentOfType(ASTNode node, IElementType type) {
        while (node != null) {
            if (node.getElementType().equals(type)) {
                break;
            }
            node = node.getTreeParent();
        }
        return node;
    }

    @Nullable
    public static String findParentingClassForFeatureCall(Project project, PsiElement unqualifiedCall) {
        return EiffelTypeResolutionUtil.getTypeString(project, unqualifiedCall);
    }
}
