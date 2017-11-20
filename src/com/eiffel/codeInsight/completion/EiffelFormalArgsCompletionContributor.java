package com.eiffel.codeInsight.completion;

import com.eiffel.psi.*;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.PrioritizedLookupElement;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.lookup.LookupElementPresentation;
import com.intellij.codeInsight.lookup.LookupElementRenderer;
import com.intellij.icons.AllIcons;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;

public class EiffelFormalArgsCompletionContributor implements IEiffelCompletionUtil {
    @Override
    public void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        PsiElement element = parameters.getPosition();
        if (isApplicable(element)) {
            EiffelFeatureDeclaration featureDeclaration = EiffelClassUtil.findFeatureDeclaration(element);
            if (featureDeclaration == null) return;
            for (EiffelEntityIdentifier identifier : featureDeclaration.getFormalArgumentIdentifiers()) {
                final String name = identifier.getText();
                final String type = identifier.getType();
                LookupElement lookupElement = LookupElementBuilder
                        .create(name)
                        .withRenderer(new LookupElementRenderer<LookupElement>() {
                            @Override
                            public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                                presentation.setItemText(name);
                                presentation.setItemTextBold(true);
                                presentation.setTypeText(type);
                                presentation.setIcon(AllIcons.Nodes.Parameter);
                            }
                        });
                result.addElement(PrioritizedLookupElement.withPriority(
                        lookupElement, EiffelCompletionPriorities.ARGUMENTS
                ));
            }
        }
    }

    private boolean isApplicable(PsiElement element) {
        PsiElement parent = element.getParent();
        if (parent == null) return false;
        PsiElement grandparent = parent.getParent();
        if (grandparent == null) return false;
        if (grandparent instanceof EiffelVariable) return true;
        PsiElement ggp = grandparent.getParent();
        if (ggp == null) return false;
        if (ggp instanceof EiffelObjectCall) return true;
        return false;
    }
}
