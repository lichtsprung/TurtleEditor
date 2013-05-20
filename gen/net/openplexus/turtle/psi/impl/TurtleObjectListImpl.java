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

public class TurtleObjectListImpl extends ASTWrapperPsiElement implements TurtleObjectList {

  public TurtleObjectListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<TurtleObject> getObjectList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TurtleObject.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitObjectList(this);
    else super.accept(visitor);
  }

}
