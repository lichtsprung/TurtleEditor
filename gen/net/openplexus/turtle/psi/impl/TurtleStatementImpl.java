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

public class TurtleStatementImpl extends ASTWrapperPsiElement implements TurtleStatement {

  public TurtleStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public TurtleDirective getDirective() {
    return findChildByClass(TurtleDirective.class);
  }

  @Override
  @Nullable
  public TurtleTriples getTriples() {
    return findChildByClass(TurtleTriples.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

}
