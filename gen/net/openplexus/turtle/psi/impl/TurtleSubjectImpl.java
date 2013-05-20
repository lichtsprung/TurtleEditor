// This is a generated file. Not intended for manual editing.
package net.openplexus.turtle.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.openplexus.turtle.psi.TurtleElementType.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.openplexus.turtle.psi.*;

public class TurtleSubjectImpl extends ASTWrapperPsiElement implements TurtleSubject {

  public TurtleSubjectImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public TurtleBlankNode getBlankNode() {
    return findChildByClass(TurtleBlankNode.class);
  }

  @Override
  @Nullable
  public TurtleCollection getCollection() {
    return findChildByClass(TurtleCollection.class);
  }

  @Override
  @Nullable
  public TurtleIri getIri() {
    return findChildByClass(TurtleIri.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitSubject(this);
    else super.accept(visitor);
  }

}
