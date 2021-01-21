package labs_examples.input_output.labs;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

//create a method for each of them.

      //  str = br.readLine();
        import java.io.*;

public class Exercise_03 {
    public static void main(String args[]) throws IOException {

        //Input Stream Reader
        String c;
        String filePath = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs" +
                "\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex2_original";

        BufferedReader br = new
                BufferedReader(new FileReader(filePath));

        // read characters
        do  {
            c = br.readLine();
            System.out.print(c);
        } while (c != null);

    }
}
