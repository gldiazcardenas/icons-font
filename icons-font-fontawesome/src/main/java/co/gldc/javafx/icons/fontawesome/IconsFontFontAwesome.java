package co.gldc.javafx.icons.fontawesome;

import de.jensd.fx.glyphs.GlyphIcon;
import javafx.scene.text.Font;

public class IconsFontFontAwesome extends GlyphIcon<IconsFontFontAwesomeIcons> {

    public static final String TTF_PATH = "/co/gldc/javafx/icons/fontawesome/gabriel.ttf";

    @Override
    public IconsFontFontAwesomeIcons getDefaultGlyph() {
        return IconsFontFontAwesomeIcons.CLOSE;
    }

    static {
        Font.loadFont(IconsFontFontAwesome.class.getResource(TTF_PATH).toExternalForm(), 10.0D);
    }

}
