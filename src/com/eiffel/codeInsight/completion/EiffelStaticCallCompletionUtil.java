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

import java.util.Map;

public class EiffelStaticCallCompletionUtil extends EiffelCompletionUtilBase {
    @Override
    public void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
        EiffelNonObjectCall call = getNonObjectCallAncestor(parameters.getPosition());
        if (call == null) return;
        String type = call.getType().getText();
        addFeatureNamesForClassInContext(parameters.getEditor().getProject(), type, call, result);
    }

    @Nullable
    private EiffelNonObjectCall getNonObjectCallAncestor(PsiElement element) {
        PsiElement current = element;
        for (int i = 0; i < 3; i++) {
            current = current.getParent();
            if (current == null) return null;
        }
        if (current instanceof EiffelNonObjectCall) {
            return (EiffelNonObjectCall) current;
        } else {
            return null;
        }
    }
}
