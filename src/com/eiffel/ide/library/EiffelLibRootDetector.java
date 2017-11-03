package com.eiffel.ide.library;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.roots.libraries.ui.RootDetector;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Collections;

public class EiffelLibRootDetector extends RootDetector {

    protected EiffelLibRootDetector(OrderRootType rootType, String presentableRootTypeName) {
        super(rootType, false, presentableRootTypeName);
    }

    @NotNull
    @Override
    public Collection<VirtualFile> detectRoots(@NotNull VirtualFile rootCandidate, @NotNull ProgressIndicator progressIndicator) {
        return Collections.singletonList(rootCandidate);
    }
}
