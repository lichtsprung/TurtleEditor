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

public class TurtleLiteralImpl extends ASTWrapperPsiElement implements TurtleLiteral {

  public TurtleLiteralImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public TurtleBooleanLiteral getBooleanLiteral() {
    return findChildByClass(TurtleBooleanLiteral.class);
  }

  @Override
  @Nullable
  public TurtleNumericLiteral getNumericLiteral() {
    return findChildByClass(TurtleNumericLiteral.class);
  }

  @Override
  @Nullable
  public TurtleRDFLiteral getRDFLiteral() {
    return findChildByClass(TurtleRDFLiteral.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitLiteral(this);
    else super.accept(visitor);
  }

}
