package com.eiffel.psi;

import com.intellij.psi.PsiElement;

public interface EiffelTypedElement extends PsiElement {
    String getTypeString();
    EiffelType getType();
}
