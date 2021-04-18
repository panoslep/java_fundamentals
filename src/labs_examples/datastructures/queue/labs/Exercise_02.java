package labs_examples.datastructures.queue.labs;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

public class Exercise_02 {

    public static void main(String[] args) throws EmptyArrayException2 {

        MyCustomQueue<String> queue = new MyCustomQueue<String>();


        // check if the Queue is empty
        if (queue.empty()) {
            System.out.println("the queue is empty");
        }


        // push several elements onto the Stack
        System.out.println(queue.size());
        queue.push("Hello");
        System.out.println(queue.size());

        queue.push("World");
        System.out.println(queue.size());

        queue.push("Panos");
        System.out.println(queue.size());
        queue.push("is learning some Java");
        System.out.println(queue.size());
        queue.push("over here");
        System.out.println(queue.size());

        queue.printList();
        System.out.println(queue.pop());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue.empty());
    }
}