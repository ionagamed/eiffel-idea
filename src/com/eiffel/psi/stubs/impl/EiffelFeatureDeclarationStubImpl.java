package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelFeatureDeclaration;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.stubs.EiffelFeatureDeclarationStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelFeatureDeclarationStubImpl extends StubBase<EiffelFeatureDeclaration> implements EiffelFeatureDeclarationStub {
    protected EiffelFeatureDeclarationStubImpl(StubElement parent) {
        super(parent, (IStubElementType) EiffelTypes.FEATURE_DECLARATION);
    }
}
