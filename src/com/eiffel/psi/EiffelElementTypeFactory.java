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
        } else if (tokenType.equals("FEATURE_CLAUSE")) {
            return new EiffelFeatureClauseElementType();
        } else if (tokenType.equals("FEATURE_DECLARATION")) {
            return new EiffelFeatureDeclarationStubElementType();
        } else if (tokenType.equals("CLIENT_SPECIFIER")) {
            return new EiffelClientSpecifierStubElementType();
        } else if (tokenType.equals("FORMAL_ARGUMENTS")) {
            return new EiffelFormalArgumentsStubElementType();
        } else if (tokenType.equals("TYPE")) {
            return new EiffelTypeStubElementType();
        } else if (tokenType.equals("ENTITY_DECLARATION_GROUP")) {
            return new EiffelEntityDeclarationGroupStubElementType();
        } else if (tokenType.equals("ENTITY_IDENTIFIER")) {
            return new EiffelEntityIdentifierStubElementType();
        } else {
            return new EiffelTokenType(tokenType);
        }
    }
}
