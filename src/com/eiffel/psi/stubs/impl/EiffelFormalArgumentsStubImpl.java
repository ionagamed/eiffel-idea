package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelFormalArguments;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.stubs.EiffelFormalArgumentsStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelFormalArgumentsStubImpl extends StubBase<EiffelFormalArguments> implements EiffelFormalArgumentsStub {
    private String text;

    protected EiffelFormalArgumentsStubImpl(StubElement parent, String text) {
        super(parent, (IStubElementType) EiffelTypes.FORMAL_ARGUMENTS);
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
