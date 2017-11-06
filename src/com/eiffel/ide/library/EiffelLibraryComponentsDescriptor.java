package com.eiffel.ide.library;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.ProjectBundle;
import com.intellij.openapi.projectRoots.ui.Util;
import com.intellij.openapi.roots.JavadocOrderRootType;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.roots.libraries.ui.AttachRootButtonDescriptor;
import com.intellij.openapi.roots.libraries.ui.LibraryRootsComponentDescriptor;
import com.intellij.openapi.roots.libraries.ui.OrderRootTypePresentation;
import com.intellij.openapi.roots.libraries.ui.RootDetector;
import com.intellij.openapi.roots.ui.configuration.libraryEditor.DefaultLibraryRootsComponentDescriptor;
import com.intellij.openapi.roots.ui.configuration.libraryEditor.LibraryEditor;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EiffelLibraryComponentsDescriptor extends LibraryRootsComponentDescriptor {
    @Nullable
    @Override
    public OrderRootTypePresentation getRootTypePresentation(@NotNull OrderRootType type) {
        return DefaultLibraryRootsComponentDescriptor.getDefaultPresentation(type);
    }

    @NotNull
    @Override
    public List<? extends RootDetector> getRootDetectors() {
        return Collections.singletonList(
                new EiffelLibRootDetector(OrderRootType.SOURCES, "Source detector")
        );
    }

    @NotNull
    @Override
    public List<? extends AttachRootButtonDescriptor> createAttachButtons() {
        return Collections.emptyList();
    }
}
