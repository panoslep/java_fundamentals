package labs_examples.datastructures.queue.labs;

public class MyCustomQueue<T> {

        private int size = 0;
        private int oldestElement = 0;
        private int newestElement = 0;
        private int capacity = 10;
        // How that works?
        private T[] myArray = (T[]) new Object[10];
        private int shifts = 0;


        // insert item into front of list
        public void push(T item) {
            try {
                myArray[size] = item;
                newestElement++;
                size++;
            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
            resize();
        }

        public void resize() {
            //2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
            //3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
            if (size > (capacity * 3 / 4)) {
                capacity *= 2;
                //change myArray to new capacity
                myArray = java.util.Arrays.copyOf(myArray, capacity);
            }
            if (size < (capacity / 4) && myArray.length > 10) {
                capacity /= 2;
                //change myArray to new capacity
                myArray = java.util.Arrays.copyOf(myArray, capacity);
            }
        }

        public T peekOldest() throws EmptyQueueException {
            if (empty())
                throw new EmptyQueueException("Your queue is empty");
            return myArray[oldestElement];
        }

        public T peekNewest() throws EmptyQueueException {
            if (empty())
                throw new EmptyQueueException("Your queue is empty");
            return myArray[newestElement-1];
        }

        public T pop() throws EmptyQueueException {
            if (empty())
                throw new EmptyQueueException("Your queue is empty");

            // - - 7 - - -
            T temp = myArray[oldestElement];
            myArray[oldestElement] = null;
            oldestElement++;
            shifts++;
            if (shifts > myArray.length*0.3)
                shuffle();
            return temp;
        }

        public void shuffle(){
            int count = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] != null) {
                    myArray[count] = myArray[i];
                    myArray[i] = null;
                    count++;
                }
            }
            oldestElement = 0;
            newestElement = count-1;
            shifts = 0;
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

class EmptyQueueException extends Exception
{
    public EmptyQueueException(String message)
    {
        super(message);
    }
}
