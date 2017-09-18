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
    else if (t == ALIAS) {
      r = alias(b, 0);
    }
    else if (t == ALIAS_NAME) {
      r = alias_name(b, 0);
    }
    else if (t == ANCHOR) {
      r = anchor(b, 0);
    }
    else if (t == ANCHORED) {
      r = anchored(b, 0);
    }
    else if (t == ASSERTION) {
      r = assertion(b, 0);
    }
    else if (t == ASSERTION_CLAUSE) {
      r = assertion_clause(b, 0);
    }
    else if (t == ASSIGNER_CALL) {
      r = assigner_call(b, 0);
    }
    else if (t == ASSIGNER_MARK) {
      r = assigner_mark(b, 0);
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
    else if (t == ATTRIBUTE_OR_ROUTINE) {
      r = attribute_or_routine(b, 0);
    }
    else if (t == BASIC_EXPRESSION) {
      r = basic_expression(b, 0);
    }
    else if (t == BASIC_EXPRESSION_NO_LEFT) {
      r = basic_expression_no_left(b, 0);
    }
    else if (t == BINARY) {
      r = binary(b, 0);
    }
    else if (t == BINARY_EXPRESSION) {
      r = binary_expression(b, 0);
    }
    else if (t == BOOLEAN_CONSTANT) {
      r = boolean_constant(b, 0);
    }
    else if (t == BOOLEAN_EXPRESSION) {
      r = boolean_expression(b, 0);
    }
    else if (t == BRACKET) {
      r = bracket(b, 0);
    }
    else if (t == BRACKET_EXPRESSION) {
      r = bracket_expression(b, 0);
    }
    else if (t == BRACKET_TARGET) {
      r = bracket_target(b, 0);
    }
    else if (t == CALL) {
      r = call(b, 0);
    }
    else if (t == CALL_AGENT) {
      r = call_agent(b, 0);
    }
    else if (t == CALL_AGENT_BODY) {
      r = call_agent_body(b, 0);
    }
    else if (t == CHARACTER_CONSTANT) {
      r = character_constant(b, 0);
    }
    else if (t == CHECK) {
      r = check(b, 0);
    }
    else if (t == CHOICE) {
      r = choice(b, 0);
    }
    else if (t == CHOICES) {
      r = choices(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = class_declaration(b, 0);
    }
    else if (t == CLASS_HEADER) {
      r = class_header(b, 0);
    }
    else if (t == CLASS_LIST) {
      r = class_list(b, 0);
    }
    else if (t == CLASS_NAME) {
      r = class_name(b, 0);
    }
    else if (t == CLASS_OR_TUPLE_TYPE) {
      r = class_or_tuple_type(b, 0);
    }
    else if (t == CLASS_TYPE) {
      r = class_type(b, 0);
    }
    else if (t == CLIENTS) {
      r = clients(b, 0);
    }
    else if (t == COMMENT) {
      r = comment(b, 0);
    }
    else if (t == COMPARISON) {
      r = comparison(b, 0);
    }
    else if (t == COMPOUND) {
      r = compound(b, 0);
    }
    else if (t == CONDITIONAL) {
      r = conditional(b, 0);
    }
    else if (t == CONSTANT) {
      r = constant(b, 0);
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
    else if (t == CONSTRAINT) {
      r = constraint(b, 0);
    }
    else if (t == CONSTRAINT_CREATORS) {
      r = constraint_creators(b, 0);
    }
    else if (t == CONSTRAINT_LIST) {
      r = constraint_list(b, 0);
    }
    else if (t == CONVERSION_PROCEDURE) {
      r = conversion_procedure(b, 0);
    }
    else if (t == CONVERSION_QUERY) {
      r = conversion_query(b, 0);
    }
    else if (t == CONVERTER) {
      r = converter(b, 0);
    }
    else if (t == CONVERTER_LIST) {
      r = converter_list(b, 0);
    }
    else if (t == CONVERTERS) {
      r = converters(b, 0);
    }
    else if (t == CREATION_CALL) {
      r = creation_call(b, 0);
    }
    else if (t == CREATION_CLAUSE) {
      r = creation_clause(b, 0);
    }
    else if (t == CREATION_EXPRESSION) {
      r = creation_expression(b, 0);
    }
    else if (t == CREATION_INSTRUCTION) {
      r = creation_instruction(b, 0);
    }
    else if (t == CREATION_PROCEDURE) {
      r = creation_procedure(b, 0);
    }
    else if (t == CREATION_PROCEDURE_LIST) {
      r = creation_procedure_list(b, 0);
    }
    else if (t == CREATORS) {
      r = creators(b, 0);
    }
    else if (t == DEBUG) {
      r = debug(b, 0);
    }
    else if (t == DECLARATION_BODY) {
      r = declaration_body(b, 0);
    }
    else if (t == DEFERRED) {
      r = deferred(b, 0);
    }
    else if (t == EFFECTIVE_ROUTINE) {
      r = effective_routine(b, 0);
    }
    else if (t == ELSE_PART) {
      r = else_part(b, 0);
    }
    else if (t == ENTITY) {
      r = entity(b, 0);
    }
    else if (t == ENTITY_DECLARATION_GROUP) {
      r = entity_declaration_group(b, 0);
    }
    else if (t == ENTITY_DECLARATION_LIST) {
      r = entity_declaration_list(b, 0);
    }
    else if (t == EQUALITY) {
      r = equality(b, 0);
    }
    else if (t == EXIT_CONDITION) {
      r = exit_condition(b, 0);
    }
    else if (t == EXPLICIT_CREATION_CALL) {
      r = explicit_creation_call(b, 0);
    }
    else if (t == EXPLICIT_CREATION_TYPE) {
      r = explicit_creation_type(b, 0);
    }
    else if (t == EXPLICIT_VALUE) {
      r = explicit_value(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == EXPRESSION_LIST) {
      r = expression_list(b, 0);
    }
    else if (t == EXT) {
      r = ext(b, 0);
    }
    else if (t == EXTENDED_FEATURE_NAME) {
      r = extended_feature_name(b, 0);
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
    else if (t == FEATURE_BODY) {
      r = feature_body(b, 0);
    }
    else if (t == FEATURE_CLAUSE) {
      r = feature_clause(b, 0);
    }
    else if (t == FEATURE_DECLARATION) {
      r = feature_declaration(b, 0);
    }
    else if (t == FEATURE_DECLARATION_LIST) {
      r = feature_declaration_list(b, 0);
    }
    else if (t == FEATURE_LIST) {
      r = feature_list(b, 0);
    }
    else if (t == FEATURE_NAME) {
      r = feature_name(b, 0);
    }
    else if (t == FEATURE_SET) {
      r = feature_set(b, 0);
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
    else if (t == FORMAL_GENERIC_LIST) {
      r = formal_generic_list(b, 0);
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
    else if (t == IDENTIFIER_LIST) {
      r = identifier_list(b, 0);
    }
    else if (t == INHERIT_CLAUSE) {
      r = inherit_clause(b, 0);
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
    else if (t == INTEGER_CONSTANT) {
      r = integer_constant(b, 0);
    }
    else if (t == INTERNAL) {
      r = internal(b, 0);
    }
    else if (t == INVARIANT) {
      r = invariant(b, 0);
    }
    else if (t == ITERATION) {
      r = iteration(b, 0);
    }
    else if (t == KEY_LIST) {
      r = key_list(b, 0);
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
    else if (t == MANIFEST_STRING) {
      r = manifest_string(b, 0);
    }
    else if (t == MANIFEST_TUPLE) {
      r = manifest_tuple(b, 0);
    }
    else if (t == MANIFEST_TYPE) {
      r = manifest_type(b, 0);
    }
    else if (t == MANIFEST_VALUE) {
      r = manifest_value(b, 0);
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
    else if (t == NEW_EXPORT_ITEM) {
      r = new_export_item(b, 0);
    }
    else if (t == NEW_EXPORT_LIST) {
      r = new_export_list(b, 0);
    }
    else if (t == NEW_EXPORTS) {
      r = new_exports(b, 0);
    }
    else if (t == NEW_FEATURE) {
      r = new_feature(b, 0);
    }
    else if (t == NEW_FEATURE_LIST) {
      r = new_feature_list(b, 0);
    }
    else if (t == NON_CONFORMANCE) {
      r = non_conformance(b, 0);
    }
    else if (t == NON_OBJECT_CALL) {
      r = non_object_call(b, 0);
    }
    else if (t == NOTE_ENTRY) {
      r = note_entry(b, 0);
    }
    else if (t == NOTE_ITEM) {
      r = note_item(b, 0);
    }
    else if (t == NOTE_LIST) {
      r = note_list(b, 0);
    }
    else if (t == NOTE_NAME) {
      r = note_name(b, 0);
    }
    else if (t == NOTE_VALUES) {
      r = note_values(b, 0);
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
    else if (t == OPERATOR) {
      r = operator(b, 0);
    }
    else if (t == OPERATOR_EXPRESSION) {
      r = operator_expression(b, 0);
    }
    else if (t == PARENT) {
      r = parent(b, 0);
    }
    else if (t == PARENT_LIST) {
      r = parent_list(b, 0);
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
    else if (t == QUERY_MARK) {
      r = query_mark(b, 0);
    }
    else if (t == READ_ONLY) {
      r = read_only(b, 0);
    }
    else if (t == REAL_CONSTANT) {
      r = real_constant(b, 0);
    }
    else if (t == REDEFINE) {
      r = redefine(b, 0);
    }
    else if (t == REGISTERED_LANGUAGE) {
      r = registered_language(b, 0);
    }
    else if (t == RENAME) {
      r = rename(b, 0);
    }
    else if (t == RENAME_LIST) {
      r = rename_list(b, 0);
    }
    else if (t == RENAME_PAIR) {
      r = rename_pair(b, 0);
    }
    else if (t == RENAMING) {
      r = renaming(b, 0);
    }
    else if (t == RESCUE) {
      r = rescue(b, 0);
    }
    else if (t == RETRY) {
      r = retry(b, 0);
    }
    else if (t == ROUTINE_MARK) {
      r = routine_mark(b, 0);
    }
    else if (t == SELECT) {
      r = select(b, 0);
    }
    else if (t == SINGLE_CONSTRAINT) {
      r = single_constraint(b, 0);
    }
    else if (t == SPECIAL_EXPRESSION) {
      r = special_expression(b, 0);
    }
    else if (t == TAG) {
      r = tag(b, 0);
    }
    else if (t == TAG_MARK) {
      r = tag_mark(b, 0);
    }
    else if (t == TARGET) {
      r = target(b, 0);
    }
    else if (t == THEN_PART) {
      r = then_part(b, 0);
    }
    else if (t == THEN_PART_LIST) {
      r = then_part_list(b, 0);
    }
    else if (t == TUPLE_PARAMETER_LIST) {
      r = tuple_parameter_list(b, 0);
    }
    else if (t == TUPLE_PARAMETERS) {
      r = tuple_parameters(b, 0);
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
    else if (t == TYPE_LIST) {
      r = type_list(b, 0);
    }
    else if (t == TYPE_MARK) {
      r = type_mark(b, 0);
    }
    else if (t == UNARY) {
      r = unary(b, 0);
    }
    else if (t == UNARY_EXPRESSION) {
      r = unary_expression(b, 0);
    }
    else if (t == UNDEFINE) {
      r = undefine(b, 0);
    }
    else if (t == UNLABELED_ASSERTION_CLAUSE) {
      r = unlabeled_assertion_clause(b, 0);
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
    else if (t == VARIABLE_ATTRIBUTE) {
      r = variable_attribute(b, 0);
    }
    else if (t == VARIANT) {
      r = variant(b, 0);
    }
    else if (t == WHEN_PART) {
      r = when_part(b, 0);
    }
    else if (t == WHEN_PART_LIST) {
      r = when_part_list(b, 0);
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
  // LEFT_SQUARE_BRACKET type_list RIGHT_SQUARE_BRACKET
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
  // expression (COMMA expression)*
  public static boolean actual_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_LIST, "<actual list>");
    r = expression(b, l + 1);
    r = r && actual_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA expression)*
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

  // COMMA expression
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
  // LEFT_PAREN actual_list RIGHT_PAREN
  public static boolean actuals(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actuals")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && actual_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, ACTUALS, r);
    return r;
  }

  /* ********************************************************** */
  // DOLLAR variable
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
  // agent_actual (COMMA agent_actual)*
  public static boolean agent_actual_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "agent_actual_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGENT_ACTUAL_LIST, "<agent actual list>");
    r = agent_actual(b, l + 1);
    r = r && agent_actual_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA agent_actual)*
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

  // COMMA agent_actual
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
  // LEFT_PAREN agent_actual_list RIGHT_PAREN
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
  // agent_target DOT agent_unqualified
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
  // ALIAS_KEYWORD DQUOTE alias_name DQUOTE [CONVERT_KEYWORD]
  public static boolean alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias")) return false;
    if (!nextTokenIs(b, ALIAS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIAS_KEYWORD, DQUOTE);
    r = r && alias_name(b, l + 1);
    r = r && consumeToken(b, DQUOTE);
    r = r && alias_4(b, l + 1);
    exit_section_(b, m, ALIAS, r);
    return r;
  }

  // [CONVERT_KEYWORD]
  private static boolean alias_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_4")) return false;
    consumeToken(b, CONVERT_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // operator | bracket
  public static boolean alias_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_NAME, "<alias name>");
    r = operator(b, l + 1);
    if (!r) r = bracket(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // feature_name | CURRENT_KEYWORD
  public static boolean anchor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchor")) return false;
    if (!nextTokenIs(b, "<anchor>", CURRENT_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANCHOR, "<anchor>");
    r = feature_name(b, l + 1);
    if (!r) r = consumeToken(b, CURRENT_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attachment_mark] LIKE_KEYWORD anchor
  public static boolean anchored(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchored")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANCHORED, "<anchored>");
    r = anchored_0(b, l + 1);
    r = r && consumeToken(b, LIKE_KEYWORD);
    r = r && anchor(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [attachment_mark]
  private static boolean anchored_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anchored_0")) return false;
    attachment_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (assertion_clause SEMICOLON?)*
  public static boolean assertion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion")) return false;
    Marker m = enter_section_(b, l, _NONE_, ASSERTION, "<assertion>");
    int c = current_position_(b);
    while (true) {
      if (!assertion_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assertion", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // assertion_clause SEMICOLON?
  private static boolean assertion_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assertion_clause(b, l + 1);
    r = r && assertion_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean assertion_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // [tag_mark] unlabeled_assertion_clause
  public static boolean assertion_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERTION_CLAUSE, "<assertion clause>");
    r = assertion_clause_0(b, l + 1);
    r = r && unlabeled_assertion_clause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [tag_mark]
  private static boolean assertion_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_clause_0")) return false;
    tag_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression ASSIGN expression
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
  // ASSIGN_KEYWORD feature_name
  public static boolean assigner_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assigner_mark")) return false;
    if (!nextTokenIs(b, ASSIGN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN_KEYWORD);
    r = r && feature_name(b, l + 1);
    exit_section_(b, m, ASSIGNER_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // variable ASSIGN expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, "<assignment>", IDENTIFIER, RESULT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = variable(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QUESTION | EXCLAMATION
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
  // ATTRIBUTE_KEYWORD compound
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
  public static boolean attribute_or_routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_or_routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_OR_ROUTINE, "<attribute or routine>");
    r = attribute_or_routine_0(b, l + 1);
    r = r && attribute_or_routine_1(b, l + 1);
    r = r && feature_body(b, l + 1);
    r = r && attribute_or_routine_3(b, l + 1);
    r = r && attribute_or_routine_4(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // unary_expression | (basic_expression_no_left binary expression) | (basic_expression_no_left comparison expression) | basic_expression_no_left
  public static boolean basic_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_EXPRESSION, "<basic expression>");
    r = unary_expression(b, l + 1);
    if (!r) r = basic_expression_1(b, l + 1);
    if (!r) r = basic_expression_2(b, l + 1);
    if (!r) r = basic_expression_no_left(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // basic_expression_no_left binary expression
  private static boolean basic_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_expression_no_left(b, l + 1);
    r = r && binary(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // basic_expression_no_left comparison expression
  private static boolean basic_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_expression_no_left(b, l + 1);
    r = r && comparison(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // read_only |
  //     local |
  //     call |
  //     precursor |
  //     //equality |
  //     parenthesized |
  //     old |
  //     //operator_expression |
  //     bracket_expression |
  //     creation_expression
  public static boolean basic_expression_no_left(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_expression_no_left")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_EXPRESSION_NO_LEFT, "<basic expression no left>");
    r = read_only(b, l + 1);
    if (!r) r = local(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = precursor(b, l + 1);
    if (!r) r = parenthesized(b, l + 1);
    if (!r) r = old(b, l + 1);
    if (!r) r = bracket_expression(b, l + 1);
    if (!r) r = creation_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PLUS |
  //     MINUS |
  //     ASTERISK |
  //     SLASH |
  //     DSLASH |
  //     DBACKSLASH |
  //     CARET |
  //     DDOT |
  //     LT |
  //     GT |
  //     LTE |
  //     GTE |
  //     AND_KEYWORD |
  //     OR_KEYWORD |
  //     XOR_KEYWORD |
  //     (AND_KEYWORD THEN_KEYWORD) |
  //     (OR_KEYWORD ELSE_KEYWORD) |
  //     IMPLIES_KEYWORD
  public static boolean binary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY, "<binary>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, ASTERISK);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, DSLASH);
    if (!r) r = consumeToken(b, DBACKSLASH);
    if (!r) r = consumeToken(b, CARET);
    if (!r) r = consumeToken(b, DDOT);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LTE);
    if (!r) r = consumeToken(b, GTE);
    if (!r) r = consumeToken(b, AND_KEYWORD);
    if (!r) r = consumeToken(b, OR_KEYWORD);
    if (!r) r = consumeToken(b, XOR_KEYWORD);
    if (!r) r = binary_15(b, l + 1);
    if (!r) r = binary_16(b, l + 1);
    if (!r) r = consumeToken(b, IMPLIES_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AND_KEYWORD THEN_KEYWORD
  private static boolean binary_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AND_KEYWORD, THEN_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // OR_KEYWORD ELSE_KEYWORD
  private static boolean binary_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OR_KEYWORD, ELSE_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression binary expression
  public static boolean binary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_EXPRESSION, "<binary expression>");
    r = expression(b, l + 1);
    r = r && binary(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRUE_KEYWORD | FALSE_KEYWORD
  public static boolean boolean_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_constant")) return false;
    if (!nextTokenIs(b, "<boolean constant>", FALSE_KEYWORD, TRUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_CONSTANT, "<boolean constant>");
    r = consumeToken(b, TRUE_KEYWORD);
    if (!r) r = consumeToken(b, FALSE_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // basic_expression | boolean_constant | object_test
  public static boolean boolean_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_EXPRESSION, "<boolean expression>");
    r = basic_expression(b, l + 1);
    if (!r) r = boolean_constant(b, l + 1);
    if (!r) r = object_test(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ALIAS_BRACKETS
  public static boolean bracket(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket")) return false;
    if (!nextTokenIs(b, ALIAS_BRACKETS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS_BRACKETS);
    exit_section_(b, m, BRACKET, r);
    return r;
  }

  /* ********************************************************** */
  // bracket_target LEFT_SQUARE_BRACKET actuals RIGHT_SQUARE_BRACKET
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
  // object_call | non_object_call
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL, "<call>");
    r = object_call(b, l + 1);
    if (!r) r = non_object_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AGENT_KEYWORD call_agent_body
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
  // CHARACTER_LITERAL
  public static boolean character_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "character_constant")) return false;
    if (!nextTokenIs(b, CHARACTER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHARACTER_LITERAL);
    exit_section_(b, m, CHARACTER_CONSTANT, r);
    return r;
  }

  /* ********************************************************** */
  // CHECK_KEYWORD assertion [notes] END_KEYWORD
  public static boolean check(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "check")) return false;
    if (!nextTokenIs(b, CHECK_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHECK_KEYWORD);
    r = r && assertion(b, l + 1);
    r = r && check_2(b, l + 1);
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

  /* ********************************************************** */
  // constant | manifest_type | constant_interval | type_interval
  public static boolean choice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICE, "<choice>");
    r = constant(b, l + 1);
    if (!r) r = manifest_type(b, l + 1);
    if (!r) r = constant_interval(b, l + 1);
    if (!r) r = type_interval(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // choice (COMMA? choice)*
  public static boolean choices(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICES, "<choices>");
    r = choice(b, l + 1);
    r = r && choices_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA? choice)*
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

  // COMMA? choice
  private static boolean choices_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choices_1_0_0(b, l + 1);
    r = r && choice(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean choices_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // [notes] class_header [formal_generics] [obsolete] [inheritance] [creators] [converters] [features] [notes] [invariant] [notes] END_KEYWORD
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && class_header(b, l + 1);
    r = r && class_declaration_2(b, l + 1);
    r = r && class_declaration_3(b, l + 1);
    r = r && class_declaration_4(b, l + 1);
    r = r && class_declaration_5(b, l + 1);
    r = r && class_declaration_6(b, l + 1);
    r = r && class_declaration_7(b, l + 1);
    r = r && class_declaration_8(b, l + 1);
    r = r && class_declaration_9(b, l + 1);
    r = r && class_declaration_10(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // [header_mark] CLASS_KEYWORD class_name
  public static boolean class_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_HEADER, "<class header>");
    r = class_header_0(b, l + 1);
    r = r && consumeToken(b, CLASS_KEYWORD);
    r = r && class_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [header_mark]
  private static boolean class_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_header_0")) return false;
    header_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // class_name (COMMA? class_name)*
  public static boolean class_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_name(b, l + 1);
    r = r && class_list_1(b, l + 1);
    exit_section_(b, m, CLASS_LIST, r);
    return r;
  }

  // (COMMA? class_name)*
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

  // COMMA? class_name
  private static boolean class_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = class_list_1_0_0(b, l + 1);
    r = r && class_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean class_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean class_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CLASS_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // class_type | tuple_type
  public static boolean class_or_tuple_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_or_tuple_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_OR_TUPLE_TYPE, "<class or tuple type>");
    r = class_type(b, l + 1);
    if (!r) r = tuple_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attachment_mark] class_name [actual_generics]
  public static boolean class_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_TYPE, "<class type>");
    r = class_type_0(b, l + 1);
    r = r && class_name(b, l + 1);
    r = r && class_type_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [attachment_mark]
  private static boolean class_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_0")) return false;
    attachment_mark(b, l + 1);
    return true;
  }

  // [actual_generics]
  private static boolean class_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type_2")) return false;
    actual_generics(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LEFT_CURLY_BRACKET class_list RIGHT_CURLY_BRACKET
  public static boolean clients(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clients")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && class_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, CLIENTS, r);
    return r;
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
  // EQ | NOT_EQ | TILDE | NOT_TILDE
  public static boolean comparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON, "<comparison>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NOT_EQ);
    if (!r) r = consumeToken(b, TILDE);
    if (!r) r = consumeToken(b, NOT_TILDE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (instruction SEMICOLON?)*
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

  // instruction SEMICOLON?
  private static boolean compound_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instruction(b, l + 1);
    r = r && compound_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean compound_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // IF_KEYWORD then_part_list [else_part] END_KEYWORD
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
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = manifest_constant(b, l + 1);
    if (!r) r = constant_attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // constant DDOT constant
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
  // ARROW constraining_types [constraint_creators]
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    if (!nextTokenIs(b, ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && constraining_types(b, l + 1);
    r = r && constraint_2(b, l + 1);
    exit_section_(b, m, CONSTRAINT, r);
    return r;
  }

  // [constraint_creators]
  private static boolean constraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_2")) return false;
    constraint_creators(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CREATE_KEYWORD feature_list END_KEYWORD
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
  // single_constraint (COMMA? single_constraint)*
  public static boolean constraint_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT_LIST, "<constraint list>");
    r = single_constraint(b, l + 1);
    r = r && constraint_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA? single_constraint)*
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

  // COMMA? single_constraint
  private static boolean constraint_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constraint_list_1_0_0(b, l + 1);
    r = r && single_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean constraint_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // feature_name LEFT_PAREN LEFT_CURLY_BRACKET type_list RIGHT_CURLY_BRACKET RIGHT_PAREN
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
  // feature_name COLON LEFT_CURLY_BRACKET type_list RIGHT_CURLY_BRACKET
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
  public static boolean converter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conversion_procedure(b, l + 1);
    if (!r) r = conversion_query(b, l + 1);
    exit_section_(b, m, CONVERTER, r);
    return r;
  }

  /* ********************************************************** */
  // converter (COMMA? converter)*
  public static boolean converter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = converter(b, l + 1);
    r = r && converter_list_1(b, l + 1);
    exit_section_(b, m, CONVERTER_LIST, r);
    return r;
  }

  // (COMMA? converter)*
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

  // COMMA? converter
  private static boolean converter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = converter_list_1_0_0(b, l + 1);
    r = r && converter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean converter_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "converter_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // CONVERT_KEYWORD converter_list
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
  public static boolean creation_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_call")) return false;
    if (!nextTokenIs(b, "<creation call>", IDENTIFIER, RESULT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATION_CALL, "<creation call>");
    r = variable(b, l + 1);
    r = r && creation_call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [explicit_creation_call]
  private static boolean creation_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_call_1")) return false;
    explicit_creation_call(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CREATE_KEYWORD [clients] [header_comment] creation_procedure_list
  public static boolean creation_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_clause")) return false;
    if (!nextTokenIs(b, CREATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE_KEYWORD);
    r = r && creation_clause_1(b, l + 1);
    r = r && creation_clause_2(b, l + 1);
    r = r && creation_procedure_list(b, l + 1);
    exit_section_(b, m, CREATION_CLAUSE, r);
    return r;
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
  // CREATE_KEYWORD explicit_creation_type [explicit_creation_call]
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
  // CREATE_KEYWORD [explicit_creation_type] creation_call
  public static boolean creation_instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_instruction")) return false;
    if (!nextTokenIs(b, CREATE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE_KEYWORD);
    r = r && creation_instruction_1(b, l + 1);
    r = r && creation_call(b, l + 1);
    exit_section_(b, m, CREATION_INSTRUCTION, r);
    return r;
  }

  // [explicit_creation_type]
  private static boolean creation_instruction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_instruction_1")) return false;
    explicit_creation_type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // feature_name
  public static boolean creation_procedure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_procedure")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    exit_section_(b, m, CREATION_PROCEDURE, r);
    return r;
  }

  /* ********************************************************** */
  // creation_procedure (COMMA creation_procedure)*
  public static boolean creation_procedure_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "creation_procedure_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = creation_procedure(b, l + 1);
    r = r && creation_procedure_list_1(b, l + 1);
    exit_section_(b, m, CREATION_PROCEDURE_LIST, r);
    return r;
  }

  // (COMMA creation_procedure)*
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

  // COMMA creation_procedure
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
  // DEBUG_KEYWORD [LEFT_PAREN key_list RIGHT_PAREN] compound END_KEYWORD
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

  // [LEFT_PAREN key_list RIGHT_PAREN]
  private static boolean debug_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debug_1")) return false;
    debug_1_0(b, l + 1);
    return true;
  }

  // LEFT_PAREN key_list RIGHT_PAREN
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
  public static boolean declaration_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_BODY, "<declaration body>");
    r = declaration_body_0(b, l + 1);
    r = r && declaration_body_1(b, l + 1);
    r = r && declaration_body_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // DEFERRED_KEYWORD
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
  // internal | ext
  public static boolean effective_routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "effective_routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EFFECTIVE_ROUTINE, "<effective routine>");
    r = internal(b, l + 1);
    if (!r) r = ext(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_declaration
  static boolean eiffelFile(PsiBuilder b, int l) {
    return class_declaration(b, l + 1);
  }

  /* ********************************************************** */
  // ELSE_KEYWORD compound
  public static boolean else_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_part")) return false;
    if (!nextTokenIs(b, ELSE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, ELSE_PART, r);
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
  // identifier_list type_mark
  public static boolean entity_declaration_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_group")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier_list(b, l + 1);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, ENTITY_DECLARATION_GROUP, r);
    return r;
  }

  /* ********************************************************** */
  // entity_declaration_group (SEMICOLON? entity_declaration_group)*
  public static boolean entity_declaration_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_declaration_group(b, l + 1);
    r = r && entity_declaration_list_1(b, l + 1);
    exit_section_(b, m, ENTITY_DECLARATION_LIST, r);
    return r;
  }

  // (SEMICOLON? entity_declaration_group)*
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

  // SEMICOLON? entity_declaration_group
  private static boolean entity_declaration_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_declaration_list_1_0_0(b, l + 1);
    r = r && entity_declaration_group(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean entity_declaration_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_list_1_0_0")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // expression comparison expression
  public static boolean equality(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY, "<equality>");
    r = expression(b, l + 1);
    r = r && comparison(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UNTIL_KEYWORD boolean_expression
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
  // DOT unqualified_call
  public static boolean explicit_creation_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_creation_call")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && unqualified_call(b, l + 1);
    exit_section_(b, m, EXPLICIT_CREATION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_CURLY_BRACKET type RIGHT_CURLY_BRACKET
  public static boolean explicit_creation_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_creation_type")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, EXPLICIT_CREATION_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // EQ manifest_constant
  public static boolean explicit_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_value")) return false;
    if (!nextTokenIs(b, EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && manifest_constant(b, l + 1);
    exit_section_(b, m, EXPLICIT_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // special_expression | basic_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = special_expression(b, l + 1);
    if (!r) r = basic_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (expression COMMA?)*
  public static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    int c = current_position_(b);
    while (true) {
      if (!expression_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // expression COMMA?
  private static boolean expression_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expression_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean expression_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
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
  public static boolean extended_feature_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extended_feature_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && extended_feature_name_1(b, l + 1);
    exit_section_(b, m, EXTENDED_FEATURE_NAME, r);
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
  // [undefine] [redefine] [rename] [new_exports] [select] END_KEYWORD
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

  // [undefine]
  private static boolean feature_adaption_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_0")) return false;
    undefine(b, l + 1);
    return true;
  }

  // [redefine]
  private static boolean feature_adaption_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_1")) return false;
    redefine(b, l + 1);
    return true;
  }

  // [rename]
  private static boolean feature_adaption_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_2")) return false;
    rename(b, l + 1);
    return true;
  }

  // [new_exports]
  private static boolean feature_adaption_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_adaption_3")) return false;
    new_exports(b, l + 1);
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
  public static boolean feature_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_BODY, "<feature body>");
    r = deferred(b, l + 1);
    if (!r) r = effective_routine(b, l + 1);
    if (!r) r = attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FEATURE_KEYWORD [clients] [header_comment] feature_declaration_list
  public static boolean feature_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_clause")) return false;
    if (!nextTokenIs(b, FEATURE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FEATURE_KEYWORD);
    r = r && feature_clause_1(b, l + 1);
    r = r && feature_clause_2(b, l + 1);
    r = r && feature_declaration_list(b, l + 1);
    exit_section_(b, m, FEATURE_CLAUSE, r);
    return r;
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
  // new_feature_list declaration_body
  public static boolean feature_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration")) return false;
    if (!nextTokenIs(b, "<feature declaration>", FROZEN_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_DECLARATION, "<feature declaration>");
    r = new_feature_list(b, l + 1);
    r = r && declaration_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (feature_declaration SEMICOLON?)*
  public static boolean feature_declaration_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_DECLARATION_LIST, "<feature declaration list>");
    int c = current_position_(b);
    while (true) {
      if (!feature_declaration_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "feature_declaration_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // feature_declaration SEMICOLON?
  private static boolean feature_declaration_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_declaration(b, l + 1);
    r = r && feature_declaration_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean feature_declaration_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_declaration_list_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // feature_name (COMMA? feature_name)*
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

  // (COMMA? feature_name)*
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

  // COMMA? feature_name
  private static boolean feature_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_list_1_0_0(b, l + 1);
    r = r && feature_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
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
  // feature_list | ALL_KEYWORD
  public static boolean feature_set(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_set")) return false;
    if (!nextTokenIs(b, "<feature set>", ALL_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_SET, "<feature set>");
    r = feature_list(b, l + 1);
    if (!r) r = consumeToken(b, ALL_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [explicit_value] [obsolete] [header_comment] [attribute_or_routine]
  public static boolean feature_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FEATURE_VALUE, "<feature value>");
    r = feature_value_0(b, l + 1);
    r = r && feature_value_1(b, l + 1);
    r = r && feature_value_2(b, l + 1);
    r = r && feature_value_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [explicit_value]
  private static boolean feature_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_0")) return false;
    explicit_value(b, l + 1);
    return true;
  }

  // [obsolete]
  private static boolean feature_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_1")) return false;
    obsolete(b, l + 1);
    return true;
  }

  // [header_comment]
  private static boolean feature_value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_2")) return false;
    header_comment(b, l + 1);
    return true;
  }

  // [attribute_or_routine]
  private static boolean feature_value_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "feature_value_3")) return false;
    attribute_or_routine(b, l + 1);
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
  // LEFT_PAREN entity_declaration_list RIGHT_PAREN
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
  // [FROZEN_KEYWORD] formal_generic_name [constraint]
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

  // [FROZEN_KEYWORD]
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
  // formal_generic (COMMA? formal_generic)*
  public static boolean formal_generic_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_GENERIC_LIST, "<formal generic list>");
    r = formal_generic(b, l + 1);
    r = r && formal_generic_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA? formal_generic)*
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

  // COMMA? formal_generic
  private static boolean formal_generic_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_generic_list_1_0_0(b, l + 1);
    r = r && formal_generic(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean formal_generic_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // [QUESTION] IDENTIFIER
  public static boolean formal_generic_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_name")) return false;
    if (!nextTokenIs(b, "<formal generic name>", IDENTIFIER, QUESTION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_GENERIC_NAME, "<formal generic name>");
    r = formal_generic_name_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [QUESTION]
  private static boolean formal_generic_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_generic_name_0")) return false;
    consumeToken(b, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // LEFT_SQUARE_BRACKET formal_generic_list RIGHT_SQUARE_BRACKET
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
  // DEFERRED_KEYWORD | EXPANDED_KEYWORD | FROZEN_KEYWORD
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

  /* ********************************************************** */
  // IDENTIFIER (COMMA IDENTIFIER)*
  public static boolean identifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && identifier_list_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean identifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!identifier_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean identifier_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INHERIT_KEYWORD [non_conformance] parent_list
  public static boolean inherit_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inherit_clause")) return false;
    if (!nextTokenIs(b, INHERIT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INHERIT_KEYWORD);
    r = r && inherit_clause_1(b, l + 1);
    r = r && parent_list(b, l + 1);
    exit_section_(b, m, INHERIT_CLAUSE, r);
    return r;
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
  // FROM_KEYWORD compound
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
  // AGENT_KEYWORD [formal_arguments] [type_mark] [attribute_or_routine] [agent_actuals]
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
  // creation_instruction |
  //     assignment |
  //     assigner_call |
  //     call |
  //     conditional |
  //     multi_branch |
  //     loop |
  //     debug |
  //     precursor |
  //     check |
  //     retry
  public static boolean instruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instruction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTRUCTION, "<instruction>");
    r = creation_instruction(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = assigner_call(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = conditional(b, l + 1);
    if (!r) r = multi_branch(b, l + 1);
    if (!r) r = loop(b, l + 1);
    if (!r) r = debug(b, l + 1);
    if (!r) r = precursor(b, l + 1);
    if (!r) r = check(b, l + 1);
    if (!r) r = retry(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  public static boolean integer_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_constant")) return false;
    if (!nextTokenIs(b, INTEGER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, m, INTEGER_CONSTANT, r);
    return r;
  }

  /* ********************************************************** */
  // routine_mark compound
  public static boolean internal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "internal")) return false;
    if (!nextTokenIs(b, "<internal>", DO_KEYWORD, ONCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERNAL, "<internal>");
    r = routine_mark(b, l + 1);
    r = r && compound(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INVARIANT_KEYWORD assertion
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
  // ACROSS_KEYWORD expression AS_KEYWORD IDENTIFIER
  public static boolean iteration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration")) return false;
    if (!nextTokenIs(b, ACROSS_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACROSS_KEYWORD);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, AS_KEYWORD, IDENTIFIER);
    exit_section_(b, m, ITERATION, r);
    return r;
  }

  /* ********************************************************** */
  // manifest_string (COMMA? manifest_string)*
  public static boolean key_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_list")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = manifest_string(b, l + 1);
    r = r && key_list_1(b, l + 1);
    exit_section_(b, m, KEY_LIST, r);
    return r;
  }

  // (COMMA? manifest_string)*
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

  // COMMA? manifest_string
  private static boolean key_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key_list_1_0_0(b, l + 1);
    r = r && manifest_string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean key_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER | RESULT_KEYWORD
  public static boolean local(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local")) return false;
    if (!nextTokenIs(b, "<local>", IDENTIFIER, RESULT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCAL, "<local>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, RESULT_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LOCAL_KEYWORD [entity_declaration_list]
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
  // [iteration]
  //     [initialization]
  //     [invariant]
  //     [exit_condition]
  //     loop_body
  //     [variant]
  //     END_KEYWORD
  public static boolean loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP, "<loop>");
    r = loop_0(b, l + 1);
    r = r && loop_1(b, l + 1);
    r = r && loop_2(b, l + 1);
    r = r && loop_3(b, l + 1);
    r = r && loop_body(b, l + 1);
    r = r && loop_5(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [iteration]
  private static boolean loop_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_0")) return false;
    iteration(b, l + 1);
    return true;
  }

  // [initialization]
  private static boolean loop_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_1")) return false;
    initialization(b, l + 1);
    return true;
  }

  // [invariant]
  private static boolean loop_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_2")) return false;
    invariant(b, l + 1);
    return true;
  }

  // [exit_condition]
  private static boolean loop_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_3")) return false;
    exit_condition(b, l + 1);
    return true;
  }

  // [variant]
  private static boolean loop_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_5")) return false;
    variant(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (LOOP_KEYWORD compound) | (ALL_KEYWORD boolean_expression) | (SOME_KEYWORD boolean_expression)
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

  // LOOP_KEYWORD compound
  private static boolean loop_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOOP_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ALL_KEYWORD boolean_expression
  private static boolean loop_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALL_KEYWORD);
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SOME_KEYWORD boolean_expression
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
  public static boolean manifest_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_string")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, MANIFEST_STRING, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_SQUARE_BRACKET expression_list RIGHT_SQUARE_BRACKET
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
  // LEFT_CURLY_BRACKET type RIGHT_CURLY_BRACKET
  public static boolean manifest_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_type")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_CURLY_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, MANIFEST_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // boolean_constant |
  //     character_constant |
  //     integer_constant |
  //     real_constant |
  //     manifest_string |
  //     manifest_type
  public static boolean manifest_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "manifest_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MANIFEST_VALUE, "<manifest value>");
    r = boolean_constant(b, l + 1);
    if (!r) r = character_constant(b, l + 1);
    if (!r) r = integer_constant(b, l + 1);
    if (!r) r = real_constant(b, l + 1);
    if (!r) r = manifest_string(b, l + 1);
    if (!r) r = manifest_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // INSPECT_KEYWORD expression [when_part_list] [else_part] END_KEYWORD
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
  // LEFT_CURLY_BRACKET constraint_list RIGHT_CURLY_BRACKET
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
  public static boolean new_export_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_item")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clients(b, l + 1);
    r = r && new_export_item_1(b, l + 1);
    r = r && feature_set(b, l + 1);
    exit_section_(b, m, NEW_EXPORT_ITEM, r);
    return r;
  }

  // [header_comment]
  private static boolean new_export_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_item_1")) return false;
    header_comment(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // new_export_item (COMMA? new_export_item)*
  public static boolean new_export_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_list")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_export_item(b, l + 1);
    r = r && new_export_list_1(b, l + 1);
    exit_section_(b, m, NEW_EXPORT_LIST, r);
    return r;
  }

  // (COMMA? new_export_item)*
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

  // COMMA? new_export_item
  private static boolean new_export_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_export_list_1_0_0(b, l + 1);
    r = r && new_export_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean new_export_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_export_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // EXPORT_KEYWORD new_export_list
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
  // [FROZEN_KEYWORD] extended_feature_name
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

  // [FROZEN_KEYWORD]
  private static boolean new_feature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_0")) return false;
    consumeToken(b, FROZEN_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // new_feature (COMMA? new_feature)*
  public static boolean new_feature_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_list")) return false;
    if (!nextTokenIs(b, "<new feature list>", FROZEN_KEYWORD, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEW_FEATURE_LIST, "<new feature list>");
    r = new_feature(b, l + 1);
    r = r && new_feature_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA? new_feature)*
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

  // COMMA? new_feature
  private static boolean new_feature_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = new_feature_list_1_0_0(b, l + 1);
    r = r && new_feature(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean new_feature_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "new_feature_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // LEFT_CURLY_BRACKET NONE_KEYWORD RIGHT_CURLY_BRACKET
  public static boolean non_conformance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_conformance")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_CURLY_BRACKET, NONE_KEYWORD, RIGHT_CURLY_BRACKET);
    exit_section_(b, m, NON_CONFORMANCE, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_CURLY_BRACKET type RIGHT_CURLY_BRACKET DOT unqualified_call
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
  // (note_entry SEMICOLON?)*
  public static boolean note_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, NOTE_LIST, "<note list>");
    int c = current_position_(b);
    while (true) {
      if (!note_list_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "note_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // note_entry SEMICOLON?
  private static boolean note_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = note_entry(b, l + 1);
    r = r && note_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean note_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_list_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON
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
  // note_item (SEMICOLON? note_item)*
  public static boolean note_values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOTE_VALUES, "<note values>");
    r = note_item(b, l + 1);
    r = r && note_values_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEMICOLON? note_item)*
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

  // SEMICOLON? note_item
  private static boolean note_values_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_values_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = note_values_1_0_0(b, l + 1);
    r = r && note_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean note_values_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_values_1_0_0")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // NOTE_KEYWORD note_list
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
  // [target DOT] unqualified_call
  public static boolean object_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_CALL, "<object call>");
    r = object_call_0(b, l + 1);
    r = r && unqualified_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [target DOT]
  private static boolean object_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_call_0")) return false;
    object_call_0_0(b, l + 1);
    return true;
  }

  // target DOT
  private static boolean object_call_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_call_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = target(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_CURLY_BRACKET IDENTIFIER COLON type RIGHT_CURLY_BRACKET expression
  public static boolean object_test(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_test")) return false;
    if (!nextTokenIs(b, LEFT_CURLY_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_CURLY_BRACKET, IDENTIFIER, COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RIGHT_CURLY_BRACKET);
    r = r && expression(b, l + 1);
    exit_section_(b, m, OBJECT_TEST, r);
    return r;
  }

  /* ********************************************************** */
  // OBSOLETE_KEYWORD message
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
  // OLD_KEYWORD expression
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
  // ONCE_KEYWORD [LEFT_PAREN key_list RIGHT_PAREN]
  public static boolean once(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once")) return false;
    if (!nextTokenIs(b, ONCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ONCE_KEYWORD);
    r = r && once_1(b, l + 1);
    exit_section_(b, m, ONCE, r);
    return r;
  }

  // [LEFT_PAREN key_list RIGHT_PAREN]
  private static boolean once_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once_1")) return false;
    once_1_0(b, l + 1);
    return true;
  }

  // LEFT_PAREN key_list RIGHT_PAREN
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
  // ONCE_KEYWORD manifest_string
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
  // ONLY_KEYWORD [feature_list]
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
  // unary | binary
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = unary(b, l + 1);
    if (!r) r = binary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unary_expression | binary_expression
  public static boolean operator_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_EXPRESSION, "<operator expression>");
    r = unary_expression(b, l + 1);
    if (!r) r = binary_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // parent (SEMICOLON? parent)*
  public static boolean parent_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARENT_LIST, "<parent list>");
    r = parent(b, l + 1);
    r = r && parent_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (SEMICOLON? parent)*
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

  // SEMICOLON? parent
  private static boolean parent_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parent_list_1_0_0(b, l + 1);
    r = r && parent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEMICOLON?
  private static boolean parent_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parent_list_1_0_0")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // LEFT_CURLY_BRACKET class_name RIGHT_CURLY_BRACKET
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
  // LEFT_PAREN expression RIGHT_PAREN
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
  // [manifest_type] QUESTION
  public static boolean placeholder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "placeholder")) return false;
    if (!nextTokenIs(b, "<placeholder>", LEFT_CURLY_BRACKET, QUESTION)) return false;
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
  // ENSURE_KEYWORD [THEN_KEYWORD] assertion [only]
  public static boolean postcondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postcondition")) return false;
    if (!nextTokenIs(b, ENSURE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENSURE_KEYWORD);
    r = r && postcondition_1(b, l + 1);
    r = r && assertion(b, l + 1);
    r = r && postcondition_3(b, l + 1);
    exit_section_(b, m, POSTCONDITION, r);
    return r;
  }

  // [THEN_KEYWORD]
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
  // REQUIRE_KEYWORD [ELSE_KEYWORD] assertion
  public static boolean precondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precondition")) return false;
    if (!nextTokenIs(b, REQUIRE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REQUIRE_KEYWORD);
    r = r && precondition_1(b, l + 1);
    r = r && assertion(b, l + 1);
    exit_section_(b, m, PRECONDITION, r);
    return r;
  }

  // [ELSE_KEYWORD]
  private static boolean precondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "precondition_1")) return false;
    consumeToken(b, ELSE_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // PRECURSOR_KEYWORD [parent_qualification] [actuals]
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
  public static boolean query_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_mark")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && query_mark_1(b, l + 1);
    exit_section_(b, m, QUERY_MARK, r);
    return r;
  }

  // [assigner_mark]
  private static boolean query_mark_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_mark_1")) return false;
    assigner_mark(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // formal | constant_attribute | CURRENT_KEYWORD
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
  public static boolean real_constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "real_constant")) return false;
    if (!nextTokenIs(b, REAL_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REAL_LITERAL);
    exit_section_(b, m, REAL_CONSTANT, r);
    return r;
  }

  /* ********************************************************** */
  // REDEFINE_KEYWORD feature_list
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
  // RENAME_KEYWORD rename_list
  public static boolean rename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename")) return false;
    if (!nextTokenIs(b, RENAME_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RENAME_KEYWORD);
    r = r && rename_list(b, l + 1);
    exit_section_(b, m, RENAME, r);
    return r;
  }

  /* ********************************************************** */
  // rename_pair (COMMA? rename_pair)*
  public static boolean rename_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rename_pair(b, l + 1);
    r = r && rename_list_1(b, l + 1);
    exit_section_(b, m, RENAME_LIST, r);
    return r;
  }

  // (COMMA? rename_pair)*
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

  // COMMA? rename_pair
  private static boolean rename_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rename_list_1_0_0(b, l + 1);
    r = r && rename_pair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean rename_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rename_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // feature_name AS_KEYWORD extended_feature_name
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
  // rename END_KEYWORD
  public static boolean renaming(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "renaming")) return false;
    if (!nextTokenIs(b, RENAME_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rename(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, RENAMING, r);
    return r;
  }

  /* ********************************************************** */
  // RESCUE_KEYWORD compound
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
  // RETRY_KEYWORD
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
  // DO_KEYWORD | once
  public static boolean routine_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_mark")) return false;
    if (!nextTokenIs(b, "<routine mark>", DO_KEYWORD, ONCE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE_MARK, "<routine mark>");
    r = consumeToken(b, DO_KEYWORD);
    if (!r) r = once(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SELECT_KEYWORD feature_list
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
  public static boolean single_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_CONSTRAINT, "<single constraint>");
    r = type(b, l + 1);
    r = r && single_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // tag COLON
  public static boolean tag_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tag_mark")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tag(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, TAG_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // local | read_only | call | parenthesized_target
  public static boolean target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TARGET, "<target>");
    r = local(b, l + 1);
    if (!r) r = read_only(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = consumeToken(b, PARENTHESIZED_TARGET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // boolean_expression THEN_KEYWORD compound
  public static boolean then_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "then_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THEN_PART, "<then part>");
    r = boolean_expression(b, l + 1);
    r = r && consumeToken(b, THEN_KEYWORD);
    r = r && compound(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // then_part (ELSEIF_KEYWORD then_part)*
  public static boolean then_part_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "then_part_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THEN_PART_LIST, "<then part list>");
    r = then_part(b, l + 1);
    r = r && then_part_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ELSEIF_KEYWORD then_part)*
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

  // ELSEIF_KEYWORD then_part
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
  // LEFT_SQUARE_BRACKET tuple_parameters RIGHT_SQUARE_BRACKET
  public static boolean tuple_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_parameter_list")) return false;
    if (!nextTokenIs(b, LEFT_SQUARE_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SQUARE_BRACKET);
    r = r && tuple_parameters(b, l + 1);
    r = r && consumeToken(b, RIGHT_SQUARE_BRACKET);
    exit_section_(b, m, TUPLE_PARAMETER_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // type_list | entity_declaration_list
  public static boolean tuple_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_parameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_PARAMETERS, "<tuple parameters>");
    r = type_list(b, l + 1);
    if (!r) r = entity_declaration_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TUPLE_KEYWORD [tuple_parameter_list]
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
  // manifest_type DDOT manifest_type
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
  // type (COMMA? type)*
  public static boolean type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_LIST, "<type list>");
    r = type(b, l + 1);
    r = r && type_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA? type)*
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

  // COMMA? type
  private static boolean type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_list_1_0_0(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean type_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_1_0_0")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // COLON type
  public static boolean type_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_mark")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, TYPE_MARK, r);
    return r;
  }

  /* ********************************************************** */
  // NOT_KEYWORD | PLUS | MINUS
  public static boolean unary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY, "<unary>");
    r = consumeToken(b, NOT_KEYWORD);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unary expression
  public static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = unary(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // UNDEFINE_KEYWORD feature_list
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
  // boolean_expression | comment
  public static boolean unlabeled_assertion_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unlabeled_assertion_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNLABELED_ASSERTION_CLAUSE, "<unlabeled assertion clause>");
    r = boolean_expression(b, l + 1);
    if (!r) r = comment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // feature_name [actuals]
  public static boolean unqualified_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unqualified_call")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    r = r && unqualified_call_1(b, l + 1);
    exit_section_(b, m, UNQUALIFIED_CALL, r);
    return r;
  }

  // [actuals]
  private static boolean unqualified_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unqualified_call_1")) return false;
    actuals(b, l + 1);
    return true;
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
    if (!nextTokenIs(b, "<variable>", IDENTIFIER, RESULT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = local(b, l + 1);
    if (!r) r = variable_attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // feature_name
  public static boolean variable_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_attribute")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = feature_name(b, l + 1);
    exit_section_(b, m, VARIABLE_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // VARIANT_KEYWORD [tag_mark] expression
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
  // WHEN_KEYWORD choices THEN_KEYWORD compound
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
  public static boolean when_part_list(PsiBuilder b, int l) {
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
    exit_section_(b, m, WHEN_PART_LIST, r);
    return r;
  }

}
