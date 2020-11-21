package labs_examples.conditions_loops.labs;

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
        Boolean foundVowel = false;

        //System.out.println(word.indexOf("a"));
        int i = 0;
        while (i < word.length()) {

            char letter = word.charAt(i);
            int ind = vowels.indexOf(letter);
            if (ind >= 0){
                System.out.println("The first vowel is " + letter);
                return;
            }
            i++;
        }
        System.out.println("There are no vowels in: " + word);
    }
}




