package labs_examples.objects_classes_methods.labs.methods;

public class PassByExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.colour = "red";
        int[] y = {100, 40, 30};

        for (int x : y) {
            System.out.println(x);
        }

        passByValue(y);

        for (int x : y) {
            System.out.println(x);
        }

        System.out.println(myCar.colour);
        passByRef(myCar);
        System.out.println(myCar.colour);
    }

    public static void passByValue(int[] x) {
        for (int i : x){
            i = i * 1000;
        }

    }

    public static void passByRef(Car car){
        car.colour = "blue";
    }
}

class Car{
    String colour;
}

