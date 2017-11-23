package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelEntityIdentifier;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.stubs.EiffelEntityIdentifierStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelEntityIdentifierStubImpl extends StubBase<EiffelEntityIdentifier> implements EiffelEntityIdentifierStub {
    protected EiffelEntityIdentifierStubImpl(StubElement parent) {
        super(parent, (IStubElementType) EiffelTypes.ENTITY_IDENTIFIER);
    }
}
