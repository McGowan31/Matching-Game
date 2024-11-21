package com.example.finalprojectjavafx;

public class Cards {
    private String value;
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
