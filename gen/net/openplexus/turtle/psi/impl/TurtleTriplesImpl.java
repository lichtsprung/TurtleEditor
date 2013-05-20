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

public class TurtleTriplesImpl extends ASTWrapperPsiElement implements TurtleTriples {

  public TurtleTriplesImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public TurtleBlankNodePropertyList getBlankNodePropertyList() {
    return findChildByClass(TurtleBlankNodePropertyList.class);
  }

  @Override
  @Nullable
  public TurtlePredicateObjectList getPredicateObjectList() {
    return findChildByClass(TurtlePredicateObjectList.class);
  }

  @Override
  @Nullable
  public TurtleSubject getSubject() {
    return findChildByClass(TurtleSubject.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitTriples(this);
    else super.accept(visitor);
  }

}
