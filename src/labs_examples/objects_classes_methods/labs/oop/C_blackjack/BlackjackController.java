package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Random;

public class BlackjackController {
    public static void main(String[] args) {

        Player myPlayer = new Player();

    }

    public void deal(Player myPlayer) {

        int int_random;
        boolean chosen = false;

        do {

            //generate a random number between 0-51
            Random rand = new Random();
            int_random = rand.nextInt(52);

            if !(myDeck.usedCards.contains(int_random)){
                chosen = true;
                myDeck.usedCards.add(int_random);
            }
        } while (!chosen);


    }
}
