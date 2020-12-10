 package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;
    int handValue;

    public Hand(){
        cards = new ArrayList<Card>();
        handValue = 0;
    }

    public int returnScore()
    {
        int tempSum = 0;
        for (int i = 0; i < cards.size(); i++) {
            Card tempCard = cards.get(i);
            tempSum += tempCard.getCardValue();
        }

        return handValue = tempSum;
    }

    public boolean busted(){
        if (returnScore() > 21)
            return true;
        else
            return false;
    }
}
