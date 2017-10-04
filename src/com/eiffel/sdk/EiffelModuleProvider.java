package com.eiffel.sdk;

import com.intellij.framework.FrameworkTypeEx;
import com.intellij.framework.addSupport.FrameworkSupportInModuleConfigurable;
import com.intellij.framework.addSupport.FrameworkSupportInModuleProvider;
import com.intellij.ide.util.frameworkSupport.FrameworkSupportModel;
import com.intellij.openapi.module.ModuleType;
import org.jetbrains.annotations.NotNull;

public class EiffelModuleProvider extends FrameworkSupportInModuleProvider {
    @NotNull
    @Override
    public FrameworkTypeEx getFrameworkType() {
        return FrameworkTypeEx.EP_NAME.findExtension(EiffelFrameworkType.class);
    }

    @NotNull
    @Override
    public FrameworkSupportInModuleConfigurable createConfigurable(@NotNull FrameworkSupportModel model) {
        return new EiffelModuleConfigurable();
    }

    @Override
    public boolean isEnabledForModuleType(@NotNull ModuleType moduleType) {
        return moduleType instanceof EiffelModuleType;
    }
}
