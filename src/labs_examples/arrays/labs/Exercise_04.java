package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args)
    {
        int[][] irregular = {{1 2 3},{1, 2,3, 4, 5}};

        for (int x:irregular)
        {
            for (int y:irregular[x])
            {
                System.out.print(irregular[x][y]);
            }
            System.out.println();
        }

    }

}
