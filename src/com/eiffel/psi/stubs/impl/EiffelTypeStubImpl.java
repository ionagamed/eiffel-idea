package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelType;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.stubs.EiffelTypeStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelTypeStubImpl extends StubBase<EiffelType> implements EiffelTypeStub {
    private String name;

    protected EiffelTypeStubImpl(StubElement parent, String name) {
        super(parent, (IStubElementType) EiffelTypes.TYPE);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
