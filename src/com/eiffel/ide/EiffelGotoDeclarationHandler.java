package com.eiffel.ide;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelClassUtil;
import com.eiffel.psi.EiffelTypes;
import com.intellij.codeInsight.navigation.actions.GotoDeclarationHandlerBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

import java.util.Stack;

public class EiffelGotoDeclarationHandler extends GotoDeclarationHandlerBase {
    @Nullable
    @Override
    public PsiElement getGotoDeclarationTarget(@Nullable PsiElement element, Editor editor) {
        if (element == null) return null;

        PsiElement parent = element.getParent();
        if (parent == null) return null;
        if (parent.getNode().getElementType().equals(EiffelTypes.CLASS_NAME))
            return getClassByNameElement(element, editor);

        PsiElement grandparent = parent.getParent();
        if (grandparent == null) return null;
        if (grandparent.getNode().getElementType().equals(EiffelTypes.UNQUALIFIED_CALL))
            return getFeatureDeclarationByUnqualifiedCallElement(grandparent, editor);

        return null;
    }

    private PsiElement getClassByNameElement(PsiElement nameElement, Editor editor) {
        return EiffelClassUtil.findClassDeclaration(editor.getProject(), nameElement.getText());
    }

    private PsiElement getFeatureDeclarationByUnqualifiedCallElement(PsiElement unqualifiedCall, Editor editor) {
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
            currentClass = EiffelClassUtil.findFeatureReturnType(editor.getProject(), currentClass, currentFeatureName.getText());
            if (currentClass == null) return null;
        }

        ASTNode featureName = unqualifiedCall.getNode().findChildByType(EiffelTypes.FEATURE_NAME);
        if (featureName == null) return null;

        return EiffelClassUtil.findFeatureDeclaration(editor.getProject(), currentClass, featureName.getText());
    }
}
