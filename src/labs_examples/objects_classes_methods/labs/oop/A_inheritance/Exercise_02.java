package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 *
 */
class A {
    int i = 10;

    public int get_i() {
        return i;
    }
}

class B extends A{
    //int i = 20;

    @Override
    public int get_i(){
        return i*2;
    }


}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        System.out.println(a.get_i());
        System.out.println(b.get_i());

    }
}