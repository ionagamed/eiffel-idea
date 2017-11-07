package com.eiffel.codeInsight.completion;

import com.eiffel.psi.*;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.InsertHandler;
import com.intellij.codeInsight.completion.InsertionContext;
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

public class EiffelFeatureNameCompletionUtil {
    public static void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        ASTNode objectCall = getObjectCallAncestor(parameters.getPosition());
        if (objectCall == null) return;
        final Project project = parameters.getEditor().getProject();
        String className = EiffelTypeResolutionUtil.getTypeString(project, objectCall.getPsi(EiffelObjectCall.class), true);
        if (className == null) return;
        EiffelClassDeclaration classDeclaration = EiffelClassUtil.findClassDeclaration(project, className);
        if (classDeclaration == null) return;
        String ctxName = EiffelClassUtil.findClassDeclaration(objectCall.getPsi()).getName();
        List<EiffelNewFeature> newFeatures = classDeclaration.getAllNewFeatures(ctxName);
        for (EiffelNewFeature newFeature : newFeatures) {
            final String formalArguments = newFeature.getSerializedFormalArguments();
            final String returnType = newFeature.getReturnTypeString();
            result.addElement(
                    LookupElementBuilder
                            .create(newFeature.getName() + (formalArguments == null ? "" : "("))
                            .withRenderer(new LookupElementRenderer<LookupElement>() {
                                @Override
                                public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                                    presentation.setIcon(AllIcons.Nodes.Function);
                                    presentation.setItemText(EiffelClassUtil.formalizeName(newFeature.getName()));
                                    presentation.setItemTextBold(true);
                                    presentation.setTailText(EiffelClassUtil.formalizeName(formalArguments));
                                    presentation.setTypeText(returnType);
                                }
                            })
            );
        }
    }

    private static ASTNode getObjectCallAncestor(PsiElement element) {
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
