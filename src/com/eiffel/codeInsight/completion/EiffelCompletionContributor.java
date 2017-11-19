package com.eiffel.codeInsight.completion;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelLocal;
import com.eiffel.psi.EiffelTypes;
import com.intellij.codeInsight.completion.*;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiManager;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class EiffelCompletionContributor extends CompletionContributor {
    public EiffelCompletionContributor() {
        extend(
                CompletionType.BASIC,
                PlatformPatterns.psiElement()
                        .withElementType(TokenSet.create(
                                EiffelTypes.IDENTIFIER
                        ))
                        .withLanguage(EiffelLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    @Override
                    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context, @NotNull CompletionResultSet resultSet) {
                        EiffelClassNameCompletionUtil.addCompletions(parameters, context, resultSet);
                        EiffelFeatureNameCompletionUtil.addCompletions(parameters, context, resultSet);
                        EiffelLocalCompletionUtil.addCompletions(parameters, context, resultSet);
                    }
                }
        );
    }
}
