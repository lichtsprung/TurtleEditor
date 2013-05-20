// This is a generated file. Not intended for manual editing.
package net.openplexus.turtle.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TurtleObject extends PsiElement {

  @Nullable
  TurtleBlankNode getBlankNode();

  @Nullable
  TurtleBlankNodePropertyList getBlankNodePropertyList();

  @Nullable
  TurtleCollection getCollection();

  @Nullable
  TurtleIri getIri();

  @Nullable
  TurtleLiteral getLiteral();

}
