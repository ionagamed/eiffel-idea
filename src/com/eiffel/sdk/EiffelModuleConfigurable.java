package com.eiffel.sdk;

import com.intellij.framework.addSupport.FrameworkSupportInModuleConfigurable;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.roots.ModifiableModelsProvider;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EiffelModuleConfigurable extends FrameworkSupportInModuleConfigurable {
    @Nullable
    @Override
    public JComponent createComponent() {
        return null;
    }

    @Override
    public void addSupport(@NotNull Module module, @NotNull ModifiableRootModel rootModel, @NotNull ModifiableModelsProvider modifiableModelsProvider) {

    }
}
