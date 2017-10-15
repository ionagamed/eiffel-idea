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
        String currentClass = EiffelClassUtil.findParentingClassForFeatureCall(editor.getProject(), unqualifiedCall);
        if (currentClass == null) return null;

        ASTNode featureName = unqualifiedCall.getNode().findChildByType(EiffelTypes.FEATURE_NAME);
        if (featureName == null) return null;

        return EiffelClassUtil.findFeatureDeclaration(editor.getProject(), currentClass, featureName.getText());
    }
}
