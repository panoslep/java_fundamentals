package labs_examples.datastructures.stack.labs;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

import java.util.Stack;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize an new array of a Generic type you can use this:
 *           Object[] data = (T[]) new Object[10];
 */

public class Exercise_02 {

    public static void main(String[] args) {

        CustomStack<String> myStack = new CustomStack<String>();



        // check if the Stack is empty
//        if (myStack.empty()){
//            System.out.println("the stack is empty");
//        }

        // push several elements onto the Stack
        System.out.println(myStack.getCapacity());
        System.out.println(myStack.firstEmptyValue());
        myStack.push("Hello");
        System.out.println(myStack.getCapacity());
        System.out.println(myStack.firstEmptyValue());

        myStack.push("World");
        System.out.println(myStack.getCapacity());
        System.out.println(myStack.firstEmptyValue());

        myStack.push("Panos");
        System.out.println(myStack.getCapacity());
        myStack.push("is learning some Java");
        System.out.println(myStack.getCapacity());
        myStack.push("over here");
        System.out.println(myStack.getCapacity());

        myStack.printList();
    }
}

