package com.eiffel;

import com.intellij.execution.BeforeRunTask;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;

public class GECConfigurationFactory extends ConfigurationFactory {
    public static String FACTORY_NAME = "GOBO Configuration Factory";

    protected GECConfigurationFactory(ConfigurationType type) {
        super(type);
    }

    @NotNull
    @Override
    public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new GECConfiguration(project, this, "GEC");
    }

    public String getName() {
        return FACTORY_NAME;
    }
}
