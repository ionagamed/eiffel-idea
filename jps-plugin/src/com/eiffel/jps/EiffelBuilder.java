package com.eiffel.jps;

import com.eiffel.jps.model.JpsEiffelModuleType;
import com.eiffel.jps.model.JpsEiffelSdkType;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.BaseOSProcessHandler;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessListener;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.util.io.FileUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.ModuleChunk;
import org.jetbrains.jps.builders.BuildOutputConsumer;
import org.jetbrains.jps.builders.BuildTarget;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.builders.java.JavaModuleBuildTargetType;
import org.jetbrains.jps.builders.java.JavaSourceRootDescriptor;
import org.jetbrains.jps.incremental.*;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.incremental.messages.ProgressMessage;
import org.jetbrains.jps.incremental.resources.ResourcesBuilder;
import org.jetbrains.jps.incremental.resources.StandardResourceBuilderEnabler;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.library.sdk.JpsSdk;
import org.jetbrains.jps.model.module.JpsModule;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EiffelBuilder extends TargetBuilder<EiffelSourceRootDescriptor, EiffelTarget> {

    private static final Logger LOG = Logger.getInstance(EiffelBuilder.class);

    public EiffelBuilder() {
        super(Collections.singletonList(EiffelTargetType.PRODUCTION));
        ResourcesBuilder.registerEnabler(new StandardResourceBuilderEnabler() {
            @Override
            public boolean isResourceProcessingEnabled(@NotNull JpsModule module) {
                return !(module.getModuleType() instanceof JpsEiffelModuleType);
            }
        });
    }
    @NotNull
    @Override
    public String getPresentableName() {
        return "eiffel";
    }

    public void build(@NotNull EiffelTarget target, @NotNull DirtyFilesHolder<EiffelSourceRootDescriptor, EiffelTarget> holder, @NotNull BuildOutputConsumer outputConsumer, @NotNull CompileContext context) throws ProjectBuildException, IOException {
        File outputDirectory = getBuildOutputDirectory(target.getModule(), false, context);
        context.processMessage(new ProgressMessage("Compiling Eiffel sources"));
        invokeGEC(target.getModule(), outputDirectory, context);
        context.checkCanceled();
        context.processMessage(new ProgressMessage(""));
    }

    private void invokeGEC(@NotNull final JpsModule module, @NotNull final File outputDirectory, @NotNull CompileContext context) throws ProjectBuildException {
        Process process = null;
        String sdkHome = module.getSdk(JpsEiffelSdkType.getInstance()).getHomePath();
        String sourceRoot = module.getSourceRoots().get(0).getUrl().substring("file://".length()); // HACK: only first source root gets processed
        GeneralCommandLine commandLine = new GeneralCommandLine()
                .withWorkDirectory(outputDirectory.getAbsolutePath())
                .withExePath(sdkHome + (SystemInfo.isWindows ? "\\bin\\gec.exe" : "/bin/gec"))
                .withParameters(sourceRoot + "/" + module.getProject().getName() + "-gobo.ecf")
                .withRedirectErrorStream(true);
        try {
            process = commandLine.createProcess();
        } catch (ExecutionException e) {
            LOG.info(e.getMessage());
        }
        BaseOSProcessHandler handler = new BaseOSProcessHandler(process, commandLine.getCommandLineString(), Charset.defaultCharset());
        handler.addProcessListener(new GECProcessListener(context, sourceRoot));
        handler.startNotify();
        handler.waitFor();
    }

    @NotNull
    private static File getBuildOutputDirectory(@NotNull JpsModule module,
                                                boolean forTests,
                                                @NotNull CompileContext context) throws ProjectBuildException {
        JpsJavaExtensionService instance = JpsJavaExtensionService.getInstance();
        File outputDirectory = instance.getOutputDirectory(module, forTests);
        if (outputDirectory == null) {
            String errorMessage = "No output dir for module " + module.getName();
            context.processMessage(new CompilerMessage("gec", BuildMessage.Kind.ERROR, errorMessage));
            throw new ProjectBuildException(errorMessage);
        }
        if (!outputDirectory.exists()) {
            FileUtil.createDirectory(outputDirectory);
        }
        return outputDirectory;
    }

    class GECProcessListener implements ProcessListener {
        private final CompileContext context;
        private final Pattern ERROR_MATCHING_PATTERN = Pattern.compile(".* class (.*) \\((\\d+),(\\d+)\\): (.*)");
        private final String sourceRoot;

        public GECProcessListener(CompileContext context, String sourceRoot) {
            this.context = context;
            this.sourceRoot = sourceRoot;
        }

        @Override
        public void startNotified(ProcessEvent event) {

        }

        @Override
        public void processTerminated(ProcessEvent event) {

        }

        @Override
        public void processWillTerminate(ProcessEvent event, boolean willBeDestroyed) {

        }

        @Override
        public void onTextAvailable(ProcessEvent event, Key outputType) {
            String line = event.getText();
            LOG.info(line);
            if (line.startsWith("[")) {
                Matcher matcher = ERROR_MATCHING_PATTERN.matcher(line);
                if (matcher.find()) {
                    String className = matcher.group(1);
                    int lineNo = Integer.parseInt(matcher.group(2));
                    int colNo = Integer.parseInt(matcher.group(3));
                    String message = matcher.group(4);

                    context.processMessage(new CompilerMessage(
                            "gec",
                            BuildMessage.Kind.ERROR,
                            message,
                            sourceRoot + "/" + className.toLowerCase() + ".e",
                            -1, -1, -1,
                            lineNo,
                            colNo
                    ));
                }
            }
        }
    }
}
