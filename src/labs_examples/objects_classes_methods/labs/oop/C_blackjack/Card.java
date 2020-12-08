package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    char[] rank = new char[]{'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K' }; // 0 represents 10
    String symbol;
    int cardValue;

    public Card(int rank, int suit){
        //symbol is a String made of the rank and the suit
        symbol = Character.toString(this.rank[rank-1]) + Character.toString(this.suit[suit-1]);
        if (rank == 10){
            symbol = "10" + Character.toString(this.suit[suit-1]);
        }

        if (rank<10) {
            cardValue = rank;
        }
        else{
            cardValue = 10;
        }


    }

}
