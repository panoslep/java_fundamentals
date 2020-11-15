package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below

        double val = 2;
        for(int i=0; i<4; i++)
        {
            if (val < i){
                System.out.println("val is less than "+i);
            }
            if (val <= i){
                System.out.println("val is less than or equal to "+i);
            }
            if (val == i){
                System.out.println("val is equal to "+i);
            }
            if (val >= i){
                System.out.println("val is greater than or equal than "+i);
            }
            if (val > i){
                System.out.println("val is greater than "+i);
            }

        }

    }

}

