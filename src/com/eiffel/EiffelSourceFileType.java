package com.eiffel;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EiffelSourceFileType extends LanguageFileType {
    public static final EiffelSourceFileType INSTANCE = new EiffelSourceFileType();

    private EiffelSourceFileType() {
        super(EiffelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Eiffel source file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Eiffel source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "e";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return EiffelIcons.E_ICON_FILE;
    }
}