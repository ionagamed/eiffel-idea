package com.eiffel.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface EiffelTypedElement extends PsiElement {
    /**
     * Convenience method, returns getType().getString()
     * Returns null, if getType() is null
     *
     * @return type string
     */
    @Nullable
    String getTypeString();

    /**
     * Get the type of the element
     * If it doesn't have a type, return null
     * If it's an attribute or a local, return its type
     * It it's a feature (agent), return its return type
     *
     * @return the type
     */
    @Nullable
    EiffelType getType();
}
