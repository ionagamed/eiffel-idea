package com.eiffel.sdk;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.projectRoots.AdditionalDataConfigurable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkAdditionalData;
import com.intellij.openapi.projectRoots.SdkModificator;
import com.intellij.openapi.ui.TextBrowseFolderListener;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.SystemInfo;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EiffelSDKConfigurable implements AdditionalDataConfigurable {
    private JPanel panel1;
    private TextFieldWithBrowseButton msvcLocationField;
    private JToolBar msvcToolbar;

    private Sdk mySdk;

    @Override
    public void setSdk(Sdk sdk) {
        mySdk = sdk;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        if (SystemInfo.isWindows) {
            EiffelSDKAdditionalData d = (EiffelSDKAdditionalData) mySdk.getSdkModificator().getSdkAdditionalData();
            if (d != null) {
                msvcLocationField.setText(d.msvcLocation);
            }
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
        } else {
            msvcToolbar.setOpaque(false);
        }

        return panel1;
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {
        SdkModificator modificator = mySdk.getSdkModificator();
        EiffelSDKAdditionalData d = (EiffelSDKAdditionalData) modificator.getSdkAdditionalData();
        if (d == null) {
            d = new EiffelSDKAdditionalData();
        }
        d.msvcLocation = msvcLocationField.getText();
        modificator.setSdkAdditionalData(d);
        ApplicationManager.getApplication().runWriteAction(modificator::commitChanges);
    }
}
