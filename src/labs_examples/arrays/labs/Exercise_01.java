package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] nums = new int[10];


        // Get 10 nums from the user:
        System.out.println("Please give 10 numbers:");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            nums[i] = scanner.nextInt();
            //scanner.close();

        }

        // calculate sum and mean
        int sum = 0;
        int mean = 0;
        for (int x : nums) {
            sum += nums[x];
            mean += nums[x] / nums.length;
        }

        System.out.println("your numbers are: ");
        for(int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The mean is: " + mean);
    }

    }

