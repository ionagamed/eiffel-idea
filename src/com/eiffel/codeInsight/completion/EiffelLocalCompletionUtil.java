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
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;

public class EiffelLocalCompletionUtil {
    public static void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        PsiElement element = parameters.getPosition();
        if (element.getNode().getElementType().equals(EiffelTypes.IDENTIFIER)) {
            ASTNode featureDeclarationNode = EiffelClassUtil.findParentOfType(parameters.getPosition().getNode(), EiffelTypes.FEATURE_DECLARATION);
            if (featureDeclarationNode == null) return;
            EiffelFeatureDeclaration featureDeclaration = featureDeclarationNode.getPsi(EiffelFeatureDeclaration.class);
            for (EiffelEntityIdentifier local : featureDeclaration.getLocalEntityIdentifiers()) {
                final String type = local.getType();
                LookupElement lookupElement = LookupElementBuilder.create(local.getText())
                        .withRenderer(new LookupElementRenderer<LookupElement>() {
                            @Override
                            public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                                presentation.setItemText(local.getText());
                                presentation.setTypeText(type);
                                presentation.setItemTextBold(true);
                                presentation.setIcon(AllIcons.Nodes.Field);
                            }
                        });
                result.addElement(PrioritizedLookupElement.withPriority(
                        lookupElement, EiffelCompletionPriorities.LOCALS
                ));
            }
        }
    }
}
