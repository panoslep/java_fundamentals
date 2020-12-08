package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {

    Card[] cards;
    ArrayList<Card> usedCards = new ArrayList<Card>();

    public Deck(){

        int k = 0;
        for (int i = 1; i <= 13; i++){
            for (int j = 1; j <= 4; j++){
                cards[k] = new Card(i,j);
                k++;
            }
        }
    }
}
