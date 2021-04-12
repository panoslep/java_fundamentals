package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

public class Exercise_02 {

    public static void main(String[] args) {
        PL_LinkedList<Integer> numLinkedList = new PL_LinkedList<>();

        numLinkedList.addEnd(5);
        numLinkedList.addEnd(15);
        numLinkedList.addEnd(20);
        numLinkedList.addEnd(7);

        numLinkedList.addFront(0);
        numLinkedList.addEnd(123);
        numLinkedList.addFront(1);

        numLinkedList.printMyList();
        System.out.println("-------------------------------");
        numLinkedList.remove(5);
        numLinkedList.printMyList();

        int index = numLinkedList.indexOf(15);
        System.out.println("index = " + index);

        System.out.println("The sum of the list is " + numLinkedList.sumOfList());

    }

}