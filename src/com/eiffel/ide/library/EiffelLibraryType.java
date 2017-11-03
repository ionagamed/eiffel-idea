package com.eiffel.ide.library;

import com.eiffel.EiffelIcons;
import com.eiffel.sdk.EiffelModuleType;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.libraries.*;
import com.intellij.openapi.roots.libraries.ui.LibraryEditorComponent;
import com.intellij.openapi.roots.libraries.ui.LibraryPropertiesEditor;
import com.intellij.openapi.roots.libraries.ui.LibraryRootsComponentDescriptor;
import com.intellij.openapi.roots.ui.configuration.FacetsProvider;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class EiffelLibraryType extends LibraryType<DummyLibraryProperties> {
    public static final PersistentLibraryKind<DummyLibraryProperties> EIFFEL_LIBRARY =
            new PersistentLibraryKind<DummyLibraryProperties>("Eiffel") {
                @NotNull
                @Override
                public DummyLibraryProperties createDefaultProperties() {
                    return new DummyLibraryProperties();
                }
            };

    protected EiffelLibraryType() {
        super(EIFFEL_LIBRARY);
    }

    @Nullable
    @Override
    public String getCreateActionName() {
        return "Eiffel";
    }

    @Override
    public boolean isSuitableModule(@NotNull Module module, @NotNull FacetsProvider facetsProvider) {
        return ModuleType.get(module).equals(EiffelModuleType.getInstance());
    }

    @Nullable
    @Override
    public NewLibraryConfiguration createNewLibrary(@NotNull JComponent parentComponent, @Nullable VirtualFile contextDirectory, @NotNull Project project) {
        return LibraryTypeService.getInstance().createLibraryFromFiles(createLibraryRootsComponentDescriptor(), parentComponent, contextDirectory, this, project);
    }

    @NotNull
    @Override
    public LibraryRootsComponentDescriptor createLibraryRootsComponentDescriptor() {
        return new EiffelLibraryComponentsDescriptor();
    }

    @Nullable
    @Override
    public LibraryPropertiesEditor createPropertiesEditor(@NotNull LibraryEditorComponent<DummyLibraryProperties> editorComponent) {
        return null;
    }

    @Nullable
    @Override
    public Icon getIcon(@Nullable DummyLibraryProperties properties) {
        return EiffelIcons.EIFFEL_FOLDER;
    }
}
