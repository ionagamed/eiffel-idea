package com.eiffel.formatting;

import com.eiffel.psi.EiffelTypes;
import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EiffelBraceMatcher implements PairedBraceMatcher {
    private static BracePair[] pairs = {
            new BracePair(EiffelTypes.LEFT_PAREN, EiffelTypes.RIGHT_PAREN, true),
            new BracePair(EiffelTypes.LEFT_CURLY_BRACKET, EiffelTypes.RIGHT_CURLY_BRACKET, true),
            new BracePair(EiffelTypes.LEFT_SQUARE_BRACKET, EiffelTypes.RIGHT_SQUARE_BRACKET, true),
    };

    @NotNull
    @Override
    public BracePair[] getPairs() {
        return pairs;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }
}
