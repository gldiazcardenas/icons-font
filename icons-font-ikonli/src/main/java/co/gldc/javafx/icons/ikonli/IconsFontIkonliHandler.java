package co.gldc.javafx.icons.ikonli;

import org.kordamp.ikonli.AbstractIkonHandler;
import org.kordamp.ikonli.Ikon;

public class IconsFontIkonliHandler extends AbstractIkonHandler {

    @Override
    public boolean supports(String description) {
        return description != null && description.startsWith("gldc-");
    }

    @Override
    public Ikon resolve(String description) {
        return IconsFontIkonli.findByDescription(description);
    }

    @Override
    public String getFontResourcePath() {
        return "co/gldc/javafx/icons/ikonli/gabriel.ttf";
    }

    @Override
    public String getFontFamily() {
        return "gabriel";
    }

}
