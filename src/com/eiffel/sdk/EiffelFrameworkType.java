package com.eiffel.sdk;

import com.eiffel.EiffelIcons;
import com.intellij.framework.FrameworkTypeEx;
import com.intellij.framework.addSupport.FrameworkSupportInModuleProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class EiffelFrameworkType extends FrameworkTypeEx {
    protected EiffelFrameworkType() {
        super("Eiffel");
    }

    @NotNull
    @Override
    public FrameworkSupportInModuleProvider createProvider() {
        return new EiffelModuleProvider();
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Eiffel";
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return EiffelIcons.E_ICON_FILE;
    }
}
