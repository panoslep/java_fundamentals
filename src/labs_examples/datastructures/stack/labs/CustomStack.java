package labs_examples.datastructures.stack.labs;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

import java.util.ArrayList;

        /**    1) throw a custom exception when trying to pop an element from an empty Stack
        *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
        *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
        *      4) contain the methods peekFirst() and peekLast()
        *      5) contain a size() method
        *      6) contain a method to print out the data of all elements in the Stack
        *
        **/



public class CustomStack<T> {

    private ArrayList<T> list = new ArrayList<T>(10);

    public void push(T item) {
        // insert item into front of list
        list.add(item);
  //      if list.size() > 2/3*list.capac
    }

    public void resize(){
        // double initial capacity
        //list.size()
        ArrayList<T> temp_list = new ArrayList<T>();

    }
}



//    /**
//     * Removes an item from the stack
//     * @return the removed item
//     */
//    public V pop() {
//        try {
//            // get first item
//            V item = list.get(0);
//            // remove first item
//            list.remove(0);
//            // return first item
//            return item;
//        } catch (NullPointerException ex) {
//            System.out.println("Exception" + ex);
//            return null;
//        }
//    }
//
//    /**
//     * Determines if the stack is empty
//     * @return true if empty, false if not empty
//     */
//    public boolean empty() {
//        return list.isEmpty();
//    }