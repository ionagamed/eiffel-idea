package com.eiffel.psi;

import com.intellij.psi.tree.IElementType;
import com.eiffel.EiffelLanguage;
import org.jetbrains.annotations.*;

public class EiffelTokenType extends IElementType {
    public EiffelTokenType(@NotNull @NonNls String debugName) {
        super(debugName, EiffelLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "EiffelTokenType." + super.toString();
    }
}