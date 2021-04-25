package labs_examples.datastructures.hashmap.labs;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 *      HashMaps Exercise_03
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

public class Exercise_03 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        Stack<String> stack = new Stack<String>();
        PriorityQueue<String> queue = new PriorityQueue();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        long startTime;
        long endTime;

        // LinkedList
        // add 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            linkedList.addLast(str);
        }
        endTime = System.nanoTime();
        long diffTime1 = endTime - startTime;
        System.out.println("LinkedList");
        System.out.println("add 100 elements: " + diffTime1 + " ns");


        // update 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i+1000);
            linkedList.set( i, str);
        }
        endTime = System.nanoTime();
        long diffTime2 = endTime - startTime;
        System.out.println("update 100 elements: " + diffTime2 + " ns");

        //search for 100 elements
        startTime = System.nanoTime();
        boolean found;
        for (int i = 1000; i < 1100; i++) {
            found = linkedList.contains(String.valueOf(i));
            if (!found) {
                System.out.println("Something went wrong!");
            }
        }
        endTime = System.nanoTime();
        long diffTime3 = endTime - startTime;
        System.out.println("search for 100 elements: " + diffTime3 + " ns");

        //delete 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            linkedList.remove();
        }
        endTime = System.nanoTime();
        long diffTime4 = endTime - startTime;
        System.out.println("delete 100 elements: " + diffTime4 + "ns");

        long totalTime = diffTime1 + diffTime2 + diffTime3 + diffTime4;
        System.out.println("The total processing time was " + totalTime + " ns");


        // STACK
        System.out.println("-----------------------------");
        System.out.println("STACK");

        // add 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            stack.push(str);
        }
        endTime = System.nanoTime();
        diffTime1 = endTime - startTime;
        System.out.println("add 100 elements: " + diffTime1 + " ns");

        // update 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i+1000);
            stack.set(i, str);
        }
        endTime = System.nanoTime();
        diffTime2 = endTime - startTime;
        System.out.println("update 100 elements: " + diffTime2 + " ns");

        //search for 100 elements
        int index;
        startTime = System.nanoTime();
        for (int i = 1000; i < 1100; i++) {
            index = stack.search(String.valueOf(i));
            if (index == -1) {
                System.out.println("Something went wrong!");
            }
        }
        endTime = System.nanoTime();
        diffTime3 = endTime - startTime;
        System.out.println("search for 100 elements: " + diffTime3 + " ns");

        //delete 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            stack.pop();
        }
        endTime = System.nanoTime();
        diffTime4 = endTime - startTime;
        System.out.println("delete 100 elements: " + diffTime4 + "ns");

        totalTime = diffTime1 + diffTime2 + diffTime3 + diffTime4;
        System.out.println("The total processing time was " + totalTime + " ns");


        //QUEUE
        System.out.println("-----------------------");
        System.out.println("QUEUE");

        // add 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            queue.add(str);
        }
        endTime = System.nanoTime();
        diffTime1 = endTime - startTime;
        System.out.println("add 100 elements: " + diffTime1 + " ns");

        // update 100 elements
        startTime = System.nanoTime();
        queue.clear();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i+1000);
            queue.add(str);
        }
        endTime = System.nanoTime();
        diffTime2 = endTime - startTime;
        System.out.println("update 100 elements: " + diffTime2 + " ns");

        //search for 100 elements
        startTime = System.nanoTime();
        for (int i = 1000; i < 1100; i++) {
            found = queue.contains(String.valueOf(i));
            if (!found) {
                System.out.println("Something went wrong!");
            }
        }
        endTime = System.nanoTime();
        diffTime3 = endTime - startTime;
        System.out.println("search for 100 elements: " + diffTime3 + " ns");

        //delete 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            queue.remove();
        }
        endTime = System.nanoTime();
        diffTime4 = endTime - startTime;
        System.out.println("delete 100 elements: " + diffTime4 + "ns");
        totalTime = diffTime1 + diffTime2 + diffTime3 + diffTime4;
        System.out.println("The total processing time was " + totalTime + " ns");

        //HashMap
        System.out.println("---------------------");
        System.out.println("HashMap");

        // add 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            hashMap.put(i, str);
        }
        endTime = System.nanoTime();
        diffTime1 = endTime - startTime;
        System.out.println("add 100 elements: " + diffTime1 + " ns");

        // update 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i+1000);
            hashMap.put(i, str);
        }
        endTime = System.nanoTime();
        diffTime2 = endTime - startTime;
        System.out.println("update 100 elements: " + diffTime2 + " ns");

        //search for 100 elements
        String gotElement;
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            gotElement = hashMap.get(i);
            if (gotElement == null) {
                System.out.println("Something went wrong!");
            }
        }
        endTime = System.nanoTime();
        diffTime3 = endTime - startTime;
        System.out.println("search for 100 elements: " + diffTime3 + " ns");

        //delete 100 elements
        startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            hashMap.remove(i);
        }
        endTime = System.nanoTime();
        diffTime4 = endTime - startTime;
        System.out.println("delete 100 elements: " + diffTime4 + "ns");

        totalTime = diffTime1 + diffTime2 + diffTime3 + diffTime4;
        System.out.println("The total processing time was " + totalTime + " ns");
    }
}