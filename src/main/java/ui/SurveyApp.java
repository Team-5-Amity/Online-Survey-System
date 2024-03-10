// SurveyApp.java
package main.java.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SurveyApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Online Survey System");

        Button createSurveyButton = new Button("Create Survey");
        createSurveyButton.setOnAction(e -> {

            System.out.println("Survey creation form ");
        });

        StackPane root = new StackPane();
        root.getChildren().add(createSurveyButton);

        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}
