package com.eiffel.psi.stubs;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelNewFeature;
import com.intellij.psi.stubs.StubElement;

import java.util.List;
import java.util.Set;

public interface EiffelClassDeclarationStub extends StubElement<EiffelClassDeclaration> {
    String getName();
    List<EiffelNewFeature> getNewFeatures();
    Set<String> getDirectParentNames();
}
