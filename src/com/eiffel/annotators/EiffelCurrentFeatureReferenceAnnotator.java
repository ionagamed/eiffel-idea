package com.eiffel.annotators;

import com.eiffel.psi.*;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class EiffelCurrentFeatureReferenceAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (isApplicable(element)) {
            EiffelClassDeclaration classDeclaration = EiffelClassUtil.findClassDeclaration(element);
            if (classDeclaration == null) return;
            if (classDeclaration.getFeatureNames().contains(element.getText())) {
                Annotation annotation = holder.createInfoAnnotation(element.getTextRange(), null);
//                annotation.setTextAttributes(DefaultLanguageHighlighterColors.);
            }
        }
    }

    private boolean isApplicable(PsiElement element) {
        PsiElement p = element.getParent();
        if (p == null) return false;
        PsiElement gp = p.getParent();
        if (gp == null) return false;
        PsiElement ggp = gp.getParent();
        if (ggp == null) return false;
        PsiElement gggp = ggp.getParent();
        return !(gggp instanceof EiffelObjectCall) && !(ggp instanceof EiffelNewFeature) && element.getNode().getElementType().equals(EiffelTypes.IDENTIFIER);
    }
}
