//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    //notes to self
   //record high score by lowest number of clicks first.
   // handle high score by method of txt file.
   // first check if txt file exists.
   // if yes, compare user end result score to txt file top 10.
   // compare user score with txt file high scores. for loop I think?
   // if user score higher than top 10, add user high score to top 10 high scores
   // in reality, user score list will be top 11, and 11 will be cleared frequently
   // only top 10 will be displayed as is the norm


public class Player {
    private String name;
    private int score;
    private int matchesfound;

    //consructor
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

    // carc clicked scenario + reset
    public void cardClicked() {
        score++; // Increment score for each card clicked
    }
    

    public void reset() {
        score = 0;
    }
}
