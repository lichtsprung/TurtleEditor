// This is a generated file. Not intended for manual editing.
package net.openplexus.turtle;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static net.openplexus.turtle.psi.TurtleElementType.*;
import static net.openplexus.turtle.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TurtleParser implements PsiParser {

  public static Logger LOG_ = Logger.getInstance("net.openplexus.turtle.TurtleParser");

  @NotNull
  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this);
    if (root_ == BLANK_NODE) {
      result_ = BlankNode(builder_, level_ + 1);
    }
    else if (root_ == BOOLEAN_LITERAL) {
      result_ = BooleanLiteral(builder_, level_ + 1);
    }
    else if (root_ == NUMERIC_LITERAL) {
      result_ = NumericLiteral(builder_, level_ + 1);
    }
    else if (root_ == PREFIXED_NAME) {
      result_ = PrefixedName(builder_, level_ + 1);
    }
    else if (root_ == RDF_LITERAL) {
      result_ = RDFLiteral(builder_, level_ + 1);
    }
    else if (root_ == STRING) {
      result_ = String(builder_, level_ + 1);
    }
    else if (root_ == BASE) {
      result_ = base(builder_, level_ + 1);
    }
    else if (root_ == BLANK_NODE_PROPERTY_LIST) {
      result_ = blankNodePropertyList(builder_, level_ + 1);
    }
    else if (root_ == COLLECTION) {
      result_ = collection(builder_, level_ + 1);
    }
    else if (root_ == DIRECTIVE) {
      result_ = directive(builder_, level_ + 1);
    }
    else if (root_ == IRI) {
      result_ = iri(builder_, level_ + 1);
    }
    else if (root_ == LITERAL) {
      result_ = literal(builder_, level_ + 1);
    }
    else if (root_ == OBJECT) {
      result_ = object(builder_, level_ + 1);
    }
    else if (root_ == OBJECT_LIST) {
      result_ = objectList(builder_, level_ + 1);
    }
    else if (root_ == PREDICATE) {
      result_ = predicate(builder_, level_ + 1);
    }
    else if (root_ == PREDICATE_OBJECT_LIST) {
      result_ = predicateObjectList(builder_, level_ + 1);
    }
    else if (root_ == PREFIX_ID) {
      result_ = prefixID(builder_, level_ + 1);
    }
    else if (root_ == SPARQL_BASE) {
      result_ = sparqlBase(builder_, level_ + 1);
    }
    else if (root_ == SPARQL_PREFIX) {
      result_ = sparqlPrefix(builder_, level_ + 1);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, level_ + 1);
    }
    else if (root_ == SUBJECT) {
      result_ = subject(builder_, level_ + 1);
    }
    else if (root_ == TRIPLES) {
      result_ = triples(builder_, level_ + 1);
    }
    else if (root_ == VERB) {
      result_ = verb(builder_, level_ + 1);
    }
    else {
      Marker marker_ = builder_.mark();
      enterErrorRecordingSection(builder_, level_, _SECTION_RECOVER_, null);
      result_ = parse_root_(root_, builder_, level_);
      exitErrorRecordingSection(builder_, level_, result_, true, _SECTION_RECOVER_, TOKEN_ADVANCER);
      marker_.done(root_);
    }
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return turtleDoc(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // BLANK_NODE_LABEL | ANON
  public static boolean BlankNode(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlankNode")) return false;
    if (!nextTokenIs(builder_, ANON) && !nextTokenIs(builder_, BLANK_NODE_LABEL)
        && replaceVariants(builder_, 2, "<blank node>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<blank node>");
    result_ = consumeToken(builder_, BLANK_NODE_LABEL);
    if (!result_) result_ = consumeToken(builder_, ANON);
    if (result_) {
      marker_.done(BLANK_NODE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // 'true' | 'false'
  public static boolean BooleanLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BooleanLiteral")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<boolean literal>");
    result_ = consumeToken(builder_, "true");
    if (!result_) result_ = consumeToken(builder_, "false");
    if (result_) {
      marker_.done(BOOLEAN_LITERAL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // INTEGER | DECIMAL | DOUBLE
  public static boolean NumericLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumericLiteral")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<numeric literal>");
    result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, DECIMAL);
    if (!result_) result_ = consumeToken(builder_, DOUBLE);
    if (result_) {
      marker_.done(NUMERIC_LITERAL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // PNAME_LN | PNAME_NS
  public static boolean PrefixedName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrefixedName")) return false;
    if (!nextTokenIs(builder_, PNAME_LN) && !nextTokenIs(builder_, PNAME_NS)
        && replaceVariants(builder_, 2, "<prefixed name>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<prefixed name>");
    result_ = consumeToken(builder_, PNAME_LN);
    if (!result_) result_ = consumeToken(builder_, PNAME_NS);
    if (result_) {
      marker_.done(PREFIXED_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // String (LANGTAG | '^^' iri)?
  public static boolean RDFLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RDFLiteral")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rdf literal>");
    result_ = String(builder_, level_ + 1);
    result_ = result_ && RDFLiteral_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(RDF_LITERAL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // (LANGTAG | '^^' iri)?
  private static boolean RDFLiteral_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RDFLiteral_1")) return false;
    RDFLiteral_1_0(builder_, level_ + 1);
    return true;
  }

  // LANGTAG | '^^' iri
  private static boolean RDFLiteral_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RDFLiteral_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, LANGTAG);
    if (!result_) result_ = RDFLiteral_1_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '^^' iri
  private static boolean RDFLiteral_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RDFLiteral_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "^^");
    result_ = result_ && iri(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // STRING_LITERAL_QUOTE | STRING_LITERAL_SINGLE_QUOTE | STRING_LITERAL_LONG_SINGLE_QUOTE | STRING_LITERAL_LONG_QUOTE
  public static boolean String(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "String")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<string>");
    result_ = consumeToken(builder_, STRING_LITERAL_QUOTE);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL_SINGLE_QUOTE);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL_LONG_SINGLE_QUOTE);
    if (!result_) result_ = consumeToken(builder_, STRING_LITERAL_LONG_QUOTE);
    if (result_) {
      marker_.done(STRING);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // '@base' IRIREF '.'
  public static boolean base(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "base")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<base>");
    result_ = consumeToken(builder_, "@base");
    result_ = result_ && consumeToken(builder_, IRIREF);
    result_ = result_ && consumeToken(builder_, ".");
    if (result_) {
      marker_.done(BASE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // '[' predicateObjectList ']'
  public static boolean blankNodePropertyList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blankNodePropertyList")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<blank node property list>");
    result_ = consumeToken(builder_, "[");
    result_ = result_ && predicateObjectList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "]");
    if (result_) {
      marker_.done(BLANK_NODE_PROPERTY_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' object* ')'
  public static boolean collection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collection")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<collection>");
    result_ = consumeToken(builder_, "(");
    result_ = result_ && collection_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    if (result_) {
      marker_.done(COLLECTION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // object*
  private static boolean collection_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "collection_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!object(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "collection_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // prefixID | base | sparqlPrefix | sparqlBase
  public static boolean directive(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "directive")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<directive>");
    result_ = prefixID(builder_, level_ + 1);
    if (!result_) result_ = base(builder_, level_ + 1);
    if (!result_) result_ = sparqlPrefix(builder_, level_ + 1);
    if (!result_) result_ = sparqlBase(builder_, level_ + 1);
    if (result_) {
      marker_.done(DIRECTIVE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // IRIREF | PrefixedName
  public static boolean iri(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "iri")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<iri>");
    result_ = consumeToken(builder_, IRIREF);
    if (!result_) result_ = PrefixedName(builder_, level_ + 1);
    if (result_) {
      marker_.done(IRI);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // RDFLiteral | NumericLiteral | BooleanLiteral
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<literal>");
    result_ = RDFLiteral(builder_, level_ + 1);
    if (!result_) result_ = NumericLiteral(builder_, level_ + 1);
    if (!result_) result_ = BooleanLiteral(builder_, level_ + 1);
    if (result_) {
      marker_.done(LITERAL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // iri | BlankNode | collection | blankNodePropertyList | literal
  public static boolean object(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<object>");
    result_ = iri(builder_, level_ + 1);
    if (!result_) result_ = BlankNode(builder_, level_ + 1);
    if (!result_) result_ = collection(builder_, level_ + 1);
    if (!result_) result_ = blankNodePropertyList(builder_, level_ + 1);
    if (!result_) result_ = literal(builder_, level_ + 1);
    if (result_) {
      marker_.done(OBJECT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // object (',' object)*
  public static boolean objectList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectList")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<object list>");
    result_ = object(builder_, level_ + 1);
    result_ = result_ && objectList_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(OBJECT_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // (',' object)*
  private static boolean objectList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectList_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!objectList_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "objectList_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' object
  private static boolean objectList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectList_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, ",");
    result_ = result_ && object(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // iri
  public static boolean predicate(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicate")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<predicate>");
    result_ = iri(builder_, level_ + 1);
    if (result_) {
      marker_.done(PREDICATE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // verb objectList (';' (verb objectList)?)*
  public static boolean predicateObjectList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicateObjectList")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<predicate object list>");
    result_ = verb(builder_, level_ + 1);
    result_ = result_ && objectList(builder_, level_ + 1);
    result_ = result_ && predicateObjectList_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PREDICATE_OBJECT_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // (';' (verb objectList)?)*
  private static boolean predicateObjectList_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicateObjectList_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!predicateObjectList_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "predicateObjectList_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ';' (verb objectList)?
  private static boolean predicateObjectList_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicateObjectList_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, ";");
    result_ = result_ && predicateObjectList_2_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (verb objectList)?
  private static boolean predicateObjectList_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicateObjectList_2_0_1")) return false;
    predicateObjectList_2_0_1_0(builder_, level_ + 1);
    return true;
  }

  // verb objectList
  private static boolean predicateObjectList_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "predicateObjectList_2_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = verb(builder_, level_ + 1);
    result_ = result_ && objectList(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '@prefix' PNAME_NS IRIREF '.'
  public static boolean prefixID(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "prefixID")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<prefix id>");
    result_ = consumeToken(builder_, "@prefix");
    result_ = result_ && consumeTokens(builder_, 0, PNAME_NS, IRIREF);
    result_ = result_ && consumeToken(builder_, ".");
    if (result_) {
      marker_.done(PREFIX_ID);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // "BASE" IRIREF
  public static boolean sparqlBase(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sparqlBase")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<sparql base>");
    result_ = consumeToken(builder_, "BASE");
    result_ = result_ && consumeToken(builder_, IRIREF);
    if (result_) {
      marker_.done(SPARQL_BASE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // "PREFIX" PNAME_NS IRIREF
  public static boolean sparqlPrefix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sparqlPrefix")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<sparql prefix>");
    result_ = consumeToken(builder_, "PREFIX");
    result_ = result_ && consumeTokens(builder_, 0, PNAME_NS, IRIREF);
    if (result_) {
      marker_.done(SPARQL_PREFIX);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // directive | triples '.'
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<statement>");
    result_ = directive(builder_, level_ + 1);
    if (!result_) result_ = statement_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(STATEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // triples '.'
  private static boolean statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = triples(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ".");
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // iri | BlankNode | collection
  public static boolean subject(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "subject")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<subject>");
    result_ = iri(builder_, level_ + 1);
    if (!result_) result_ = BlankNode(builder_, level_ + 1);
    if (!result_) result_ = collection(builder_, level_ + 1);
    if (result_) {
      marker_.done(SUBJECT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // subject predicateObjectList | blankNodePropertyList predicateObjectList?
  public static boolean triples(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "triples")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<triples>");
    result_ = triples_0(builder_, level_ + 1);
    if (!result_) result_ = triples_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(TRIPLES);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // subject predicateObjectList
  private static boolean triples_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "triples_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = subject(builder_, level_ + 1);
    result_ = result_ && predicateObjectList(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // blankNodePropertyList predicateObjectList?
  private static boolean triples_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "triples_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = blankNodePropertyList(builder_, level_ + 1);
    result_ = result_ && triples_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // predicateObjectList?
  private static boolean triples_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "triples_1_1")) return false;
    predicateObjectList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // statement*
  static boolean turtleDoc(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "turtleDoc")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!statement(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "turtleDoc");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // predicate | 'a'
  public static boolean verb(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "verb")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<verb>");
    result_ = predicate(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, "a");
    if (result_) {
      marker_.done(VERB);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

}
