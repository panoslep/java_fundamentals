package labs_examples.datastructures.stack.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**    1) throw a custom exception when trying to pop an element from an empty Stack
        *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
        *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
        *      4) contain the methods peekFirst() and peekLast()
        *      5) contain a size() method
        *      6) contain a method to print out the data of all elements in the Stack
        *
        **/



public class CustomStack<T> {

    private int capacity = 10;
    // How that works?
    private Object[] myArray = (T[]) new Object[10];


    // insert item into front of list
    public void push(T item) {
        try {
            myArray[firstEmptyValue()] = item;
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        resize();
    }

    public void resize(){
        //2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
        //3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
        int currentSize = firstEmptyValue();
        if (currentSize > (capacity*3/4)) {
            capacity *= 2;
        }
        if (currentSize < (capacity/4)) {
            capacity /= 2;
        }

        //change myArray to new capacity
        myArray = java.util.Arrays.copyOf(myArray, capacity);
    }

    public int firstEmptyValue(){

        int count = 0;
        for(Object element : myArray) {
            if (element == null)
                return count;// return the index of the first element that is null
            count++;
        }

        // if we are here it means that we iterated over all elements
        // and didn't find null value so it is time to return array length
        return count;
    }


    public Object peekFirst() throws emptyArrayException{
        if (empty())
            throw new emptyArrayException("Your stack is empty");
        return myArray[0];
    }

    public Object peekLast() throws emptyArrayException{
        if (empty())
            throw new emptyArrayException("Your stack is empty");
        int index = firstEmptyValue()-1; //last element on stack
        return myArray[index];
    }



    public Object pop() throws emptyArrayException{
        if (empty())
            throw new emptyArrayException("Your stack is empty");
        int index = firstEmptyValue()-1; //last element on stack
        Object element2pop = myArray[index];
        myArray[index] = null;
        return element2pop;
    }


    public int search(T item) {
        return 0;
    }

    public boolean empty() {
        if (firstEmptyValue() > 0)
            return false;
        return true;
    }

    public void printList() {
        for (Object x : myArray) {
            if (x == null) return;
            System.out.println(x);
        }
    }

    public int size() {
        return capacity;
    }
}

/**
 * My custom exception class.
 */
class emptyArrayException extends Exception
{
    public emptyArrayException(String message)
    {
        super("Your stack is empty!");
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