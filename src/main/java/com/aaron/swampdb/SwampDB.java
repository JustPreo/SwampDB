
package com.aaron.swampdb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwampDB extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("Welcome to SwampDB");

        Label description = new Label(
            "Your databases. Your rules. Your swamp."
        );

        Button connectButton = new Button("Connect");

        connectButton.setOnAction(event -> {
            description.setText("JavaFX is working!");
        });

        VBox root = new VBox(15);
        root.getChildren().addAll(
            title,
            description,
            connectButton
        );

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("SwampDB");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
