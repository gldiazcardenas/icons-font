package co.gldc.javafx.icons;

import co.gldc.javafx.icons.fontawesome.IconsFontFontAwesome;
import co.gldc.javafx.icons.fontawesome.IconsFontFontAwesomeIcons;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class IconsFontFontAwesomeView extends HBox {

    public IconsFontFontAwesomeView() {
        setSpacing(10);
        setAlignment(Pos.CENTER);

        for (IconsFontFontAwesomeIcons icon : IconsFontFontAwesomeIcons.values()) {
            IconsFontFontAwesome fontIcon = new IconsFontFontAwesome();
            fontIcon.setIcon(icon);
            fontIcon.setSize("32px");
            fontIcon.setOnMouseEntered(e  -> fontIcon.setGlyphStyle("-fx-fill: red;"));
            fontIcon.setOnMouseExited(e -> fontIcon.setGlyphStyle("-fx-fill: black;"));
            getChildren().add(fontIcon);
        }
    }
}
