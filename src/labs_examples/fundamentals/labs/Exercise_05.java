package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int lengthOfstr= str.length();
        System.out.println(lengthOfstr);

        String str2 = "HELLO!";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual;
        isEqual = str.equalsIgnoreCase(str2);
        System.out.println(isEqual);

        // please concatenate str & str2 and set the result to a new String variable below
        String conc = str+" "+str2;
        System.out.println(conc);


        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        //replace()
        str = str.replace("!","?");
        System.out.println(str);

        //substring()
        String sub = str.substring(2,4);
        System.out.println(sub);


        //contains()
        boolean cont = str.contains("he");
        System.out.println(cont);

        //indexOf()
        int index = str.indexOf("l");
        System.out.println(index);


    }


}