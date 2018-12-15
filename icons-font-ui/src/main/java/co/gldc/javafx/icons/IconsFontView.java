package co.gldc.javafx.icons;

import co.gldc.javafx.icons.ikonli.IconsFontIkonli;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import org.kordamp.ikonli.javafx.FontIcon;

public class IconsFontView extends StackPane {

    public IconsFontView() {
        Label close = new Label();
        close.setGraphic(FontIcon.of(IconsFontIkonli.CLOSE));
        close.setOnMouseClicked(evt -> System.exit(0));
        close.getStyleClass().add("close");
        StackPane.setAlignment(close, Pos.TOP_RIGHT);

        Button button = new Button();
        button.setText("Login");
        button.setOnAction(evt -> {
            HBox box = new HBox();
            box.setSpacing(10);
            box.setAlignment(Pos.CENTER);

            for (IconsFontIkonli icon : IconsFontIkonli.values()) {
                FontIcon fontIcon = FontIcon.of(icon, 32);
                fontIcon.setOnMouseEntered(e -> fontIcon.setIconColor(Color.BLUE));
                fontIcon.setOnMouseExited(e -> fontIcon.setIconColor(Color.BLACK));
                box.getChildren().add(fontIcon);
            }

            StackPane.setAlignment(box, Pos.CENTER);
            getChildren().remove(button);
            getChildren().add(0, box);
        });

        getChildren().add(close);
        getChildren().add(button);
    }

}
