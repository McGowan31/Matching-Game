package com.example.tryagain;
public class Cards {
    private final String value;
    private boolean isFaceUp;

    public Cards(String value) {
        this.value = value;
        this.isFaceUp = false;
    }

    public String getValue() {
        return value;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
