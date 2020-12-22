package labs_examples.exception_handling.labs;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        System.out.println("Type a positive number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();

            try{
                double log = Math.log(number);
                checkValue(log);
                System.out.println("log(" + number + ") = " + Math.log(number));
                System.out.println(number + "/(log(" + number + ") = " + number / Math.abs(Math.log(number)));
            }
            catch (ArithmeticException e){
                System.out.println("Your number must be positive");
            }

        }
        catch (InputMismatchException e){
            System.out.println("You need to type a number.");
        }

    }

    public static void checkValue(double log) throws ArithmeticException {
        if (Double.isInfinite(log) || Double.isNaN(log))
            throw new ArithmeticException();
    }
}