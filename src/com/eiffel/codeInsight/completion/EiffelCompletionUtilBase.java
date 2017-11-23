package com.eiffel.codeInsight.completion;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelClassUtil;
import com.eiffel.psi.EiffelNewFeature;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.PrioritizedLookupElement;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.codeInsight.lookup.LookupElementPresentation;
import com.intellij.codeInsight.lookup.LookupElementRenderer;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;

import java.util.Map;

public abstract class EiffelCompletionUtilBase {
    abstract void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result);

    protected void addFeatureNamesForClassInContext(Project project, String className, String context, CompletionResultSet result) {
        EiffelClassDeclaration classDeclaration = EiffelClassUtil.findClassDeclaration(project, className);
        if (classDeclaration == null) return;
        Map<EiffelNewFeature, Integer> newFeatures = classDeclaration.getAllNewFeaturesInContextWithDepth(context);
        for (EiffelNewFeature newFeature : newFeatures.keySet()) {
            final String formalArguments = newFeature.getSerializedFormalArguments();
//            final String formalArguments = null;
            final String doc = null;
//            final String returnType = null;
            final String returnType = newFeature.getTypeString();
            final int priority = newFeatures.get(newFeature);
            final String name = newFeature.getName();
//            final String doc = newFeature.getCommentDoc();
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

    protected void addFeatureNamesForClassInContext(Project project, String className, PsiElement contextElement, CompletionResultSet result) {
        addFeatureNamesForClassInContext(project, className, EiffelClassUtil.findClassDeclaration(contextElement).getName(), result);

    }
}
