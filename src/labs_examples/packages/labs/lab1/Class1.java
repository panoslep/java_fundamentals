package labs_examples.packages.labs.lab1;

import labs_examples.packages.labs.lab2.Class2;


public class Class1 {
    public static void main(String[] args) {

        Class1 object1 = new Class1();
        object1.protectedMethod();
        object1.defaultMethod();
        Class2 object2 = new Class2();
        object2.pubicMethod();

        System.out.println("Attempt to access protected class:");
        try {
   //        object2.protectedMehod();
        }
        catch(Exception e) {
            System.out.println("The method was not accessible");
        }
    }
    protected void protectedMethod(){
        System.out.println("This is a protected method of lab1.Class1");
    }

    void defaultMethod(){
        System.out.println("This is a default method of labs.Class1");
    }

}

