package labs_examples.objects_classes_methods.labs.methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

import static java.lang.Integer.sum;

public class MethodTraining {

    public static void main(String[] args) {

        int sum1 = findSum(5, 5);
        int sum2 = findSum(4.7, 3.333);
        System.out.println("sum1 = " + sum1 + "\nsum2 = " + sum2);

        //"pass by value" and "pass by reference
        int a = 5;
        String str = "something";

        System.out.println("The int value before passing to method is :" + a);
        System.out.println("The String value before passing to method is :" + str);

        passByExample(a, str);

        System.out.println("The int value after passing to method is :" + a);
        System.out.println("The String value after passing to method is :" + str);

        int b = a + 1;
        System.out.println("\nThe largest of " + a + ", " + sum1 + ", " + sum2 + ", " + b + " is " + MaxOf4(a, sum1, sum2, b));

        System.out.println("\n" + str + " contains " + noOfConsonants(str) + " consonants");

        // prime number
        int num = 997;
        String is = " is";
        if (!isPrime(num)) is += " not";
        System.out.println("-------------------------------------------");
        System.out.println(num + is +  " a prime number");

        // Max and Min of array
        int[] sampleArray = {12, 43 , 56, 7543, 5, 23, 18};
        System.out.println("-------------------------------------------");
        System.out.println("The input array is:");
        for (int x : sampleArray) {
            System.out.print(x + " ");
        }
        System.out.println("\nThe max and min numbers of this array are:");
        for (int x : array_Max_n_Min(sampleArray)) {
            System.out.print(x + " ");
        }

        // reverse array
        System.out.println("\nThe reverse array is:");
        for (int x : reverseArray(sampleArray)) {
            System.out.print(x + " ");
        }

        //divisors
        int div1 = 5;
        int div2 = 2;
        int maxNum = 100;
        ArrayList<Integer> list = listOfDivisors(maxNum, div1, div2);
        System.out.println();
        System.out.println(div1 + " and " + div2 + " are divisors of " + list.size() + " numbers between 0 and " + maxNum);

        System.out.println();

        drawAnElephant();
    }

    // method overloading
    static int findSum(int a, int b){
        return a + b;
    }

    static int findSum(double c, double d){
        return (int)(c + d);
    }

    public static void passByExample(int a, String str){

        //System.out.println("The int value before actions in method is :" + a);
        a = a * 1000;
        System.out.println("The int value after actions in method is :" + a);

        //System.out.println("The String value before actions in method is :" + str);
        str = str + " and something more";
        System.out.println("The String value after actions in method is :" + str);
    }

    // return the largest of 4 numbers
    static int MaxOf4(int a, int b, int c, int d){
        int max = 0;
        int[] m = new int[]{a, b, c, d};
        for (int x:m){
            if (x>max)
                max = x;
        }
        return max;
    }

    // return consonants of a string
    static int noOfConsonants(String str){
        String vowels = "iouae";
        String letter = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            letter = Character.toString(str.charAt(i));
            if (!vowels.contains(letter))
                    count++;
        }
        return count;
    }

    static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num%i==0)
                return false;
        }
        return true;

    }

    static int[] array_Max_n_Min(int[] v){
        int max = 0;
        int min = 999999999;
        for (int x : v){
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        int[] maxmin = new int[]{max, min};
        return maxmin;
    }

    // reverse input array
    static int[] reverseArray(int[] v){
        int temp;
        for (int i = 0; i < v.length/2; i++ ){
            temp = v[i];
            v[i] = v[v.length-1-i];
            v[v.length-1-i] = temp;
        }
        return v;
    }


    // takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    // populated with each number between zero and maxNum that is
    // divisible by both divisor1 and divisor2.
    static ArrayList listOfDivisors(int maxNum, int divisor1, int divisor2){     //change the name to something that makes more sense

        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= maxNum; i++){
            if (((i % divisor1) == 0) && ((i % divisor1) == 0))
                list.add(i);
        }
        return list;
    }



    static void drawAnElephant(){

        System.out.println("\n" +
       "                            _                       "+
        "\n" + "                          .' `'.__                  " +
        "\n" + "                         /      \\ `'\"-,              " +
        "\n" + "        .-''''--...__..-/ .     |      \\            " +
        "\n" + "      .'               ; :'     '.  a   |           " +
        "\n" + "     /                 | :.       \\     =\\          " +
        "\n" + "    ;                   \\':.      /  ,-.__;.-;`     " +
        "\n" + "   /|     .              '--._   /-.7`._..-;`       " +
        "\n" + "  ; |       '                |`-'      \\  =|        " +
        "\n" + "  |/\\        .   -' /     /  ;         |  =/        " +
        "\n" + "  (( ;.       ,_  .:|     | /     /\\   | =|         " +
        "\n" + "   ) / `\\     | `\"\"`;     / |    | /   / =/         " +
        "\n" + "     | ::|    |      \\    \\ \\    \\ `--' =/          " +
        "\n" + "    /  '/\\    /       )    |/     `-...-`           " +
        "\n" + "   /    | |  `\\    /-'    /;                        " +
        "\n" + "   \\  ,,/ |    \\   D    .'  \\                       " +
        "\n" + "    `\"\"`   \\  nnh  D_.-'L__nnh                      " +
        "\n" + "            `\"\"\"`                                   " );

    }


}

class Number{

    private int num;

    public Number(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}