package com.eiffel.psi;

import com.eiffel.psi.impl.EiffelClassDeclarationStubElementType;
import com.intellij.psi.tree.IElementType;

public class EiffelElementTypeFactory {
    public static IElementType createElement(String tokenType) {
        if (tokenType.equals("CLASS_DECLARATION")) {
            return new EiffelClassDeclarationStubElementType();
        } else {
            return new EiffelTokenType(tokenType);
        }
    }
}
