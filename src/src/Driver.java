
public class Driver {
    public static void main(String[] args){

        //testing
        Cards dragonCard = new Cards("Dragon");
        Cards snakeCard = new Cards("Snake");
        Cards swanCard = new Cards("Swan");
        Cards tigerCard = new Cards("Tiger");
        Cards rabbitCard = new Cards("Rabbit");
        Cards foxCard = new Cards("Fox");

        Cards[] testCards = {dragonCard, snakeCard, swanCard, tigerCard, rabbitCard, foxCard};
        Deck testDeck = new Deck(testCards);
    }
}
