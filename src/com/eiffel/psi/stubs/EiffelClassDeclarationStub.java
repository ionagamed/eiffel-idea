package com.eiffel.psi.stubs;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelFeature;
import com.intellij.psi.stubs.StubElement;

import java.util.List;
import java.util.Set;

public interface EiffelClassDeclarationStub extends StubElement<EiffelClassDeclaration> {
    String getName();
    List<EiffelFeature> getNewFeatures();
    Set<String> getDirectParentNames();
}
