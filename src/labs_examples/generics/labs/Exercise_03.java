package labs_examples.generics.labs;

import java.util.*;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 {


    public static < T, V extends Number> double doubleSum( T arg1, V arg2 ) {

        double sum = (double) arg2.doubleValue() + (double) arg2.doubleValue();
        return sum;
    }


    public static <E> int palindromes(List<E> collection){
        int palElements = 0;
        try {
            for (E x : collection) {
                String str = x.toString().toLowerCase();
                boolean isPalindrome = true;

                for (int i = 0; i < str.length()/2-1; i++){
                    if (!((str.charAt(i)) == (str.charAt(str.length()-1-i)))){
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println("\"" + x + "\" is a palindrome.");
                    palElements++;
                }
            }
        }catch(Exception exp){
            System.out.println("Something went wrong.");
        }
        return palElements;
    }

    public static <E> E[] reversePos(E[] array, int pos1, int pos2){
        E temp = array[pos1];

        try {
            array[pos1] = array[pos2];
            array[pos2] = temp;
        }catch (Exception exp){
            System.out.println("Something went wrong.");
        }
        return array;
    }

    public static <T extends Object & Comparable> void largestElement(ArrayList<T> list, int begin, int end) {

        ArrayList<T> rangedList = new ArrayList<T>();
        for (int i = begin; i <= end; i++){
            rangedList.add(list.get(i));
        }
        System.out.println("The elements within range limits are: ");
        for (T x : rangedList) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("The largest element is : " +
                Collections.max(list));
    }

//    public static <E> E largestElement2(ArrayList<E> list, int begin, int end) {
//        E tempElement = list.get(0);
//        int index = 0;
//        try {
//            if (tempElement instanceof Number) {
//                double max = (double) list.get(begin); //Double.NEGATIVE_INFINITY;
//                double max = 0;
//                for (int i = begin; i <= end; i++) {
//                    if ((double) list.get(i) > max) {
//                        max = (double) list.get(i);
//                        index = i;
//                    }
//                }
//            } else if (tempElement instanceof String) {
//                int max = 0;
//                for (int i = begin; i <= end; i++) {
//                    int len = list.get(i).toString().length();
//                    if (len > max) {
//                        max = len;
//                        index = i;
//                    }
//                }
//            } else {
//                System.out.println("your list consists of non-comparable elements");
//                return null;
//            }
//        } catch (Exception exp2) {
//            System.out.println("Something went wrong.");
//            return null;
//        }
//        return list.get(index);
//    }


//    public static <E extends Number> E largestElement3(ArrayList<E> list, int begin, int end) {
//        int index = 0;
//        try {
//            double max = (double) list.get(begin); //Double.NEGATIVE_INFINITY;
//            for (int i = begin; i <= end; i++) {
//                if ((double) list.get(i) > max) {
//                    max = (double) list.get(i);
//                    index = i;
//                }
//            }
//        } catch (Exception exp2) {
//            System.out.println("Something went wrong.");
//            return null;
//        }
//        return list.get(index);
//    }

    public static String largestElement3(ArrayList<String> list, int begin, int end) {
        int index = 0;
        try {
            int max = 0;
            for (int i = begin; i <= end; i++) {
                int len = list.get(i).toString().length();
                if (len > max) {
                    max = len;
                    index = i;
                }
            }
        } catch (Exception exp3) {
            System.out.println("Something went wrong.");
            return null;
        }
        return list.get(index);
    }



    public static void main(String args[]) {

        Integer arg1 = 5;
        Float arg2 = 5.5f;
        List<String> listString = Arrays.asList("kayak", "panos", "ryan", "AManAPLanACanalPanama");
        Integer[] array = { 1, 2, 3, 4, 5 };

        ArrayList<String> arrayListString =
                new ArrayList<>(Arrays.asList("a", "long", "word", "is", "strawberry", "."));

        ArrayList<Integer> arrayListInt =
                new ArrayList<>(Arrays.asList(10, 20, 50, 4668, 34, 453));

        System.out.println("\n" + arg1 + " + " + arg2 + " = " + doubleSum(arg1, arg2));
        System.out.println();
        int elements = palindromes(listString);
        System.out.println(elements + " elements in the list are palindromes");

        System.out.println("Array before exchange: ");
        for (int x : array) {System.out.print(x);}
        System.out.println();
        System.out.println("Array after exchange: ");
        for (int x : reversePos(array, 2, 4)) {
            System.out.print(x);
        }

        System.out.println();
        largestElement(arrayListString, 2, 4);
        System.out.println();
        largestElement(arrayListInt, 0, 4);

    }
}



