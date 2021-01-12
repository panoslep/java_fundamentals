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
        catch (CustomException exc) {
            //System.out.println(exc.toString());
            exc.printStackTrace();
        }
        System.out.println("here");
    }

    public static double divide(double a, double b) throws ArithmeticException{
        return a/b;
    }

    public static void checkAdulthood(int age) throws CustomException{
        if(age < 18)
            throw new CustomException(age);
    }
}

class CustomException extends Exception{

    private int age;

    public CustomException(int age){
        this.age = age;
    }

    public CustomException(String message){
        super(message);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        if (age > 0){
            return age + " is too young. Access denied";
        }

        return "Sorry, access denied. " + getMessage()+ " is too young.";
    }
}
