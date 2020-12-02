package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise_05 {
    public static void main(String[] args)
    {
        Parent2 c = new Child2();

    }
}

class Parent2
{
    public Parent2()
    {
        System.err.println("Parent2 called");
    }
}

class Child2 extends Parent2
{
    public Child2()
    {
        System.err.println("Child2 called");
    }
}
