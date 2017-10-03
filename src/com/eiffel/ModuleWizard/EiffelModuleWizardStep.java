package com.eiffel.ModuleWizard;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public class EiffelModuleWizardStep extends ModuleWizardStep {
    @Override
    public JComponent getComponent() {
        return new EiffelModuleWizardFirstStepForm().FirstStep;
    }

    @Override
    public void updateDataModel() {
        //todo update model according to UI
    }
}