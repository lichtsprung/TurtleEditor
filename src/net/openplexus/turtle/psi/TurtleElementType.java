package net.openplexus.turtle.psi;

import com.intellij.psi.tree.IElementType;
import net.openplexus.turtle.TurtleLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Turtle Element Type.
 */
public class TurtleElementType extends IElementType {

    public TurtleElementType(@NotNull @NonNls String debugName) {
        super(debugName, TurtleLanguage.INSTANCE);
    }
}
