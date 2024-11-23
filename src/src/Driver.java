package com.example.cardmatchinggame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Driver extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("cardmatchinggamegui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 995, 742); // Adjusted size for the layout
        stage.setTitle("Card Matching Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
