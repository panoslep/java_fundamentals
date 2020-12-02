package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 *
 */
class A {
    int i = 10;

    public void test() {
        System.out.println("test print in A");
    }
}

class B extends A{
    int i = 20;
    public  B(){
        System.out.println("in B");
    }
    public void test(){
        System.out.println("test print in B");
    }
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        A a2 = new A();

        System.out.println(a.i);
        a.test();
        System.out.println(b.i);
        System.out.println(a2.i);
        a2.test();
    }
}