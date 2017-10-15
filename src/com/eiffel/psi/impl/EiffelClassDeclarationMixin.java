package com.eiffel.psi.impl;

import com.eiffel.psi.EiffelNamedElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.icons.AllIcons;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public abstract class EiffelClassDeclarationMixin extends EiffelNamedElementImpl implements EiffelNamedElement {
    public EiffelClassDeclarationMixin(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public Icon getIcon(@IconFlags int flags) {
        return AllIcons.Nodes.Class;
    }
}
