package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 10;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a / b = " + divide(a, b));
        System.out.println("There are " + yearsInSeconds(b) + " seconds in " + "b" + "years");
        joke();
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        if (b != 0) return a / b;
        else return -1;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke() {
        System.out.println("The ice-cream man has written two books. He's got the scoop.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearsInSeconds(int years) {
        return years * 365 * 24 * 60 * 60;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargsLength(int... num){
        int count = 0;
        for (int x:num){
            count++;
        }
        return count;
    }
}
