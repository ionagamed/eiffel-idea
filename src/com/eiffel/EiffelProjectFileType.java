package com.eiffel;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class EiffelProjectFileType extends LanguageFileType {
    public static final EiffelProjectFileType INSTANCE = new EiffelProjectFileType();

    private EiffelProjectFileType() {
        super(EiffelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Eiffel compile file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Eiffel compile file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ecf";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return EiffelIcons.ECF_ICON_FILE;
    }
}