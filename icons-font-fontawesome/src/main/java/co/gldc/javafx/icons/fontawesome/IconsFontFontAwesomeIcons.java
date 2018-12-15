package co.gldc.javafx.icons.fontawesome;

import de.jensd.fx.glyphs.GlyphIcons;

public enum IconsFontFontAwesomeIcons implements GlyphIcons {

    TWITTER('\ue005'),

    LINKEDIN('\ue006'),

    INSTAGRAM('\ue007'),

    FACEBOOK('\ue008'),

    CLOSE('\ue009')

    ;

    private char character;

    IconsFontFontAwesomeIcons(char character) {
        this.character = character;
    }

    @Override
    public String characterToString() {
        return Character.toString(this.character);
    }

    @Override
    public String unicodeToString() {
        return String.format("\\u%04x", (int) this.character);
    }

    @Override
    public char getChar() {
        return character;
    }

    @Override
    public String getFontFamily() {
        return "gabriel";
    }
}
