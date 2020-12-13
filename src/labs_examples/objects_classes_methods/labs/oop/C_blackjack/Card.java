package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private char[] suit = new char[]{'a', 'b', 'c', 'd' };//'♠', '♦', '♥', '♣'
    private char[] rank = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' }; // 0 represents 10
    private String symbol;
    private int cardValue;

    public Card(int rank, int suit) {
        //symbol is a String made of the rank and the suit
        symbol = Character.toString(this.rank[rank - 1]) + Character.toString(this.suit[suit - 1]);
        if (rank == 10) {
            symbol = "10" + Character.toString(this.suit[suit - 1]);
        }

        if (rank < 10) {
            setCardValue(rank);
        } else {
            setCardValue(10);
        }
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public char[] getRank() {
        return rank;
    }

    public void setRank(char[] rank) {
        this.rank = rank;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String getSymbol() {
        return symbol;
    }

    public void printCard(){
            System.out.print("|"+ getSymbol() + "|");

    }

}
