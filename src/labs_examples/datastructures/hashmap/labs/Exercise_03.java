package labs_examples.datastructures.hashmap.labs;

import java.util.*;

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
        Queue<String> queue = new LinkedList<String>();
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        Timer timer = new Timer();

        // add 100 elements
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            linkedList.addLast(str);
        }


        // update 100 elements
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i+1000);
            //linkedList.replaceAll(str);
        }


        // STACK
        // add 100 elements
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            stack.add(str);
        }

        // update 100 elements
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i+1000);
            
        }


        // add 100 elements
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            queue.add(str);
        }

        // add 100 elements
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            hashMap.put(i, str);
        }






    }
}