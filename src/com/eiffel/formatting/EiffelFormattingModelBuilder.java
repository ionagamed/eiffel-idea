package com.eiffel.formatting;

import com.eiffel.EiffelLanguage;
import com.eiffel.formatting.EiffelBlock;
import com.eiffel.psi.EiffelTypes;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.eiffel.psi.EiffelTypes.*;

public class EiffelFormattingModelBuilder implements FormattingModelBuilder {
    @NotNull
    @Override
    public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
        return FormattingModelProvider.createFormattingModelForPsiFile(
                element.getContainingFile(),
                new EiffelBlock(
                        element.getNode(),
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        createSpaceBuilder(settings),
                        Indent.getNoneIndent()
                ),
                settings
        );
    }

    @Nullable
    @Override
    public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
        return elementAtOffset.getTextRange();
//        int dt = 20;
//        int a = elementAtOffset.getStartOffset();
//        int b = a + elementAtOffset.getTextLength();
//        return new TextRange(a - dt, b + dt);
    }

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, EiffelLanguage.INSTANCE)
                .after(COMMA).spaces(1)
                .after(SEMICOLON).spaces(1)
                .after(LEFT_SQUARE_BRACKET).spaces(1)
                .before(RIGHT_SQUARE_BRACKET).spaces(1)
                .after(COLON).spaces(1)
                .around(ASSIGN).spaces(1)
                .before(LEFT_PAREN).spaces(1)
                ;
    }
}
