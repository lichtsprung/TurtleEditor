// This is a generated file. Not intended for manual editing.
package net.openplexus.turtle.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import net.openplexus.turtle.psi.impl.*;

public interface TurtleElementType {

  IElementType BASE = new TurtleElementType("BASE");
  IElementType BLANK_NODE = new TurtleElementType("BLANK_NODE");
  IElementType BLANK_NODE_PROPERTY_LIST = new TurtleElementType("BLANK_NODE_PROPERTY_LIST");
  IElementType BOOLEAN_LITERAL = new TurtleElementType("BOOLEAN_LITERAL");
  IElementType COLLECTION = new TurtleElementType("COLLECTION");
  IElementType DIRECTIVE = new TurtleElementType("DIRECTIVE");
  IElementType IRI = new TurtleElementType("IRI");
  IElementType LITERAL = new TurtleElementType("LITERAL");
  IElementType NUMERIC_LITERAL = new TurtleElementType("NUMERIC_LITERAL");
  IElementType OBJECT = new TurtleElementType("OBJECT");
  IElementType OBJECT_LIST = new TurtleElementType("OBJECT_LIST");
  IElementType PREDICATE = new TurtleElementType("PREDICATE");
  IElementType PREDICATE_OBJECT_LIST = new TurtleElementType("PREDICATE_OBJECT_LIST");
  IElementType PREFIXED_NAME = new TurtleElementType("PREFIXED_NAME");
  IElementType PREFIX_ID = new TurtleElementType("PREFIX_ID");
  IElementType RDF_LITERAL = new TurtleElementType("RDF_LITERAL");
  IElementType SPARQL_BASE = new TurtleElementType("SPARQL_BASE");
  IElementType SPARQL_PREFIX = new TurtleElementType("SPARQL_PREFIX");
  IElementType STATEMENT = new TurtleElementType("STATEMENT");
  IElementType STRING = new TurtleElementType("STRING");
  IElementType SUBJECT = new TurtleElementType("SUBJECT");
  IElementType TRIPLES = new TurtleElementType("TRIPLES");
  IElementType VERB = new TurtleElementType("VERB");

  IElementType ANON = new TurtleTokenType("ANON");
  IElementType BLANK_NODE_LABEL = new TurtleTokenType("BLANK_NODE_LABEL");
  IElementType DECIMAL = new TurtleTokenType("DECIMAL");
  IElementType DOUBLE = new TurtleTokenType("DOUBLE");
  IElementType INTEGER = new TurtleTokenType("INTEGER");
  IElementType IRIREF = new TurtleTokenType("IRIREF");
  IElementType LANGTAG = new TurtleTokenType("LANGTAG");
  IElementType PNAME_LN = new TurtleTokenType("PNAME_LN");
  IElementType PNAME_NS = new TurtleTokenType("PNAME_NS");
  IElementType STRING_LITERAL_LONG_QUOTE = new TurtleTokenType("STRING_LITERAL_LONG_QUOTE");
  IElementType STRING_LITERAL_LONG_SINGLE_QUOTE = new TurtleTokenType("STRING_LITERAL_LONG_SINGLE_QUOTE");
  IElementType STRING_LITERAL_QUOTE = new TurtleTokenType("STRING_LITERAL_QUOTE");
  IElementType STRING_LITERAL_SINGLE_QUOTE = new TurtleTokenType("STRING_LITERAL_SINGLE_QUOTE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == BASE) {
        return new TurtleBaseImpl(node);
      }
      else if (type == BLANK_NODE) {
        return new TurtleBlankNodeImpl(node);
      }
      else if (type == BLANK_NODE_PROPERTY_LIST) {
        return new TurtleBlankNodePropertyListImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new TurtleBooleanLiteralImpl(node);
      }
      else if (type == COLLECTION) {
        return new TurtleCollectionImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new TurtleDirectiveImpl(node);
      }
      else if (type == IRI) {
        return new TurtleIriImpl(node);
      }
      else if (type == LITERAL) {
        return new TurtleLiteralImpl(node);
      }
      else if (type == NUMERIC_LITERAL) {
        return new TurtleNumericLiteralImpl(node);
      }
      else if (type == OBJECT) {
        return new TurtleObjectImpl(node);
      }
      else if (type == OBJECT_LIST) {
        return new TurtleObjectListImpl(node);
      }
      else if (type == PREDICATE) {
        return new TurtlePredicateImpl(node);
      }
      else if (type == PREDICATE_OBJECT_LIST) {
        return new TurtlePredicateObjectListImpl(node);
      }
      else if (type == PREFIXED_NAME) {
        return new TurtlePrefixedNameImpl(node);
      }
      else if (type == PREFIX_ID) {
        return new TurtlePrefixIDImpl(node);
      }
      else if (type == RDF_LITERAL) {
        return new TurtleRDFLiteralImpl(node);
      }
      else if (type == SPARQL_BASE) {
        return new TurtleSparqlBaseImpl(node);
      }
      else if (type == SPARQL_PREFIX) {
        return new TurtleSparqlPrefixImpl(node);
      }
      else if (type == STATEMENT) {
        return new TurtleStatementImpl(node);
      }
      else if (type == STRING) {
        return new TurtleStringImpl(node);
      }
      else if (type == SUBJECT) {
        return new TurtleSubjectImpl(node);
      }
      else if (type == TRIPLES) {
        return new TurtleTriplesImpl(node);
      }
      else if (type == VERB) {
        return new TurtleVerbImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
