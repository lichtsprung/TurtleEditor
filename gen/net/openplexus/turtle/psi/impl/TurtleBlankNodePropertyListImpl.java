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

public class TurtleBlankNodePropertyListImpl extends ASTWrapperPsiElement implements TurtleBlankNodePropertyList {

  public TurtleBlankNodePropertyListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public TurtlePredicateObjectList getPredicateObjectList() {
    return findNotNullChildByClass(TurtlePredicateObjectList.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitBlankNodePropertyList(this);
    else super.accept(visitor);
  }

}
