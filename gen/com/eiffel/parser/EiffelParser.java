// This is a generated file. Not intended for manual editing.
package com.eiffel.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.eiffel.psi.EiffelTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class EiffelParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CLASS_DECLARATION) {
      r = class_declaration(b, 0);
    }
    else if (t == CLASS_HEADER) {
      r = class_header(b, 0);
    }
    else if (t == HEADER_MARK) {
      r = header_mark(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return eiffelFile(b, l + 1);
  }

  /* ********************************************************** */
  // class_header
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_header(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // header_mark? CLASS_KEYWORD IDENTIFIER
  public static boolean class_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_HEADER, "<class header>");
    r = class_header_0(b, l + 1);
    r = r && consumeTokens(b, 0, CLASS_KEYWORD, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // header_mark?
  private static boolean class_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_header_0")) return false;
    header_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COMMENT* class_declaration COMMENT*
  static boolean eiffelFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eiffelFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eiffelFile_0(b, l + 1);
    r = r && class_declaration(b, l + 1);
    r = r && eiffelFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT*
  private static boolean eiffelFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eiffelFile_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "eiffelFile_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMENT*
  private static boolean eiffelFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eiffelFile_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "eiffelFile_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // DEFERRED_KEYWORD|EXPANDED_KEYWORD|FROZEN_KEYWORD
  public static boolean header_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_mark")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER_MARK, "<header mark>");
    r = consumeToken(b, DEFERRED_KEYWORD);
    if (!r) r = consumeToken(b, EXPANDED_KEYWORD);
    if (!r) r = consumeToken(b, FROZEN_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
