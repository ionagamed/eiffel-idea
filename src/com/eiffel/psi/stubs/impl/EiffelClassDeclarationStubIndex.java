package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.stubs.EiffelStubIndexKeys;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;

public class EiffelClassDeclarationStubIndex extends StringStubIndexExtension {
    @Override
    public int getVersion() {
        return 30;
    }

    @NotNull
    @Override
    public StubIndexKey getKey() {
        return EiffelStubIndexKeys.SYMBOLS_KEY;
    }
}
