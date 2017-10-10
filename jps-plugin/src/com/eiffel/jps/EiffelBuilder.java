package com.eiffel.jps;

import com.eiffel.jps.model.JpsEiffelModuleType;
import com.intellij.openapi.diagnostic.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.ModuleChunk;
import org.jetbrains.jps.builders.BuildOutputConsumer;
import org.jetbrains.jps.builders.BuildTarget;
import org.jetbrains.jps.builders.DirtyFilesHolder;
import org.jetbrains.jps.builders.java.JavaSourceRootDescriptor;
import org.jetbrains.jps.incremental.*;
import org.jetbrains.jps.incremental.resources.ResourcesBuilder;
import org.jetbrains.jps.incremental.resources.StandardResourceBuilderEnabler;
import org.jetbrains.jps.model.module.JpsModule;

import java.io.*;
import java.util.Collections;

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

    @Override
    public void build(@NotNull EiffelTarget target, @NotNull DirtyFilesHolder<EiffelSourceRootDescriptor, EiffelTarget> holder, @NotNull BuildOutputConsumer outputConsumer, @NotNull CompileContext context) throws ProjectBuildException, IOException {
        LOG.error("abacaba");
        LOG.debug("I'm Eiffel builder");
        LOG.info("I'm Eiffel info-builder");
    }
}
