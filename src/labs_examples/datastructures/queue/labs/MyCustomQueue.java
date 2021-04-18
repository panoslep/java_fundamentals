package labs_examples.datastructures.queue.labs;

public class MyCustomQueue<T> {

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
            //2) resize the Stack (the underlying array) to be twice the size when the Queue is more than 3/4 full
            //3) resize the Stack (the underlying array) to be half the size when the Queue is more than 1/4 empty
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


        public Object peekFirst() throws EmptyArrayException2 {
            if (empty())
                throw new EmptyArrayException2("Your queue is empty");
            return myArray[0];
        }

        public Object peekLast() throws EmptyArrayException2 {
            if (empty())
                throw new EmptyArrayException2("Your queue is empty");
            int index = firstEmptyValue()-1; //last element on stack
            return myArray[index];
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

// why cannot use Emptyarrayexception ?
class EmptyArrayException2 extends Exception
{
    public EmptyArrayException2(String message)
    {
        super(message);
    }
}