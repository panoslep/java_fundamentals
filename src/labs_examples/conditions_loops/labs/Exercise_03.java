package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String arkg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the number of the month");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("This month is January");
                break;
            case 2:
                System.out.println("This month is February");
                break;
            case 3:
                System.out.println("This month is March");
                break;
            case 4:
                System.out.println("This month is April");
                break;
            case 5:
                System.out.println("This month is May");
                break;
            case 6:
                System.out.println("This month is June");
                break;
            case 7:
                System.out.println("This month is July");
                break;
            case 8:
                System.out.println("This month is August");
                break;
            case 9:
                System.out.println("This month is September");
                break;
            case 10:
                System.out.println("This month is October");
                break;
            case 11:
                System.out.println("This month is November");
                break;
            case 12:
                System.out.println("This month is December");
                break;
            default:
                System.out.println("Looking forward for your Other month");
        }
    }
}
