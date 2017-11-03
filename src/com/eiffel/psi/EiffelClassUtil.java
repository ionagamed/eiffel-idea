package com.eiffel.psi;

import com.eiffel.EiffelSourceFileType;
import com.eiffel.model.EiffelClassModel;
import com.eiffel.model.EiffelFeatureModel;
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
import com.intellij.util.indexing.FileBasedIndex;
import org.apache.commons.lang.NotImplementedException;
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
        Collection<EiffelClassDeclaration> declarations = StubIndex.getElements(EiffelStubIndexKeys.CLASS_DECLARATION_KEY, name, project, GlobalSearchScope.allScope(project), EiffelClassDeclaration.class);
        if (declarations.size() == 0) return null;
        return declarations.toArray(new EiffelClassDeclaration[1])[0];
    }

    public static List<String> findFeatureNames(Project project, String className) {
        EiffelClassDeclaration declaration = findClassDeclaration(project, className);
        if (declaration == null) return Collections.emptyList();
        return declaration.getFeatureNames();
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

    public static String findFeatureDocstring(Project project, String className, String feature) {
        EiffelFeatureDeclaration declaration = findFeatureDeclaration(project, className, feature);
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
    public static String findSerializedFeatureFormalArguments(Project project, String className, String feature) {
        EiffelFeatureDeclaration featureDeclaration = findFeatureDeclaration(project, className, feature);
        if (featureDeclaration == null) return null;
        EiffelFormalArguments formalArguments = featureDeclaration.getFormalArguments();
        if (formalArguments != null) {
            return formalizeName(formalArguments.getText());
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
        EiffelClassDeclaration currentClassDeclaration = EiffelClassUtil.findClassDeclaration(unqualifiedCall);
        if (currentClassDeclaration == null) return null;

        Stack<ASTNode> processingStack = new Stack<>();
        ASTNode storedObjectCall = EiffelClassUtil.findParentOfType(unqualifiedCall.getNode(), EiffelTypes.OBJECT_CALL);
        if (storedObjectCall == null) return null;
        ASTNode currentNode = storedObjectCall.getTreeParent();
        while (currentNode != null && !currentNode.getElementType().equals(EiffelTypes.INSTRUCTION)) {
            if (currentNode.getElementType().equals(EiffelTypes.OBJECT_CALL)) {
                processingStack.push(currentNode);
            }
            currentNode = currentNode.getTreeParent();
        }

        String currentClass = currentClassDeclaration.getName();
        while (!processingStack.empty()) {
            ASTNode objectCall = processingStack.pop();
//            ASTNode target = objectCall.findChildByType(EiffelTypes.TARGET_NO_LEFT);
//            if (target == null) return null;
//            ASTNode currentUnqualifiedCall = target.findChildByType(EiffelTypes.UNQUALIFIED_CALL);
//            if (currentUnqualifiedCall == null) return null;
//            ASTNode currentFeatureName = currentUnqualifiedCall.findChildByType(EiffelTypes.FEATURE_NAME);
//            if (currentFeatureName == null) return null;
//            currentClass = EiffelClassUtil.findFeatureReturnType(project, currentClass, currentFeatureName.getText());
//            if (currentClass == null) return null;
        }

        return currentClass;
    }

    public static String getType(Project project, PsiElement element) {
        return null;
    }
}
