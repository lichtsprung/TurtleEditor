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

public class TurtlePredicateObjectListImpl extends ASTWrapperPsiElement implements TurtlePredicateObjectList {

  public TurtlePredicateObjectListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<TurtleObjectList> getObjectListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TurtleObjectList.class);
  }

  @Override
  @NotNull
  public List<TurtleVerb> getVerbList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TurtleVerb.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitPredicateObjectList(this);
    else super.accept(visitor);
  }

}
