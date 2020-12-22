package labs_examples.static_nonstatic.labs;

public class Class1 {
    public static void main(String[] args) {
        static_call();
        Class1 obj3 = new Class1();
        obj3.non_static_call();

    }

    public static void static_call(){
        System.out.println("----------------------------");
        System.out.println("This is a static method.");
        System.out.println("Call a static method of the same class:");
        static_1_print();
        System.out.println("Call a non-static method of the same class:");
        Class1 obj = new Class1();
        obj.non_static_1_print();

        System.out.println("Call a static method of another class:");
        Class2.static_2_print();
        System.out.println("Call a non-static method of another class:");
        Class2 obj2 = new Class2();
        obj2.non_static_2_print();
        System.out.println("-----------------------------");
    }

    public void non_static_call(){
        System.out.println("----------------------------");
        System.out.println("This is a non-static method.");
        System.out.println("Call a static method of the same class:");
        static_1_print();
        System.out.println("Call a non-static method of the same class:");
        Class1 obj = new Class1();
        obj.non_static_1_print();

        System.out.println("Call a static method of another class:");
        Class2.static_2_print();
        System.out.println("Call a non-static method of another class:");
        Class2 obj2 = new Class2();
        obj2.non_static_2_print();
        System.out.println("-----------------------------");
    }



    public static void static_1_print(){
        System.out.println("This is a static method of Class 1");
    }

    public void non_static_1_print(){
        System.out.println("This is a non-static method of Class 1");
    }

}


