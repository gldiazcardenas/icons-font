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

        HBox buttons = new HBox();

        Button buttonIkonli = new Button();
        buttonIkonli.setText("Show Ikonli icons");
        buttonIkonli.setOnAction(evt -> {
            IconsFontIkonliView iconView = new IconsFontIkonliView();
            StackPane.setAlignment(iconView, Pos.CENTER);
            getChildren().remove(buttons);
            getChildren().add(0, iconView);
        });

        Button buttonFontAwesome = new Button();
        buttonFontAwesome.setText("Show Awesome Icons");
        buttonFontAwesome.setOnAction(evt -> {
            IconsFontFontAwesomeView iconView = new IconsFontFontAwesomeView();
            StackPane.setAlignment(iconView, Pos.CENTER);
            getChildren().remove(buttons);
            getChildren().add(0, iconView);
        });

        buttons.setSpacing(10);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().add(buttonIkonli);
        buttons.getChildren().add(buttonFontAwesome);

        getChildren().add(close);
        getChildren().add(buttons);
    }

}
