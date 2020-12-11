package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Random;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();
    }

    public static void playBlackJack(){
        //start with a new deck
        Deck myDeck = new Deck();

        // create computer player
        int computerPotValue = 100;
        Player comPlayer = new Player("dealer", computerPotValue);

        // create user player
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name +"!");
        Player myPlayer = new Player(name, 100);


        //Deal the first pair of cards
        deal(myPlayer, myDeck);
        deal(myPlayer, myDeck);
        deal(comPlayer, myDeck);
        deal(comPlayer, myDeck);

        System.out.println("\n----------");
        System.out.println("New Game");
        System.out.println("----------");
        System.out.println("Dealer:");
        comPlayer.getHand().cards.get(0).printCard();
        comPlayer.getHand().cards.get(1).printCard();
        System.out.print("   ---- hand value: " + comPlayer.getHand().returnScore());
        System.out.println();
        System.out.println(myPlayer.getName() + ":");
        myPlayer.getHand().cards.get(0).printCard();
        myPlayer.getHand().cards.get(1).printCard();
        System.out.print("   ---- hand value: " + myPlayer.getHand().returnScore());

        boolean stop = false;
        while (!stop){
            System.out.println();
            System.out.println("\nDo you want another card (y/n) ?");
            Scanner scan2 = new Scanner(System.in);
            String giveMeCard = scan2.nextLine();
            if (giveMeCard.equals("n")){
                stop = true;
            }
            else if (giveMeCard.equals("y")) {
                deal(myPlayer, myDeck);
                System.out.println();
                for (int i = 0; i < myPlayer.getHand().cards.size(); i++){
                    myPlayer.getHand().cards.get(i).printCard();
                    System.out.print("   ---- hand value: " + myPlayer.getHand().returnScore());
                }
            }
            else{
                System.out.println("Please type \"y\" or \"n\".");
            }
        }
    }

    public static void deal(Player myPlayer, Deck myDeck) {

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
                myPlayer.getHand().cards.add(myDeck.cards[int_random]);
            }
        } while (!chosen);

    }
}
