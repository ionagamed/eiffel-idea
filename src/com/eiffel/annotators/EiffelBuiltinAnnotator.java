package com.eiffel.annotators;

import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class EiffelBuiltinAnnotator implements Annotator {
    private ArrayList<String> builtins = new ArrayList<>(Arrays.asList(
            "INTEGER", "STRING", "TUPLE", "REAL", "BOOLEAN"
    ));

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (builtins.contains(element.getText())) {
            Annotation annotation = holder.createInfoAnnotation(element.getTextRange(), null);
            annotation.setTextAttributes(DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
        }
    }
}
