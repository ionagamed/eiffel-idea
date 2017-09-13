package com.eiffel.pci;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.eiffel.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class EiffelFile extends PsiFileBase {
    public EiffelFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, EiffelLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return EiffelSourceFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Eiffel Source File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}