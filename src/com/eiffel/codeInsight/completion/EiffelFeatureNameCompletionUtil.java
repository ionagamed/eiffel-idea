package com.eiffel.codeInsight.completion;

import com.eiffel.psi.*;
import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.lookup.LookupElementPresentation;
import com.intellij.codeInsight.lookup.LookupElementRenderer;
import com.intellij.icons.AllIcons;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;

import java.util.List;
import java.util.Map;

public class EiffelFeatureNameCompletionUtil implements IEiffelCompletionUtil {
    @Override
    public void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        ASTNode objectCall = getObjectCallAncestor(parameters.getPosition());
        if (objectCall == null) return;
        final Project project = parameters.getEditor().getProject();
        String className = EiffelTypeResolutionUtil.getTypeString(project, objectCall.getPsi(EiffelObjectCall.class), true);
        if (className == null) return;
        EiffelClassDeclaration classDeclaration = EiffelClassUtil.findClassDeclaration(project, className);
        if (classDeclaration == null) return;
        String ctxName = EiffelClassUtil.findClassDeclaration(objectCall.getPsi()).getName();
        Map<EiffelNewFeature, Integer> newFeatures = classDeclaration.getAllNewFeaturesInContextWithDepth(ctxName);
        for (EiffelNewFeature newFeature : newFeatures.keySet()) {
            final String formalArguments = newFeature.getSerializedFormalArguments();
            final String returnType = newFeature.getTypeString();
            final int priority = newFeatures.get(newFeature);
            final String name = newFeature.getName();
            final String doc = newFeature.getCommentDoc();
            LookupElement lookupElement = LookupElementBuilder
                    .create(name + (formalArguments == null ? "" : "("))
                    .withRenderer(new LookupElementRenderer<LookupElement>() {
                        @Override
                        public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                            presentation.setIcon(AllIcons.Nodes.Function);
                            presentation.setItemText(EiffelClassUtil.formalizeName(name));
                            if (priority == 0) {
                                presentation.setItemTextBold(true);
                            }
                            presentation.setTailText(
                                    (formalArguments == null ? "" : EiffelClassUtil.formalizeName(formalArguments)) +
                                            (doc == null ? "" : " " + doc)
                            );
                            presentation.setTypeText(returnType);
                        }
                    });
            result.addElement(PrioritizedLookupElement.withPriority(
                    lookupElement, EiffelCompletionPriorities.THRESHOLD - priority
            ));
        }
    }

    private ASTNode getObjectCallAncestor(PsiElement element) {
        if (!element.getNode().getElementType().equals(EiffelTypes.IDENTIFIER)) {
            return null;
        }
        if (element.getNode().getTreeParent() == null) return null;
        if (element.getNode().getTreeParent().getTreeParent() == null) return null;
        if (element.getNode().getTreeParent().getTreeParent().getTreeParent() == null) return null;
        ASTNode ancestor = element.getNode().getTreeParent().getTreeParent().getTreeParent();
        if (ancestor.getElementType().equals(EiffelTypes.OBJECT_CALL)) {
            return ancestor;
        } else {
            return null;
        }
    }
}
