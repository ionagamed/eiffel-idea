package com.eiffel.psi.stubs.impl;

import com.eiffel.psi.EiffelFeatureClause;
import com.eiffel.psi.EiffelTypes;
import com.eiffel.psi.stubs.EiffelFeatureClauseStub;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;

public class EiffelFeatureClauseStubImpl extends StubBase<EiffelFeatureClause> implements EiffelFeatureClauseStub {
    protected EiffelFeatureClauseStubImpl(StubElement parent) {
        super(parent, (IStubElementType) EiffelTypes.FEATURE_CLAUSE);
    }
}
