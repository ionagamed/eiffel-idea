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

import java.util.Map;

public class EiffelFeatureNameCompletionUtil extends EiffelCompletionUtilBase {
    @Override
    public void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        ASTNode objectCall = getObjectCallAncestor(parameters.getPosition());
        if (objectCall == null) return;
        final Project project = parameters.getEditor().getProject();
        String className = EiffelTypeResolutionUtil.getTypeString(project, objectCall.getPsi(EiffelObjectCall.class), true);
        if (className == null) return;
        addFeatureNamesForClassInContext(project, className, parameters.getPosition(), result);
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
