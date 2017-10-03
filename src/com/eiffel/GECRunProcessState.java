package com.eiffel;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.ColoredProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.OutputStream;

public class GECRunProcessState extends CommandLineState {
    protected GECRunProcessState(ExecutionEnvironment environment) {
        super(environment);
    }

    @NotNull
    @Override
    protected ProcessHandler startProcess() throws ExecutionException {
        return new ColoredProcessHandler(
                new GeneralCommandLine("build/" + getEnvironment().getProject().getName())
                .withWorkDirectory(getEnvironment().getProject().getBasePath())
        );
    }
}
