package com.eiffel;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.eiffel.psi.EiffelTypes;
import static com.eiffel.psi.EiffelTypes.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class EiffelSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("EIFFEL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey CLASS_NAME =
            createTextAttributesKey("EIFFEL_CLASS_NAME", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("EIFFEL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("EIFFEL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("EIFFEL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("EIFFEL_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey OPERATOR_SIGN =
            createTextAttributesKey("EIFFEL_OPERATOR_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("EIFFEL_SEPARATOR", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("EIFFEL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("EIFFEL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHARACTER_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] OPERATOR_SIGN_KEYS = new TextAttributesKey[]{OPERATOR_SIGN};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private static final ArrayList<IElementType> keywords = new ArrayList<>(Arrays.asList(
            CLASS_KEYWORD,
            DEFERRED_KEYWORD,
            EXPANDED_KEYWORD,
            FROZEN_KEYWORD,
            END_KEYWORD,
            NOTE_KEYWORD,
            OBSOLETE_KEYWORD,
            FEATURE_KEYWORD,
            ALIAS_KEYWORD,
            CONVERT_KEYWORD,
            NOT_KEYWORD,
            AND_KEYWORD,
            OR_KEYWORD,
            XOR_KEYWORD,
            THEN_KEYWORD,
            ELSE_KEYWORD,
            IMPLIES_KEYWORD,
            ASSIGN_KEYWORD,
            INHERIT_KEYWORD,
            NONE_KEYWORD,
            RENAME_KEYWORD,
            AS_KEYWORD,
            EXPORT_KEYWORD,
            ALL_KEYWORD,
            DO_KEYWORD,
            ONCE_KEYWORD,
            LOCAL_KEYWORD,
            REQUIRE_KEYWORD,
            ENSURE_KEYWORD,
            INVARIANT_KEYWORD,
            OLD_KEYWORD,
            ONLY_KEYWORD,
            CHECK_KEYWORD,
            VARIANT_KEYWORD,
            PRECURSOR_KEYWORD,
            REDEFINE_KEYWORD,
            UNDEFINE_KEYWORD,
            LIKE_KEYWORD,
            CURRENT_KEYWORD,
            CREATE_KEYWORD,
            TUPLE_KEYWORD,
            IF_KEYWORD,
            ELSEIF_KEYWORD,
            INSPECT_KEYWORD,
            WHEN_KEYWORD,
            ACROSS_KEYWORD,
            FROM_KEYWORD,
            UNTIL_KEYWORD,
            LOOP_KEYWORD,
            SOME_KEYWORD,
            DEBUG_KEYWORD,
            RESULT_KEYWORD,
            ATTRIBUTE_KEYWORD,
            RESCUE_KEYWORD,
            RETRY_KEYWORD,
            AGENT_KEYWORD,
            EXTERNAL_KEYWORD,
            C_EXTERNAL_KEYWORD,
            CPP_EXTERNAL_KEYWORD,
            DLL_EXTERNAL_KEYWORD,
            USE_KEYWORD
    ));

    private static final ArrayList<IElementType> operators = new ArrayList<>(Arrays.asList(
            EQ,
            PLUS,
            MINUS,
            ASTERISK,
            SLASH,
            DSLASH,
            DBACKSLASH,
            CARET,
            DDOT,
            LT,
            GT,
            LTE,
            GTE,
            DOT,
            NOT_EQ,
            TILDE,
            NOT_TILDE,
            ASSIGN,
            DOLLAR
    ));

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new EiffelLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(EiffelTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(EiffelTypes.INTEGER_LITERAL) ||
                tokenType.equals(EiffelTypes.REAL_LITERAL)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(EiffelTypes.STRING_LITERAL)) {
            return STRING_KEYS;
        } else if (keywords.contains(tokenType)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(EiffelTypes.COMMA)) {
            return COMMA_KEYS;
        } else if (tokenType.equals(EiffelTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        } else if (operators.contains(tokenType)) {
            return OPERATOR_SIGN_KEYS;
        } else if (tokenType.equals(EiffelTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARACTER_KEYS;
        }
        return EMPTY_KEYS;
    }
}
