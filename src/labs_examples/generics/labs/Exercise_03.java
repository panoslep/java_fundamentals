package labs_examples.generics.labs;

import javafx.scene.chart.ScatterChart;

import java.util.*;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 {


    public static < T, V extends Number> double doubleSum( T arg1, V arg2 ) {

        double sum = (double) arg2.doubleValue() + (double) arg2.doubleValue();
        return sum;
    }


    public static <E> int palindromes(List<E> collection){
        int palElements = 0;
        try {
            for (E x : collection) {
                String str = x.toString().toLowerCase();
                boolean isPalindrome = true;

                for (int i = 0; i < str.length()/2-1; i++){
                    if (!((str.charAt(i)) == (str.charAt(str.length()-1-i)))){
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println("\"" + x + "\" is a palindrome.");
                    palElements++;
                }
            }
        }catch(Exception exp){
            System.out.println("Something went wrong.");
        }
        return palElements;
    }



    public static void main(String args[]) {

        Integer arg1 = 5;
        Float arg2 = 5.5f;
        List<String> listString = Arrays.asList("kayak", "panos", "ryan", "AManAPLanACanalPanama");

        System.out.println("\n" + arg1 + " + " + arg2 + " = " + doubleSum(arg1, arg2));
        System.out.println();
        int elements = palindromes(listString);
        System.out.println(elements + " elements in the list are palindromes");
    }
}