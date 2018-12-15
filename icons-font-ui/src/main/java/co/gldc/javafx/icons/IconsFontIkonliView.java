package co.gldc.javafx.icons;

import co.gldc.javafx.icons.ikonli.IconsFontIkonli;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import org.kordamp.ikonli.javafx.FontIcon;

public class IconsFontIkonliView extends HBox {

    public IconsFontIkonliView() {
        setSpacing(10);
        setAlignment(Pos.CENTER);

        for (IconsFontIkonli icon : IconsFontIkonli.values()) {
            FontIcon fontIcon = FontIcon.of(icon, 32);
            fontIcon.setOnMouseEntered(e -> fontIcon.setIconColor(Color.BLUE));
            fontIcon.setOnMouseExited(e -> fontIcon.setIconColor(Color.BLACK));
            getChildren().add(fontIcon);
        }
    }

}
