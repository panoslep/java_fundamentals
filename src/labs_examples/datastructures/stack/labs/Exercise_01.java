package labs_examples.datastructures.stack.labs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.addElement(222);
        stack.push(15);
        stack.push(25);
        stack.addElement(222);
        System.out.println(stack);
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.empty());
        Stack<Integer> emptyStack = new Stack<Integer>();
        System.out.println(emptyStack.empty());

        System.out.println(stack.search(255));
    }


//        push()
//        addElement(item);
//        pop()
//        peek()
//        empty()
//                search()
    }



