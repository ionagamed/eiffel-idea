package com.eiffel;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import com.eiffel.psi.EiffelTypes;

%%

%{
  public EiffelLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class EiffelLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%ignorecase

EOL=\R
CRLF=\R
WHITE_SPACE=\s+

SIGN=[+-]
INTEGER_LITERAL={SIGN}?{INTEGER}
INTEGER=(0[bB][01_]+)|(0[cC][0-7_]+)|(0[xX][0-9a-fA-F_]+)|([0-9_]+)
INTEGER_BASE=0[bcxBCX]
CHARACTER_LITERAL='.'
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_]*
REAL=(\.{INTEGER}|{INTEGER}\.|{INTEGER}\.{INTEGER})([eE]{SIGN}?{INTEGER})?
REAL_LITERAL={SIGN}?{REAL}
STRING_ONELINE=(%.|[^%\"]+)*
STRING={STRING_ONELINE}(%{WHITE_SPACE}*{EOL}{WHITE_SPACE}*%{STRING_ONELINE})*
STRING_LITERAL=\"{STRING}\"
PARTIAL_STRING_LITERAL=\"{STRING}
COMMENT_ONELINE=--[^\n\r]*
OPERATOR_SINGLE_SYMBOL=[~%&!?+\-*/\^<.>|\\]
OPERATOR_SYMBOL={OPERATOR_SINGLE_SYMBOL}|=|\.
FREE_OPERATOR=({OPERATOR_SYMBOL}{OPERATOR_SYMBOL}+)|{OPERATOR_SINGLE_SYMBOL}

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }
  {COMMENT_ONELINE} { return EiffelTypes.COMMENT; }

  "class" { return EiffelTypes.CLASS_KEYWORD; }
  "deferred" { return EiffelTypes.DEFERRED_KEYWORD; }
  "expanded" { return EiffelTypes.EXPANDED_KEYWORD; }
  "frozen" { return EiffelTypes.FROZEN_KEYWORD; }
  "end" { return EiffelTypes.END_KEYWORD; }
  "note" { return EiffelTypes.NOTE_KEYWORD; }
  "obsolete" { return EiffelTypes.OBSOLETE_KEYWORD; }
  "feature" { return EiffelTypes.FEATURE_KEYWORD; }
  "alias" { return EiffelTypes.ALIAS_KEYWORD; }
  "convert" { return EiffelTypes.CONVERT_KEYWORD; }
  "not" { return EiffelTypes.NOT_KEYWORD; }
  "and" { return EiffelTypes.AND_KEYWORD; }
  "or" { return EiffelTypes.OR_KEYWORD; }
  "xor" { return EiffelTypes.XOR_KEYWORD; }
  "then" { return EiffelTypes.THEN_KEYWORD; }
  "else" { return EiffelTypes.ELSE_KEYWORD; }
  "implies" { return EiffelTypes.IMPLIES_KEYWORD; }
  "assign" { return EiffelTypes.ASSIGN_KEYWORD; }
  "inherit" { return EiffelTypes.INHERIT_KEYWORD; }
  "none" { return EiffelTypes.NONE_KEYWORD; }
  "rename" { return EiffelTypes.RENAME_KEYWORD; }
  "as" { return EiffelTypes.AS_KEYWORD; }
  "export" { return EiffelTypes.EXPORT_KEYWORD; }
  "all" { return EiffelTypes.ALL_KEYWORD; }
  "do" { return EiffelTypes.DO_KEYWORD; }
  "once" { return EiffelTypes.ONCE_KEYWORD; }
  "local" { return EiffelTypes.LOCAL_KEYWORD; }
  "require" { return EiffelTypes.REQUIRE_KEYWORD; }
  "ensure" { return EiffelTypes.ENSURE_KEYWORD; }
  "invariant" { return EiffelTypes.INVARIANT_KEYWORD; }
  "old" { return EiffelTypes.OLD_KEYWORD; }
  "only" { return EiffelTypes.ONLY_KEYWORD; }
  "check" { return EiffelTypes.CHECK_KEYWORD; }
  "variant" { return EiffelTypes.VARIANT_KEYWORD; }
  "precursor" { return EiffelTypes.PRECURSOR_KEYWORD; }
  "redefine" { return EiffelTypes.REDEFINE_KEYWORD; }
  "undefine" { return EiffelTypes.UNDEFINE_KEYWORD; }
  "like" { return EiffelTypes.LIKE_KEYWORD; }
  "current" { return EiffelTypes.CURRENT_KEYWORD; }
  "create" { return EiffelTypes.CREATE_KEYWORD; }
  "tuple" { return EiffelTypes.TUPLE_KEYWORD; }
  "select" { return EiffelTypes.SELECT_KEYWORD; }
  "if" { return EiffelTypes.IF_KEYWORD; }
  "elseif" { return EiffelTypes.ELSEIF_KEYWORD; }
  "inspect" { return EiffelTypes.INSPECT_KEYWORD; }
  "when" { return EiffelTypes.WHEN_KEYWORD; }
  "across" { return EiffelTypes.ACROSS_KEYWORD; }
  "from" { return EiffelTypes.FROM_KEYWORD; }
  "until" { return EiffelTypes.UNTIL_KEYWORD; }
  "loop" { return EiffelTypes.LOOP_KEYWORD; }
  "some" { return EiffelTypes.SOME_KEYWORD; }
  "debug" { return EiffelTypes.DEBUG_KEYWORD; }
  "attribute" { return EiffelTypes.ATTRIBUTE_KEYWORD; }
  "result" { return EiffelTypes.RESULT_KEYWORD; }
  "rescue" { return EiffelTypes.RESCUE_KEYWORD; }
  "retry" { return EiffelTypes.RETRY_KEYWORD; }
  "agent" { return EiffelTypes.AGENT_KEYWORD; }
  "true" { return EiffelTypes.TRUE_KEYWORD; }
  "false" { return EiffelTypes.FALSE_KEYWORD; }
  "external" { return EiffelTypes.EXTERNAL_KEYWORD; }
  "attached" { return EiffelTypes.ATTACHED_KEYWORD; }

  "C_external" { return EiffelTypes.C_EXTERNAL_KEYWORD; }
  "C++_external" { return EiffelTypes.CPP_EXTERNAL_KEYWORD; }
  "DLL_external" { return EiffelTypes.DLL_EXTERNAL_KEYWORD; }
  "signature" { return EiffelTypes.SIGNATURE_KEYWORD; }
  "use" { return EiffelTypes.USE_KEYWORD; }

  {IDENTIFIER}            { return EiffelTypes.IDENTIFIER; }
  "?" { return EiffelTypes.QUESTION; }
  "!" { return EiffelTypes.EXCLAMATION; }

  "->" { return EiffelTypes.ARROW; }
  "." { return EiffelTypes.DOT; }
  "<<" { return EiffelTypes.LEFT_TRIANGLE_DBRACKET; }
  ">>" { return EiffelTypes.RIGHT_TRIANGLE_DBRACKET; }

  {FREE_OPERATOR} { return EiffelTypes.FREE_OPERATOR; }

  ".." { return EiffelTypes.DDOT; }
  ":=" { return EiffelTypes.ASSIGN; }
  ":" { return EiffelTypes.COLON; }
  ";" { return EiffelTypes.SEMICOLON; }
  "," { return EiffelTypes.COMMA; }
  "\"" { return EiffelTypes.DQUOTE; }
  "{" { return EiffelTypes.LEFT_CURLY_BRACKET; }
  "}" { return EiffelTypes.RIGHT_CURLY_BRACKET; }
  "(" { return EiffelTypes.LEFT_PAREN; }
  ")" { return EiffelTypes.RIGHT_PAREN; }
  "[" { return EiffelTypes.LEFT_SQUARE_BRACKET; }
  "]" { return EiffelTypes.RIGHT_SQUARE_BRACKET; }
  "$" { return EiffelTypes.DOLLAR; }
  "=" { return EiffelTypes.EQ; }





  {REAL_LITERAL} { return EiffelTypes.REAL_LITERAL; }
  {INTEGER_LITERAL} { return EiffelTypes.INTEGER_LITERAL; }
  {STRING_LITERAL} { return EiffelTypes.STRING_LITERAL; }
  {PARTIAL_STRING_LITERAL} { return EiffelTypes.STRING_LITERAL; } // TODO: somehow deal with incomplete string poisoning
  {CHARACTER_LITERAL} { return EiffelTypes.CHARACTER_LITERAL; }


}

[^] { return BAD_CHARACTER; }
