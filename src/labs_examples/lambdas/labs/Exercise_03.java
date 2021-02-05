package labs_examples.lambdas.labs;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {

        // call a static method
        BiFunction<String, String, String> connect = Exercise_03::connectWords;
        String myString = connect.apply("the", "end");
        System.out.println(myString);

        //call an instance of a method
        Exercise_03 ex3 = new Exercise_03();
        Consumer<String> c = ex3::printSomething;
        c.accept("biceps");

        //reference to a constructor
        PlayerGenerator playerGenerator = FootballPlayer::new;
        FootballPlayer CR7 = playerGenerator.createPlayer("Christiano Ronaldo", 7);
        FootballPlayer Messi = playerGenerator.createPlayer("Lionel Messi", 10);
        System.out.println(CR7.toString());
        System.out.println(Messi.toString());

    }

    public static String connectWords(String s1, String s2) {
        s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String string = s1 + " " + s2 + ".";
        return string;
    }

    public void printSomething(String str) {
        String something = "Hey, this is a printout of your word: ";
        System.out.println(something + str);
    }
}

    class FootballPlayer {
        String playerName;
        int jerseyNumber;

        public FootballPlayer(String playerName, int jerseyNumber){
            this.playerName = playerName;
            this.jerseyNumber = jerseyNumber;
        }

        @Override
        public String toString() {
            return "FootballPlayer{" +
                    "playerName='" + playerName + '\'' +
                    ", jerseyNumber=" + jerseyNumber +
                    '}';
        }
    }

    @FunctionalInterface
    interface PlayerGenerator{
        FootballPlayer createPlayer(String playerName, int jerseyNumber);
    }

