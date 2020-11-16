package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {


        boolean a = true;
        boolean b = false;

        // example of "OR"
        if (a | b){
            System.out.println("a or b is true");
        }

        // example of "short-circuit OR"
        if (a || b){
            System.out.println("a or b is true");
        }

        // example of "AND"
        if (a & b){
            System.out.println("a and b is true");
        }

        // example of "short-circuit AND"
        if (a && b){
            System.out.println("a and b is true");
        }

        // example of "XOR"
        if (a ^ b){
            System.out.println("a or b exclusively is true");
        }

        // example of "NOT"
        if (!a){
            System.out.println("a is not true");
        }
        if (!b){
            System.out.println("b is not true");
        }


        // write your code below



    }

}

