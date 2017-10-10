package com.eiffel.sdk;

import com.eiffel.EiffelIcons;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkAdditionalData;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EiffelModuleType extends ModuleType<EiffelModuleBuilder> {
    private static final String ID = "EIFFEL_MODULE";

    public EiffelModuleType() {
        super(ID);
    }

    public static EiffelModuleType getInstance() {
        return (EiffelModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @NotNull
    @Override
    public EiffelModuleBuilder createModuleBuilder() {
        return new EiffelModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "Eiffel Project";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Eiffel Project";
    }

    public Icon getBigIcon() {
        return EiffelIcons.E_ICON_FILE;
    }

    @Override
    public Icon getNodeIcon(@Deprecated boolean b) {
        return EiffelIcons.E_ICON_FILE;
    }

    @NotNull
    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext,
                                                @NotNull EiffelModuleBuilder moduleBuilder,
                                                @NotNull ModulesProvider modulesProvider) {
        return super.createWizardSteps(wizardContext, moduleBuilder, modulesProvider);
    }
}