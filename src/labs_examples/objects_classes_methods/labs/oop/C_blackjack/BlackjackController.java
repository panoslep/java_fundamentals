package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Random;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {

        //Player myPlayer = new Player();
        Deck myDeck = new Deck();

    }

    public void playBlackJack(){
        //start with a new deck
        Deck myDeck = new Deck();

        // create computer player
        int computerPotvalue = 100;
        Player comPlayer = new Player("dealer", 100);

        // create user player
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        Player myPlayer = new Player(name, 100);


        //Deal the first pair of cards
        deal(myPlayer, myDeck);
        deal(myPlayer, myDeck);
        deal(comPlayer, myDeck);
        deal(comPlayer, myDeck);

        System.out.println("New Game");
        System.out.println("----------");
        System.out.println("Dealer:");
        print(comPlayer.hand.cards[1])

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
