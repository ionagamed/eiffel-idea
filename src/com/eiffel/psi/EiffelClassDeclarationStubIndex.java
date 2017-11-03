package com.eiffel.psi;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;

public class EiffelClassDeclarationStubIndex extends StringStubIndexExtension {
    @Override
    public int getVersion() {
        return 6;
    }

    @NotNull
    @Override
    public StubIndexKey getKey() {
        return EiffelStubIndexKeys.CLASS_DECLARATION_KEY;
    }
}
