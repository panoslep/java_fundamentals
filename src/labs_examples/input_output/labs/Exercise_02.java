package labs_examples.input_output.labs;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class EncryptionExample {
    public static void main(String[] argv) throws Exception {

        String filePathIn = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex2_original";
        String filePathOut = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex2_encrypted";

        BufferedReader br = new BufferedReader(new FileReader(filePathIn));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePathOut));
        int i;
        do {
            i = br.read();
            if (i != -1) {
                char j 
                if (Character.isLowerCase((char) i))
                    bw.write(((char) i));
                else if (Character.isUpperCase((char) i))
                    bw.write(((char) i));
                else
                    bw.write((char) i);
            }
        } while (i != -1);
        br.close();
        bw.close();
    }
}