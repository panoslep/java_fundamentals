package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_03
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> myDoublyLinkedList = new DoublyLinkedList<>();

        // add a few nodes
        myDoublyLinkedList.addEnd(5);
        myDoublyLinkedList.addEnd(56);
        myDoublyLinkedList.addEnd(67);
        myDoublyLinkedList.addEnd(78);
        myDoublyLinkedList.print();

        System.out.println("--------------------");
        myDoublyLinkedList.addFront(1);
        myDoublyLinkedList.addFront(2);
        myDoublyLinkedList.addFront(3);

        myDoublyLinkedList.print();

        myDoublyLinkedList.remove(3);
        myDoublyLinkedList.remove(5);
        myDoublyLinkedList.remove(78);
        System.out.println("----------------");
        myDoublyLinkedList.print();
    }
}

