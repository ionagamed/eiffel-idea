package com.eiffel.psi.impl;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelClassDeclarationStub;
import com.eiffel.psi.EiffelTypes;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelClassDeclarationStubImpl extends StubBase<EiffelClassDeclaration> implements EiffelClassDeclarationStub {
    private String name;

    protected EiffelClassDeclarationStubImpl(StubElement parent, final String name) {
        super(parent, (IStubElementType) EiffelTypes.CLASS_DECLARATION);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
