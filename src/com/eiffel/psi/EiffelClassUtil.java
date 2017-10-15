package com.eiffel.psi;

import com.eiffel.EiffelSourceFileType;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class EiffelClassUtil {
    public static List<EiffelClassDeclaration> findClassDeclarations(Project project) {
        return findClassDeclarationsWithPrefix(project, "");
    }

    public static List<EiffelClassDeclaration> findClassDeclarationsWithPrefix(Project project, String prefix) {
        List<EiffelClassDeclaration> result = new ArrayList<>();

        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, EiffelSourceFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));

        for (VirtualFile virtualFile : virtualFiles) {
            EiffelFile file = (EiffelFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                EiffelClassDeclaration[] classDeclarations = PsiTreeUtil.getChildrenOfType(file, EiffelClassDeclaration.class);
                if (classDeclarations != null && classDeclarations.length > 0) {
                    for (EiffelClassDeclaration declaration : classDeclarations) {
                        if (declaration.getName().startsWith(prefix)) {
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
        Collection<VirtualFile> virtualFiles =
                FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, EiffelSourceFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));

        for (VirtualFile virtualFile : virtualFiles) {
            EiffelFile file = (EiffelFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                EiffelClassDeclaration[] classDeclarations = PsiTreeUtil.getChildrenOfType(file, EiffelClassDeclaration.class);
                if (classDeclarations != null && classDeclarations.length > 0) {
                    for (EiffelClassDeclaration declaration : classDeclarations) {
                        if (declaration.getName().equals(name)) {
                            return declaration;
                        }
                    }
                }
            }
        }

        return null;
    }

    public static List<String> findFeatureNames(Project project, String className) {
        List<String> result = new ArrayList<>();
        EiffelClassDeclaration classDeclaration = findClassDeclaration(project, className);
        if (classDeclaration == null) return result;
        ASTNode features = classDeclaration.getNode().findChildByType(EiffelTypes.FEATURES);
        if (features == null) return result;
        ASTNode[] featureClauses = features.getChildren(TokenSet.create(EiffelTypes.FEATURE_CLAUSE));
        for (ASTNode featureClause : featureClauses) {
            ASTNode featureDeclarationList = featureClause.findChildByType(EiffelTypes.FEATURE_DECLARATION_LIST);
            if (featureDeclarationList == null) continue;
            ASTNode[] featureDeclarations = featureDeclarationList.getChildren(TokenSet.create(EiffelTypes.FEATURE_DECLARATION));
            for (ASTNode featureDeclaration : featureDeclarations) {
                ASTNode newFeatureList = featureDeclaration.findChildByType(EiffelTypes.NEW_FEATURE_LIST);
                if (newFeatureList == null) continue;
                ASTNode[] newFeatures = newFeatureList.getChildren(TokenSet.create(EiffelTypes.NEW_FEATURE));
                for (ASTNode newFeature : newFeatures) {
                    ASTNode extFeatureName = newFeature.findChildByType(EiffelTypes.EXTENDED_FEATURE_NAME);
                    if (extFeatureName == null) continue;
                    ASTNode featureName = extFeatureName.findChildByType(EiffelTypes.FEATURE_NAME);
                    if (featureName == null) continue;
                    result.add(featureName.getText());
                }
            }
        }
        return result;
    }

    public static EiffelFeatureDeclaration findFeatureDeclaration(Project project, String className, String feature) {
        EiffelClassDeclaration classDeclaration = findClassDeclaration(project, className);
        if (classDeclaration == null) return null;
        ASTNode features = classDeclaration.getNode().findChildByType(EiffelTypes.FEATURES);
        if (features == null) return null;
        ASTNode[] featureClauses = features.getChildren(TokenSet.create(EiffelTypes.FEATURE_CLAUSE));
        for (ASTNode featureClause : featureClauses) {
            ASTNode featureDeclarationList = featureClause.findChildByType(EiffelTypes.FEATURE_DECLARATION_LIST);
            if (featureDeclarationList == null) continue;
            ASTNode[] featureDeclarations = featureDeclarationList.getChildren(TokenSet.create(EiffelTypes.FEATURE_DECLARATION));
            for (ASTNode featureDeclaration : featureDeclarations) {
                ASTNode newFeatureList = featureDeclaration.findChildByType(EiffelTypes.NEW_FEATURE_LIST);
                if (newFeatureList == null) continue;
                ASTNode[] newFeatures = newFeatureList.getChildren(TokenSet.create(EiffelTypes.NEW_FEATURE));
                for (ASTNode newFeature : newFeatures) {
                    ASTNode extFeatureName = newFeature.findChildByType(EiffelTypes.EXTENDED_FEATURE_NAME);
                    if (extFeatureName == null) continue;
                    ASTNode featureName = extFeatureName.findChildByType(EiffelTypes.FEATURE_NAME);
                    if (featureName == null) continue;
                    if (feature.equals(featureName.getText())) {
                        return featureDeclaration.getPsi(EiffelFeatureDeclaration.class);
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static String findFeatureReturnType(Project project, String className, String feature) {
        EiffelFeatureDeclaration featureDeclaration = findFeatureDeclaration(project, className, feature);
        if (featureDeclaration == null) return null;
        ASTNode declarationBody = featureDeclaration.getNode().findChildByType(EiffelTypes.DECLARATION_BODY);
        if (declarationBody == null) return null;
        ASTNode queryMark = declarationBody.findChildByType(EiffelTypes.QUERY_MARK);
        if (queryMark == null) return null;
        ASTNode typeMark = queryMark.findChildByType(EiffelTypes.TYPE_MARK);
        if (typeMark == null) return null;
        ASTNode type = typeMark.findChildByType(EiffelTypes.TYPE);
        if (type == null) return null;
        return type.getText();
    }

    @Nullable
    public static String findSerializedFeatureFormalArguments(Project project, String className, String feature) {
        EiffelFeatureDeclaration featureDeclaration = findFeatureDeclaration(project, className, feature);
        if (featureDeclaration == null) return null;
        ASTNode declarationBody = featureDeclaration.getNode().findChildByType(EiffelTypes.DECLARATION_BODY);
        if (declarationBody == null) return null;
        ASTNode formalArguments = declarationBody.findChildByType(EiffelTypes.FORMAL_ARGUMENTS);
        if (formalArguments == null) return null;
        return formalArguments.getText();
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
        while (currentNode != null && !currentNode.getElementType().equals(EiffelTypes.COMPOUND)) {
            if (currentNode.getElementType().equals(EiffelTypes.OBJECT_CALL)) {
                processingStack.push(currentNode);
            }
            currentNode = currentNode.getTreeParent();
        }

        String currentClass = currentClassDeclaration.getName();
        while (!processingStack.empty()) {
            ASTNode objectCall = processingStack.pop();
            ASTNode target = objectCall.findChildByType(EiffelTypes.TARGET_NO_LEFT);
            if (target == null) return null;
            ASTNode currentUnqualifiedCall = target.findChildByType(EiffelTypes.UNQUALIFIED_CALL);
            if (currentUnqualifiedCall == null) return null;
            ASTNode currentFeatureName = currentUnqualifiedCall.findChildByType(EiffelTypes.FEATURE_NAME);
            if (currentFeatureName == null) return null;
            currentClass = EiffelClassUtil.findFeatureReturnType(project, currentClass, currentFeatureName.getText());
            if (currentClass == null) return null;
        }

        return currentClass;
    }
}
