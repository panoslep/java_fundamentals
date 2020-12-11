package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BlackjackController {

    private static boolean playAgain = false;

    public static void main(String[] args) throws InterruptedException {

        // create computer player
        int computerPotValue = 100;
        Player comPlayer = new Player("dealer", computerPotValue);

        // create user player
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name +"!");
        Player myPlayer = new Player(name, 100);

        playBlackJack(myPlayer, comPlayer);
        while (isPlayAgain()){
            myPlayer.setHand(new Hand());
            comPlayer.setHand(new Hand());
            playBlackJack(myPlayer, comPlayer);
        }
    }

    public static void playBlackJack(Player myPlayer, Player comPlayer) throws InterruptedException {
        //start with a new deck
        Deck myDeck = new Deck();

        //Deal the first pair of cards
        deal(myPlayer, myDeck);
        deal(myPlayer, myDeck);
        deal(comPlayer, myDeck);
        deal(comPlayer, myDeck);

        System.out.println("\n----------");
        System.out.println("New Game");
        System.out.println("----------\n");
        System.out.println("Dealer:");

        // what the player can see
        int visScore = comPlayer.getHand().returnScore() - comPlayer.getHand().cards.get(1).getCardValue();
        comPlayer.getHand().cards.get(0).printCard();
        System.out.print("| ? |");
        System.out.print("   ---- hand value: " + visScore);
        System.out.println();
        System.out.println(myPlayer.getName() + ":");
        myPlayer.getHand().cards.get(0).printCard();
        myPlayer.getHand().cards.get(1).printCard();
        System.out.print("   ---- hand value: " + myPlayer.getHand().returnScore() + "\n");



        // Players hand
        boolean stand = false;
        while ((!stand) && (!myPlayer.getHand().busted())){
            System.out.println();
            System.out.println("\nDo you want another card (y/n) ?");
            Scanner scan2 = new Scanner(System.in);
            String giveMeCard = scan2.nextLine();
            if (giveMeCard.equals("n")){
                stand = true;
                System.out.println("You stand. Your hand value is: " + myPlayer.getHand().returnScore());
                System.out.println("Dealer's turn:");
            }
            else if (giveMeCard.equals("y")) {
                deal(myPlayer, myDeck);
                System.out.println();
                for (int i = 0; i < myPlayer.getHand().cards.size(); i++) {
                    myPlayer.getHand().cards.get(i).printCard();
                }
                System.out.print("   ---- hand value: " + myPlayer.getHand().returnScore());
            }
            else{
                System.out.println("Please type \"y\" or \"n\".");
            }
        }
        // end round if busted
        if (myPlayer.getHand().busted())
        {
            gameOver(myPlayer, comPlayer);
            return;
        }


        // Dealer's turn
        comPlayer.getHand().cards.get(0).printCard();
        comPlayer.getHand().cards.get(1).printCard();
        System.out.print("   ---- hand value: " + comPlayer.getHand().returnScore() +"\n");
        while((comPlayer.computerAI())&&(!comPlayer.getHand().busted())){

            //pause for suspense
            pause(3);

            System.out.print("Dealer hits");
            deal(comPlayer, myDeck);
            System.out.println();
            for (int i = 0; i < comPlayer.getHand().cards.size(); i++) {
                comPlayer.getHand().cards.get(i).printCard();
            }
            System.out.print("   ---- hand value: " + comPlayer.getHand().returnScore());
        }

        gameOver(myPlayer, comPlayer);


    }

    public static void deal(Player myPlayer, Deck myDeck) {

        int int_random;
        boolean chosen = false;

        do {

            //generate a random number between 0-51
            Random rand = new Random();
            int_random = rand.nextInt(52);

            // check if the card has not been used
            if (!myDeck.usedCards.contains(int_random))
            {
                chosen = true;
                //add card to used cards
                myDeck.usedCards.add(int_random);
                //add card to hand
                myPlayer.getHand().cards.add(myDeck.cards[int_random]);
            }
        } while (!chosen);

    }

    public static void gameOver(Player myPlayer, Player comPlayer){
        boolean win = true;

        if (myPlayer.getHand().busted()) {
            System.out.println("\n You went bust!");
            win = false;
        }
        else if (comPlayer.getHand().busted()) {
            System.out.println("\n The dealer went bust!");
        }
        else {
            System.out.println(myPlayer.getName() + "'s hand value : " + myPlayer.getHand().handValue);
            System.out.println("Dealer's hand value : " + comPlayer.getHand().handValue);
        }
        //pause for suspense
        pause(5);


        //check if dealer's cards are higher:
        if ((comPlayer.getHand().handValue >= myPlayer.getHand().handValue) &&
                (!comPlayer.getHand().busted())){
            win = false;
        }

        if (win)
        {
            System.out.println("\n-------------------");
            System.out.println("|  Congratulations " + myPlayer.getName() + "  |");
            System.out.println("| You win!!");

        }
        else
        {
            System.out.println("\n--------------------------------");
            System.out.println("  Tough luck " + myPlayer.getName() + "  :(");
            System.out.println(" You lost this time around!!");
        }
        System.out.println("-------------------");
        System.out.println("|    Game Over     |");
        System.out.println("-------------------");

        pause(2);
        System.out.println("Do you want to play again? (y/n)");
        Scanner scan3 = new Scanner(System.in);
        String playAgain = scan3.nextLine();
        if (playAgain.equals("n")){
            setPlayAgain(false);
        }
        else if (playAgain.equals("y")) {
            setPlayAgain(true);
        }
        else {
            System.out.println("Please type y for yes or n for no");
            Scanner scan4 = new Scanner(System.in);
            String playAgain2 = scan4.nextLine();
            if (playAgain2.equals("n")) {
                setPlayAgain(false);
            } else if (playAgain2.equals("y")) {
                setPlayAgain(true);
            } else {
                System.out.println("It seems that you want to play with my nerves!");
                setPlayAgain(false);
            }
        }
   }



    public static void pause(int secs){
        //pause for suspense
        try
        {
            Thread.sleep(secs*10);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean isPlayAgain() {
        return playAgain;
    }

    public static void setPlayAgain(boolean newGame) {
        playAgain = newGame;
    }
}
