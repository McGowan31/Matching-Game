/**
 *
 */
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
        //to test assignments work
        //        for(int y =0; y<this.deck.length; y++){
        //            System.out.println(this.deck[y].getDesign());
        //        }
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

        return deck;
    }
}
