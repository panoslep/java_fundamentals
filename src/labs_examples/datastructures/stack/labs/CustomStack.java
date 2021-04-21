package labs_examples.datastructures.stack.labs;

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
    private int size = 0;
    private T[] myArray = (T[]) new Object[10];


    // insert item into front of list
    public void push(T item) {
        try {
            myArray[size] = item;
            size++;
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        resize();
    }

    public void resize(){
        //2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
        //3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
        if (size > (capacity*3/4)) {
            capacity *= 2;
            //change myArray to new capacity
            myArray = java.util.Arrays.copyOf(myArray, capacity);
        }
        if (size < (capacity/4) && myArray.length > 10) {
            capacity /= 2;
            //change myArray to new capacity
            myArray = java.util.Arrays.copyOf(myArray, capacity);
        }


    }


    public Object peekFirst() throws EmptyArrayException {
        if (empty())
            throw new EmptyArrayException("Your stack is empty");
        return myArray[0];
    }

    public Object peekLast() throws EmptyArrayException {
        if (empty())
            throw new EmptyArrayException("Your stack is empty");
        int index = size-1; //last element on stack
        return myArray[index];
    }



    public Object pop() throws EmptyArrayException {
        if (empty())
            throw new EmptyArrayException("Your stack is empty");
        Object element2pop = myArray[size-1];
        myArray[size-1] = null;
        size--;
        return element2pop;
    }


    public int search(T item) {
        return 0;
    }

    public boolean empty() {
        if (size > 0)
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
class EmptyArrayException extends Exception
{
    public EmptyArrayException(String message)
    {
        super(message);
    }
}
