package net.openplexus.turtle.psi;

import com.intellij.psi.tree.IElementType;
import net.openplexus.turtle.TurtleLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Turtle Tokens.
 */
public class TurtleTokenType extends IElementType {

    public TurtleTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TurtleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TurtleTokenType." + super.toString();
    }
}
