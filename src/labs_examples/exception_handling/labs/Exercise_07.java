package labs_examples.exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {
    public static void main(String[] args) {

        int age = 0;
        System.out.println("This is an adults only program.");

        try {
            // Ask user input and repeat until a positive number is received
            boolean pass = false;
            while (!pass) {
                System.out.println("What is your age? ");
                Scanner scanner = new Scanner(System.in);
                try {
                    age = scanner.nextInt();
                    pass = true;
                } catch (InputMismatchException e) {
                    System.out.println("You need to type a number.");
                }
            }
            checkAdulthood(age);
            System.out.println("Access granted");
        }
        catch (customException exc) {
            System.out.println(exc.toString());
        }
    }

    public static void checkAdulthood(double age) throws customException {
        if(age < 18)
            throw new customException();
    }
}

class customException extends Exception{
        String message;

        @Override
        public String toString(){
            return "Sorry, access denied. Come back in a few years.";
        }
}
