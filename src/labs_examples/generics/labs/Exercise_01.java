package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Generic<E>{

    ArrayList<E> list = new ArrayList();


    void printArray(ArrayList<E> list){
        System.out.print(list);
    }

}