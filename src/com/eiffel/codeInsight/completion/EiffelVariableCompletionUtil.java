package com.eiffel.codeInsight.completion;

import com.eiffel.psi.*;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.PrioritizedLookupElement;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.lookup.LookupElementPresentation;
import com.intellij.codeInsight.lookup.LookupElementRenderer;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.Nullable;

public class EiffelVariableCompletionUtil implements IEiffelCompletionUtil {
    @Override
    public void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        EiffelVariable variable = getVariableAncestor(parameters.getPosition());
        if (variable == null) return;
        EiffelClassDeclaration classDeclaration = EiffelClassUtil.findClassDeclaration(variable);
        if (classDeclaration == null) return;
        // TODO: create only creatable variables
        for (EiffelNewFeature newFeature : classDeclaration.getNewFeatures()) {
            final String name = newFeature.getName();
            final String type = newFeature.getReturnTypeString();
            LookupElement lookupElement = LookupElementBuilder.create(name)
                    .withRenderer(new LookupElementRenderer<LookupElement>() {
                        @Override
                        public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                            presentation.setItemText(name);
                            presentation.setItemTextBold(true);
                            presentation.setTypeText(type);
                        }
                    });
            result.addElement(PrioritizedLookupElement.withPriority(
                    lookupElement, EiffelCompletionPriorities.VARIABLES
            ));
        }
    }

    @Nullable
    private EiffelVariable getVariableAncestor(PsiElement element) {
        PsiElement parent = element.getParent();
        if (parent == null) return null;
        PsiElement grandparent = parent.getParent();
        if (grandparent == null) return null;
        if (grandparent instanceof EiffelVariable) {
            return (EiffelVariable) grandparent;
        }
        return null;
    }
}
