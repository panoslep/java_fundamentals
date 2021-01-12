package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        int[] vector = {1 , 2 , 3 };
        for (int i = 0; i < vector.length; i++){
            for (int j = 0; j < vector.length; j++)
            try{
                System.out.println(vector[i+1]/j);
            }
            catch (ArithmeticException exception1){
                System.out.println("Division by 0 is not allowed.");
            }
            catch (IndexOutOfBoundsException exception2){
                System.out.println("index: " + i + " is out of bounds");
            }

        }
    }
}
