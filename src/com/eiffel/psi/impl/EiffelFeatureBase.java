package com.eiffel.psi.impl;

import com.eiffel.psi.EiffelClassDeclaration;
import com.eiffel.psi.EiffelClassUtil;
import com.eiffel.psi.EiffelFeature;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public abstract class EiffelFeatureBase<T extends PsiElement, S extends StubElement<T>> extends StubBasedPsiElementBase<S> implements EiffelFeature {
    public EiffelFeatureBase(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public boolean isAccessibleBy(String context) {
        Set<String> clients = getClientNames();
        return clients.size() == 0 || clients.contains("ALL") || clients.contains(context) ||
                context.equals(EiffelClassUtil.findClassDeclaration(this).getName());
    }
}
