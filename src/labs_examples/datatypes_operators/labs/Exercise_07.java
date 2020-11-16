package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();
        if (days<1)
        {
            System.out.println("You are out of range. I give you 1 day");
            days =1;
        }
        if (days>1000000)
        {
            System.out.println("It can't take that long. I'll give it a million days");
            days = 1000000;
        }

        // write completed code here
        int seconds = (days*24*60*60);
        System.out.println(days+" days are "+seconds+" seconds");
    }
}