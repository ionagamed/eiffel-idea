package com.eiffel.codeInsight.completion;

import com.eiffel.EiffelLanguage;
import com.eiffel.psi.EiffelTypes;
import com.intellij.codeInsight.completion.*;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class EiffelCompletionContributor extends CompletionContributor {
    private List<EiffelCompletionUtilBase> completionUtils;

    public EiffelCompletionContributor() {
        completionUtils = Arrays.asList(
                new EiffelClassNameCompletionUtil(),
                new EiffelFeatureNameCompletionUtil(),
                new EiffelLocalCompletionUtil(),
                new EiffelVariableCompletionUtil(),
                new EiffelCreationProcedureCompletionUtil(),
                new EiffelFormalArgsCompletionContributor(),
                new EiffelStaticCallCompletionUtil()
        );
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
                        for (EiffelCompletionUtilBase util : completionUtils) {
                            util.addCompletions(parameters, context, resultSet);
                        }
                    }
                }
        );
    }
}
