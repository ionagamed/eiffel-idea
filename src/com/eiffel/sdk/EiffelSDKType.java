package com.eiffel.sdk;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.Icons;
import net.sf.cglib.core.Local;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class EiffelSDKType extends SdkType {
//    public EiffelSDKType(@NotNull String name) {
//        super(name);
//    }

    public EiffelSDKType() {
        super("EIFFEL_SDK");
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return null;
    }

    @Override
    public boolean isValidSdkHome(String path) {
        VirtualFile home = LocalFileSystem.getInstance().findFileByIoFile(new File(path));
        if (home == null || !home.exists() || !home.isDirectory()) {
            return false;
        }

        VirtualFile lib = home.findChild("library");
        if (lib == null || !lib.exists() || !lib.isDirectory()) {
            return false;
        }

        VirtualFile bin = home.findChild("bin");
        if (bin == null || !bin.exists() || !bin.isDirectory()) {
            return false;
        }

        VirtualFile gec = bin.findChild(SystemInfo.isWindows ? "gec.exe" : "gec");
        if (gec == null || !gec.exists()) {
            return false;
        }

        return true;
    }

    @Override
    public String suggestSdkName(String currentSdkName, String sdkHome) {
        return "Eiffel GOBO SDK";
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(@NotNull SdkModel sdkModel, @NotNull SdkModificator sdkModificator) {
        return new EiffelSDKConfigurable();
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Eiffel GOBO SDK";
    }

    @Nullable
    @Override
    public SdkAdditionalData loadAdditionalData(@NotNull Sdk currentSdk, Element additional) {
        EiffelSDKAdditionalData data = new EiffelSDKAdditionalData();
        data.readExternal(additional);
        return data;
    }

    @Override
    public void saveAdditionalData(@NotNull SdkAdditionalData additionalData, @NotNull Element additional) {
        if (additionalData instanceof EiffelSDKAdditionalData) {
            ((EiffelSDKAdditionalData)additionalData).writeExternal(additional);
        }
    }

    @Nullable
    @Override
    public String getVersionString(@NotNull Sdk sdk) {
        String path = sdk.getHomePath();
        if (path == null) return null;

        VirtualFile home = LocalFileSystem.getInstance().findFileByIoFile(new File(path));
        if (home == null) return null;

        VirtualFile bin = home.findChild("bin");
        if (bin == null) return null;

        try {
            java.util.Scanner s = new java.util.Scanner(Runtime.getRuntime().exec(bin.getPath() + "/gec --version").getInputStream()).useDelimiter("\\A");
            if (s.hasNext()) {
                return s.next().replace("gec version ", "");
            } else {
                return null;
            }
        } catch (IOException ignored) {
            return null;
        }
    }

    public static SdkTypeId getInstance() {
        return SdkType.findInstance(EiffelSDKType.class);
    }
}
