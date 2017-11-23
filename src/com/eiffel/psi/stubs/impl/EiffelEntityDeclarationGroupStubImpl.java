package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelEntityDeclarationGroup;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.stubs.EiffelEntityDeclarationGroupStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelEntityDeclarationGroupStubImpl extends StubBase<EiffelEntityDeclarationGroup> implements EiffelEntityDeclarationGroupStub {
    protected EiffelEntityDeclarationGroupStubImpl(StubElement parent) {
        super(parent, (IStubElementType) EiffelTypes.ENTITY_DECLARATION_GROUP);
    }
}
