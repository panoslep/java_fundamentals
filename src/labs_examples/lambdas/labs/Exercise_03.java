package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

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

        
    }

    public static String connectWords(String s1, String s2) {
        s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String string = s1 + " " + s2 + ".";
        return string;
    }
}