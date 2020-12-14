 package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;
    private int handValue;

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
        setHandValue(tempSum);

        return tempSum;
    }

    public boolean busted(){
        if (returnScore() > 21)
            return true;
        else
            return false;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
}
