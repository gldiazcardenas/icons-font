package co.gldc.javafx.icons;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IconsFontApp extends Application {

    public void start(Stage primaryStage) {
        Scene scene = new Scene(new IconsFontView());
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.show();
    }

    public static void main(String[] arg) {
        launch(arg);
    }

}
