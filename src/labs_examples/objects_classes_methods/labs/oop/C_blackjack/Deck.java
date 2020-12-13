package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<Integer>();

    public Deck(){

        int k = 0;
        for (int i = 1; i <= 13; i++){
            for (int j = 1; j <= 4; j++){
                cards[k] = new Card(i,j);
                k++;
            }
        }
    }

    public void deal(Player myPlayer) {

        int int_random;
        boolean chosen = false;

        do {

            //generate a random number between 0-51
            Random rand = new Random();
            int_random = rand.nextInt(52);

            // check if the card has not been used
            if (!usedCards.contains(int_random))
            {
                chosen = true;
                //add card to used cards
                usedCards.add(int_random);
                //add card to hand
                myPlayer.getHand().cards.add(cards[int_random]);
            }
        } while (!chosen);

    }
}
