package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
public class Exercise_01 {
    public static void main(String[] args) {
        int[] vector = {1 , 2 , 3 };
        for (int i = 0; i < vector.length; i++){
            try{
                System.out.println(vector[i+1]);
            }
            catch (IndexOutOfBoundsException exception){
                System.out.println("index: " + i + " is out of bounds");
            }
        }
    }

}



