package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {


        String filePath = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex1_byte_data";
        String filePathDestination = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\ex1_byte_data_dest";

        try( BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePathDestination))
        ) {


            // this will hold the collection of bytes that we read at once
            byte[] buffer = new byte[64];
            int bytesRead = 0;

            // this while loop will read the file 8 bytes at a time
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                // print out bytes read to console
                bufferedOutputStream.write(buffer);
                System.out.println(bytesRead);
                //System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}


