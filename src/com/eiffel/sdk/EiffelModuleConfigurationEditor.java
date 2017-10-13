package com.eiffel.sdk;

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleConfigurationEditor;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.OrderEntry;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.roots.RootPolicy;
import com.intellij.openapi.roots.impl.OrderEntryBaseImpl;
import com.intellij.openapi.roots.ui.configuration.CommonContentEntriesEditor;
import com.intellij.openapi.roots.ui.configuration.ContentEntryEditor;
import com.intellij.openapi.roots.ui.configuration.ModuleConfigurationState;
import com.intellij.openapi.roots.ui.configuration.ModuleElementsEditor;
import com.intellij.openapi.ui.TextBrowseFolderListener;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.module.JpsModuleSourceRootType;

import javax.swing.*;

public class EiffelModuleConfigurationEditor extends ModuleElementsEditor {
    private JPanel mainPanel;
    private JToolBar msvcToolBar;
    private TextFieldWithBrowseButton msvcLocationField;

    private Key<String> MSVC_HOME = new Key<>("msvc.home");

    protected EiffelModuleConfigurationEditor(@NotNull ModuleConfigurationState state) {
        super(state);
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Eiffel module configuration";
    }

    @Override
    public void apply() {
        getState().putUserData(MSVC_HOME, msvcLocationField.getText());
        getModel().getModule().getComponent(EiffelModulePersistent.class).getState().msvcLocation = msvcLocationField.getText();
    }

    @Override
    public boolean isModified() {
        boolean modified = false;

        String msvcHome = getState().getUserData(MSVC_HOME);
        if (msvcHome == null) return true;
        modified |= isModified(msvcLocationField.getTextField(), msvcHome);

        return modified;
    }

    @Override
    protected JComponent createComponentImpl() {
        msvcLocationField.addBrowseFolderListener(new TextBrowseFolderListener(
                new FileChooserDescriptor(
                        false,
                        true,
                        false,
                        false,
                        false,
                        false
                )
        ));

        return mainPanel;
    }
}
