package labs_examples.conditions_loops.labs;

import labs_examples.datastructures.linkedlist.examples.UsingLinkedList;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.println("What is the number day of the week? ");

        // 3) assign input to variable as int
        int number = scanner.nextInt();

        // 4) write completed code here
        if (number!=1){
            if (number!=2){
                if (number!=3){
                    if (number!=4){
                        if (number!=5) {
                            if (number!=6){
                                if (number!=7){
                                    System.out.println("It's something strange, I'll call it Other");
                                }else
                                    System.out.println("It's Sunday");
                            }else
                                System.out.println("It's Saturday");
                        }else
                            System.out.println("It's Friday");
                        }else
                        System.out.println("It's Thursday");
                }else
                    System.out.println("It's Wednesday");
            }else
                System.out.println("It's Tuesday");
        }else
            System.out.println("It's Monday");
    }
}
