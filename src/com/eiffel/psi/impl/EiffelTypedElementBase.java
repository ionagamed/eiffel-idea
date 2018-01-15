package com.eiffel.psi.impl;

import com.eiffel.psi.EiffelType;
import com.eiffel.psi.EiffelTypedElement;
import org.jetbrains.annotations.Nullable;

public abstract class EiffelTypedElementBase implements EiffelTypedElement {
    @Nullable
    @Override
    public String getTypeString() {
        EiffelType t = getType();
        if (t == null) return null;
        return t.getUngenerified();
    }
}
