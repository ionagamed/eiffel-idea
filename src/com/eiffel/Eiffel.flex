package com.eiffel;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.eiffel.psi.EiffelTypes;
import com.intellij.psi.TokenType;

%%

%class EiffelLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITESPACE=[\ \n\t\f]
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_]*

COMMENT=--[^\n\r]*

%%

<YYINITIAL> {
    {COMMENT}{CRLF}?                               { return EiffelTypes.COMMENT; }
    "class"                                        { return EiffelTypes.CLASS_KEYWORD; }
    "deferred"                                     { return EiffelTypes.DEFERRED_KEYWORD; }
    "expanded"                                     { return EiffelTypes.EXPANDED_KEYWORD; }
    "frozen"                                       { return EiffelTypes.FROZEN_KEYWORD; }


    {IDENTIFIER}                                   { return EiffelTypes.IDENTIFIER; }
    {WHITESPACE}+                                  { return TokenType.WHITE_SPACE; }
}

. { return TokenType.BAD_CHARACTER; }