package com.eiffel.psi.stubs;

import com.eiffel.psi.EiffelFeature;
import com.intellij.psi.stubs.StubElement;

import java.util.Set;

public interface EiffelNewFeatureStub extends StubElement<EiffelFeature> {
    String getName();
    String getSerializedFormalArguments();
    String getTypeString();
    Set<String> getClientNames();
    String getCommentDoc();

    String getClassName();
}
