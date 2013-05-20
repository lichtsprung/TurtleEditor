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

public class TurtleRDFLiteralImpl extends ASTWrapperPsiElement implements TurtleRDFLiteral {

  public TurtleRDFLiteralImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public TurtleString getString() {
    return findNotNullChildByClass(TurtleString.class);
  }

  @Override
  @Nullable
  public TurtleIri getIri() {
    return findChildByClass(TurtleIri.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitRDFLiteral(this);
    else super.accept(visitor);
  }

}
