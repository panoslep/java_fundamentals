package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args){

        int[] array = new int[11];

        //populate array
        for (int i = 0; i < array.length; i++) {
            array[i] = i*2;
        }

        //print reverse order every other element
        for (int j = array.length-1; j >= 0; j -=2 ) {
            System.out.print(array[j] + "\t");
        }
    }
}
