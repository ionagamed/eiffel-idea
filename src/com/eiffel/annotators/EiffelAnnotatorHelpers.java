package com.eiffel.annotators;

import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class EiffelAnnotatorHelpers {
    public static boolean hasParentTokenType(@NotNull PsiElement element, @NotNull IElementType type) {
        PsiElement cur = element;
        try {
            while (true) {
                if (cur.getNode().getElementType().equals(type)) return true;
                cur = cur.getParent();
            }
        } catch (Exception e) {
            return false;
        }
    }
}
