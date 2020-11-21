package labs_examples.conditions_loops.examples;

import java.util.Scanner;

// Demonstrate the do-while loop.
class DWDemo {
    public static void main(String args[])
            throws java.io.IOException {

        String ch;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Press a key following by ENTER: ");
            ch = scanner.next(); // get a char
        } while(!ch.equals("q"));
    }
}