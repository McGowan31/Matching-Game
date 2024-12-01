package com.example.cardmatchinggame;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button rulesButton;

    @FXML
    private Button startButton;

    @FXML
    public void initialize() {
        rulesButton.setOnAction(event -> showRules());
        startButton.setOnAction(event -> startGame());
    }

    private void showRules() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("rules.fxml"));
            Scene scene = new Scene(loader.load(), 995, 742);
            Stage stage = (Stage) rulesButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startGame() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("cardmatchinggamegui.fxml"));
            Scene scene = new Scene(loader.load(), 995, 742);
            Stage stage = (Stage) startButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
