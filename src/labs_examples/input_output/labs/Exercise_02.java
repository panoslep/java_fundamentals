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

import java.io.*;

class EncryptionExample {
    public static void main(String[] argv){

        String filePathIn = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex2_original";
        String filePathOut = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex2_encrypted";

        try (BufferedReader br = new BufferedReader(new FileReader(filePathIn));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filePathOut))){

            String line;


            while((line = br.readLine()) != null){
                line = line.replace('-' ,'%');
                line = line.replace('a', '-');
                line = line.replace('~' , '£');
                line = line.replace('e', '~');
                bw.write(line);
                bw.newLine();
            }

        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("file encrypted");
        System.out.println("decrypting file...");

        //to do: read in encrypted file , decrypt it, print the content to the console
        try (BufferedReader br2 = new BufferedReader(new FileReader(filePathOut))){
            String line2;

            while((line2 = br2.readLine()) != null){

                line2 = line2.replace('-', 'a');
                line2 = line2.replace('%' ,'-');
                line2 = line2.replace('~' , 'e');
                line2 = line2.replace('£', '~');
                System.out.println(line2);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}