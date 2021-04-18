package labs_examples.datastructures.queue.labs;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("this is");
        q.add("my first ever");
        q.add("java queue");
        System.out.print(q);
        System.out.println();

        System.out.println(q.remove());
        System.out.print(q);
        System.out.println();

        System.out.println(q.peek());
        System.out.print(q);
        System.out.println();

        System.out.println("the size is: " + q.size());


        // boolean offer(E e);

        // E poll();

        // E element();


    }
}