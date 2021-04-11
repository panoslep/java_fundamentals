package labs_examples.datastructures.linkedlist.labs;

import java.util.LinkedList;
import java.util.ListIterator;

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

        System.out.println(myList);

        //create a second list
        LinkedList<String> myList2 = new LinkedList<String>();

        // add element to myList2
        myList2.add("first element of list2");
        myList2.add("second element of list2");
        myList2.add("third element of list2");

        //add All method
        myList.addAll(myList2);
        System.out.println(myList);

        //add first and last
        myList.addFirst("new first element");
        myList.addLast("new last element");

        System.out.println(myList);
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());

        System.out.println(myList.get(5));
        myList.set(5, "new 6th element");
        System.out.println(myList.get(5));

        myList.push("newer first element");

        System.out.println(myList);
        System.out.println(myList.pop());
        System.out.println(myList);

        System.out.println(myList.remove(2));
        System.out.println(myList.contains("second element"));
        System.out.println(myList.contains("third element"));

        System.out.println(myList);
        System.out.println(myList.listIterator(5));


        //copied this over from google. not exactly sure what it does.
        // ListIterator
        ListIterator list_Iter = myList.listIterator(5);

        System.out.println(list_Iter);
        // Iterating through the created list from the position
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }

        // clear list2
        System.out.println(myList2);
        myList2.clear();
        System.out.println(myList2);


    }
}