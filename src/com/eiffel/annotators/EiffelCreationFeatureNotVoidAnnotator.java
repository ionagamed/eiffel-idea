package com.eiffel.annotators;

import com.eiffel.ide.quickfix.EiffelRemoveElementsQuickFix;
import com.eiffel.psi.*;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Creation features must not have a return value
 */
public class EiffelCreationFeatureNotVoidAnnotator extends EiffelNewFeatureAnnotatorBase {
    @Override
    protected void annotate_impl(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        final String featureName = element.getText();
        EiffelClassDeclaration currentClass = EiffelClassUtil.findClassDeclaration(element);
        if (currentClass == null) return;
        EiffelNewFeature creationFeature = currentClass.getNewFeature(featureName);
        if (creationFeature == null) return;
        if (!currentClass.getCreationProcedures().contains(creationFeature)) return;

        if (creationFeature.getTypeString() != null) {
            EiffelFeatureDeclaration featureDeclaration = creationFeature.getFeatureDeclaration();
            EiffelType type = featureDeclaration.getType();
            PsiElement colon = type;
            do {
                colon = colon.getPrevSibling();
            } while (colon != null && !colon.getNode().getElementType().equals(EiffelTypes.COLON));
            if (colon == null)
                holder.createWarningAnnotation(element.getTextRange(), "Creation feature with return value")
                        .registerFix(new EiffelRemoveElementsQuickFix("Remove return value", Arrays.asList(type)));
            else
                holder.createWarningAnnotation(element.getTextRange(), "Creation feature with return value")
                        .registerFix(new EiffelRemoveElementsQuickFix("Remove return value", Arrays.asList(type, colon)));
        }
    }
}
