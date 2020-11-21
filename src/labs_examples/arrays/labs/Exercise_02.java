package labs_examples.arrays.labs;
import javax.script.ScriptContext;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        //get number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number from 1-10: ");
        int num = scanner.nextInt();

        // find index in array
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                int ind = i;
                System.out.println("the index of your element is: " + ind);
            }
        }
    }
}