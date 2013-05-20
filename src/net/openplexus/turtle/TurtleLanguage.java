package net.openplexus.turtle;

import com.intellij.lang.Language;

/**
 * Turtle Language
 */
public class TurtleLanguage extends Language {
    public static final TurtleLanguage INSTANCE = new TurtleLanguage();

    public TurtleLanguage() {
        super("Turtle");
    }
}
