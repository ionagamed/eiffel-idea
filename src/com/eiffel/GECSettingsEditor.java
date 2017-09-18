package com.eiffel;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GECSettingsEditor extends SettingsEditor<GECConfiguration> {
    private JPanel panel1;

    @Override
    protected void resetEditorFrom(@NotNull GECConfiguration s) {

    }

    @Override
    protected void applyEditorTo(@NotNull GECConfiguration s) throws ConfigurationException {

    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return panel1;
    }
}
