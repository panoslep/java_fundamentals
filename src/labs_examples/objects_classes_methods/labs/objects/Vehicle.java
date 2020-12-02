package labs_examples.objects_classes_methods.labs.objects;

public class Vehicle {

    public void start(){
        System.out.println("Vehicle is starting");
    }

    public void stop(){
        System.out.println("Vehicle is stopping");
    }
}

class Car2 extends Vehicle{}

class Motorcycle extends Vehicle{
    @Override
    public void start() {
       // super.start();
        System.out.println("Motorcycle is starting.");
    }

    @Override
    public void stop() {
        //super.stop();
        System.out.println("Motorcycle is stopping.");
    }
}

class Controller{
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Car2 car2 = new Car2();
        Motorcycle moto1 = new Motorcycle();

        test(vehicle1);
        test(car2);
        test(moto1);
    }

    private static void test(Vehicle v) {
        v.start();
        v.stop();
    }
}