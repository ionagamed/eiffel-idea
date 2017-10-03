package com.eiffel;

import com.intellij.execution.BeforeRunTask;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;

public class BuildInjectedBeforeRunTask extends BeforeRunTask<BuildInjectedBeforeRunTask> {
    protected BuildInjectedBeforeRunTask(@NotNull Key<BuildInjectedBeforeRunTask> providerId) {
        super(providerId);
    }
}
