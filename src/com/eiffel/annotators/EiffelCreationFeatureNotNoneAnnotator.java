package com.eiffel.annotators;

import com.eiffel.ide.quickfix.EiffelSetFeatureClientsQuickFix;
import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelClassUtil;
import com.eiffel.psi.EiffelFeatureClause;
import com.eiffel.psi.EiffelNewFeature;
import com.intellij.lang.annotation.Annotation;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Creation features must be with NONE visibility
 * For it not to be called explicitly without object creation
 */
public class EiffelCreationFeatureNotNoneAnnotator extends EiffelNewFeatureAnnotatorBase {
    @Override
    public void annotate_impl(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        final String featureName = element.getText();
        EiffelClassDeclaration currentClass = EiffelClassUtil.findClassDeclaration(element);
        if (currentClass == null) return;
        EiffelNewFeature creationFeature = currentClass.getNewFeature(featureName);
        if (creationFeature == null) return;
        if (!currentClass.getCreationProcedures().contains(creationFeature)) return;

        if (!creationFeature.getClientNames().equals(new HashSet<>(Collections.singletonList("NONE")))) {
            holder.createWarningAnnotation(element.getTextRange(), "Creation feature with non-NONE visibility")
                    .registerFix(new EiffelSetFeatureClientsQuickFix("NONE", creationFeature.getFeatureDeclaration()));
        }
    }
}
