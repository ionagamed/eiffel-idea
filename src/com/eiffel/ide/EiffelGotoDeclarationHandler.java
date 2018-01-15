package com.eiffel.ide;

import com.eiffel.psi.*;
import com.intellij.codeInsight.navigation.actions.GotoDeclarationHandlerBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

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
        if (grandparent.getNode().getElementType().equals(EiffelTypes.UNQUALIFIED_CALL)) {
            PsiElement result = getFeatureDeclarationByUnqualifiedCallElement(grandparent, editor);
            if (result != null) return result;
            result = getLocalDeclarationByGrandparent(grandparent, editor);
            if (result != null) return result;
            result = getCreationProcedureDeclarationByGrandparent(grandparent, editor);
            if (result != null) return result;
            result = getFormalArgumentByGrandparent(grandparent, editor);
            if (result != null) return result;
        }
        if (grandparent.getNode().getElementType().equals(EiffelTypes.VARIABLE)) {
            PsiElement result = getLocalDeclarationByGrandparent(grandparent, editor);
            if (result != null) return result;
            result = getFeatureDeclarationByPlainName(grandparent, editor);
            if (result != null) return result;
            result = getFormalArgumentByGrandparent(grandparent, editor);
            if (result != null) return result;
        }

        if (parent.getNode().getElementType().equals(EiffelTypes.FEATURE_NAME))
            return getFeatureDeclarationByPlainName(parent, editor);
        return null;
    }

    private PsiElement getFormalArgumentByGrandparent(PsiElement grandparent, Editor editor) {
        EiffelFeatureDeclaration featureDeclaration = EiffelClassUtil.findFeatureDeclaration(grandparent);
        if (featureDeclaration == null) return null;
        return featureDeclaration.getArgument(grandparent.getText());
    }

    private PsiElement getClassByNameElement(PsiElement nameElement, Editor editor) {
        return EiffelClassUtil.findClassDeclaration(editor.getProject(), nameElement.getText());
    }

    private PsiElement getFeatureDeclarationByUnqualifiedCallElement(PsiElement unqualifiedCall, Editor editor) {
        String currentClass = EiffelClassUtil.findParentingClassForFeatureCall(editor.getProject(), unqualifiedCall);
        if (currentClass == null) return null;

        ASTNode featureName = unqualifiedCall.getNode().findChildByType(EiffelTypes.FEATURE_NAME);
        if (featureName == null) return null;

        EiffelClassDeclaration currentClassDeclaration = EiffelClassUtil.findClassDeclaration(editor.getProject(), currentClass);
        if (currentClassDeclaration == null) return null;

        return currentClassDeclaration.getNewFeature(featureName.getText());
    }

    private PsiElement getLocalDeclarationByGrandparent(PsiElement grandparent, Editor editor) {
        ASTNode featureDeclarationNode = EiffelClassUtil.findParentOfType(grandparent.getNode(), EiffelTypes.FEATURE_DECLARATION);
        if (featureDeclarationNode == null) return null;
        EiffelFeatureDeclaration featureDeclaration = featureDeclarationNode.getPsi(EiffelFeatureDeclaration.class);
        return featureDeclaration.getLocal(grandparent.getText());
    }

    private PsiElement getFeatureDeclarationByPlainName(PsiElement featureName, Editor editor) {
        EiffelClassDeclaration classDeclaration = EiffelClassUtil.findClassDeclaration(featureName);
        if (classDeclaration == null) return null;

        String currentClass = classDeclaration.getName();
        if (currentClass == null) return null;

        return EiffelClassUtil.findFeatureIntroduction(editor.getProject(), currentClass, featureName.getText());
    }

    private PsiElement getCreationProcedureDeclarationByGrandparent(PsiElement grandparent, Editor editor) {
        if (grandparent instanceof EiffelUnqualifiedCall) {
            PsiElement instruction = grandparent.getParent();
            if (instruction instanceof EiffelCreationInstruction) {
                PsiElement variable = ((EiffelCreationInstruction) instruction).getVariable();
                EiffelClassDeclaration declaration = EiffelClassUtil.findClassDeclaration(variable);
                if (variable == null || declaration == null) return null;
                EiffelFeature target = declaration.getNewFeature(variable.getText());
                if (target == null) return null;
                EiffelFeatureName featureName = ((EiffelUnqualifiedCall) grandparent).getFeatureName();
                if (featureName == null) return null;
                return EiffelClassUtil.findFeatureIntroduction(
                        editor.getProject(),
                        target.getTypeString(),
                        featureName.getText()
                );
            }
        }
        return null;
    }
}
