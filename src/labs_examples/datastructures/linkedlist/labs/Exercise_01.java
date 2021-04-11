package labs_examples.datastructures.linkedlist.labs;

import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Exercise_01 {

    public static void main(String[] args) {
        // create LinkedList
        LinkedList<String> myList = new LinkedList<String>();

        // add element
        myList.add("first element");
        myList.add("second element");
        myList.add("third element");
        myList.add("fourth element");

        //create a second list
        LinkedList<String> myList2 = new LinkedList<String>();

        // add element to myList2
        myList2.add("first element of list2");
        myList2.add("second element of list2");
        myList2.add("third element of list2");

        //add All method
        myList.addAll(myList2);

        

    }
}