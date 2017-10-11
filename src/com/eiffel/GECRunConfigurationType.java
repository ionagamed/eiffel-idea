package com.eiffel;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.icons.AllIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GECRunConfigurationType implements ConfigurationType {
    @Override
    public String getDisplayName() {
        return "Eiffel GOBO";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "Eiffel GOBO Toolchain Configuration";
    }

    @Override
    public Icon getIcon() {
        return AllIcons.General.Information;
    }

    @NotNull
    @Override
    public String getId() {
        return "GOBO_EIFFEL_RUN";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[] { new GECConfigurationFactory(this) };
    }
}
