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

public class TurtleDirectiveImpl extends ASTWrapperPsiElement implements TurtleDirective {

  public TurtleDirectiveImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public TurtleBase getBase() {
    return findChildByClass(TurtleBase.class);
  }

  @Override
  @Nullable
  public TurtlePrefixID getPrefixID() {
    return findChildByClass(TurtlePrefixID.class);
  }

  @Override
  @Nullable
  public TurtleSparqlBase getSparqlBase() {
    return findChildByClass(TurtleSparqlBase.class);
  }

  @Override
  @Nullable
  public TurtleSparqlPrefix getSparqlPrefix() {
    return findChildByClass(TurtleSparqlPrefix.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TurtleVisitor) ((TurtleVisitor)visitor).visitDirective(this);
    else super.accept(visitor);
  }

}
