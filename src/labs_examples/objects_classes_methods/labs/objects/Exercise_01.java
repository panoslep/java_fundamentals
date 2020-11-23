package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {

    public static void main(String[] args) {

        Capacity capacity1 = new Capacity(10, 100, 1000);

        Maintenance maintenance1 = new Maintenance(5, 25, "June");

        Model myModel = new Model("British Airways", "Boeing", "747");

        Performance myPerformance = new Performance(0.83, 45000, 800);

        Airplane myAirplace = new Airplane(myEngine, myStereo, "XTerra", "Blue");

        System.out.println("I drive a " + myCar.color + " " + myCar.model + " with a "

                + myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower + " engine");

        // OR

        System.out.println(myCar.toString());
    }
}
