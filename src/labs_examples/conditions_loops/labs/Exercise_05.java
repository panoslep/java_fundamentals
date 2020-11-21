package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args)
    {
        System.out.println("Please give your 2 numbers");
        Scanner scanner= new Scanner(System.in);
        int lowBound = scanner.nextInt();
        int upBound = scanner.nextInt();

//        int sum = Math.abs(upBound*(upBound-1)/2 - lowBound*(lowBound-1)/2+lowBound);

        int sum = 0;
        int k = 0;
        for (int i = lowBound; i <= upBound; i++){
            sum+=i;
            k++;
        }

        double average = (double)(sum)/k; //(upBound-lowBound+1);
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
    }
}
