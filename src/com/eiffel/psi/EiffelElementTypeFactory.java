package com.eiffel.psi;

import com.eiffel.psi.stubs.impl.*;
import com.intellij.psi.tree.IElementType;

public class EiffelElementTypeFactory {
    public static IElementType createElement(String tokenType) {
        if (tokenType.equals("CLASS_DECLARATION")) {
            return new EiffelClassDeclarationStubElementType();
        } else if (tokenType.equals("NEW_FEATURE")) {
            return new EiffelNewFeatureStubElementType();
        } else if (tokenType.equals("PARENT")) {
            return new EiffelParentStubElementType();
        } else {
            return new EiffelTokenType(tokenType);
        }
    }
}
