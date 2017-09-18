package com.eiffel.annotators;

import com.eiffel.psi.EiffelTypes;
import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;

public class EiffelClassNameAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (EiffelAnnotatorHelpers.hasParentTokenType(element, EiffelTypes.CLASS_NAME)) {
            Annotation annotation = holder.createInfoAnnotation(element.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.CLASS_NAME);
        }
    }
}
