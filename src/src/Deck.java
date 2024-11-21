/**
 *
 */
import java.security.SecureRandom;
import java.util.ArrayList;

public class Deck {
    private Cards[] deck = new Cards[12];

    //constructor
    public Deck(Cards[] deck){
        int c = 0;
        for(int i =0; i< deck.length; i++){
            this.deck[i+c] = deck[i];
            this.deck[i+c+1] = deck[i];
            c++;
        }
    }

    //Mutator
    public void setDeck(Cards[] deck) {
        this.deck = deck;
    }

    //Accessor
    public Cards[] getDeck() {
        return deck;
    }

    public Cards[] shuffle(){
        //generate a randint in [0,13)
        // if the destination is unassigned and the index is not in the previously picked indices,
        // assign data in rand idx to location in current idx

        ArrayList<Integer> previously_used = new ArrayList<Integer>();
        boolean present = false;
        SecureRandom randInt = new SecureRandom();
        Cards[] shuffledCards = new Cards[12];
        int randidx ;

        for(int i = 0; i <deck.length; i++) {
            //generate a randidx that has not been previously used
            do {
                //System.out.println("\npreviously used: " + previously_used);
                randidx = randInt.nextInt(12); // generate random index value
                //System.out.printf("%s%d%n", "random generated: ", randidx);
                for (int n : previously_used) {                //check every previously used idx
                    if (n == randidx) {
                        present = true;        //if the idx occurs, we must generate a new random idx
                        break;
                    }
                    else {
                        present = false;
                    }
                }
            } while (present);

            //System.out.printf("%s%d%s%d%n", "Index i: ", i, " new index: ", randidx);
            previously_used.add(randidx);
            shuffledCards[i] = deck[randidx];
        }

        return shuffledCards;
    }
}
