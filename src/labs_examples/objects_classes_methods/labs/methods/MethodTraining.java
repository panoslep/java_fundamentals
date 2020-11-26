//package labs_examples.objects_classes_methods.labs.methods;
//
//public class MethodTraining {
//
//    public static void main(String[] args) {
//
//        int sum1 = sum(5, 5);
//        int sum2 = sum(4.7 , 3.333);
//        System.out.println("sum1 = " + sum1 + "\nsum2 = " + sum2);
//
//        //"pass by value" and "pass by reference
//        int a = 5;
//        String str = "something";
//
//        System.out.println("The int value before passing to method is :" + a);
//        System.out.println("The String value before passing to method is :" + str);
//
//        passByExample(a, str);
//
//        System.out.println("The int value after passing to method is :" + a);
//        System.out.println("The String value after passing to method is :" + str);
//
//        int b = a + 1;
//        System.out.println("The largest of " + a + ", " + sum1 + ", " + sum2 + ", " + b + " is " );//MaxOf4()
//
//    // method overloading
//    public static int sum(int a, int b){
//        return a + b;
//    }
//
//    public static int sum(double c, double d){
//        return (int)(c + d);
//    }
//
//    public static void passByExample(int a, String str){
//
//        //System.out.println("The int value before actions in method is :" + a);
//        a = a * 1000;
//        System.out.println("The int value after actions in method is :" + a);
//
//        //System.out.println("The String value before actions in method is :" + str);
//        str = str + " and something more";
//        System.out.println("The String value after actions in method is :" + str);
//    }
//
//    // return the largest of 4 numbers
//    public int MaxOf4(int a, int b, int c, int d){
//        int max = 0;
//        int[] m = new int[]{a, b, c, d};
//        for (int x:m){
//            if (x>max)
//                max = x;
//        }
//        return max;
//    }
//
//}
//
