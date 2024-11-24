/**
 * Deck is a class based on composition & contains private field deck, an array of Cards objects.
 * method shuffle() returns a randomly sorted Cards array
 */
import java.security.SecureRandom;
import java.util.ArrayList;

public class Deck {
    private Cards[] deck = new Cards[12];

    //Constructor
    public Deck(Cards[] deck){
        //param deck has 1 instance of each Cards object, duplicate each and assign to this.deck in sequential order
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

    /**
     * shuffle() returns a randomly sorted array of Cards objects
     * @return Cards[]
     */
    public Cards[] shuffle(){
        //generate a randint in [0,13)
        // if the destination is unassigned and the index is not in the previously picked indices,
        // assign data in rand idx to location in current idx

        ArrayList<Integer> previously_used = new ArrayList<Integer>();  //create an ArrayList of for previous random indexes
        boolean present = false;                                  //true if a given index is present in previously_used
        SecureRandom randInt = new SecureRandom();
        Cards[] shuffledCards = new Cards[12];
        int randidx ;

        for(int i = 0; i <deck.length; i++) {
            do {
                randidx = randInt.nextInt(12);  //generate random index value [0,12)
                for (int n : previously_used) {       //check if the index has already been used
                    if (n == randidx) {
                        present = true;               //if the index occurs, we must generate a new random index
                        break;
                    }
                    else {
                        present = false;
                    }
                }
            } while (present);

            previously_used.add(randidx);       //add the generated index to the previously_used list
            shuffledCards[i] = deck[randidx];   //assign the current card to the new location in shuffledCards
        }

        return shuffledCards;
    }
}
