package labs_examples.lambdas.labs;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.*;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

interface MyFirstVoidFunctionalInterface {

    public void methodOne();

}

interface TypeInterface {
    public int getType(int x, int y);
}


public class Exercise_01 {
    public static void main(String[] args) {
        MyFirstVoidFunctionalInterface fi = ()-> {
            System.out.println("this is a simple lambda");
        };
        fi.methodOne();

        MyFirstVoidFunctionalInterface fi2 = ()-> {
            System.out.println("another simple lambda");
        };
        fi2.methodOne();

        TypeInterface sum = (int x, int y)-> {
            return x+y;
        };
        TypeInterface product = (int x, int y)-> {
            return x*y;
        };

        int x = 5;
        int y =6;
        System.out.println("sum of " + x + " and " + y + " is : " + sum.getType(x,y));
        System.out.println("product of " + x + " and " + y + " is : " + product.getType(x,y));
    }
}

//@FunctionalInterface
//public interface MyFirstVoidFunctionalInterface {
//
////    public void someMethod(); {
//        System.out.println("Hi. It works");
//    }
//
//}


//public class Exercise_01 {
//    public static void main(String args[]) {
//
//        MyFirstVoidFunctionalInterface myInter = (s)->s.someMethod();
//
//                System.out.println(st);
//        }
//    }
//}
