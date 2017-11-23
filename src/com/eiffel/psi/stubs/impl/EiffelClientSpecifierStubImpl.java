package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelClientSpecifier;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.stubs.EiffelClientSpecifierStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelClientSpecifierStubImpl extends StubBase<EiffelClientSpecifier> implements EiffelClientSpecifierStub {
    private String name;

    protected EiffelClientSpecifierStubImpl(StubElement parent, String name) {
        super(parent, (IStubElementType) EiffelTypes.CLIENT_SPECIFIER);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
