package com.eiffel.psi.impl;

import com.eiffel.psi.EiffelNamedElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class EiffelNamedElementImpl extends ASTWrapperPsiElement implements EiffelNamedElement {
    public EiffelNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
