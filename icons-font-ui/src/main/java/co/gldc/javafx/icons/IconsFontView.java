package co.gldc.javafx.icons;

import co.gldc.javafx.icons.ikonli.IconsFontIkonli;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import org.kordamp.ikonli.javafx.FontIcon;

public class IconsFontView extends BorderPane {

    public IconsFontView() {
        Label close = new Label();
        close.setGraphic(FontIcon.of(IconsFontIkonli.CLOSE));
        close.setOnMouseClicked(evt -> System.exit(0));
        close.getStyleClass().add("close");

        HBox buttons = new HBox();

        Label back = new Label("Back");
        back.setAlignment(Pos.CENTER);
        back.getStyleClass().add("back");
        back.setOnMouseClicked(evt -> {
            setCenter(buttons);
            back.setVisible(false);
        });
        back.setMaxHeight(Double.MAX_VALUE);
        back.setVisible(false);

        Button buttonIkonli = new Button();
        buttonIkonli.setText("Show Ikonli icons");
        buttonIkonli.setOnAction(evt -> {
            setCenter(new IconsFontIkonliView());
            back.setVisible(true);
        });

        Button buttonFontAwesome = new Button();
        buttonFontAwesome.setText("Show Awesome Icons");
        buttonFontAwesome.setOnAction(evt -> {
            setCenter(new IconsFontFontAwesomeView());
            back.setVisible(true);
        });

        buttons.setSpacing(10);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().add(buttonIkonli);
        buttons.getChildren().add(buttonFontAwesome);

        HBox navigation = new HBox();
        navigation.setAlignment(Pos.TOP_RIGHT);
        navigation.getChildren().add(back);
        navigation.getChildren().add(close);
        navigation.setFillHeight(false);
        navigation.setSpacing(10);

        setCenter(buttons);
        setTop(navigation);
    }

}
