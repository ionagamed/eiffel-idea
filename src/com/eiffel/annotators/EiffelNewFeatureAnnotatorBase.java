package com.eiffel.annotators;

import com.eiffel.psi.EiffelNewFeature;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public abstract class EiffelNewFeatureAnnotatorBase implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (isApplicable(element)) {
            annotate_impl(element, holder);
        }
    }

    private boolean isApplicable(PsiElement element) {
        PsiElement p = element.getParent();
        if (p == null) return false;
        PsiElement gp = p.getParent();
        if (gp == null) return false;
        return gp instanceof EiffelNewFeature;
    }

    protected abstract void annotate_impl(@NotNull PsiElement element, @NotNull AnnotationHolder holder);
}
