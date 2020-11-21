package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(){

        //create ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        //populate ArrayList
        arrayList.add("one");
        arrayList.add("2");
        arrayList.add("three");
        arrayList.add("4");
        arrayList.add("five");

        // access elements within ArrayList
        String el1 = arrayList.get(0);
        System.out.println(el1);

        //other methods
        int index = arrayList.indexOf("three");
        System.out.println(index);

        int size = arrayList.size();
        System.out.println(size);

        System.out.println(arrayList);
        arrayList.remove(size - 1);
        arrayList.remove(size - 2);
        System.out.println("new list:");
        System.out.println(arrayList);
    }
}
