package com.eiffel.jps;

import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.builders.*;
import org.jetbrains.jps.builders.storage.BuildDataPaths;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.indices.IgnoredFileIndex;
import org.jetbrains.jps.indices.ModuleExcludeIndex;
import org.jetbrains.jps.model.JpsModel;
import org.jetbrains.jps.model.java.JavaSourceRootType;
import org.jetbrains.jps.model.java.JpsJavaExtensionService;
import org.jetbrains.jps.model.module.JpsModule;
import org.jetbrains.jps.model.module.JpsModuleSourceRootType;
import org.jetbrains.jps.model.module.JpsTypedModuleSourceRoot;

import java.io.File;
import java.util.*;

public class EiffelTarget extends ModuleBasedTarget<EiffelSourceRootDescriptor> {
    public EiffelTarget(ModuleBasedBuildTargetType<?> targetType, @NotNull JpsModule module) {
        super(targetType, module);
    }

    @Override
    public boolean isTests() {
        return false;
    }

    @Override
    public String getId() {
        return myModule.getName();
    }

    @Override
    public Collection<BuildTarget<?>> computeDependencies(BuildTargetRegistry targetRegistry, TargetOutputIndex outputIndex) {
        return null;
    }

    @NotNull
    @Override
    public List<EiffelSourceRootDescriptor> computeRootDescriptors(JpsModel model, ModuleExcludeIndex index, IgnoredFileIndex ignoredFileIndex, BuildDataPaths dataPaths) {
        List<EiffelSourceRootDescriptor> descriptors = new ArrayList<>();

        for (JpsTypedModuleSourceRoot root : myModule.getSourceRoots(JavaSourceRootType.SOURCE)) {
            descriptors.add(new EiffelSourceRootDescriptor(root.getFile(), this));
        }

        return descriptors;
    }

    @Nullable
    @Override
    public EiffelSourceRootDescriptor findRootDescriptor(String rootId, BuildRootIndex rootIndex) {
        return ContainerUtil.getFirstItem(rootIndex.getRootDescriptors(new File(rootId), Collections.singletonList(getEiffelTargetType()), null));
    }

    private EiffelTargetType getEiffelTargetType() {
        return (EiffelTargetType) getTargetType();
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Eiffel";
    }

    @NotNull
    @Override
    public Collection<File> getOutputRoots(CompileContext context) {
        return ContainerUtil.createMaybeSingletonList(JpsJavaExtensionService.getInstance().getOutputDirectory(myModule, isTests()));
    }
}
