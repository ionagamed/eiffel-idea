package com.eiffel.codeInsight.completion;

import com.eiffel.psi.EiffelClassUtil;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.EiffelUnqualifiedCall;
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
        ASTNode unqualifiedCall = getUnqualifiedCallGrandparent(parameters.getPosition());
        if (unqualifiedCall == null) return;
        final Project project = parameters.getEditor().getProject();
        String className = EiffelClassUtil.findParentingClassForFeatureCall(project, unqualifiedCall.getPsi(EiffelUnqualifiedCall.class));
        if (className == null) return;
        List<String> featureNames = EiffelClassUtil.findFeatureNames(project, className);
        for (String featureName : featureNames) {
            final String formalArguments = EiffelClassUtil.findSerializedFeatureFormalArguments(project, className, featureName);
            final String returnType = EiffelClassUtil.findFeatureReturnType(project, className, featureName);
            result.addElement(
                    LookupElementBuilder
                            .create(featureName + (formalArguments == null ? "" : "("))
                            .withRenderer(new LookupElementRenderer<LookupElement>() {
                                @Override
                                public void renderElement(LookupElement element, LookupElementPresentation presentation) {
                                    presentation.setIcon(AllIcons.Nodes.Function);
                                    presentation.setItemText(featureName);
                                    presentation.setItemTextBold(true);
                                    presentation.setTailText(formalArguments);
                                    presentation.setTypeText(returnType);
                                }
                            })
            );
        }
    }

    private static ASTNode getUnqualifiedCallGrandparent(PsiElement element) {
        if (!element.getNode().getElementType().equals(EiffelTypes.IDENTIFIER)) {
            return null;
        }
        if (element.getNode().getTreeParent() == null) return null;
        if (element.getNode().getTreeParent().getTreeParent() == null) return null;
        ASTNode grandparent = element.getNode().getTreeParent().getTreeParent();
        if (grandparent.getElementType().equals(EiffelTypes.UNQUALIFIED_CALL)) {
            return grandparent;
        } else {
            return null;
        }
    }
}
