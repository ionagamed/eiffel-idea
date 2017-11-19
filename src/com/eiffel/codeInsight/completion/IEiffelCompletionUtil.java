package com.eiffel.codeInsight.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.util.ProcessingContext;

public interface IEiffelCompletionUtil {
    void addCompletions(CompletionParameters parameters, ProcessingContext context, CompletionResultSet result);
}
