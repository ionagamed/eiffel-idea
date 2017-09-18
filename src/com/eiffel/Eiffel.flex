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
INTEGER={INTEGER_BASE}?[0-9a-fA-F_]+
INTEGER_BASE=0[bcxBCX]
CHARACTER_LITERAL='.'
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_]*
REAL=(\.{INTEGER}|{INTEGER}\.|{INTEGER}\.{INTEGER})([eE]{SIGN}?{INTEGER})?
REAL_LITERAL={SIGN}?{REAL}
STRING_ONELINE=(%.|[^%\"]+)*
STRING={STRING_ONELINE}(%{WHITE_SPACE}*{EOL}{WHITE_SPACE}*%{STRING_ONELINE})*
STRING_LITERAL=\"{STRING}\"
COMMENT_ONELINE=--[^\n\r]*

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

  "C_external" { return EiffelTypes.C_EXTERNAL_KEYWORD; }
  "C++_external" { return EiffelTypes.CPP_EXTERNAL_KEYWORD; }
  "DLL_external" { return EiffelTypes.DLL_EXTERNAL_KEYWORD; }
  "signature" { return EiffelTypes.SIGNATURE_KEYWORD; }
  "use" { return EiffelTypes.USE_KEYWORD; }

  {IDENTIFIER}            { return EiffelTypes.IDENTIFIER; }

  {REAL_LITERAL} { return EiffelTypes.REAL_LITERAL; }
  {INTEGER_LITERAL} { return EiffelTypes.INTEGER_LITERAL; }
  {STRING_LITERAL} { return EiffelTypes.STRING_LITERAL; }
  {CHARACTER_LITERAL} { return EiffelTypes.CHARACTER_LITERAL; }

  ":" { return EiffelTypes.COLON; }
  ";" { return EiffelTypes.SEMICOLON; }
  "=" { return EiffelTypes.EQ; }
  "/=" { return EiffelTypes.NOT_EQ; }
  "~" { return EiffelTypes.TILDE; }
  "/~" { return EiffelTypes.NOT_TILDE; }
  "," { return EiffelTypes.COMMA; }
  "\"" { return EiffelTypes.DQUOTE; }
  "[ ]" { return EiffelTypes.ALIAS_BRACKETS; }
  "+" { return EiffelTypes.PLUS; }
  "-" { return EiffelTypes.MINUS; }
  "*" { return EiffelTypes.ASTERISK; }
  "/" { return EiffelTypes.SLASH; }
  "//" { return EiffelTypes.DSLASH; }
  "\\" { return EiffelTypes.DBACKSLASH; }
  "^" { return EiffelTypes.CARET; }
  ".." { return EiffelTypes.DDOT; }
  "<" { return EiffelTypes.LT; }
  ">" { return EiffelTypes.GT; }
  "<=" { return EiffelTypes.LTE; }
  ">=" { return EiffelTypes.GTE; }
  "{" { return EiffelTypes.LEFT_CURLY_BRACKET; }
  "}" { return EiffelTypes.RIGHT_CURLY_BRACKET; }
  "(" { return EiffelTypes.LEFT_PAREN; }
  ")" { return EiffelTypes.RIGHT_PAREN; }
  "?" { return EiffelTypes.QUESTION; }
  "!" { return EiffelTypes.EXCLAMATION; }
  "[" { return EiffelTypes.LEFT_SQUARE_BRACKET; }
  "]" { return EiffelTypes.RIGHT_SQUARE_BRACKET; }
  "->" { return EiffelTypes.ARROW; }
  "." { return EiffelTypes.DOT; }
  ":=" { return EiffelTypes.ASSIGN; }
  "$" { return EiffelTypes.DOLLAR; }


}

[^] { return BAD_CHARACTER; }
