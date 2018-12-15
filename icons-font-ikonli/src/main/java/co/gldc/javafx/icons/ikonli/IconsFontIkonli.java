package co.gldc.javafx.icons.ikonli;

import org.kordamp.ikonli.Ikon;

public enum IconsFontIkonli implements Ikon {

    TWITTER("gldc-twitter", '\ue005'),

    LINKEDIN("gldc-linkedin", '\ue006'),

    INSTAGRAM("gldc-instagram", '\ue007'),

    FACEBOOK("gldc-facebook", '\ue008'),

    CLOSE("gldc-close", '\ue009')

    ;

    private String description;
    private char code;

    IconsFontIkonli(String description, char code) {
        this.description = description;
        this.code = code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public char getCode() {
        return code;
    }

    public static IconsFontIkonli findByDescription(String description) {
        for (IconsFontIkonli icon : values()) {
            if (icon.getDescription().equals(description)) {
                return icon;
            }
        }
        throw new IllegalArgumentException("Icon not supported: " + description);
    }

}
