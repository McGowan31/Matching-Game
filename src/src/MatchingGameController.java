/**
 * MatchingGameController is the controller class for the Matching Game fxml file
 * it creates instances of the Cards, Deck, and Player classes & uses methods initialize, handleButtonClick, turnCard,
 * and match to handle user interaction and check for matching card pairs.
 */
package com.example.cardmatchinggame;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Objects;

public class MatchingGameController {
    private int currentFaceUp = 0;          //the current guess's number of face-up cards
    private int totalFaceUp = 0;            //the total number of face up cards (that are matches)
    private Cards currCard1;                //currCard1/2 are the current guess's 1st/2nd card picked, respectively
    private Cards currCard2;
    private Button currButton1;             //currButton1/2 correspond to the current guess's cards
    private Button currButton2;

    private final Cards dragonCard = new Cards("Dragon");       //declare the Cards instances to be used
    private final Cards snakeCard = new Cards("Snake");
    private final Cards pigCard = new Cards("Pig");
    private final Cards tigerCard = new Cards("Tiger");
    private final Cards rabbitCard = new Cards("Rabbit");
    private final Cards oxCard = new Cards("Ox");

    private final Cards[] testCards = {dragonCard, snakeCard, pigCard, tigerCard, rabbitCard, oxCard};
    private final Deck testDeck = new Deck(testCards);          //create a deck with the selected Cards
    private final Cards[] shuffledCards = testDeck.shuffle();   //get the shuffledCards to be used

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

    /**
     * method initialize() creates a Player instance and populates ArrayList buttons with all fxml buttons (cards)
     */
    @FXML
    public void initialize() {
        player = new Player("Player 1");    //declare a Player instance for the current game; keeps track of the score

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

        //for each button, set method handleButtonClick to handle user interaction
        for (int i = 0; i < buttons.size(); i++) {
            final int index = i;
            buttons.get(i).setOnAction(event -> handleButtonClick(event, index));
        }
    }

    /**
     * method handleButtonClick determines the current state of the game and decides to either let the user pick another
     * card if they have only selected one, or call method match if 2 have been selected
     * @param event finds the button which the user interacted with
     * @param index the index of the selected card in shuffledCards
     */
    private void handleButtonClick(ActionEvent event, int index) {
        Button clickedButton = (Button) event.getSource();

        if (currentFaceUp == 0) {               //if this is the first card selected in a given guess:
            currCard1 = shuffledCards[index];   //set the first card and corresponding button, then turn it face-up
            currButton1 = clickedButton;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {        //if this is the second card selected in a given guess:
            if (clickedButton == currButton1) { //check that the user did not select the same card for both guesses
                System.out.println("You must choose a different card!");
                return;
            }
            currCard2 = shuffledCards[index];   //set the second card and corresponding button, then turn it face-up
            currButton2 = clickedButton;
            turnCard(currCard2, currButton2);

            //ensures the player sees both card values before calling match & either resetting or disabling them
            PauseTransition pause = new PauseTransition(Duration.seconds(1));
            pause.setOnFinished(e -> match(currCard1, currCard2, currButton1, currButton2));
            pause.play();
        }
    }

    /**
     * method turnCard increments the current face-up counter and total click count, then displays the value on the
     * back of the card (ie Dragon, Tiger, Swan, etc.)
     * @param c the current card being flipped
     * @param b the corresponding button for the current card
     */
    private void turnCard(Cards c, Button b) {
        ++currentFaceUp;
        player.cardClicked();
        b.setText(c.getValue());

        switch (c.getValue()){
            case "Dragon":
                ImageView dv = new ImageView(getClass().getResource("dragon.png").toExternalForm());
                dv.setFitHeight(200);
                dv.setFitWidth(144);
                b.setGraphic(dv);
                break;
            case "Snake":
                ImageView sv = new ImageView(getClass().getResource("snake.png").toExternalForm());
                sv.setFitHeight(200);
                sv.setFitWidth(144);
                b.setGraphic(sv);
                break;
            case "Pig":
                ImageView pv = new ImageView(getClass().getResource("pig.png").toExternalForm());
                pv.setFitHeight(200);
                pv.setFitWidth(144);
                b.setGraphic(pv);
                break;
            case "Tiger":
                ImageView tv = new ImageView(getClass().getResource("tiger.png").toExternalForm());
                tv.setFitHeight(200);
                tv.setFitWidth(144);
                b.setGraphic(tv);
                break;
            case "Rabbit":
                ImageView rv = new ImageView(getClass().getResource("rabbit.png").toExternalForm());
                rv.setFitHeight(200);
                rv.setFitWidth(144);
                b.setGraphic(rv);
                break;
            case "Ox":
                ImageView ov = new ImageView(getClass().getResource("ox.png").toExternalForm());
                ov.setFitHeight(200);
                ov.setFitWidth(144);
                b.setGraphic(ov);
                break;
        }
    }

    /**
     * method match checks if 2 cards are matching and either adds to the match score and greys out the matching pair,
     * or it resets the current face up counter and turns the cards to face down again
     * @param c1 the first card currently selected
     * @param c2 the second card currently selected
     * @param b1 the corresponding button for the first card
     * @param b2 the corresponding button for the second card
     */
    private void match(Cards c1, Cards c2, Button b1, Button b2) {
        if (Objects.equals(c1.getValue(), c2.getValue())) {    //if the values of the two cards are the same:
            totalFaceUp += 2;                                  //increment the total face up count (matching pair #)
            currentFaceUp = 0;                                 //reset the current guess count to 0
            b1.setDisable(true);                               //disable both cards from being selected again
            b2.setDisable(true);

            if (totalFaceUp == 12) {
                System.out.print("You have won in " + player.getScore()+ " clicks!"); //check to see if this was the last pair remaining
                System.exit(0);
            }
        } else {
            currentFaceUp = 0;  //if the cards do not match, reset the current guess count to 0 and flip them back over
            b1.setText("CARD");
            b2.setText("CARD");
            ImageView iv1 = new ImageView(getClass().getResource("CardBack.png").toExternalForm());
            iv1.setFitHeight(200);
            iv1.setFitWidth(144);
            ImageView iv2 = new ImageView(getClass().getResource("CardBack.png").toExternalForm());
            iv2.setFitHeight(200);
            iv2.setFitWidth(144);
            b1.setGraphic(iv1);
            b2.setGraphic(iv2);
        }
    }


}
