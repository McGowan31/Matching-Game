package com.example.cardmatchinggame;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Objects;

public class MatchingGameController {
    private int currentFaceUp = 0;
    private int totalFaceUp = 0;
    private Cards currCard1;
    private Cards currCard2;
    private Button currButton1;
    private Button currButton2;

    private final Cards dragonCard = new Cards("Dragon");
    private final Cards snakeCard = new Cards("Snake");
    private final Cards swanCard = new Cards("Swan");
    private final Cards tigerCard = new Cards("Tiger");
    private final Cards rabbitCard = new Cards("Rabbit");
    private final Cards foxCard = new Cards("Fox");

    private final Cards[] testCards = {dragonCard, snakeCard, swanCard, tigerCard, rabbitCard, foxCard};
    private final Deck testDeck = new Deck(testCards);
    private final Cards[] shuffledCards = testDeck.shuffle();

    @FXML
    private ArrayList<Button> buttons = new ArrayList<>();

    private Player player;

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;

    @FXML
    public void initialize() {

        player = new Player("Player 1");

        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(button10);
        buttons.add(button11);
        buttons.add(button12);

        for (int i = 0; i < buttons.size(); i++) {
            final int index = i;
            buttons.get(i).setOnAction(event -> handleButtonClick(event, index));
        }
    }

    private void handleButtonClick(ActionEvent event, int index) {
        Button clickedButton = (Button) event.getSource();

        if (currentFaceUp == 0) {
            currCard1 = shuffledCards[index];
            currButton1 = clickedButton;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            if (clickedButton == currButton1) {
                System.out.println("You must choose a different card!");
                return;
            }
            currCard2 = shuffledCards[index];
            currButton2 = clickedButton;
            turnCard(currCard2, currButton2);

            PauseTransition pause = new PauseTransition(Duration.seconds(1));
            pause.setOnFinished(e -> match(currCard1, currCard2, currButton1, currButton2));
            pause.play();
        }
    }

    private void turnCard(Cards c, Button b) {
        ++currentFaceUp;
        player.cardClicked();
        b.setText(c.getValue());
    }

    private void match(Cards c1, Cards c2, Button b1, Button b2) {
        if (Objects.equals(c1.getValue(), c2.getValue())) {
            totalFaceUp += 2;
            currentFaceUp = 0;
            b1.setDisable(true);
            b2.setDisable(true);

            if (totalFaceUp == 12) {
                System.out.println("You win!");
                System.out.printf("You found all matches in %d clicks.%n", player.getScore());
                System.exit(0);
            }
        } else {
            currentFaceUp = 0;
            b1.setText("CARD");
            b2.setText("CARD");
        }
    }
}
