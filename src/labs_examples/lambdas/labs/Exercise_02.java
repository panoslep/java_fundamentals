package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {

        //Predicate
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

        //Binary Operator
        double radius = 5;
        double height = 10;
        BinaryOperator<Double> cylinderVolume = (v1, v2) -> 3.14158 * v1 * v2 * v2;
        System.out.println();
        System.out.println("Cylinder volume:");
        System.out.println(cylinderVolume.apply(radius, height));

        //Function
        int distance = 10;
        Function<Integer, Double> inverseSquare = a -> (1.0 / (a * a));


        // apply the function to get the result
        System.out.println("The inverse square of " + distance + " is: ");
        System.out.println(inverseSquare.apply(distance));


        
    }
}