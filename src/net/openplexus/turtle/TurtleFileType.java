package net.openplexus.turtle;

import com.intellij.openapi.fileTypes.LanguageFileType;
import net.openplexus.turtle.icons.TurtleIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Turtle File Type.
 */
public class TurtleFileType extends LanguageFileType {
    public static final TurtleFileType INSTANCE = new TurtleFileType();

    public TurtleFileType() {
        super(TurtleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Turtle";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Turtle Ontology File Type.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ttl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TurtleIcons.TURTLE_ICON;
    }
}
