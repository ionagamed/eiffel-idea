package com.eiffel.jps;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.incremental.BuilderService;
import org.jetbrains.jps.incremental.ModuleLevelBuilder;
import org.jetbrains.jps.incremental.TargetBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EiffelBuilderService extends BuilderService {
    @NotNull
    @Override
    public List<? extends TargetBuilder<?, ?>> createBuilders() {
        return Collections.singletonList(new EiffelBuilder());
    }
}
