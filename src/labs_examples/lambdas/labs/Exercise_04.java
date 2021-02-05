package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demontsrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */


public class Exercise_04 {
    public static void main(String[] args) {

        /*
         *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
         */

        //***********************************
        // How do we add space between numbers


        IntStream
                .rangeClosed(1, 15)

                .forEach(System.out::print);

        System.out.println();

        // Would this work somehow? -->
//        IntStream myIntStream = new IntStream.range(1, 16);
//        myIntStream.forEach(System.out::print);


        //2) Demonstrate the use of the sum function to determine the range of a set of numbers.
        int sum = IntStream.range(1, 16).sum();
        System.out.println(sum);

        //3) Demonstrate the use of the map() function to alter each int in a List of Integers,
        // then use the sum function to get the sum of the modified list
        Arrays.stream(new int[] {2, 4, 6, 8, 10})  //Create a Stream from an int array

                .map(x -> x / 2);  //Use a Lambda to half each int in the array

                System.out.println(IntStream.sum());



    }
}
