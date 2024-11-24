/**
 * PURPOSE: A tile-based game where players flip over 2 face down cards in hopes of finding a pair.
 *          In the scenario that a pair is found, the respective pair stays face up and is unable to be re-selected.
 *          The ultimate goal of the game is to find all pairs in the shortest amount of guesses (clicks).
 * GROUP: group 9
 * NAMES: Connor Maxwell, Jack Mcgowan, Katelyn Touzeau, T Franks
 * DATE: 11/23/24
 */
package com.example.cardmatchinggame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Driver extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("MatchingGame.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 995, 742); // Adjusted size for the layout
        stage.setTitle("Card Matching Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


