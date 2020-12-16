 package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;
    //private int handValue;
    private int acesInHand;

    public Hand(){
        cards = new ArrayList<Card>();
        acesInHand = 0;
    }

    public int returnScore()
    {
        int score = 0;
        setAcesInHand(0);
        for (int i = 0; i < cards.size(); i++) {
            Card tempCard = cards.get(i);
            score += tempCard.getCardValue();
            if (tempCard.getCardValue() == 1)
                setAcesInHand(getAcesInHand()+1); //no of aces at hand
        }

        //Soft hand game
        switch (getAcesInHand()){
            case 1:
                if ((score + 10) < 22) score += 10;
                break;
            case 2:
            case 3:
                score += 10;
                break;
            case 4:
                score += 20;
                break;
            default:
                break;
        }

        return score;
    }

    public boolean busted(){
        return returnScore() > 21;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getAcesInHand() {
        return acesInHand;
    }

    public void setAcesInHand(int acesInHand) {
        this.acesInHand = acesInHand;
    }
}
