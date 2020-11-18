package labs_examples.conditions_loops.labs;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        //get word input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your word?");
        String word = scanner.nextLine();
        String vowels = "aeiou";

        System.out.println(word.indexOf("a"));
        System.out.println(word.charAt(1));
        System.out.println();

        //     ;
        //       charAt()indexOf((word.charAt(3)))));
        //  int i = 0;
        //  while (i<word.length()){
        //CharSequence checkLetter = word.charAt(i);
        //if (vowels.contains(CharSequence(checkLetter)) {


        //    i++;



    }


    }




