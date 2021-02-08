package labs_examples.lambdas.labs;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.*;
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

    public static int square(int i){
        return i * i;
    }



    public static void main(String[] args) {

        /*
         *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
         */

        //***********************************
        // How do we add space between numbers

        Consumer<Integer> c = (s) -> {
            int sum = 0;
            sum += s * s;
            System.out.println(sum*sum);
        };

        IntFunction<Integer> c2 = (i) -> {
            return i * i;
        };

        Exercise_04 obj = new Exercise_04();
        int aSum = IntStream
                .rangeClosed(1, 15)
                .map(Exercise_04::square)
                .sum();
        System.out.println(aSum);

        System.out.println();

//        // Would this work somehow? -->
//        IntStream myIntStream = IntStream.range(1, 16);
//        myIntStream.forEach(System.out::print);


        //2) Demonstrate the use of the sum function to determine the range of a set of numbers.
        int sum = IntStream.range(1, 16).sum();
        System.out.println(sum * sum);

        //3) Demonstrate the use of the map() function to alter each int in a List of Integers,
        // then use the sum function to get the sum of the modified list
        int sumOfArray = Arrays.stream(new int[] {2, 4, 6, 8, 10})  //Create a Stream from an int array

                .map(x -> x / 2)  //Use a Lambda to half each int in the array
                .sum();
        System.out.println("Print the sum of int array:");
        System.out.println(sumOfArray);


        // 4) Demontrate the filter function by filtering out all Integers that are less than 10 -
        // then use the average function to average the remaining numbers, assign this result to an int variable.

        int[] numbers = new int[] {1, 5, 10, 15, 50, 75, 344, 4, 6, 80};

        // one way that this might work
        OptionalDouble mean = IntStream.range(1, 20).average();

        OptionalDouble anotherMean = Arrays.stream(numbers)
                .filter(x -> x < 10)
                .average();
        if (anotherMean.isPresent()) {
            System.out.println("The average of the array is :");
            System.out.println((int) anotherMean.getAsDouble());
        }

        //5) Demonstrate the reduce() function to determine the sum of a list of Integers
        int sumList = IntStream.of(1, 5, 10, 15, 50, 75, 344, 4, 6, 80)

                .reduce(0, (int a, int b) -> a + b);

        System.out.println("Sum of Integers = " + sumList);


        // 6) Demontsrate how to Stream a text file and print out each line
        String streamTextPath = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text";

        try {
            Stream<String> streamText = Files.lines(Paths.get(streamTextPath));

            streamText.forEach(System.out::println);  //print each remaining element
            streamText.close();  //close the connection to the file

        } catch (Exception exp) {
            System.out.println("Something's wrong with the file");
        }


        // 7) Demonstrate how to Stream the stream_text_lab.csv file in this package.
        // Split the lines into String arrays,
        // the print out the element at the 1 index for each array.
        String csv_path = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\lambdas\\labs\\stream_text_lab.csv";

        //just add a line
        System.out.println();

        try {
            Stream<String> lines = Files.lines(Paths.get(csv_path));
            lines
               .map(x -> x.split(","))  //call String.split() on comma - returns array of values
               .forEach(x -> System.out.println(x[1]));  //print first element
            lines.close();  //close file connection
        } catch (Exception exp2){
            System.out.println("Something's wrong with the csv file");
        }

        // 8) Demonstrate how to Stream the stream_text_lab.csv file in this package.
        // Split the lines into String arrays,
        // the print out the sum of all elements at index 2.

        System.out.println();
        try {
            Stream<String> lines = Files.lines(Paths.get(csv_path));
            double sumCol2 = lines
                .map(x -> x.split(","))
                .mapToDouble(x -> Double.parseDouble(x[2]))
                .sum();
            System.out.println(sumCol2);
            lines.close();  //close file connection

        } catch (Exception exp2){
            System.out.println("Something's wrong with the csv file");
        }



        // 9) Demonstrate the anyMatch() function
        System.out.print("Give me 2 numbers: ");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("Are there multiples of 33 between " + num1 + " and " + num2 + " ?");

        boolean m33 = IntStream
            .rangeClosed(num1, num2)
            .anyMatch(x -> (x % 33 == 0));
        if (m33) System.out.println(" --> Yes!");
        else System.out.println(" --> No");

//        //Fermat
//        System.out.print("Is Fermat right?");
//        boolean isFermatRight = true;
//        for (int a = 1; a <= 100; a++){
//            for (int b = 1; b <= 100; b++){
//                for (int cc = 1; cc <= 100; cc++) {
//                    int finalA = a;
//                    int finalB = b;
//                    int finalC = cc;
//                    boolean fermat = IntStream
//                            .range(3, 100)
//                            .anyMatch(x -> Math.pow(finalA, x) + Math.pow(finalB, x) == Math.pow(finalC, x));
//                    if (fermat) {
//                        isFermatRight = false;
//                        System.out.println(a + " " + b + " " + c );
//                        return;
//                    }
//                    if (!isFermatRight) break;
//                }
//                if (!isFermatRight) break;
//            }
//            if (!isFermatRight) break;
//        }
        //if (isFermatRight) System.out.println("      No!");
       //else System.out.println("        Yes! (up to 1000 at least)");


        // 10) Demonstrate the allMatch() function.
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        boolean answer = list.stream().allMatch(x -> x > 0);
        if (answer) {
            System.out.println("All numbers in the list are positive.");
        }
        else{
            System.out.println("At least 1 number in the list is not positive.");
        }


        // 11) Demonstrate the collect() terminal operation to store resulting values into a List
        List<String> listOfStrings = Arrays.asList("one", "two", "many", "a simple phrase", "what else?");
        List<String> shortList = listOfStrings
                .stream()
                .filter( s -> s.length() > 3)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println();
        System.out.println("The following strings have more than 3 characters:");
        for (String s : shortList) {
            System.out.println(s);
        }

    }
}
