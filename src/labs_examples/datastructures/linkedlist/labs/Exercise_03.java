package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_03
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {

    public static void main(String[] args) {
        doublyLinkedList<Integer> myDoublyLinkedList = new doublyLinkedList<>();

        // add a few nodes
        myDoublyLinkedList.addEnd(5);
        myDoublyLinkedList.addEnd(56);
        myDoublyLinkedList.addEnd(67);
        myDoublyLinkedList.addEnd(78);

        myDoublyLinkedList.printMyList();
    }
}

