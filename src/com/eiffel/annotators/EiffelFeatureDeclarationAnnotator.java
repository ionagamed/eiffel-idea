package com.eiffel.annotators;

import com.eiffel.psi.EiffelTypes;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class EiffelFeatureDeclarationAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (EiffelAnnotatorHelpers.hasParentTokenType(element, EiffelTypes.NEW_FEATURE) &&
                element.getNode().getElementType().equals(EiffelTypes.FEATURE_NAME)) {
            Annotation annotation = holder.createInfoAnnotation(element.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
        }
    }
}
