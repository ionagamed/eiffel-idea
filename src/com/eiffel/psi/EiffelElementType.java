package com.eiffel.psi;

import com.intellij.psi.tree.IElementType;
import com.eiffel.EiffelLanguage;
import org.jetbrains.annotations.*;

public class EiffelElementType extends IElementType {
    public EiffelElementType(@NotNull @NonNls String debugName) {
        super(debugName, EiffelLanguage.INSTANCE);
    }
}
