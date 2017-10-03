package com.eiffel;

import com.intellij.execution.BeforeRunTaskProvider;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BuildInjectedBeforeRunTaskProvider extends BeforeRunTaskProvider<BuildInjectedBeforeRunTask> {
    @Override
    public Key<BuildInjectedBeforeRunTask> getId() {
        return new Key<>("GECConfiguration");
    }

    @Override
    public String getName() {
        return "Build Injected before run task provider";
    }

    @Override
    public String getDescription(BuildInjectedBeforeRunTask task) {
        return "Build Injected before run task provider";
    }


    @Override
    public boolean isConfigurable() {
        return false;
    }

    @Nullable
    @Override
    public BuildInjectedBeforeRunTask createTask(@NotNull RunConfiguration runConfiguration) {
        return new BuildInjectedBeforeRunTask(getId());
    }

    @Override
    public boolean configureTask(RunConfiguration runConfiguration, BuildInjectedBeforeRunTask task) {
        return false;
    }

    @Override
    public boolean canExecuteTask(RunConfiguration configuration, BuildInjectedBeforeRunTask task) {
        return configuration instanceof GECConfiguration;
    }

    @Override
    public boolean executeTask(DataContext context, RunConfiguration configuration, ExecutionEnvironment env, BuildInjectedBeforeRunTask task) {
        return false;
    }
}
