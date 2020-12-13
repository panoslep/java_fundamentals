package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Random;
import java.util.Scanner;

public class BlackjackController {

    private boolean playAgain = false;

    public static void main(String[] args) throws InterruptedException {

        BlackjackController controller = new BlackjackController();
        // create computer player
        int computerPotValue = 100;
        Player comPlayer = new Player("dealer", computerPotValue);

        // create user player
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name +"!");
        Player myPlayer = new Player(name, 100);

        controller.playBlackJack(myPlayer, comPlayer);
        while (controller.isPlayAgain()){
            myPlayer.setHand(new Hand());
            comPlayer.setHand(new Hand());
            controller.playBlackJack(myPlayer, comPlayer);
        }
    }

    public void playBlackJack(Player myPlayer, Player comPlayer) {

        // get betting
        System.out.println("\nPlease place your bet: ");
        Scanner scanner = new Scanner(System.in);
        int bet = scanner.nextInt();

        //start with a new deck
        Deck myDeck = new Deck();

        dealInitialCards(myPlayer, comPlayer, myDeck);

        printInitialGameStatus(myPlayer, comPlayer);

        dealAdditionalUserCards(myPlayer, myDeck);

        // end round if busted
        if (myPlayer.getHand().busted()){
            gameOver(myPlayer, comPlayer, bet);
            return;
        }

        dealAdditionalDealerCards(comPlayer, myDeck);

        gameOver(myPlayer, comPlayer, bet);
    }

    /**
     * This method deals additional cards to the dealer until the dealer's hand is no longer less than 17.
     *
     * @param comPlayer - The Player object that represents the dealer
     * @param myDeck - The current deck in use
     */
    private void dealAdditionalDealerCards(Player comPlayer, Deck myDeck) {
        // Dealer's turn
        comPlayer.getHand().cards.get(0).printCard();
        comPlayer.getHand().cards.get(1).printCard();
        System.out.print("   ---- hand value: " + comPlayer.getHand().returnScore() +"\n");
        while((comPlayer.computerAI())&&(!comPlayer.getHand().busted())){

            //pause for suspense
            pause(3);

            System.out.print("Dealer hits");
            myDeck.deal(comPlayer);
            System.out.println();
            for (int i = 0; i < comPlayer.getHand().cards.size(); i++) {
                comPlayer.getHand().cards.get(i).printCard();
            }
            System.out.print("   ---- hand value: " + comPlayer.getHand().returnScore());
        }
    }

    private void dealAdditionalUserCards(Player myPlayer, Deck myDeck) {
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
                myDeck.deal(myPlayer);
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
    }

    private void printInitialGameStatus(Player myPlayer, Player comPlayer) {
        // what the player can see
        System.out.println("Dealer:");
        int visScore = comPlayer.getHand().returnScore() - comPlayer.getHand().cards.get(1).getCardValue();
        comPlayer.getHand().cards.get(0).printCard();
        System.out.print("| ? |");
        System.out.print("   ---- hand value: " + visScore);
        System.out.println();
        System.out.println(myPlayer.getName() + ":");
        myPlayer.getHand().cards.get(0).printCard();
        myPlayer.getHand().cards.get(1).printCard();
        System.out.print("   ---- hand value: " + myPlayer.getHand().returnScore() + "\n");
    }

    private void dealInitialCards(Player myPlayer, Player comPlayer, Deck myDeck) {
        //Deal the first pair of cards
        myDeck.deal(myPlayer);
        myDeck.deal(myPlayer);
        myDeck.deal(comPlayer);
        myDeck.deal(comPlayer);

        System.out.println("\n----------");
        System.out.println("New Game");
        System.out.println("----------\n");
    }


    public void gameOver(Player myPlayer, Player comPlayer, int bet){
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
        pause(2);


        //check if dealer's cards are higher:
        if ((comPlayer.getHand().handValue >= myPlayer.getHand().handValue) &&
                (!comPlayer.getHand().busted())){
            win = false;
        }

        if (win)
        {
            myPlayer.setPotValue(myPlayer.getPotValue() + bet);
            comPlayer.setPotValue(comPlayer.getPotValue() - bet);
            printWin(myPlayer);
        }
        else
        {
            myPlayer.setPotValue(myPlayer.getPotValue() - bet);
            comPlayer.setPotValue(comPlayer.getPotValue() + bet);
            printLoss(myPlayer);
        }

        pause(2);
        setPlayAgain(askNewRound());
   }

    private boolean askNewRound(){
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

    public void printWin(Player myPlayer){
        System.out.println("\n-------------------" + myPlayer.nameSize());
        System.out.println("  Congratulations " + myPlayer.getName() + "  ");
        System.out.println("  You win!!");
        System.out.println("-------------------" + myPlayer.nameSize() +"\n");
    }

    public void printLoss(Player myPlayer){
        System.out.println("\n-------------------------" + myPlayer.nameSize());
        System.out.println("  Tough luck " + myPlayer.getName() + "  :(");
        System.out.println("  You lost this time around!!");
        System.out.println("-------------------------" + myPlayer.nameSize() + "\n");
    }

    public void printEnd(){
        pause(2);
        System.out.println("-------------------");
        System.out.println("|    Game Over     |");
        System.out.println("-------------------");
    }


    public void pause(int secs){
        //pause for suspense
        try
        {
            Thread.sleep(secs*1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public boolean isPlayAgain() {
        return playAgain;
    }

    public void setPlayAgain(boolean newGame) {
        playAgain = newGame;
    }



}
