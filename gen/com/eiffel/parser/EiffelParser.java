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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACTUAL_GENERICS) {
      r = actual_generics(b, 0);
    }
    else if (t == ACTUAL_LIST) {
      r = actual_list(b, 0);
    }
    else if (t == ACTUALS) {
      r = actuals(b, 0);
    }
    else if (t == ADDRESS) {
      r = address(b, 0);
    }
    else if (t == AGENT) {
      r = agent(b, 0);
    }
    else if (t == AGENT_ACTUAL) {
      r = agent_actual(b, 0);
    }
    else if (t == AGENT_ACTUAL_LIST) {
      r = agent_actual_list(b, 0);
    }
    else if (t == AGENT_ACTUALS) {
      r = agent_actuals(b, 0);
    }
    else if (t == AGENT_QUALIFIED) {
      r = agent_qualified(b, 0);
    }
    else if (t == AGENT_TARGET) {
      r = agent_target(b, 0);
    }
    else if (t == AGENT_UNQUALIFIED) {
      r = agent_unqualified(b, 0);
    }
    else if (t == ALIAS_NAME) {
      r = alias_name(b, 0);
    }
    else if (t == ARRAY_LITERAL) {
      r = array_literal(b, 0);
    }
    else if (t == ASSERTION_CLAUSE) {
      r = assertion_clause(b, 0);
    }
    else if (t == ASSIGNER_CALL) {
      r = assigner_call(b, 0);
    }
    else if (t == ASSIGNMENT) {
      r = assignment(b, 0);
    }
    else if (t == ATTACHMENT_MARK) {
      r = attachment_mark(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = attribute(b, 0);
    }
    else if (t == BASIC_EXPRESSION) {
      r = basic_expression(b, 0);
    }
    else if (t == BOOLEAN_LOOP) {
      r = boolean_loop(b, 0);
    }
    else if (t == BRACKET_EXPRESSION) {
      r = bracket_expression(b, 0);
    }
    else if (t == BRACKET_TARGET) {
      r = bracket_target(b, 0);
    }
    else if (t == CALL_AGENT) {
      r = call_agent(b, 0);
    }
    else if (t == CALL_AGENT_BODY) {
      r = call_agent_body(b, 0);
    }
    else if (t == CASTING_CALL) {
      r = casting_call(b, 0);
    }
    else if (t == CHECK) {
      r = check(b, 0);
    }
    else if (t == CHOICE) {
      r = choice(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = class_declaration(b, 0);
    }
    else if (t == CLASS_HEADER) {
      r = class_header(b, 0);
    }
    else if (t == CLASS_NAME) {
      r = class_name(b, 0);
    }
    else if (t == CLIENT_SPECIFIER) {
      r = client_specifier(b, 0);
    }
    else if (t == CLIENTS) {
      r = clients(b, 0);
    }
    else if (t == COMMENT) {
      r = comment(b, 0);
    }
    else if (t == COMPOUND) {
      r = compound(b, 0);
    }
    else if (t == CONDITIONAL) {
      r = conditional(b, 0);
    }
    else if (t == CONSTANT_ATTRIBUTE) {
      r = constant_attribute(b, 0);
    }
    else if (t == CONSTANT_INTERVAL) {
      r = constant_interval(b, 0);
    }
    else if (t == CONSTRAINING_TYPES) {
      r = constraining_types(b, 0);
    }
    else if (t == CONSTRAINT_CREATORS) {
      r = constraint_creators(b, 0);
    }
    else if (t == CONVERSION_PROCEDURE) {
      r = conversion_procedure(b, 0);
    }
    else if (t == CONVERSION_QUERY) {
      r = conversion_query(b, 0);
    }
    else if (t == CONVERTERS) {
      r = converters(b, 0);
    }
    else if (t == CREATION_EXPRESSION) {
      r = creation_expression(b, 0);
    }
    else if (t == CREATION_INSTRUCTION) {
      r = creation_instruction(b, 0);
    }
    else if (t == CREATORS) {
      r = creators(b, 0);
    }
    else if (t == DEBUG) {
      r = debug(b, 0);
    }
    else if (t == DEFERRED) {
      r = deferred(b, 0);
    }
    else if (t == ENTITY) {
      r = entity(b, 0);
    }
    else if (t == ENTITY_DECLARATION_GROUP) {
      r = entity_declaration_group(b, 0);
    }
    else if (t == ENTITY_IDENTIFIER) {
      r = entity_identifier(b, 0);
    }
    else if (t == EXIT_CONDITION) {
      r = exit_condition(b, 0);
    }
    else if (t == EXPLICIT_VALUE) {
      r = explicit_value(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == EXT) {
      r = ext(b, 0);
    }
    else if (t == EXTERNAL_ARGUMENT_TYPES) {
      r = external_argument_types(b, 0);
    }
    else if (t == EXTERNAL_FILE) {
      r = external_file(b, 0);
    }
    else if (t == EXTERNAL_FILE_LIST) {
      r = external_file_list(b, 0);
    }
    else if (t == EXTERNAL_FILE_USE) {
      r = external_file_use(b, 0);
    }
    else if (t == EXTERNAL_LANGUAGE) {
      r = external_language(b, 0);
    }
    else if (t == EXTERNAL_NAME) {
      r = external_name(b, 0);
    }
    else if (t == EXTERNAL_SIGNATURE) {
      r = external_signature(b, 0);
    }
    else if (t == EXTERNAL_SYSTEM_FILE) {
      r = external_system_file(b, 0);
    }
    else if (t == EXTERNAL_TYPE) {
      r = external_type(b, 0);
    }
    else if (t == EXTERNAL_TYPE_LIST) {
      r = external_type_list(b, 0);
    }
    else if (t == EXTERNAL_USER_FILE) {
      r = external_user_file(b, 0);
    }
    else if (t == FEATURE_ADAPTION) {
      r = feature_adaption(b, 0);
    }
    else if (t == FEATURE_CLAUSE) {
      r = feature_clause(b, 0);
    }
    else if (t == FEATURE_DECLARATION) {
      r = feature_declaration(b, 0);
    }
    else if (t == FEATURE_LIST) {
      r = feature_list(b, 0);
    }
    else if (t == FEATURE_NAME) {
      r = feature_name(b, 0);
    }
    else if (t == FEATURE_VALUE) {
      r = feature_value(b, 0);
    }
    else if (t == FEATURES) {
      r = features(b, 0);
    }
    else if (t == FORMAL) {
      r = formal(b, 0);
    }
    else if (t == FORMAL_ARGUMENTS) {
      r = formal_arguments(b, 0);
    }
    else if (t == FORMAL_GENERIC) {
      r = formal_generic(b, 0);
    }
    else if (t == FORMAL_GENERIC_NAME) {
      r = formal_generic_name(b, 0);
    }
    else if (t == FORMAL_GENERICS) {
      r = formal_generics(b, 0);
    }
    else if (t == HEADER_COMMENT) {
      r = header_comment(b, 0);
    }
    else if (t == HEADER_MARK) {
      r = header_mark(b, 0);
    }
    else if (t == INHERITANCE) {
      r = inheritance(b, 0);
    }
    else if (t == INITIALIZATION) {
      r = initialization(b, 0);
    }
    else if (t == INLINE_AGENT) {
      r = inline_agent(b, 0);
    }
    else if (t == INSTRUCTION) {
      r = instruction(b, 0);
    }
    else if (t == INVARIANT) {
      r = invariant(b, 0);
    }
    else if (t == ITERATION) {
      r = iteration(b, 0);
    }
    else if (t == LOCAL) {
      r = local(b, 0);
    }
    else if (t == LOCAL_DECLARATIONS) {
      r = local_declarations(b, 0);
    }
    else if (t == LOOP) {
      r = loop(b, 0);
    }
    else if (t == LOOP_BODY) {
      r = loop_body(b, 0);
    }
    else if (t == MANIFEST_CONSTANT) {
      r = manifest_constant(b, 0);
    }
    else if (t == MANIFEST_TUPLE) {
      r = manifest_tuple(b, 0);
    }
    else if (t == MESSAGE) {
      r = message(b, 0);
    }
    else if (t == MULTI_BRANCH) {
      r = multi_branch(b, 0);
    }
    else if (t == MULTIPLE_CONSTRAINT) {
      r = multiple_constraint(b, 0);
    }
    else if (t == NEW_EXPORTS) {
      r = new_exports(b, 0);
    }
    else if (t == NEW_FEATURE) {
      r = new_feature(b, 0);
    }
    else if (t == NON_CONFORMANCE) {
      r = non_conformance(b, 0);
    }
    else if (t == NON_OBJECT_CALL) {
      r = non_object_call(b, 0);
    }
    else if (t == NON_OBJECT_PARENTHESIZED_CALL) {
      r = non_object_parenthesized_call(b, 0);
    }
    else if (t == NOTE_ENTRY) {
      r = note_entry(b, 0);
    }
    else if (t == NOTE_ITEM) {
      r = note_item(b, 0);
    }
    else if (t == NOTE_NAME) {
      r = note_name(b, 0);
    }
    else if (t == NOTES) {
      r = notes(b, 0);
    }
    else if (t == OBJECT_CALL) {
      r = object_call(b, 0);
    }
    else if (t == OBJECT_TEST) {
      r = object_test(b, 0);
    }
    else if (t == OBSOLETE) {
      r = obsolete(b, 0);
    }
    else if (t == OLD) {
      r = old(b, 0);
    }
    else if (t == ONCE) {
      r = once(b, 0);
    }
    else if (t == ONCE_STRING) {
      r = once_string(b, 0);
    }
    else if (t == ONLY) {
      r = only(b, 0);
    }
    else if (t == PARENT) {
      r = parent(b, 0);
    }
    else if (t == PARENT_QUALIFICATION) {
      r = parent_qualification(b, 0);
    }
    else if (t == PARENTHESIZED) {
      r = parenthesized(b, 0);
    }
    else if (t == PLACEHOLDER) {
      r = placeholder(b, 0);
    }
    else if (t == POSTCONDITION) {
      r = postcondition(b, 0);
    }
    else if (t == PRECONDITION) {
      r = precondition(b, 0);
    }
    else if (t == PRECURSOR) {
      r = precursor(b, 0);
    }
    else if (t == READ_ONLY) {
      r = read_only(b, 0);
    }
    else if (t == REDEFINE) {
      r = redefine(b, 0);
    }
    else if (t == REGISTERED_LANGUAGE) {
      r = registered_language(b, 0);
    }
    else if (t == RENAME_PAIR) {
      r = rename_pair(b, 0);
    }
    else if (t == RESCUE) {
      r = rescue(b, 0);
    }
    else if (t == RETRY) {
      r = retry(b, 0);
    }
    else if (t == SELECT) {
      r = select(b, 0);
    }
    else if (t == SPECIAL_EXPRESSION) {
      r = special_expression(b, 0);
    }
    else if (t == TAG) {
      r = tag(b, 0);
    }
    else if (t == TUPLE_TYPE) {
      r = tuple_type(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == TYPE_INTERVAL) {
      r = type_interval(b, 0);
    }
    else if (t == UNDEFINE) {
      r = undefine(b, 0);
    }
    else if (t == UNQUALIFIED_CALL) {
      r = unqualified_call(b, 0);
    }
    else if (t == UNREGISTERED_LANGUAGE) {
      r = unregistered_language(b, 0);
    }
    else if (t == VARIABLE) {
      r = variable(b, 0);
    }
    else if (t == VARIANT) {
      r = variant(b, 0);
    }
    else if (t == WHEN_PART) {
      r = when_part(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return eiffelFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(BASIC_EXPRESSION, EXPRESSION, SPECIAL_EXPRESSION),
  };

  /* ********************************************************** */
  // expression
  static boolean across_expression(PsiBuilder b, int l) {
    return expression(b, l + 1);
  }

  /* ********************************************************** */
  // '[' type_list ']'
  public static boolean actual_generics(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_generics")) return false;
    if (!nextTokenIs(b, LEFT_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SQUARE_BRACKET);
    r = r && type_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_SQUARE_BRACKET);
    exit_section_(b, m, ACTUAL_GENERICS, r);
    return r;
  }

  /* ********************************************************** */
  // expression (',' expression)*
  public static boolean actual_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_LIST, "<actual list>");
    r = expression(b, l + 1);
    r = r && actual_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' expression)*
  private static boolean actual_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!actual_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "actual_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expression
  private static boolean actual_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parenthesized_actuals | bracketed_actuals
  public static boolean actuals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actuals")) return false;
    if (!nextTokenIs(b, "<actuals>", LEFT_PAREN, LEFT_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUALS, "<actuals>");
    r = parenthesized_actuals(b, l + 1);
    if (!r) r = bracketed_actuals(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '$' variable
  public static boolean address(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "address")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOLLAR);
    r = r && variable(b, l + 1);
    exit_section_(b, m, ADDRESS, r);
    return r;
  }

  /* ********************************************************** */
  // call_agent | inline_agent
  public static boolean agent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent")) return false;
    if (!nextTokenIs(b, AGENT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = call_agent(b, l + 1);
    if (!r) r = inline_agent(b, l + 1);
    exit_section_(b, m, AGENT, r);
    return r;
  }

  /* ********************************************************** */
  // expression | placeholder
  public static boolean agent_actual(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_actual")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGENT_ACTUAL, "<agent actual>");
    r = expression(b, l + 1);
    if (!r) r = placeholder(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // agent_actual (',' agent_actual)*
  public static boolean agent_actual_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_actual_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGENT_ACTUAL_LIST, "<agent actual list>");
    r = agent_actual(b, l + 1);
    r = r && agent_actual_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' agent_actual)*
  private static boolean agent_actual_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_actual_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!agent_actual_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "agent_actual_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' agent_actual
  private static boolean agent_actual_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_actual_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && agent_actual(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' agent_actual_list ')'
  public static boolean agent_actuals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_actuals")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && agent_actual_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, AGENT_ACTUALS, r);
    return r;
  }

  /* ********************************************************** */
  // agent_target '.' agent_unqualified
  public static boolean agent_qualified(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_qualified")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGENT_QUALIFIED, "<agent qualified>");
    r = agent_target(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && agent_unqualified(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity | parenthesized | manifest_type
  public static boolean agent_target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGENT_TARGET, "<agent target>");
    r = entity(b, l + 1);
    if (!r) r = parenthesized(b, l + 1);
    if (!r) r = manifest_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // feature_name [agent_actuals]
  public static boolean agent_unqualified(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_unqualified")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && agent_unqualified_1(b, l + 1);
    exit_section_(b, m, AGENT_UNQUALIFIED, r);
    return r;
  }

  // [agent_actuals]
  private static boolean agent_unqualified_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_unqualified_1")) return false;
    agent_actuals(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'alias' alias_name ['convert']
  static boolean alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias")) return false;
    if (!nextTokenIs(b, ALIAS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS_KEYWORD);
    r = r && alias_name(b, l + 1);
    r = r && alias_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['convert']
  private static boolean alias_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_2")) return false;
    consumeToken(b, CONVERT_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean alias_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_name")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, ALIAS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // feature_name | 'current'
  static boolean anchor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchor")) return false;
    if (!nextTokenIs(b, "", CURRENT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    if (!r) r = consumeToken(b, CURRENT_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ['detachable' | 'attached'] ['separate'] [attachment_mark] 'like' anchor
  static boolean anchored(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchored")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = anchored_0(b, l + 1);
    r = r && anchored_1(b, l + 1);
    r = r && anchored_2(b, l + 1);
    r = r && consumeToken(b, LIKE_KEYWORD);
    r = r && anchor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['detachable' | 'attached']
  private static boolean anchored_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchored_0")) return false;
    anchored_0_0(b, l + 1);
    return true;
  }

  // 'detachable' | 'attached'
  private static boolean anchored_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchored_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DETACHABLE_KEYWORD);
    if (!r) r = consumeToken(b, ATTACHED_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['separate']
  private static boolean anchored_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchored_1")) return false;
    consumeToken(b, SEPARATE_KEYWORD);
    return true;
  }

  // [attachment_mark]
  private static boolean anchored_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchored_2")) return false;
    attachment_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '<<' expression_list '>>'
  public static boolean array_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_literal")) return false;
    if (!nextTokenIs(b, LEFT_TRIANGLE_DBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_TRIANGLE_DBRACKET);
    r = r && expression_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_TRIANGLE_DBRACKET);
    exit_section_(b, m, ARRAY_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // (assertion_clause ';'?)*
  static boolean assertion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion")) return false;
    int c = current_position_(b);
    while (true) {
      if (!assertion_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assertion", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // assertion_clause ';'?
  private static boolean assertion_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assertion_clause(b, l + 1);
    r = r && assertion_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean assertion_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // (tag_mark unlabeled_assertion_clause) | tag_mark | unlabeled_assertion_clause
  public static boolean assertion_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERTION_CLAUSE, "<assertion clause>");
    r = assertion_clause_0(b, l + 1);
    if (!r) r = tag_mark(b, l + 1);
    if (!r) r = unlabeled_assertion_clause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tag_mark unlabeled_assertion_clause
  private static boolean assertion_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_clause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag_mark(b, l + 1);
    r = r && unlabeled_assertion_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression ':=' expression
  public static boolean assigner_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assigner_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNER_CALL, "<assigner call>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'assign' feature_name
  static boolean assigner_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assigner_mark")) return false;
    if (!nextTokenIs(b, ASSIGN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN_KEYWORD);
    r = r && feature_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable ':=' expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, "<assignment>", RESULT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = variable(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'attached' attached_object_test_type? ('current' | call) attached_object_test_redefinition?
  static boolean attached_object_test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attached_object_test")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ATTACHED_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, attached_object_test_1(b, l + 1));
    r = p && report_error_(b, attached_object_test_2(b, l + 1)) && r;
    r = p && attached_object_test_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, keyword_or_identifier_recovery_parser_);
    return r || p;
  }

  // attached_object_test_type?
  private static boolean attached_object_test_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attached_object_test_1")) return false;
    attached_object_test_type(b, l + 1);
    return true;
  }

  // 'current' | call
  private static boolean attached_object_test_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attached_object_test_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURRENT_KEYWORD);
    if (!r) r = call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attached_object_test_redefinition?
  private static boolean attached_object_test_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attached_object_test_3")) return false;
    attached_object_test_redefinition(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'as' IDENTIFIER
  static boolean attached_object_test_redefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attached_object_test_redefinition")) return false;
    if (!nextTokenIs(b, AS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS_KEYWORD, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' type '}'
  static boolean attached_object_test_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attached_object_test_type")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '?' | '!'
  public static boolean attachment_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attachment_mark")) return false;
    if (!nextTokenIs(b, "<attachment mark>", EXCLAMATION, QUESTION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTACHMENT_MARK, "<attachment mark>");
    r = consumeToken(b, QUESTION);
    if (!r) r = consumeToken(b, EXCLAMATION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'attribute' compound
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, ATTRIBUTE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // [precondition] [local_declarations] feature_body [postcondition] [rescue] END_KEYWORD
  static boolean attribute_or_routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_or_routine")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = attribute_or_routine_0(b, l + 1);
    r = r && attribute_or_routine_1(b, l + 1);
    r = r && feature_body(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, attribute_or_routine_3(b, l + 1));
    r = p && report_error_(b, attribute_or_routine_4(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [precondition]
  private static boolean attribute_or_routine_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_or_routine_0")) return false;
    precondition(b, l + 1);
    return true;
  }

  // [local_declarations]
  private static boolean attribute_or_routine_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_or_routine_1")) return false;
    local_declarations(b, l + 1);
    return true;
  }

  // [postcondition]
  private static boolean attribute_or_routine_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_or_routine_3")) return false;
    postcondition(b, l + 1);
    return true;
  }

  // [rescue]
  private static boolean attribute_or_routine_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_or_routine_4")) return false;
    rescue(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (basic_expression_term operator expression) | (basic_expression_term '=' expression) | (operator expression) | basic_expression_term
  public static boolean basic_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BASIC_EXPRESSION, "<basic expression>");
    r = basic_expression_0(b, l + 1);
    if (!r) r = basic_expression_1(b, l + 1);
    if (!r) r = basic_expression_2(b, l + 1);
    if (!r) r = basic_expression_term(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // basic_expression_term operator expression
  private static boolean basic_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_expression_term(b, l + 1);
    r = r && operator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // basic_expression_term '=' expression
  private static boolean basic_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_expression_term(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // operator expression
  private static boolean basic_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = operator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // array_literal |
  //     object_test |
  //     parenthesized |
  //     creation_expression |
  //     call |
  //     local |
  //     read_only |
  //     boolean_loop |
  //     precursor |
  //     manifest_tuple |
  //     //equality |
  //     old |
  //     //operator_expression |
  //     bracket_expression |
  //     manifest_constant
  static boolean basic_expression_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression_term")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_literal(b, l + 1);
    if (!r) r = object_test(b, l + 1);
    if (!r) r = parenthesized(b, l + 1);
    if (!r) r = creation_expression(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = local(b, l + 1);
    if (!r) r = read_only(b, l + 1);
    if (!r) r = boolean_loop(b, l + 1);
    if (!r) r = precursor(b, l + 1);
    if (!r) r = manifest_tuple(b, l + 1);
    if (!r) r = old(b, l + 1);
    if (!r) r = bracket_expression(b, l + 1);
    if (!r) r = manifest_constant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('and' 'then') | ('or' 'else') | 'and' | 'or' | 'implies'
  static boolean binary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binary_operator_0(b, l + 1);
    if (!r) r = binary_operator_1(b, l + 1);
    if (!r) r = consumeToken(b, AND_KEYWORD);
    if (!r) r = consumeToken(b, OR_KEYWORD);
    if (!r) r = consumeToken(b, IMPLIES_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'and' 'then'
  private static boolean binary_operator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_operator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AND_KEYWORD, THEN_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'or' 'else'
  private static boolean binary_operator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_operator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OR_KEYWORD, ELSE_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TRUE_KEYWORD | FALSE_KEYWORD
  static boolean boolean_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_constant")) return false;
    if (!nextTokenIs(b, "", FALSE_KEYWORD, TRUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRUE_KEYWORD);
    if (!r) r = consumeToken(b, FALSE_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // object_test | basic_expression | boolean_constant
  static boolean boolean_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_test(b, l + 1);
    if (!r) r = basic_expression(b, l + 1);
    if (!r) r = boolean_constant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // iteration
  //     (('all' boolean_expression) | ('some' boolean_expression))
  //     'end'
  public static boolean boolean_loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_loop")) return false;
    if (!nextTokenIs(b, ACROSS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = iteration(b, l + 1);
    r = r && boolean_loop_1(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, BOOLEAN_LOOP, r);
    return r;
  }

  // ('all' boolean_expression) | ('some' boolean_expression)
  private static boolean boolean_loop_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_loop_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = boolean_loop_1_0(b, l + 1);
    if (!r) r = boolean_loop_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'all' boolean_expression
  private static boolean boolean_loop_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_loop_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALL_KEYWORD);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'some' boolean_expression
  private static boolean boolean_loop_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_loop_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SOME_KEYWORD);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bracket_target '[' actuals ']'
  public static boolean bracket_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BRACKET_EXPRESSION, "<bracket expression>");
    r = bracket_target(b, l + 1);
    r = r && consumeToken(b, LEFT_SQUARE_BRACKET);
    r = r && actuals(b, l + 1);
    r = r && consumeToken(b, RIGHT_SQUARE_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // target | once_string | manifest_constant | manifest_tuple
  public static boolean bracket_target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BRACKET_TARGET, "<bracket target>");
    r = target(b, l + 1);
    if (!r) r = once_string(b, l + 1);
    if (!r) r = manifest_constant(b, l + 1);
    if (!r) r = manifest_tuple(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' actual_list ']'
  static boolean bracketed_actuals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketed_actuals")) return false;
    if (!nextTokenIs(b, LEFT_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SQUARE_BRACKET);
    r = r && actual_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_SQUARE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // object_call | non_object_call | non_object_parenthesized_call | casting_call
  static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_call(b, l + 1);
    if (!r) r = non_object_call(b, l + 1);
    if (!r) r = non_object_parenthesized_call(b, l + 1);
    if (!r) r = casting_call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'agent' call_agent_body
  public static boolean call_agent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_agent")) return false;
    if (!nextTokenIs(b, AGENT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AGENT_KEYWORD);
    r = r && call_agent_body(b, l + 1);
    exit_section_(b, m, CALL_AGENT, r);
    return r;
  }

  /* ********************************************************** */
  // agent_qualified | agent_unqualified
  public static boolean call_agent_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_agent_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_AGENT_BODY, "<call agent body>");
    r = agent_qualified(b, l + 1);
    if (!r) r = agent_unqualified(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' type '}' actuals
  public static boolean casting_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "casting_call")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    r = r && actuals(b, l + 1);
    exit_section_(b, m, CASTING_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // CHARACTER_LITERAL
  static boolean character_constant(PsiBuilder b, int l) {
    return consumeToken(b, CHARACTER_LITERAL);
  }

  /* ********************************************************** */
  // 'check' assertion [notes] ['then' compound] 'end'
  public static boolean check(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "check")) return false;
    if (!nextTokenIs(b, CHECK_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHECK_KEYWORD);
    r = r && assertion(b, l + 1);
    r = r && check_2(b, l + 1);
    r = r && check_3(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, CHECK, r);
    return r;
  }

  // [notes]
  private static boolean check_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "check_2")) return false;
    notes(b, l + 1);
    return true;
  }

  // ['then' compound]
  private static boolean check_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "check_3")) return false;
    check_3_0(b, l + 1);
    return true;
  }

  // 'then' compound
  private static boolean check_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "check_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THEN_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constant_interval | type_interval | constant | manifest_type
  public static boolean choice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICE, "<choice>");
    r = constant_interval(b, l + 1);
    if (!r) r = type_interval(b, l + 1);
    if (!r) r = constant(b, l + 1);
    if (!r) r = manifest_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // choice (',' choice)*
  static boolean choices(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choice(b, l + 1);
    r = r && choices_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' choice)*
  private static boolean choices_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!choices_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "choices_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' choice
  private static boolean choices_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && choice(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [notes]
  //     class_header
  //     [formal_generics]
  //     [obsolete]
  //     [inheritance]
  //     [creators]
  //     [converters]
  //     [features]
  //     [notes]
  //     [invariant]
  //     [notes]
  //     'end'
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && class_header(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, class_declaration_2(b, l + 1));
    r = p && report_error_(b, class_declaration_3(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_4(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_5(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_6(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_7(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_8(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_9(b, l + 1)) && r;
    r = p && report_error_(b, class_declaration_10(b, l + 1)) && r;
    r = p && consumeToken(b, END_KEYWORD) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [notes]
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    notes(b, l + 1);
    return true;
  }

  // [formal_generics]
  private static boolean class_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_2")) return false;
    formal_generics(b, l + 1);
    return true;
  }

  // [obsolete]
  private static boolean class_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_3")) return false;
    obsolete(b, l + 1);
    return true;
  }

  // [inheritance]
  private static boolean class_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_4")) return false;
    inheritance(b, l + 1);
    return true;
  }

  // [creators]
  private static boolean class_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_5")) return false;
    creators(b, l + 1);
    return true;
  }

  // [converters]
  private static boolean class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_6")) return false;
    converters(b, l + 1);
    return true;
  }

  // [features]
  private static boolean class_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_7")) return false;
    features(b, l + 1);
    return true;
  }

  // [notes]
  private static boolean class_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_8")) return false;
    notes(b, l + 1);
    return true;
  }

  // [invariant]
  private static boolean class_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_9")) return false;
    invariant(b, l + 1);
    return true;
  }

  // [notes]
  private static boolean class_declaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_10")) return false;
    notes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [header_mark] 'class' class_name
  public static boolean class_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_header")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS_HEADER, "<class header>");
    r = class_header_0(b, l + 1);
    r = r && consumeToken(b, CLASS_KEYWORD);
    p = r; // pin = 2
    r = r && class_name(b, l + 1);
    exit_section_(b, l, m, r, p, class_header_recovery_parser_);
    return r || p;
  }

  // [header_mark]
  private static boolean class_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_header_0")) return false;
    header_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !keyword_recovery_
  static boolean class_header_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_header_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !keyword_recovery_(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_name (','? class_name)*
  static boolean class_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_list")) return false;
    if (!nextTokenIs(b, "", TUPLE_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    r = r && class_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','? class_name)*
  private static boolean class_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!class_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','? class_name
  private static boolean class_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_list_1_0_0(b, l + 1);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean class_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | 'tuple'
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    if (!nextTokenIs(b, "<class name>", TUPLE_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_NAME, "<class name>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, TUPLE_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tuple_type | class_type
  static boolean class_or_tuple_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_or_tuple_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple_type(b, l + 1);
    if (!r) r = class_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ['detachable' | 'attached'] ['separate'] [attachment_mark] class_name [actual_generics]
  static boolean class_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_type_0(b, l + 1);
    r = r && class_type_1(b, l + 1);
    r = r && class_type_2(b, l + 1);
    r = r && class_name(b, l + 1);
    r = r && class_type_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['detachable' | 'attached']
  private static boolean class_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_0")) return false;
    class_type_0_0(b, l + 1);
    return true;
  }

  // 'detachable' | 'attached'
  private static boolean class_type_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DETACHABLE_KEYWORD);
    if (!r) r = consumeToken(b, ATTACHED_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['separate']
  private static boolean class_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_1")) return false;
    consumeToken(b, SEPARATE_KEYWORD);
    return true;
  }

  // [attachment_mark]
  private static boolean class_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_2")) return false;
    attachment_mark(b, l + 1);
    return true;
  }

  // [actual_generics]
  private static boolean class_type_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_4")) return false;
    actual_generics(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // class_list | 'none' | 'all'
  public static boolean client_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "client_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLIENT_SPECIFIER, "<client specifier>");
    r = class_list(b, l + 1);
    if (!r) r = consumeToken(b, NONE_KEYWORD);
    if (!r) r = consumeToken(b, ALL_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' client_specifier '}'
  public static boolean clients(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clients")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLIENTS, null);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, client_specifier(b, l + 1));
    r = p && consumeToken(b, RIGHT_CURLY_BRACKET) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // COMMENT_ONELINE
  public static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, COMMENT_ONELINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT_ONELINE);
    exit_section_(b, m, COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // (instruction ';'?)*
  public static boolean compound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound")) return false;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND, "<compound>");
    int c = current_position_(b);
    while (true) {
      if (!compound_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compound", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // instruction ';'?
  private static boolean compound_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instruction(b, l + 1);
    r = r && compound_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean compound_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // 'if' then_part_list [else_part] 'end'
  public static boolean conditional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional")) return false;
    if (!nextTokenIs(b, IF_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF_KEYWORD);
    r = r && then_part_list(b, l + 1);
    r = r && conditional_2(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, CONDITIONAL, r);
    return r;
  }

  // [else_part]
  private static boolean conditional_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_2")) return false;
    else_part(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // manifest_constant | constant_attribute
  static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_constant(b, l + 1);
    if (!r) r = constant_attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // feature_name
  public static boolean constant_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_attribute")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    exit_section_(b, m, CONSTANT_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // constant '..' constant
  public static boolean constant_interval(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_interval")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_INTERVAL, "<constant interval>");
    r = constant(b, l + 1);
    r = r && consumeToken(b, DDOT);
    r = r && constant(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // single_constraint | multiple_constraint
  public static boolean constraining_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraining_types")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINING_TYPES, "<constraining types>");
    r = single_constraint(b, l + 1);
    if (!r) r = multiple_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '->' constraining_types [constraint_creators]
  static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    if (!nextTokenIs(b, ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && constraining_types(b, l + 1);
    r = r && constraint_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [constraint_creators]
  private static boolean constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_2")) return false;
    constraint_creators(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'create' feature_list 'end'
  public static boolean constraint_creators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_creators")) return false;
    if (!nextTokenIs(b, CREATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE_KEYWORD);
    r = r && feature_list(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, CONSTRAINT_CREATORS, r);
    return r;
  }

  /* ********************************************************** */
  // single_constraint (',' single_constraint)*
  static boolean constraint_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_constraint(b, l + 1);
    r = r && constraint_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' single_constraint)*
  private static boolean constraint_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!constraint_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constraint_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' single_constraint
  private static boolean constraint_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && single_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // feature_name '(' '{' type_list '}' ')'
  public static boolean conversion_procedure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conversion_procedure")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && consumeTokens(b, 0, LEFT_PAREN, LEFT_CURLY_BRACKET);
    r = r && type_list(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_CURLY_BRACKET, RIGHT_PAREN);
    exit_section_(b, m, CONVERSION_PROCEDURE, r);
    return r;
  }

  /* ********************************************************** */
  // feature_name ':' '{' type_list '}'
  public static boolean conversion_query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conversion_query")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, LEFT_CURLY_BRACKET);
    r = r && type_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, CONVERSION_QUERY, r);
    return r;
  }

  /* ********************************************************** */
  // conversion_procedure | conversion_query
  static boolean converter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conversion_procedure(b, l + 1);
    if (!r) r = conversion_query(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // converter (',' converter)*
  static boolean converter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = converter(b, l + 1);
    r = r && converter_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' converter)*
  private static boolean converter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!converter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "converter_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' converter
  private static boolean converter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && converter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'convert' converter_list
  public static boolean converters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converters")) return false;
    if (!nextTokenIs(b, CONVERT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONVERT_KEYWORD);
    r = r && converter_list(b, l + 1);
    exit_section_(b, m, CONVERTERS, r);
    return r;
  }

  /* ********************************************************** */
  // variable [explicit_creation_call]
  static boolean creation_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_call")) return false;
    if (!nextTokenIs(b, "", RESULT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable(b, l + 1);
    r = r && creation_call_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [explicit_creation_call]
  private static boolean creation_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_call_1")) return false;
    explicit_creation_call(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'create' [clients] [header_comment] creation_procedure_list
  static boolean creation_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_clause")) return false;
    if (!nextTokenIs(b, CREATE_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, CREATE_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, creation_clause_1(b, l + 1));
    r = p && report_error_(b, creation_clause_2(b, l + 1)) && r;
    r = p && creation_procedure_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [clients]
  private static boolean creation_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_clause_1")) return false;
    clients(b, l + 1);
    return true;
  }

  // [header_comment]
  private static boolean creation_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_clause_2")) return false;
    header_comment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'create' explicit_creation_type [explicit_creation_call]
  public static boolean creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_expression")) return false;
    if (!nextTokenIs(b, CREATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE_KEYWORD);
    r = r && explicit_creation_type(b, l + 1);
    r = r && creation_expression_2(b, l + 1);
    exit_section_(b, m, CREATION_EXPRESSION, r);
    return r;
  }

  // [explicit_creation_call]
  private static boolean creation_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_expression_2")) return false;
    explicit_creation_call(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'create' [explicit_creation_type] creation_call
  public static boolean creation_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_instruction")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CREATION_INSTRUCTION, "<creation instruction>");
    r = consumeToken(b, CREATE_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, creation_instruction_1(b, l + 1));
    r = p && creation_call(b, l + 1) && r;
    exit_section_(b, l, m, r, p, keyword_or_identifier_recovery_parser_);
    return r || p;
  }

  // [explicit_creation_type]
  private static boolean creation_instruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_instruction_1")) return false;
    explicit_creation_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // feature_name
  static boolean creation_procedure(PsiBuilder b, int l) {
    return feature_name(b, l + 1);
  }

  /* ********************************************************** */
  // creation_procedure (',' creation_procedure)*
  static boolean creation_procedure_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_procedure_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = creation_procedure(b, l + 1);
    r = r && creation_procedure_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' creation_procedure)*
  private static boolean creation_procedure_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_procedure_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!creation_procedure_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "creation_procedure_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' creation_procedure
  private static boolean creation_procedure_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_procedure_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && creation_procedure(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // creation_clause+
  public static boolean creators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creators")) return false;
    if (!nextTokenIs(b, CREATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = creation_clause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!creation_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "creators", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, CREATORS, r);
    return r;
  }

  /* ********************************************************** */
  // 'debug' ['(' key_list ')'] compound 'end'
  public static boolean debug(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debug")) return false;
    if (!nextTokenIs(b, DEBUG_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEBUG_KEYWORD);
    r = r && debug_1(b, l + 1);
    r = r && compound(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, DEBUG, r);
    return r;
  }

  // ['(' key_list ')']
  private static boolean debug_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debug_1")) return false;
    debug_1_0(b, l + 1);
    return true;
  }

  // '(' key_list ')'
  private static boolean debug_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debug_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && key_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [formal_arguments] [query_mark] [feature_value]
  static boolean declaration_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration_body_0(b, l + 1);
    r = r && declaration_body_1(b, l + 1);
    r = r && declaration_body_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [formal_arguments]
  private static boolean declaration_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_body_0")) return false;
    formal_arguments(b, l + 1);
    return true;
  }

  // [query_mark]
  private static boolean declaration_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_body_1")) return false;
    query_mark(b, l + 1);
    return true;
  }

  // [feature_value]
  private static boolean declaration_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_body_2")) return false;
    feature_value(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'deferred'
  public static boolean deferred(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deferred")) return false;
    if (!nextTokenIs(b, DEFERRED_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFERRED_KEYWORD);
    exit_section_(b, m, DEFERRED, r);
    return r;
  }

  /* ********************************************************** */
  // '{' IDENTIFIER ':' type '}' expression
  static boolean deprecated_object_test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecated_object_test")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_CURLY_BRACKET, IDENTIFIER, COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // internal | ext
  static boolean effective_routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "effective_routine")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = internal(b, l + 1);
    if (!r) r = ext(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_declaration
  static boolean eiffelFile(PsiBuilder b, int l) {
    return class_declaration(b, l + 1);
  }

  /* ********************************************************** */
  // 'else' compound
  static boolean else_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_part")) return false;
    if (!nextTokenIs(b, ELSE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variable | read_only
  public static boolean entity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY, "<entity>");
    r = variable(b, l + 1);
    if (!r) r = read_only(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity_identifier_list type_mark
  public static boolean entity_declaration_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_group")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_identifier_list(b, l + 1);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, ENTITY_DECLARATION_GROUP, r);
    return r;
  }

  /* ********************************************************** */
  // entity_declaration_group (';'? entity_declaration_group)*
  static boolean entity_declaration_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_declaration_group(b, l + 1);
    r = r && entity_declaration_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';'? entity_declaration_group)*
  private static boolean entity_declaration_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!entity_declaration_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_declaration_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ';'? entity_declaration_group
  private static boolean entity_declaration_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_declaration_list_1_0_0(b, l + 1);
    r = r && entity_declaration_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean entity_declaration_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_list_1_0_0")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean entity_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENTITY_IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // entity_identifier (',' entity_identifier)*
  static boolean entity_identifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_identifier_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_identifier(b, l + 1);
    r = r && entity_identifier_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' entity_identifier)*
  private static boolean entity_identifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_identifier_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!entity_identifier_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "entity_identifier_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' entity_identifier
  private static boolean entity_identifier_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_identifier_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && entity_identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'until' boolean_expression
  public static boolean exit_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_condition")) return false;
    if (!nextTokenIs(b, UNTIL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL_KEYWORD);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, EXIT_CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // '.' unqualified_call
  static boolean explicit_creation_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_creation_call")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, DOT);
    p = r; // pin = 1
    r = r && unqualified_call(b, l + 1);
    exit_section_(b, l, m, r, p, explicit_creation_call_recovery_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // !(keyword_recovery_ | IDENTIFIER)
  static boolean explicit_creation_call_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_creation_call_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !explicit_creation_call_recovery_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // keyword_recovery_ | IDENTIFIER
  private static boolean explicit_creation_call_recovery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_creation_call_recovery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keyword_recovery_(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' type '}'
  static boolean explicit_creation_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_creation_type")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, type(b, l + 1));
    r = p && consumeToken(b, RIGHT_CURLY_BRACKET) && r;
    exit_section_(b, l, m, r, p, keyword_or_identifier_recovery_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // '=' manifest_constant
  public static boolean explicit_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_value")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPLICIT_VALUE, "<explicit value>");
    r = consumeToken(b, EQ);
    p = r; // pin = 1
    r = r && manifest_constant(b, l + 1);
    exit_section_(b, l, m, r, p, explicit_value_recovery_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // !(keyword_recovery_ | IDENTIFIER)
  static boolean explicit_value_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_value_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !explicit_value_recovery_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // keyword_recovery_ | IDENTIFIER
  private static boolean explicit_value_recovery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_value_recovery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keyword_recovery_(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // basic_expression | special_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = basic_expression(b, l + 1);
    if (!r) r = special_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (expression (',' expression)*)?
  static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    expression_list_0(b, l + 1);
    return true;
  }

  // expression (',' expression)*
  private static boolean expression_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expression_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expression)*
  private static boolean expression_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_list_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expression
  private static boolean expression_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EXTERNAL_KEYWORD external_language [external_name]
  public static boolean ext(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ext")) return false;
    if (!nextTokenIs(b, EXTERNAL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTERNAL_KEYWORD);
    r = r && external_language(b, l + 1);
    r = r && ext_2(b, l + 1);
    exit_section_(b, m, EXT, r);
    return r;
  }

  // [external_name]
  private static boolean ext_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ext_2")) return false;
    external_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // feature_name [alias]
  static boolean extended_feature_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extended_feature_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && extended_feature_name_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [alias]
  private static boolean extended_feature_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extended_feature_name_1")) return false;
    alias(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LEFT_PAREN external_type_list RIGHT_PAREN
  public static boolean external_argument_types(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_argument_types")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && external_type_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, EXTERNAL_ARGUMENT_TYPES, r);
    return r;
  }

  /* ********************************************************** */
  // external_user_file | external_system_file
  public static boolean external_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_file")) return false;
    if (!nextTokenIs(b, "<external file>", DQUOTE, LT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_FILE, "<external file>");
    r = external_user_file(b, l + 1);
    if (!r) r = external_system_file(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // external_file (COMMA external_file)*
  public static boolean external_file_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_file_list")) return false;
    if (!nextTokenIs(b, "<external file list>", DQUOTE, LT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_FILE_LIST, "<external file list>");
    r = external_file(b, l + 1);
    r = r && external_file_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA external_file)*
  private static boolean external_file_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_file_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!external_file_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "external_file_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA external_file
  private static boolean external_file_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_file_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && external_file(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USE_KEYWORD external_file_list
  public static boolean external_file_use(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_file_use")) return false;
    if (!nextTokenIs(b, USE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE_KEYWORD);
    r = r && external_file_list(b, l + 1);
    exit_section_(b, m, EXTERNAL_FILE_USE, r);
    return r;
  }

  /* ********************************************************** */
  // unregistered_language | registered_language
  public static boolean external_language(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_language")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_LANGUAGE, "<external language>");
    r = unregistered_language(b, l + 1);
    if (!r) r = registered_language(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ALIAS_KEYWORD manifest_string
  public static boolean external_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_name")) return false;
    if (!nextTokenIs(b, ALIAS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS_KEYWORD);
    r = r && manifest_string(b, l + 1);
    exit_section_(b, m, EXTERNAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // SIGNATURE_KEYWORD [external_argument_types] [COLON external_type]
  public static boolean external_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_signature")) return false;
    if (!nextTokenIs(b, SIGNATURE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNATURE_KEYWORD);
    r = r && external_signature_1(b, l + 1);
    r = r && external_signature_2(b, l + 1);
    exit_section_(b, m, EXTERNAL_SIGNATURE, r);
    return r;
  }

  // [external_argument_types]
  private static boolean external_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_signature_1")) return false;
    external_argument_types(b, l + 1);
    return true;
  }

  // [COLON external_type]
  private static boolean external_signature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_signature_2")) return false;
    external_signature_2_0(b, l + 1);
    return true;
  }

  // COLON external_type
  private static boolean external_signature_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_signature_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && external_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LT STRING_ONELINE GT
  public static boolean external_system_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_system_file")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LT, STRING_ONELINE, GT);
    exit_section_(b, m, EXTERNAL_SYSTEM_FILE, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_ONELINE
  public static boolean external_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_type")) return false;
    if (!nextTokenIs(b, STRING_ONELINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_ONELINE);
    exit_section_(b, m, EXTERNAL_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // (external_type COMMA?)*
  public static boolean external_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_type_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_TYPE_LIST, "<external type list>");
    int c = current_position_(b);
    while (true) {
      if (!external_type_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "external_type_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // external_type COMMA?
  private static boolean external_type_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_type_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = external_type(b, l + 1);
    r = r && external_type_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean external_type_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_type_list_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // DQUOTE STRING_ONELINE DQUOTE
  public static boolean external_user_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_user_file")) return false;
    if (!nextTokenIs(b, DQUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DQUOTE, STRING_ONELINE, DQUOTE);
    exit_section_(b, m, EXTERNAL_USER_FILE, r);
    return r;
  }

  /* ********************************************************** */
  // [rename] [new_exports] [undefine] [redefine] [select] 'end'
  public static boolean feature_adaption(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_ADAPTION, "<feature adaption>");
    r = feature_adaption_0(b, l + 1);
    r = r && feature_adaption_1(b, l + 1);
    r = r && feature_adaption_2(b, l + 1);
    r = r && feature_adaption_3(b, l + 1);
    r = r && feature_adaption_4(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [rename]
  private static boolean feature_adaption_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_0")) return false;
    rename(b, l + 1);
    return true;
  }

  // [new_exports]
  private static boolean feature_adaption_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_1")) return false;
    new_exports(b, l + 1);
    return true;
  }

  // [undefine]
  private static boolean feature_adaption_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_2")) return false;
    undefine(b, l + 1);
    return true;
  }

  // [redefine]
  private static boolean feature_adaption_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_3")) return false;
    redefine(b, l + 1);
    return true;
  }

  // [select]
  private static boolean feature_adaption_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_4")) return false;
    select(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // deferred | effective_routine | attribute
  static boolean feature_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = deferred(b, l + 1);
    if (!r) r = effective_routine(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'feature' [clients] [header_comment] feature_declaration_list
  public static boolean feature_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_clause")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_CLAUSE, "<feature clause>");
    r = consumeToken(b, FEATURE_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, feature_clause_1(b, l + 1));
    r = p && report_error_(b, feature_clause_2(b, l + 1)) && r;
    r = p && feature_declaration_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, feature_clause_recovery_parser_);
    return r || p;
  }

  // [clients]
  private static boolean feature_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_clause_1")) return false;
    clients(b, l + 1);
    return true;
  }

  // [header_comment]
  private static boolean feature_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_clause_2")) return false;
    header_comment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !('feature' | 'invariant' | 'note' | 'end')
  static boolean feature_clause_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_clause_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !feature_clause_recovery_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'feature' | 'invariant' | 'note' | 'end'
  private static boolean feature_clause_recovery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_clause_recovery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FEATURE_KEYWORD);
    if (!r) r = consumeToken(b, INVARIANT_KEYWORD);
    if (!r) r = consumeToken(b, NOTE_KEYWORD);
    if (!r) r = consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // new_feature_list [declaration_body]
  public static boolean feature_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration")) return false;
    if (!nextTokenIs(b, "<feature declaration>", FROZEN_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_DECLARATION, "<feature declaration>");
    r = new_feature_list(b, l + 1);
    r = r && feature_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [declaration_body]
  private static boolean feature_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration_1")) return false;
    declaration_body(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (feature_declaration ';'?)*
  static boolean feature_declaration_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration_list")) return false;
    int c = current_position_(b);
    while (true) {
      if (!feature_declaration_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "feature_declaration_list", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // feature_declaration ';'?
  private static boolean feature_declaration_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_declaration(b, l + 1);
    r = r && feature_declaration_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean feature_declaration_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration_list_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // feature_name (','? feature_name)*
  public static boolean feature_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && feature_list_1(b, l + 1);
    exit_section_(b, m, FEATURE_LIST, r);
    return r;
  }

  // (','? feature_name)*
  private static boolean feature_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!feature_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "feature_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','? feature_name
  private static boolean feature_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_list_1_0_0(b, l + 1);
    r = r && feature_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean feature_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean feature_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FEATURE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // feature_list | 'all'
  static boolean feature_set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_set")) return false;
    if (!nextTokenIs(b, "", ALL_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_list(b, l + 1);
    if (!r) r = consumeToken(b, ALL_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (explicit_value [obsolete] [header_comment] [notes]) |
  //     ([obsolete] [header_comment] [notes] attribute_or_routine)
  public static boolean feature_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_VALUE, "<feature value>");
    r = feature_value_0(b, l + 1);
    if (!r) r = feature_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // explicit_value [obsolete] [header_comment] [notes]
  private static boolean feature_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = explicit_value(b, l + 1);
    r = r && feature_value_0_1(b, l + 1);
    r = r && feature_value_0_2(b, l + 1);
    r = r && feature_value_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [obsolete]
  private static boolean feature_value_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_0_1")) return false;
    obsolete(b, l + 1);
    return true;
  }

  // [header_comment]
  private static boolean feature_value_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_0_2")) return false;
    header_comment(b, l + 1);
    return true;
  }

  // [notes]
  private static boolean feature_value_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_0_3")) return false;
    notes(b, l + 1);
    return true;
  }

  // [obsolete] [header_comment] [notes] attribute_or_routine
  private static boolean feature_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_value_1_0(b, l + 1);
    r = r && feature_value_1_1(b, l + 1);
    r = r && feature_value_1_2(b, l + 1);
    r = r && attribute_or_routine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [obsolete]
  private static boolean feature_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_1_0")) return false;
    obsolete(b, l + 1);
    return true;
  }

  // [header_comment]
  private static boolean feature_value_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_1_1")) return false;
    header_comment(b, l + 1);
    return true;
  }

  // [notes]
  private static boolean feature_value_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_1_2")) return false;
    notes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // feature_clause+
  public static boolean features(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "features")) return false;
    if (!nextTokenIs(b, FEATURE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_clause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!feature_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "features", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, FEATURES, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean formal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FORMAL, r);
    return r;
  }

  /* ********************************************************** */
  // '(' entity_declaration_list ')'
  public static boolean formal_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_arguments")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && entity_declaration_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, FORMAL_ARGUMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // ['frozen'] formal_generic_name [constraint]
  public static boolean formal_generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_GENERIC, "<formal generic>");
    r = formal_generic_0(b, l + 1);
    r = r && formal_generic_name(b, l + 1);
    r = r && formal_generic_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['frozen']
  private static boolean formal_generic_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_0")) return false;
    consumeToken(b, FROZEN_KEYWORD);
    return true;
  }

  // [constraint]
  private static boolean formal_generic_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_2")) return false;
    constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // formal_generic (',' formal_generic)*
  static boolean formal_generic_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_generic(b, l + 1);
    r = r && formal_generic_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' formal_generic)*
  private static boolean formal_generic_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!formal_generic_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "formal_generic_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' formal_generic
  private static boolean formal_generic_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && formal_generic(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '?' | IDENTIFIER
  public static boolean formal_generic_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_name")) return false;
    if (!nextTokenIs(b, "<formal generic name>", QUESTION, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_GENERIC_NAME, "<formal generic name>");
    r = consumeToken(b, QUESTION);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' formal_generic_list ']'
  public static boolean formal_generics(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generics")) return false;
    if (!nextTokenIs(b, LEFT_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SQUARE_BRACKET);
    r = r && formal_generic_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_SQUARE_BRACKET);
    exit_section_(b, m, FORMAL_GENERICS, r);
    return r;
  }

  /* ********************************************************** */
  // comment
  public static boolean header_comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_comment")) return false;
    if (!nextTokenIs(b, COMMENT_ONELINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comment(b, l + 1);
    exit_section_(b, m, HEADER_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ['frozen'] ['expanded'] ['deferred']
  public static boolean header_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_mark")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER_MARK, "<header mark>");
    r = header_mark_0(b, l + 1);
    r = r && header_mark_1(b, l + 1);
    r = r && header_mark_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['frozen']
  private static boolean header_mark_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_mark_0")) return false;
    consumeToken(b, FROZEN_KEYWORD);
    return true;
  }

  // ['expanded']
  private static boolean header_mark_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_mark_1")) return false;
    consumeToken(b, EXPANDED_KEYWORD);
    return true;
  }

  // ['deferred']
  private static boolean header_mark_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_mark_2")) return false;
    consumeToken(b, DEFERRED_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // 'inherit' [non_conformance] parent_list
  static boolean inherit_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inherit_clause")) return false;
    if (!nextTokenIs(b, INHERIT_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, INHERIT_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, inherit_clause_1(b, l + 1));
    r = p && parent_list(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [non_conformance]
  private static boolean inherit_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inherit_clause_1")) return false;
    non_conformance(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // inherit_clause+
  public static boolean inheritance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inheritance")) return false;
    if (!nextTokenIs(b, INHERIT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inherit_clause(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!inherit_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inheritance", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, INHERITANCE, r);
    return r;
  }

  /* ********************************************************** */
  // 'from' compound
  public static boolean initialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialization")) return false;
    if (!nextTokenIs(b, FROM_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, INITIALIZATION, r);
    return r;
  }

  /* ********************************************************** */
  // 'agent' [formal_arguments] [type_mark] [attribute_or_routine] [agent_actuals]
  public static boolean inline_agent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_agent")) return false;
    if (!nextTokenIs(b, AGENT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AGENT_KEYWORD);
    r = r && inline_agent_1(b, l + 1);
    r = r && inline_agent_2(b, l + 1);
    r = r && inline_agent_3(b, l + 1);
    r = r && inline_agent_4(b, l + 1);
    exit_section_(b, m, INLINE_AGENT, r);
    return r;
  }

  // [formal_arguments]
  private static boolean inline_agent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_agent_1")) return false;
    formal_arguments(b, l + 1);
    return true;
  }

  // [type_mark]
  private static boolean inline_agent_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_agent_2")) return false;
    type_mark(b, l + 1);
    return true;
  }

  // [attribute_or_routine]
  private static boolean inline_agent_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_agent_3")) return false;
    attribute_or_routine(b, l + 1);
    return true;
  }

  // [agent_actuals]
  private static boolean inline_agent_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_agent_4")) return false;
    agent_actuals(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // conditional |
  //     creation_instruction |
  //     precursor |
  //     loop |
  //     multi_branch |
  //     assignment |
  //     assigner_call |
  //     call |
  //     debug |
  //     check |
  //     retry
  public static boolean instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTRUCTION, "<instruction>");
    r = conditional(b, l + 1);
    if (!r) r = creation_instruction(b, l + 1);
    if (!r) r = precursor(b, l + 1);
    if (!r) r = loop(b, l + 1);
    if (!r) r = multi_branch(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = assigner_call(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = debug(b, l + 1);
    if (!r) r = check(b, l + 1);
    if (!r) r = retry(b, l + 1);
    exit_section_(b, l, m, r, false, instruction_recovery_parser_);
    return r;
  }

  /* ********************************************************** */
  // !(
  //     keyword_recovery_ |
  //     instruction
  // )
  static boolean instruction_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !instruction_recovery_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // keyword_recovery_ |
  //     instruction
  private static boolean instruction_recovery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction_recovery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keyword_recovery_(b, l + 1);
    if (!r) r = instruction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  static boolean integer_constant(PsiBuilder b, int l) {
    return consumeToken(b, INTEGER_LITERAL);
  }

  /* ********************************************************** */
  // routine_mark compound
  static boolean internal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "internal")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = routine_mark(b, l + 1);
    p = r; // pin = 1
    r = r && compound(b, l + 1);
    exit_section_(b, l, m, r, p, internal_recovery_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // !keyword_recovery_
  static boolean internal_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "internal_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !keyword_recovery_(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'invariant' assertion
  public static boolean invariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invariant")) return false;
    if (!nextTokenIs(b, INVARIANT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVARIANT_KEYWORD);
    r = r && assertion(b, l + 1);
    exit_section_(b, m, INVARIANT, r);
    return r;
  }

  /* ********************************************************** */
  // 'across' across_expression 'as' IDENTIFIER
  public static boolean iteration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration")) return false;
    if (!nextTokenIs(b, ACROSS_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ITERATION, null);
    r = consumeToken(b, ACROSS_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, across_expression(b, l + 1));
    r = p && report_error_(b, consumeTokens(b, -1, AS_KEYWORD, IDENTIFIER)) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // manifest_string (','? manifest_string)*
  static boolean key_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_list")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_string(b, l + 1);
    r = r && key_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','? manifest_string)*
  private static boolean key_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!key_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "key_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','? manifest_string
  private static boolean key_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key_list_1_0_0(b, l + 1);
    r = r && manifest_string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean key_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // !(keyword_recovery_ | IDENTIFIER)
  static boolean keyword_or_identifier_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword_or_identifier_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !keyword_or_identifier_recovery_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // keyword_recovery_ | IDENTIFIER
  private static boolean keyword_or_identifier_recovery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword_or_identifier_recovery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keyword_recovery_(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !keyword_recovery_
  static boolean keyword_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !keyword_recovery_(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'if' |
  //     'then' |
  //     'else' |
  //     'create' |
  //     'from' |
  //     'until' |
  //     'end' |
  //     'ensure' |
  //     'elseif' |
  //     'across' |
  //     'when' |
  //     'do' |
  //     'require' |
  //     'inherit' |
  //     'feature' |
  //     'local' |
  //     'assign' |
  //     '(' | ')' | ';' | '=' | '{' | '}' | '[' | ']' |
  //     'result' |
  //     'precursor' |
  //     'variant' |
  //     'invariant' |
  //     'obsolete' |
  //     EXTERNAL_KEYWORD |
  //     'once' |
  //     'deferred' |
  //     'note' |
  //     'attached' |
  //     'check' |
  //     'and' |
  //     'or'
  static boolean keyword_recovery_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword_recovery_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF_KEYWORD);
    if (!r) r = consumeToken(b, THEN_KEYWORD);
    if (!r) r = consumeToken(b, ELSE_KEYWORD);
    if (!r) r = consumeToken(b, CREATE_KEYWORD);
    if (!r) r = consumeToken(b, FROM_KEYWORD);
    if (!r) r = consumeToken(b, UNTIL_KEYWORD);
    if (!r) r = consumeToken(b, END_KEYWORD);
    if (!r) r = consumeToken(b, ENSURE_KEYWORD);
    if (!r) r = consumeToken(b, ELSEIF_KEYWORD);
    if (!r) r = consumeToken(b, ACROSS_KEYWORD);
    if (!r) r = consumeToken(b, WHEN_KEYWORD);
    if (!r) r = consumeToken(b, DO_KEYWORD);
    if (!r) r = consumeToken(b, REQUIRE_KEYWORD);
    if (!r) r = consumeToken(b, INHERIT_KEYWORD);
    if (!r) r = consumeToken(b, FEATURE_KEYWORD);
    if (!r) r = consumeToken(b, LOCAL_KEYWORD);
    if (!r) r = consumeToken(b, ASSIGN_KEYWORD);
    if (!r) r = consumeToken(b, LEFT_PAREN);
    if (!r) r = consumeToken(b, RIGHT_PAREN);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, LEFT_CURLY_BRACKET);
    if (!r) r = consumeToken(b, RIGHT_CURLY_BRACKET);
    if (!r) r = consumeToken(b, LEFT_SQUARE_BRACKET);
    if (!r) r = consumeToken(b, RIGHT_SQUARE_BRACKET);
    if (!r) r = consumeToken(b, RESULT_KEYWORD);
    if (!r) r = consumeToken(b, PRECURSOR_KEYWORD);
    if (!r) r = consumeToken(b, VARIANT_KEYWORD);
    if (!r) r = consumeToken(b, INVARIANT_KEYWORD);
    if (!r) r = consumeToken(b, OBSOLETE_KEYWORD);
    if (!r) r = consumeToken(b, EXTERNAL_KEYWORD);
    if (!r) r = consumeToken(b, ONCE_KEYWORD);
    if (!r) r = consumeToken(b, DEFERRED_KEYWORD);
    if (!r) r = consumeToken(b, NOTE_KEYWORD);
    if (!r) r = consumeToken(b, ATTACHED_KEYWORD);
    if (!r) r = consumeToken(b, CHECK_KEYWORD);
    if (!r) r = consumeToken(b, AND_KEYWORD);
    if (!r) r = consumeToken(b, OR_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | 'result'
  public static boolean local(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local")) return false;
    if (!nextTokenIs(b, "<local>", RESULT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL, "<local>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, RESULT_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'local' [entity_declaration_list]
  public static boolean local_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_declarations")) return false;
    if (!nextTokenIs(b, LOCAL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCAL_KEYWORD);
    r = r && local_declarations_1(b, l + 1);
    exit_section_(b, m, LOCAL_DECLARATIONS, r);
    return r;
  }

  // [entity_declaration_list]
  private static boolean local_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_declarations_1")) return false;
    entity_declaration_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (initialization [invariant] exit_condition loop_body [variant] 'end') |
  //     (iteration loop_body 'end')
  public static boolean loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop")) return false;
    if (!nextTokenIs(b, "<loop>", ACROSS_KEYWORD, FROM_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP, "<loop>");
    r = loop_0(b, l + 1);
    if (!r) r = loop_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // initialization [invariant] exit_condition loop_body [variant] 'end'
  private static boolean loop_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initialization(b, l + 1);
    r = r && loop_0_1(b, l + 1);
    r = r && exit_condition(b, l + 1);
    r = r && loop_body(b, l + 1);
    r = r && loop_0_4(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [invariant]
  private static boolean loop_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_0_1")) return false;
    invariant(b, l + 1);
    return true;
  }

  // [variant]
  private static boolean loop_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_0_4")) return false;
    variant(b, l + 1);
    return true;
  }

  // iteration loop_body 'end'
  private static boolean loop_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = iteration(b, l + 1);
    r = r && loop_body(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('loop' compound) | ('all' boolean_expression) | ('some' boolean_expression)
  public static boolean loop_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_BODY, "<loop body>");
    r = loop_body_0(b, l + 1);
    if (!r) r = loop_body_1(b, l + 1);
    if (!r) r = loop_body_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'loop' compound
  private static boolean loop_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOOP_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'all' boolean_expression
  private static boolean loop_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALL_KEYWORD);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'some' boolean_expression
  private static boolean loop_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_body_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SOME_KEYWORD);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [manifest_type] manifest_value
  public static boolean manifest_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MANIFEST_CONSTANT, "<manifest constant>");
    r = manifest_constant_0(b, l + 1);
    r = r && manifest_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [manifest_type]
  private static boolean manifest_constant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_constant_0")) return false;
    manifest_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  static boolean manifest_string(PsiBuilder b, int l) {
    return consumeToken(b, STRING_LITERAL);
  }

  /* ********************************************************** */
  // '[' expression_list ']'
  public static boolean manifest_tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_tuple")) return false;
    if (!nextTokenIs(b, LEFT_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SQUARE_BRACKET);
    r = r && expression_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_SQUARE_BRACKET);
    exit_section_(b, m, MANIFEST_TUPLE, r);
    return r;
  }

  /* ********************************************************** */
  // '{' type '}'
  static boolean manifest_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_type")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // boolean_constant |
  //     character_constant |
  //     integer_constant |
  //     real_constant |
  //     manifest_string |
  //     manifest_type
  static boolean manifest_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_value")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = boolean_constant(b, l + 1);
    if (!r) r = character_constant(b, l + 1);
    if (!r) r = integer_constant(b, l + 1);
    if (!r) r = real_constant(b, l + 1);
    if (!r) r = manifest_string(b, l + 1);
    if (!r) r = manifest_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // manifest_string
  public static boolean message(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "message")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_string(b, l + 1);
    exit_section_(b, m, MESSAGE, r);
    return r;
  }

  /* ********************************************************** */
  // 'inspect' expression [when_part_list] [else_part] END_KEYWORD
  public static boolean multi_branch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_branch")) return false;
    if (!nextTokenIs(b, INSPECT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSPECT_KEYWORD);
    r = r && expression(b, l + 1);
    r = r && multi_branch_2(b, l + 1);
    r = r && multi_branch_3(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, MULTI_BRANCH, r);
    return r;
  }

  // [when_part_list]
  private static boolean multi_branch_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_branch_2")) return false;
    when_part_list(b, l + 1);
    return true;
  }

  // [else_part]
  private static boolean multi_branch_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multi_branch_3")) return false;
    else_part(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' constraint_list '}'
  public static boolean multiple_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiple_constraint")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && constraint_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, MULTIPLE_CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // clients [header_comment] feature_set
  static boolean new_export_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_item")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clients(b, l + 1);
    r = r && new_export_item_1(b, l + 1);
    r = r && feature_set(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [header_comment]
  private static boolean new_export_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_item_1")) return false;
    header_comment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // new_export_item (','? new_export_item)*
  static boolean new_export_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_list")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_export_item(b, l + 1);
    r = r && new_export_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','? new_export_item)*
  private static boolean new_export_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!new_export_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "new_export_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','? new_export_item
  private static boolean new_export_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_export_list_1_0_0(b, l + 1);
    r = r && new_export_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean new_export_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // 'export' new_export_list
  public static boolean new_exports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_exports")) return false;
    if (!nextTokenIs(b, EXPORT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPORT_KEYWORD);
    r = r && new_export_list(b, l + 1);
    exit_section_(b, m, NEW_EXPORTS, r);
    return r;
  }

  /* ********************************************************** */
  // ['frozen'] extended_feature_name
  public static boolean new_feature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature")) return false;
    if (!nextTokenIs(b, "<new feature>", FROZEN_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEW_FEATURE, "<new feature>");
    r = new_feature_0(b, l + 1);
    r = r && extended_feature_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['frozen']
  private static boolean new_feature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_0")) return false;
    consumeToken(b, FROZEN_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // new_feature (','? new_feature)*
  static boolean new_feature_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_list")) return false;
    if (!nextTokenIs(b, "", FROZEN_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_feature(b, l + 1);
    r = r && new_feature_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','? new_feature)*
  private static boolean new_feature_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!new_feature_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "new_feature_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','? new_feature
  private static boolean new_feature_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_feature_list_1_0_0(b, l + 1);
    r = r && new_feature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean new_feature_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '{' 'none' '}'
  public static boolean non_conformance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_conformance")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NON_CONFORMANCE, null);
    r = consumeTokens(b, 1, LEFT_CURLY_BRACKET, NONE_KEYWORD, RIGHT_CURLY_BRACKET);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '{' type '}' '.' unqualified_call
  public static boolean non_object_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_object_call")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_CURLY_BRACKET, DOT);
    r = r && unqualified_call(b, l + 1);
    exit_section_(b, m, NON_OBJECT_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // '(' '{' type '}' ')' DOT unqualified_call
  public static boolean non_object_parenthesized_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_object_parenthesized_call")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_PAREN, LEFT_CURLY_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeTokens(b, 0, RIGHT_CURLY_BRACKET, RIGHT_PAREN, DOT);
    r = r && unqualified_call(b, l + 1);
    exit_section_(b, m, NON_OBJECT_PARENTHESIZED_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // note_name note_values
  public static boolean note_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_entry")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = note_name(b, l + 1);
    r = r && note_values(b, l + 1);
    exit_section_(b, m, NOTE_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | manifest_constant
  public static boolean note_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOTE_ITEM, "<note item>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = manifest_constant(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (note_entry ';'?)*
  static boolean note_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_list")) return false;
    int c = current_position_(b);
    while (true) {
      if (!note_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "note_list", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // note_entry ';'?
  private static boolean note_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = note_entry(b, l + 1);
    r = r && note_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean note_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_list_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER ':'
  public static boolean note_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, NOTE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // note_item (',' note_item)*
  static boolean note_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_values")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = note_item(b, l + 1);
    r = r && note_values_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' note_item)*
  private static boolean note_values_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_values_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!note_values_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "note_values_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' note_item
  private static boolean note_values_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_values_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && note_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'note' note_list
  public static boolean notes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notes")) return false;
    if (!nextTokenIs(b, NOTE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOTE_KEYWORD);
    r = r && note_list(b, l + 1);
    exit_section_(b, m, NOTES, r);
    return r;
  }

  /* ********************************************************** */
  // (target_atomic bracketed_actuals) | (target_atomic '.' call) | unqualified_call
  public static boolean object_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_CALL, "<object call>");
    r = object_call_0(b, l + 1);
    if (!r) r = object_call_1(b, l + 1);
    if (!r) r = unqualified_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // target_atomic bracketed_actuals
  private static boolean object_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = target_atomic(b, l + 1);
    r = r && bracketed_actuals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // target_atomic '.' call
  private static boolean object_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = target_atomic(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attached_object_test | deprecated_object_test
  public static boolean object_test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_test")) return false;
    if (!nextTokenIs(b, "<object test>", ATTACHED_KEYWORD, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_TEST, "<object test>");
    r = attached_object_test(b, l + 1);
    if (!r) r = deprecated_object_test(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'obsolete' message
  public static boolean obsolete(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "obsolete")) return false;
    if (!nextTokenIs(b, OBSOLETE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OBSOLETE_KEYWORD);
    r = r && message(b, l + 1);
    exit_section_(b, m, OBSOLETE, r);
    return r;
  }

  /* ********************************************************** */
  // 'old' expression
  public static boolean old(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "old")) return false;
    if (!nextTokenIs(b, OLD_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OLD_KEYWORD);
    r = r && expression(b, l + 1);
    exit_section_(b, m, OLD, r);
    return r;
  }

  /* ********************************************************** */
  // 'once' ['(' key_list ')']
  public static boolean once(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once")) return false;
    if (!nextTokenIs(b, ONCE_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ONCE, null);
    r = consumeToken(b, ONCE_KEYWORD);
    p = r; // pin = 1
    r = r && once_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ['(' key_list ')']
  private static boolean once_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once_1")) return false;
    once_1_0(b, l + 1);
    return true;
  }

  // '(' key_list ')'
  private static boolean once_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && key_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'once' manifest_string
  public static boolean once_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once_string")) return false;
    if (!nextTokenIs(b, ONCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ONCE_KEYWORD);
    r = r && manifest_string(b, l + 1);
    exit_section_(b, m, ONCE_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // 'only' [feature_list]
  public static boolean only(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "only")) return false;
    if (!nextTokenIs(b, ONLY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ONLY_KEYWORD);
    r = r && only_1(b, l + 1);
    exit_section_(b, m, ONLY, r);
    return r;
  }

  // [feature_list]
  private static boolean only_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "only_1")) return false;
    feature_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // binary_operator | unary_operator | FREE_OPERATOR
  static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binary_operator(b, l + 1);
    if (!r) r = unary_operator(b, l + 1);
    if (!r) r = consumeToken(b, FREE_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_type [feature_adaption]
  public static boolean parent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARENT, "<parent>");
    r = class_type(b, l + 1);
    r = r && parent_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [feature_adaption]
  private static boolean parent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_1")) return false;
    feature_adaption(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // parent (';'? parent)*
  static boolean parent_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parent(b, l + 1);
    r = r && parent_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (';'? parent)*
  private static boolean parent_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parent_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parent_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ';'? parent
  private static boolean parent_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parent_list_1_0_0(b, l + 1);
    r = r && parent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean parent_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_list_1_0_0")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // '{' class_name '}'
  public static boolean parent_qualification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_qualification")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && class_name(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, PARENT_QUALIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' expression ')'
  public static boolean parenthesized(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, PARENTHESIZED, r);
    return r;
  }

  /* ********************************************************** */
  // '(' actual_list ')'
  static boolean parenthesized_actuals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized_actuals")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && actual_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [manifest_type] '?'
  public static boolean placeholder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "placeholder")) return false;
    if (!nextTokenIs(b, "<placeholder>", QUESTION, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLACEHOLDER, "<placeholder>");
    r = placeholder_0(b, l + 1);
    r = r && consumeToken(b, QUESTION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [manifest_type]
  private static boolean placeholder_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "placeholder_0")) return false;
    manifest_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'ensure' ['then'] assertion [only]
  public static boolean postcondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postcondition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, POSTCONDITION, "<postcondition>");
    r = consumeToken(b, ENSURE_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, postcondition_1(b, l + 1));
    r = p && report_error_(b, assertion(b, l + 1)) && r;
    r = p && postcondition_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, keyword_or_identifier_recovery_parser_);
    return r || p;
  }

  // ['then']
  private static boolean postcondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postcondition_1")) return false;
    consumeToken(b, THEN_KEYWORD);
    return true;
  }

  // [only]
  private static boolean postcondition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postcondition_3")) return false;
    only(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'require' ['else'] assertion
  public static boolean precondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precondition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PRECONDITION, "<precondition>");
    r = consumeToken(b, REQUIRE_KEYWORD);
    p = r; // pin = 1
    r = r && report_error_(b, precondition_1(b, l + 1));
    r = p && assertion(b, l + 1) && r;
    exit_section_(b, l, m, r, p, keyword_or_identifier_recovery_parser_);
    return r || p;
  }

  // ['else']
  private static boolean precondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precondition_1")) return false;
    consumeToken(b, ELSE_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // 'precursor' [parent_qualification] [actuals]
  public static boolean precursor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precursor")) return false;
    if (!nextTokenIs(b, PRECURSOR_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRECURSOR_KEYWORD);
    r = r && precursor_1(b, l + 1);
    r = r && precursor_2(b, l + 1);
    exit_section_(b, m, PRECURSOR, r);
    return r;
  }

  // [parent_qualification]
  private static boolean precursor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precursor_1")) return false;
    parent_qualification(b, l + 1);
    return true;
  }

  // [actuals]
  private static boolean precursor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precursor_2")) return false;
    actuals(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type_mark [assigner_mark]
  static boolean query_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_mark")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && query_mark_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [assigner_mark]
  private static boolean query_mark_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_mark_1")) return false;
    assigner_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // formal | constant_attribute | 'current'
  public static boolean read_only(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "read_only")) return false;
    if (!nextTokenIs(b, "<read only>", CURRENT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, READ_ONLY, "<read only>");
    r = formal(b, l + 1);
    if (!r) r = constant_attribute(b, l + 1);
    if (!r) r = consumeToken(b, CURRENT_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // REAL_LITERAL
  static boolean real_constant(PsiBuilder b, int l) {
    return consumeToken(b, REAL_LITERAL);
  }

  /* ********************************************************** */
  // 'redefine' feature_list
  public static boolean redefine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "redefine")) return false;
    if (!nextTokenIs(b, REDEFINE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REDEFINE_KEYWORD);
    r = r && feature_list(b, l + 1);
    exit_section_(b, m, REDEFINE, r);
    return r;
  }

  /* ********************************************************** */
  // C_EXTERNAL_KEYWORD | CPP_EXTERNAL_KEYWORD | DLL_EXTERNAL_KEYWORD
  public static boolean registered_language(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "registered_language")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REGISTERED_LANGUAGE, "<registered language>");
    r = consumeToken(b, C_EXTERNAL_KEYWORD);
    if (!r) r = consumeToken(b, CPP_EXTERNAL_KEYWORD);
    if (!r) r = consumeToken(b, DLL_EXTERNAL_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'rename' rename_list
  static boolean rename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename")) return false;
    if (!nextTokenIs(b, RENAME_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RENAME_KEYWORD);
    r = r && rename_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // rename_pair (','? rename_pair)*
  static boolean rename_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rename_pair(b, l + 1);
    r = r && rename_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (','? rename_pair)*
  private static boolean rename_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rename_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rename_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','? rename_pair
  private static boolean rename_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rename_list_1_0_0(b, l + 1);
    r = r && rename_pair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean rename_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // feature_name 'as' extended_feature_name
  public static boolean rename_pair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_pair")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && consumeToken(b, AS_KEYWORD);
    r = r && extended_feature_name(b, l + 1);
    exit_section_(b, m, RENAME_PAIR, r);
    return r;
  }

  /* ********************************************************** */
  // rename 'end'
  static boolean renaming(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "renaming")) return false;
    if (!nextTokenIs(b, RENAME_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rename(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'rescue' compound
  public static boolean rescue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rescue")) return false;
    if (!nextTokenIs(b, RESCUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RESCUE_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, RESCUE, r);
    return r;
  }

  /* ********************************************************** */
  // 'retry'
  public static boolean retry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "retry")) return false;
    if (!nextTokenIs(b, RETRY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETRY_KEYWORD);
    exit_section_(b, m, RETRY, r);
    return r;
  }

  /* ********************************************************** */
  // 'do' | once
  static boolean routine_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_mark")) return false;
    if (!nextTokenIs(b, "", DO_KEYWORD, ONCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO_KEYWORD);
    if (!r) r = once(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'select' feature_list
  public static boolean select(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select")) return false;
    if (!nextTokenIs(b, SELECT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECT_KEYWORD);
    r = r && feature_list(b, l + 1);
    exit_section_(b, m, SELECT, r);
    return r;
  }

  /* ********************************************************** */
  // type [renaming]
  static boolean single_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && single_constraint_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [renaming]
  private static boolean single_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_constraint_1")) return false;
    renaming(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // manifest_constant |
  //     manifest_tuple |
  //     agent |
  //     object_test |
  //     once_string |
  //     address
  public static boolean special_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "special_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIAL_EXPRESSION, "<special expression>");
    r = manifest_constant(b, l + 1);
    if (!r) r = manifest_tuple(b, l + 1);
    if (!r) r = agent(b, l + 1);
    if (!r) r = object_test(b, l + 1);
    if (!r) r = once_string(b, l + 1);
    if (!r) r = address(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TAG, r);
    return r;
  }

  /* ********************************************************** */
  // tag ':'
  static boolean tag_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_mark")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // target_atomic ['.' call]
  static boolean target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = target_atomic(b, l + 1);
    r = r && target_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['.' call]
  private static boolean target_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target_1")) return false;
    target_1_0(b, l + 1);
    return true;
  }

  // '.' call
  private static boolean target_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && call(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // casting_call | unqualified_call | local | read_only | non_object_call | parenthesized
  static boolean target_atomic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target_atomic")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = casting_call(b, l + 1);
    if (!r) r = unqualified_call(b, l + 1);
    if (!r) r = local(b, l + 1);
    if (!r) r = read_only(b, l + 1);
    if (!r) r = non_object_call(b, l + 1);
    if (!r) r = parenthesized(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // boolean_expression 'then' compound
  static boolean then_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "then_part")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = boolean_expression(b, l + 1);
    r = r && consumeToken(b, THEN_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // then_part ('elseif' then_part)*
  static boolean then_part_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "then_part_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = then_part(b, l + 1);
    r = r && then_part_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('elseif' then_part)*
  private static boolean then_part_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "then_part_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!then_part_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "then_part_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // 'elseif' then_part
  private static boolean then_part_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "then_part_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSEIF_KEYWORD);
    r = r && then_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' tuple_parameters ']'
  static boolean tuple_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_parameter_list")) return false;
    if (!nextTokenIs(b, LEFT_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SQUARE_BRACKET);
    r = r && tuple_parameters(b, l + 1);
    r = r && consumeToken(b, RIGHT_SQUARE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_declaration_list | type_list
  static boolean tuple_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_parameters")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_declaration_list(b, l + 1);
    if (!r) r = type_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'tuple' [tuple_parameter_list]
  public static boolean tuple_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type")) return false;
    if (!nextTokenIs(b, TUPLE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TUPLE_KEYWORD);
    r = r && tuple_type_1(b, l + 1);
    exit_section_(b, m, TUPLE_TYPE, r);
    return r;
  }

  // [tuple_parameter_list]
  private static boolean tuple_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_type_1")) return false;
    tuple_parameter_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // class_or_tuple_type | formal_generic_name | anchored
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = class_or_tuple_type(b, l + 1);
    if (!r) r = formal_generic_name(b, l + 1);
    if (!r) r = anchored(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // manifest_type '..' manifest_type
  public static boolean type_interval(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_interval")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_type(b, l + 1);
    r = r && consumeToken(b, DDOT);
    r = r && manifest_type(b, l + 1);
    exit_section_(b, m, TYPE_INTERVAL, r);
    return r;
  }

  /* ********************************************************** */
  // type (',' type)*
  static boolean type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && type_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type)*
  private static boolean type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!type_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' type
  private static boolean type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' type
  static boolean type_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_mark")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, COLON);
    p = r; // pin = 1
    r = r && type(b, l + 1);
    exit_section_(b, l, m, r, p, type_mark_recovery_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // !(keyword_recovery_ | IDENTIFIER)
  static boolean type_mark_recovery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_mark_recovery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !type_mark_recovery_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // keyword_recovery_ | IDENTIFIER
  private static boolean type_mark_recovery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_mark_recovery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keyword_recovery_(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'not'
  static boolean unary_operator(PsiBuilder b, int l) {
    return consumeToken(b, NOT_KEYWORD);
  }

  /* ********************************************************** */
  // 'undefine' feature_list
  public static boolean undefine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "undefine")) return false;
    if (!nextTokenIs(b, UNDEFINE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNDEFINE_KEYWORD);
    r = r && feature_list(b, l + 1);
    exit_section_(b, m, UNDEFINE, r);
    return r;
  }

  /* ********************************************************** */
  // boolean_loop | boolean_expression | comment
  static boolean unlabeled_assertion_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unlabeled_assertion_clause")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = boolean_loop(b, l + 1);
    if (!r) r = boolean_expression(b, l + 1);
    if (!r) r = comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (feature_name [actuals]) | ('current' bracketed_actuals)
  public static boolean unqualified_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unqualified_call")) return false;
    if (!nextTokenIs(b, "<unqualified call>", CURRENT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNQUALIFIED_CALL, "<unqualified call>");
    r = unqualified_call_0(b, l + 1);
    if (!r) r = unqualified_call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // feature_name [actuals]
  private static boolean unqualified_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unqualified_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && unqualified_call_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [actuals]
  private static boolean unqualified_call_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unqualified_call_0_1")) return false;
    actuals(b, l + 1);
    return true;
  }

  // 'current' bracketed_actuals
  private static boolean unqualified_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unqualified_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURRENT_KEYWORD);
    r = r && bracketed_actuals(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // manifest_string
  public static boolean unregistered_language(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unregistered_language")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_string(b, l + 1);
    exit_section_(b, m, UNREGISTERED_LANGUAGE, r);
    return r;
  }

  /* ********************************************************** */
  // local | variable_attribute
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, "<variable>", RESULT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = local(b, l + 1);
    if (!r) r = variable_attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // feature_name
  static boolean variable_attribute(PsiBuilder b, int l) {
    return feature_name(b, l + 1);
  }

  /* ********************************************************** */
  // 'variant' [tag_mark] expression
  public static boolean variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant")) return false;
    if (!nextTokenIs(b, VARIANT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIANT_KEYWORD);
    r = r && variant_1(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, VARIANT, r);
    return r;
  }

  // [tag_mark]
  private static boolean variant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_1")) return false;
    tag_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'when' choices 'then' compound
  public static boolean when_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_part")) return false;
    if (!nextTokenIs(b, WHEN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN_KEYWORD);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, THEN_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, WHEN_PART, r);
    return r;
  }

  /* ********************************************************** */
  // when_part+
  static boolean when_part_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_part_list")) return false;
    if (!nextTokenIs(b, WHEN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = when_part(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!when_part(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "when_part_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser class_header_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return class_header_recovery(b, l + 1);
    }
  };
  final static Parser explicit_creation_call_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return explicit_creation_call_recovery(b, l + 1);
    }
  };
  final static Parser explicit_value_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return explicit_value_recovery(b, l + 1);
    }
  };
  final static Parser feature_clause_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return feature_clause_recovery(b, l + 1);
    }
  };
  final static Parser instruction_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return instruction_recovery(b, l + 1);
    }
  };
  final static Parser internal_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return internal_recovery(b, l + 1);
    }
  };
  final static Parser keyword_or_identifier_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return keyword_or_identifier_recovery(b, l + 1);
    }
  };
  final static Parser type_mark_recovery_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return type_mark_recovery(b, l + 1);
    }
  };
}
