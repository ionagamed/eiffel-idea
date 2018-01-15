package com.eiffel.psi;

import com.eiffel.EiffelSourceFileType;
import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;

public class EiffelClassUtil {
    private static String bindingMap(String name) {
        if (name.equals("INTEGER")) name = "INTEGER_32";
        if (name.equals("CHARACTER")) name = "CHARACTER_8";
        if (name.equals("STRING")) name = "STRING_8";
        return name;
    }

    public static String formalizeName(String name) {
        if (name == null) return null;
        name = bindingMap(name);
        return name
                .replace("like", "$like$") // HACK well, you see it
                .replace("detachable", "$det$")
                .replace("separate", "$sep$")
                .replace(" ", "")
                .replace("[", " [")
                .replace(",", ", ")
                .replace(":", ": ")
                .replace(";", "; ")
                .replace("$like$", "like ")
                .replace("$det$", " detachable ")
                .replace("$sep$", " separate ");
    }

    public static String ungenerify(String className) {
        if (className == null) return null;
        className = bindingMap(className);
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

    public static List<String> findClassDeclarationNames(Project project) {
        return (List<String>)
                StubIndex.getInstance().getAllKeys(EiffelStubIndexKeys.SYMBOLS_KEY, project)
                        .stream()
                        .filter((Object s) -> !((String)s).contains("."))
                        .collect(Collectors.toList());
    }

    /**
     * Find class declaration from any child element
     * @param element - child element
     * @return ancestor class declaration
     */
    @NotNull
    public static EiffelClassDeclaration findClassDeclaration(PsiElement element) {
        ASTNode classDeclaration = findParentOfType(element.getNode(), EiffelTypes.CLASS_DECLARATION);
        return classDeclaration.getPsi(EiffelClassDeclaration.class);
    }

    /**
     * Find feature declaration from any element (closest ancestor)
     * @param element - child element
     * @return ancestor feature declaration
     */
    public static EiffelFeatureDeclaration findFeatureDeclaration(PsiElement element) {
        ASTNode featureDeclaration = findParentOfType(element.getNode(), EiffelTypes.FEATURE_DECLARATION);
        if (featureDeclaration == null) return null;
        return featureDeclaration.getPsi(EiffelFeatureDeclaration.class);
    }

    public static EiffelClassDeclaration findClassDeclaration(Project project, String name) {
        Collection<EiffelClassDeclaration> declarations = StubIndex.getElements(
                EiffelStubIndexKeys.SYMBOLS_KEY,
                ungenerify(name),
                project,
                GlobalSearchScope.allScope(project),
                EiffelClassDeclaration.class
        );
        if (declarations.size() == 0) return null;
        return declarations.toArray(new EiffelClassDeclaration[1])[0];
    }

    public static EiffelNewFeature findFeatureIntroduction(Project project, String className, String feature) {
        EiffelClassDeclaration classDeclaration = findClassDeclaration(project, className);
        if (classDeclaration == null) return null;
        for (EiffelFeature newFeature : classDeclaration.getAllNewFeatures()) {
            if (newFeature.getFinalName().equals(feature)) {
                if (newFeature instanceof EiffelNewFeature) {
                    return (EiffelNewFeature) newFeature;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    @Nullable
    public static String findFeatureReturnType(Project project, String className, String feature) {
        EiffelClassDeclaration classDeclaration = findClassDeclaration(project, className);
        if (classDeclaration == null) return null;
        EiffelFeature newFeature = classDeclaration.getNewFeature(feature);
        if (newFeature == null) return null;
        return newFeature.getTypeString();
//        if (className.equals("APPLICATION")) {
//            return "STD_FILES";
//        }
//        return null;
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
        return EiffelTypeResolutionUtil.getTypeString(project, unqualifiedCall, true);
        // TODO: -
//        return "STD_FILES";
    }

    @Nullable
    public static EiffelTypedElement findReferencedElementInContext(PsiElement reference) {
        final String name = reference.getText();
        EiffelFeatureDeclaration featureDeclaration = findFeatureDeclaration(reference);
        if (featureDeclaration != null) {
            EiffelEntity identifier = featureDeclaration.getLocal(name);
            if (identifier != null) return identifier;
            identifier = featureDeclaration.getArgument(name);
            if (identifier != null) return identifier;
        }
        EiffelClassDeclaration classDeclaration = findClassDeclaration(reference);
        if (classDeclaration != null) {
            EiffelFeature feature = classDeclaration.getNewFeature(name);
            if (feature != null) return feature;
        }
        return null;
    }
}
