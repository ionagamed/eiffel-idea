package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.*;
import com.eiffel.psi.stubs.EiffelClassDeclarationStub;
import com.eiffel.psi.stubs.EiffelParentStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelParentStubImpl extends StubBase<EiffelParent> implements EiffelParentStub {
    private String name;

    protected EiffelParentStubImpl(StubElement parent, String name) {
        super(parent, (IStubElementType) EiffelTypes.PARENT);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getClassName() {
        StubElement element = getParentStub();
        if (element instanceof EiffelClassDeclarationStub) {
            return ((EiffelClassDeclarationStub) element).getName();
        }
        return null;
    }
}
