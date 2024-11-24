/*/
Player is a very basic class designed to handle very basic things such as incrementing the click count 
when the player clicks a card in the form of a score. Player has features not fully implemented in the final product due
to time constraints.
 */

package com.example.cardmatchinggame;


public class Player {
    private String name; //player name
    private int score;  //player score
    private int matchesfound;  //player matches

    //constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    public int getMatchesFound(){
        return matchesfound;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public void setMatchesfound(int matchesfound){
        this.matchesfound=matchesfound;
    }

    // card clicked scenario + reset
    public void cardClicked() {
        score++; // Increment score for each card clicked
    }
    

    public void reset() { //place for resetting score for bug testing
        score = 0;
    }
}
