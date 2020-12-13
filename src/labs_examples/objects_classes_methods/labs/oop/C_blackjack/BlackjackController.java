package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Scanner;

public class BlackjackController {

    private boolean playAgain = false;

    public static void main(String[] args) throws InterruptedException {

        BlackjackController controller = new BlackjackController();


        // create user player
        Player myPlayer = createUserPlayer();

        // create computer player
        int computerPotValue = myPlayer.getPotValue();
        Player comPlayer = new Player("dealer", computerPotValue);

        controller.playBlackJack(myPlayer, comPlayer);
        while (controller.isPlayAgain()) {
            myPlayer.setHand(new Hand());
            comPlayer.setHand(new Hand());
            controller.playBlackJack(myPlayer, comPlayer);
        }
    }

    private static Player createUserPlayer() {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("What is your starting pot value?");
        Scanner scanner2 = new Scanner(System.in);
        int potValue = scanner2.nextInt();
        Player myPlayer = new Player(name, potValue);
        return  myPlayer;
    }

    public void playBlackJack(Player myPlayer, Player comPlayer) {

        printRound(myPlayer);
        // get betting
        int bet = placeBet(myPlayer, comPlayer);

        //start with a new deck
        Deck myDeck = new Deck();

        dealInitialCards(myPlayer, comPlayer, myDeck);

        printInitialGameStatus(myPlayer, comPlayer);

        dealAdditionalUserCards(myPlayer, myDeck);

        // end round if busted
        if (myPlayer.getHand().busted()) {
            roundOver(myPlayer, comPlayer, bet);
            return;
        }

        dealAdditionalDealerCards(comPlayer, myDeck);

        roundOver(myPlayer, comPlayer, bet);
    }

    /**
     * This method deals additional cards to the dealer until the dealer's hand is no longer less than 17.
     *
     * @param comPlayer - The Player object that represents the dealer
     * @param myDeck    - The current deck in use
     */
    private void dealAdditionalDealerCards(Player comPlayer, Deck myDeck) {
        // Dealer's turn
        comPlayer.getHand().cards.get(0).printCard();
        comPlayer.getHand().cards.get(1).printCard();
        System.out.print("   ---- hand value: " + comPlayer.getHand().returnScore() + "\n");
        while ((comPlayer.computerAI()) && (!comPlayer.getHand().busted())) {

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

    private int placeBet(Player myPlayer, Player comPlayer){
        int bet;
        do {
            System.out.println("Dealer's pot: £" + comPlayer.getPotValue());
            System.out.println("You have £" + myPlayer.getPotValue() + ".");
            System.out.println("Please place your bet: ");
            Scanner scanner = new Scanner(System.in);
            bet = scanner.nextInt();
        }while((bet > myPlayer.getPotValue()) || (bet > comPlayer.getPotValue()));
        return bet;
    }



    private void dealAdditionalUserCards(Player myPlayer, Deck myDeck) {
        // Players hand
        boolean stand = false;
        while ((!stand) && (!myPlayer.getHand().busted())) {
            System.out.println();
            System.out.println("\nDo you want another card (y/n) ?");
            Scanner scan2 = new Scanner(System.in);
            String giveMeCard = scan2.nextLine();
            if (giveMeCard.equals("n")) {
                stand = true;
                System.out.println("You stand. Your hand value is: " + myPlayer.getHand().returnScore());
                System.out.println("Dealer's turn:");
            } else if (giveMeCard.equals("y")) {
                myDeck.deal(myPlayer);
                System.out.println();
                for (int i = 0; i < myPlayer.getHand().cards.size(); i++) {
                    myPlayer.getHand().cards.get(i).printCard();
                }
                System.out.print("   ---- hand value: " + myPlayer.getHand().returnScore());
            } else {
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
    }

    private void printRound(Player myPlayer){
        myPlayer.setHandsPlayed(myPlayer.getHandsPlayed()+1);
        System.out.println("\n----------");
        System.out.println("Round " + myPlayer.getHandsPlayed());
        System.out.println("----------\n");
    }


    public void roundOver(Player myPlayer, Player comPlayer, int bet) {
        boolean win = true;

        if (myPlayer.getHand().busted()) {
            System.out.println("\n You went bust!");
            win = false;
        } else if (comPlayer.getHand().busted()) {
            System.out.println("\n The dealer went bust!");
        } else {
            System.out.println(myPlayer.getName() + "'s hand value : " + myPlayer.getHand().handValue);
            System.out.println("Dealer's hand value : " + comPlayer.getHand().handValue);
        }
        //pause for suspense
        pause(2);

        //check if dealer's cards are higher:
        if ((comPlayer.getHand().handValue >= myPlayer.getHand().handValue) &&
                (!comPlayer.getHand().busted())) {
            win = false;
        }

        // adjust pot values and print win/loss
        if (win) {
            myPlayer.setPotValue(myPlayer.getPotValue() + bet);
            comPlayer.setPotValue(comPlayer.getPotValue() - bet);
            printWin(myPlayer);
        } else {
            myPlayer.setPotValue(myPlayer.getPotValue() - bet);
            comPlayer.setPotValue(comPlayer.getPotValue() + bet);
            printLoss(myPlayer);
        }

        pause(2);

        if (myPlayer.getPotValue() == 0)
            printLostGame();
        else if (comPlayer.getPotValue() == 0)
            printWinGame();
        else
            askNewRound();

        if (!playAgain)
            printEnd();
    }

    private void askNewRound() {
        System.out.println("Press any key to continue or q to quit");
        Scanner scan3 = new Scanner(System.in);
        String playAgain = scan3.nextLine();
        setPlayAgain(!playAgain.equals("q"));
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
            Thread.sleep(secs*1);
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

    public void printWinGame(){
        System.out.print("                   __ooooooooo__\n" +
                "              oOOOOOOOOOOOOOOOOOOOOOo\n" +
                "          oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "       oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "     oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "   oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "  oOOOOOOOOOOO*  *OOOOOOOOOOOOOO*  *OOOOOOOOOOOOo\n" +
                " oOOOOOOOOOOO      OOOOOOOOOOOO      OOOOOOOOOOOOo\n" +
                " oOOOOOOOOOOOOo  oOOOOOOOOOOOOOOo  oOOOOOOOOOOOOOo\n" +
                "oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "oOOOO     OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO     OOOOo\n" +
                "oOOOOOO OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO OOOOOOo\n" +
                " *OOOOO  OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  OOOOO*\n" +
                " *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\n" +
                "  *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\n" +
                "   *OOOOOOo  *OOOOOOOOOOOOOOOOOOOOOOO*  oOOOOOO*\n" +
                "     *OOOOOOOo  *OOOOOOOOOOOOOOOOO*  oOOOOOOO*\n" +
                "       *OOOOOOOOo  *OOOOOOOOOOO*  oOOOOOOOO*      \n" +
                "          *OOOOOOOOo           oOOOOOOOO*      \n" +
                "              *OOOOOOOOOOOOOOOOOOOOO*          \n" +
                "                   \"\"ooooooooo\"\"");

    }

    public void printLostGame(){
        System.out.print("                          oooo$$$$$$$$$$$$oooo\n" +
                "                      oo$$$$$$$$$$$$$$$$$$$$$$$$o\n" +
                "                   oo$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o         o$   $$ o$\n" +
                "   o $ oo        o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$o       $$ $$ $$o$\n" +
                "oo $ $ \"$      o$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$o       $$$o$$o$\n" +
                "\"$$$$$$o$     o$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$o    $$$$$$$$\n" +
                "  $$$$$$$    $$$$$$$$$$$      $$$$$$$$$$$      $$$$$$$$$$$$$$$$$$$$$$$\n" +
                "  $$$$$$$$$$$$$$$$$$$$$$$    $$$$$$$$$$$$$    $$$$$$$$$$$$$$  \"\"\"$$$\n" +
                "   \"$$$\"\"\"\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$\n" +
                "    $$$   o$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     \"$$$o\n" +
                "   o$$\"   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$       $$$o\n" +
                "   $$$    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\" \"$$$$$$ooooo$$$$o\n" +
                "  o$$$oooo$$$$$  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   o$$$$$$$$$$$$$$$$$\n" +
                "  $$$$$$$$\"$$$$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$     $$$$\"\"\"\"\"\"\"\"\n" +
                " \"\"\"\"       $$$$    \"$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"      o$$$\n" +
                "            \"$$$o     \"\"\"$$$$$$$$$$$$$$$$$$\"$$\"         $$$\n" +
                "              $$$o          \"$$\"\"$$$$$$\"\"\"\"           o$$$\n" +
                "               $$$$o                 oo             o$$$\"\n" +
                "                \"$$$$o      o$$$$$$o\"$$$$o        o$$$$\n" +
                "                  \"$$$$$oo     \"\"$$$$o$$$$$o   o$$$$\"\"  \n" +
                "                     \"\"$$$$$oooo  \"$$$o$$$$$$$$$\"\"\"\n" +
                "                        \"\"$$$$$$$oo $$$$$$$$$$       \n" +
                "                                \"\"\"\"$$$$$$$$$$$        \n" +
                "                                    $$$$$$$$$$$$       \n" +
                "                                     $$$$$$$$$$\"      \n" +
                "                                      \"$$$\"\"\"\"\n");
        System.out.println("You've lost but don't worry");
    }

}
