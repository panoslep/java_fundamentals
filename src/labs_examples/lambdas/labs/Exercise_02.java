package labs_examples.lambdas.labs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {

        // 1. Predicate
        /* create a list of integer - Test for Even */
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);
        Predicate<Integer> p = (i)-> (i % 2 == 0);

        System.out.println(" Even numbers :");
        /* Iterate through the list */
        for (int in:nums) {
            /* call the test method */
            if (p.test(in)) {
                System.out.print(in + " ");
            }
        }

        // 2. Binary Operator
        double radius = 5;
        double height = 10;
        BinaryOperator<Double> cylinderVolume = (v1, v2) -> 3.14158 * v1 * v2 * v2;
        System.out.println();
        System.out.println("Cylinder volume:");
        System.out.println(cylinderVolume.apply(radius, height));

        // 3. Function
        int distance = 10;
        Function<Integer, Double> inverseSquare = a -> (1.0 / (a * a));

        System.out.println("The inverse square of " + distance + " is: ");
        System.out.println(inverseSquare.apply(distance));

        // 4. IntSupplier
        IntSupplier myIntSupplier = () -> (int) (Math.random() * 10);
        System.out.println(" A random int is : ");
        System.out.println(myIntSupplier.getAsInt());

        // 5. DoubleSupplier
        DoubleSupplier myDoubleSupplier = () -> Math.random();
        System.out.println(" A random double is : ");
        System.out.println(myDoubleSupplier.getAsDouble());


        // 6. intPredicate
        IntPredicate largerThan10 = (i) -> (i > 10);
        System.out.println("The following numbers are larger than 10 :");
        System.out.println();
        for (int ind = 0 ; ind <= 20; ind+=3) {
            if (largerThan10.test(ind))
                System.out.print(ind + " ");
        }
        System.out.println();

        // 7. ToIntBiFunction<T,U>
        String word1 = "nice";
        String word2 = "day";
        ToIntBiFunction<String, String> wordlength = (s1,s2) -> s1.length() + s2.length();
        System.out.println("I'll tell you 2 words: ");
        System.out.println(word1 + " " + word2);
        System.out.println("Combined they have " + wordlength.applyAsInt(word1, word2) + " letters");

        // 8. BooleanSupplier
        BooleanSupplier headsOrTails = () -> (Math.random() >= 0.5);
        System.out.println("Heads or Tails ? ");
        if (headsOrTails.getAsBoolean()) System.out.println("Heads");
        else System.out.println("Tails");

        // 9. UnaryOperator<T>
        double fahrenheit = 100;
        UnaryOperator<Double> fahrenheit2Celcius = (d) -> ((d - 32) / 1.8);
        double celsius = fahrenheit2Celcius.apply(fahrenheit);
        System.out.println(fahrenheit + " degrees Fahrenheit equals " + celsius + " degrees Celsius");

        // 10. Supplier<T>
        Supplier<LocalDateTime> timeNow = () -> LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        LocalDateTime time = timeNow.get();
        System.out.println("What's the time?");
        System.out.println("It's " + dtf.format(time));
    }
}