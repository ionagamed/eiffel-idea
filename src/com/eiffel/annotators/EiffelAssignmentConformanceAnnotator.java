package com.eiffel.annotators;

import com.eiffel.psi.*;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class EiffelAssignmentConformanceAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof EiffelAssignment) {
            EiffelVariable variable = ((EiffelAssignment) element).getVariable();
            EiffelExpression expression = ((EiffelAssignment) element).getExpression();

            String variableTypeString = EiffelTypeResolutionUtil.getTypeString(variable.getProject(), variable);
            if (variableTypeString == null) return;
            EiffelClassDeclaration variableType = EiffelClassUtil.findClassDeclaration(
                    variable.getProject(),
                    variableTypeString
            );

            String expressionTypeString = EiffelTypeResolutionUtil.getTypeString(expression.getProject(), expression);
            if (expressionTypeString == null) return;
            EiffelClassDeclaration expressionType = EiffelClassUtil.findClassDeclaration(
                    expression.getProject(),
                    expressionTypeString
            );

            if (expressionType == null || variableType == null) return;

            if (!expressionType.isAncestorOf(variableType) && !expressionType.equals(variableType)) {
                holder.createErrorAnnotation(
                        expression,
                        "Type {" + expressionTypeString + "} of expression does not conform to type {" + variableTypeString + "} of assignment target"
                );
            }
        }
    }
}
