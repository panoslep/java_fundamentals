package labs_examples.lambdas.labs;

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
        BiFunction<String, String, String> connect = Exercise_03 :: connectWords;
        String myString = connect.apply("the", "end");
        System.out.println(myString);

        //call an instance of a method
        Exercise_03 ex3 = new Exercise_03();
        Consumer<String> c = ex3 :: printSomething;
        c.accept("biceps");
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