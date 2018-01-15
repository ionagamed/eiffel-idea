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
import org.jetbrains.annotations.Nullable;

public class EiffelCreationProcedureCompletionUtil extends EiffelCompletionUtilBase {
    @Override
    public void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        EiffelCreationInstruction instruction = getCreationInstruction(parameters.getPosition());
        if (instruction == null) return;
        EiffelVariable variable = instruction.getVariable();
        if (variable == null) return;
        EiffelClassDeclaration declaration = EiffelClassUtil.findClassDeclaration(variable);
        if (declaration == null) return;
        EiffelTypedElement contextElement = EiffelClassUtil.findReferencedElementInContext(variable);
        if (contextElement == null) return;
        EiffelClassDeclaration contextClass = EiffelClassUtil.findClassDeclaration(parameters.getEditor().getProject(), contextElement.getTypeString());
        if (contextClass == null) return;
        for (EiffelFeature creationFeature : contextClass.getCreationProcedures()) {
            final String name = creationFeature.getFinalName();
            final String formals = creationFeature.getSerializedArguments();
            final String doc = creationFeature.getCommentDoc();
            LookupElement lookupElement = LookupElementBuilder.create(name)
                    .withRenderer(new LookupElementRenderer<LookupElement>() {
                        @Override
                        public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                            presentation.setItemText(name);
                            presentation.setItemTextBold(true);
                            presentation.setTailText(
                                    (formals == null ? "" : formals) +
                                            (doc == null ? "" : " " + doc)
                            );
                            presentation.setIcon(AllIcons.Nodes.AbstractClass); // just because it has 'C' in it
                        }
                    });
            result.addElement(PrioritizedLookupElement.withPriority(
                    lookupElement, EiffelCompletionPriorities.CREATION_CALLS
            ));
        }
    }

    @Nullable
    private EiffelCreationInstruction getCreationInstruction(PsiElement element) {
        PsiElement featureName = element.getParent();
        if (featureName == null) return null;
        PsiElement unqualifiedCall = featureName.getParent();
        if (unqualifiedCall == null) return null;
        PsiElement creationInstruction = unqualifiedCall.getParent();
        if (creationInstruction == null) return null;
        if (creationInstruction instanceof EiffelCreationInstruction) {
            return (EiffelCreationInstruction) creationInstruction;
        }
        return null;
    }
}
