package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */


public class Exercise_02 {

    /* generic method printArray - it is designed to take in any type of array "[]" */
    public static < E extends Number> void findSum( E[] inputArray ) {

        double sum = 0;
        for(E element : inputArray) {
            sum += element.doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        /* Create arrays of Integer, Double and Float */
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Float[] floatArray = { 1.1f, 2.2f, 3.3f };

        System.out.println("\nThe sum of Array intArray is:");
        findSum(intArray);   /* pass an Integer array */

        System.out.println("\nThe sum of Array doubleArray is:");
        findSum(doubleArray);   /* pass a Double array */

        System.out.println("\nThe sum of Array floatArray is:");
        findSum(floatArray);   /* pass a Character array */
    }
}
