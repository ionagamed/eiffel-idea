package com.eiffel.jps;

import com.eiffel.jps.model.JpsEiffelModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.BuildTargetLoader;
import org.jetbrains.jps.builders.ModuleBasedBuildTargetType;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.module.JpsTypedModule;

import java.util.ArrayList;
import java.util.List;

public class EiffelTargetType extends ModuleBasedBuildTargetType<EiffelTarget> {
    public static final EiffelTargetType PRODUCTION = new EiffelTargetType("eiffel-production");

    protected EiffelTargetType(String typeId) {
        super(typeId);
    }

    @NotNull
    @Override
    public List<EiffelTarget> computeAllTargets(@NotNull JpsModel model) {
        List<EiffelTarget> targets = new ArrayList<>();
        for (JpsTypedModule module : model.getProject().getModules(JpsEiffelModuleType.getInstance())) {
            targets.add(new EiffelTarget(this, module));
        }
        return targets;
    }

    @NotNull
    @Override
    public BuildTargetLoader<EiffelTarget> createLoader(@NotNull JpsModel model) {
        return new BuildTargetLoader<EiffelTarget>() {
            @Nullable
            @Override
            public EiffelTarget createTarget(@NotNull String targetId) {
                for (JpsTypedModule module : model.getProject().getModules(JpsEiffelModuleType.getInstance())) {
                    if (module.getName().equals(targetId)) {
                        return new EiffelTarget(EiffelTargetType.this, module);
                    }
                }
                return null;
            }
        };
    }
}
