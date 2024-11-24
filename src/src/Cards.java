/**
 * Cards contains private fields value and isFaceUp
 * value contains the String describing the design of the card
 * isFaceUp is a boolean value (default=false) which is flipped when a card is face-up
 */
package com.example.tryagain;
public class Cards {
    private final String value;
    private boolean isFaceUp;

    //Constructor
    public Cards(String value) {
        this.value = value;
        this.isFaceUp = false;
    }

    //Accessors
    public String getValue() {
        return value;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    //Mutator
    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
