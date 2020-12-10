package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Random;

public class BlackjackController {
    public static void main(String[] args) {

        Player myPlayer = new Player();
        Deck myDeck = new Deck();

    }

    public void deal(Player myPlayer, Deck myDeck) {

        int int_random;
        boolean chosen = false;

        do {

            //generate a random number between 0-51
            Random rand = new Random();
            int_random = rand.nextInt(52);

            // check if the card has not been used
            if (!myDeck.usedCards.contains(int_random)){
                chosen = true;
                //add card to used cards
                myDeck.usedCards.add(int_random);
                //add card to hand
                myPlayer.hand.cards.add(myDeck.cards[int_random]);
            }
        } while (!chosen);

    }
}
