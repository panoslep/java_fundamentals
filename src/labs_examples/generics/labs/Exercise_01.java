package labs_examples.generics.labs;


/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenClass<T, V, W>{

    T obj1;
    V obj2;
    W obj3;

    public GenClass(T obj1, V obj2, W obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }

    public W getObj3() {
        return obj3;
    }

    public void setObj3(W obj3) {
        this.obj3 = obj3;
    }

    // Show types of T and V.
    void showTypes() {
        System.out.println("Type of T is " +
                obj1.getClass().getName());

        System.out.println("Type of V is " +
                obj2.getClass().getName());

        System.out.println("Type of W is " +
                obj3.getClass().getName());
    }

}

class demoGenClass {
    public static void main(String[] args) {

        GenClass<Integer, String, Character> gcObj=
            new GenClass(5, "letters", '£' );

        gcObj.showTypes();
        // print values
        System.out.println("\n" + gcObj.getObj1() + " " + gcObj.getObj2() + " " + gcObj.getObj3() + "\n");

        GenClass<String, String, Integer> gcObj2=
                new GenClass("can do", "this", 2 );

        gcObj2.showTypes();
        // print values
        System.out.println("\n" + gcObj2.getObj1() + " " + gcObj2.getObj2() + " " + gcObj2.getObj3()  + "\n");


        GenClass<String, Double, Float> gcObj3=
                new GenClass("one", 1.000000005, 99999999 );

        gcObj2.showTypes();
        // print values
        System.out.println("\n" + gcObj3.getObj1() + " " + gcObj3.getObj2() + " " + gcObj3.getObj3()  + "\n");
    }

}

