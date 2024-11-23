import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.util.Objects;

public class MatchingGameController {
    //define needed variables here:
    //  create deck, card, player objects, and set face up counts and total click count to 0
    //  shuffle the deck, set all cards face down
    private int currentFaceUp = 0;
    private int totalFaceUp = 0;
    private int totalClicks = 0;
    private Cards currCard1;
    private Cards currCard2;
    private Button currButton1;
    private Button currButton2;
    private Cards dragonCard = new Cards("Dragon");
    private Cards snakeCard = new Cards("Snake");
    private Cards swanCard = new Cards("Swan");
    private Cards tigerCard = new Cards("Tiger");
    private Cards rabbitCard = new Cards("Rabbit");
    private Cards foxCard = new Cards("Fox");

    private  Cards[] testCards = {dragonCard, snakeCard, swanCard, tigerCard, rabbitCard, foxCard};
    private  Deck testDeck = new Deck(testCards);
    private  Cards[] shuffledCards = testDeck.shuffle();

    //declare FXML Buttons, ButtonN MUST match fx:id in GUI
    @FXML
    private Button Button1;
    @FXML
    private Button Button10;
    @FXML
    private Button Button11;
    @FXML
    private Button Button12;
    @FXML
    private Button Button2;
    @FXML
    private Button Button3;
    @FXML
    private Button Button4;
    @FXML
    private Button Button5;
    @FXML
    private Button Button6;
    @FXML
    private Button Button7;
    @FXML
    private Button Button8;
    @FXML
    private Button Button9;
    @FXML
    private Pane root;

    @FXML
    void button10Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[9];
            currButton1 = Button10;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[9];
            currButton2 = Button10;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button11Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[10];
            currButton1 = Button11;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[10];
            currButton2 = Button11;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button12Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[11];
            currButton1 = Button12;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[11];
            currButton2 = Button12;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button1Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[0];
            currButton1 = Button1;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[0];
            currButton2 = Button1;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button2Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[1];
            currButton1 = Button2;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[1];
            currButton2 = Button2;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button3Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[2];
            currButton1 = Button3;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[2];
            currButton2 = Button3;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button4Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[3];
            currButton1 = Button4;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[3];
            currButton2 = Button4;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button5Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[4];
            currButton1 = Button5;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[4];
            currButton2 = Button5;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button6Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[5];
            currButton1 = Button6;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[5];
            currButton2 = Button6;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button7Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[6];
            currButton1 = Button7;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[6];
            currButton2 = Button7;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button8Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[7];
            currButton1 = Button8;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[7];
            currButton2 = Button8;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    @FXML
    void button9Pressed(ActionEvent event) {
        if(currentFaceUp == 0){
            currCard1 = shuffledCards[8];
            currButton1 = Button9;
            turnCard(currCard1, currButton1);
        } else if (currentFaceUp == 1) {
            currCard2 = shuffledCards[8];
            currButton2 = Button9;
            while(currButton1 == currButton2){
                System.out.println("You must choose 2 different cards!");
                System.exit(1);
            }
            turnCard(currCard2, currButton2);
            try {
                // to sleep 5 seconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            match(currCard1, currCard2, currButton1, currButton2);
        }
    }

    public void turnCard(Cards c, Button b){
        ++currentFaceUp;
        ++totalClicks;
        b.setText(c.getValue());
    }

    public void match(Cards c1, Cards c2, Button b1, Button b2){
        if(Objects.equals(c1.getValue(), c2.getValue())){
            totalFaceUp += 2;
            currentFaceUp = 0;
            if(totalFaceUp == 12){
                System.out.println("You win!");
                System.exit(0);
            }
        }
        else{
            currentFaceUp = 0;
            b1.setText("CARD");
            b2.setText("CARD");
        }
    }

}

//pseudocode button events
//when ButtonN is pressed:
//  check the totalFaceUp value: if = 12 game should exit
//  check the currentFaceUp value: if 0 ...
//      set currCard1 = shuffledCards[N-1] (ie, Button2 pressed & CFU = 0 : currCard1 = shuffledCards[1])
//      set currButton1 = ButtonN
//      call method1(currCard1)
//  check the currentFaceUp value: else if 1 ...
//      set currCard2 = shuffledCards[N-1] (ie, Button4 pressed & CFU = 1 : currCard2 = shuffledCards[3])
//      while currCard1 == currCard2:
//          display error, prompt user to click elsewhere
//      set currButton2 = ButtonN
//      call method1(currCard2)
//      call method2(currCard1, currCard2, currButton1, currButton2)


//method 1: param: Cards currCard
//  increment currentFaceUp, totalClickCount
//  turn card face up: set the ButtonN's text to currCard.getValue

//method 2: param: Cards c1, c2, cb1, cb2
//  if c1.getValue == c2.getValue:
//      totalFaceUp value += 2
//      currentFaceUp value = 0
//      if totalFaceUp value = 12:
//          exit game
//  else
//      currentFaceUp value = 0
//      turn cards face down:
//          set cb1/2's text to "CARD"

