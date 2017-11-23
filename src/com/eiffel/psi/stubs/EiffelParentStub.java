package com.eiffel.psi.stubs;

import com.eiffel.psi.EiffelParent;
import com.intellij.psi.stubs.StubElement;

public interface EiffelParentStub extends StubElement<EiffelParent> {
    String getName();
    String getClassName();
}
