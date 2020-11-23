package labs_examples.objects_classes_methods.labs.objects;

import java.sql.SQLOutput;

public class Exercise_01 {

    public static void main(String[] args) {

        Capacity capacity1 = new Capacity(10, 100, 1000);

        Maintenance maintenance1 = new Maintenance(5, 25, "June");

        Model myModel = new Model("British Airways", "Boeing", "747");

        Performance myPerformance = new Performance(0.83, 45000, 800);

        Airplane myAirplane = new Airplane(myPerformance, maintenance1, capacity1, myModel);

        System.out.println("My airplane is a " + myAirplane.getAirModel().getManufacturer()+" "+myAirplane.getAirModel().getType()+".");
        System.out.println("It can take "+ myAirplane.getCapacity().getMaxPassengers() + " nice people to their destination.");
        System.out.println("Looking from "+myAirplane.getPerformance().getMaxAltitude()+ " feet high. What a sight!");
        System.out.println("I just have to remember to service it next "+myAirplane.getMaintenance().getMonthOfLastService()+".");
        System.out.println(myAirplane.toString());
    }
}
