package labs_examples.interfaces.labs;

/**
 * Interfaces Exercise 1:
 *
 *      1) Write an interface with at least three methods. Write two classes that implement the
 *          interface in different ways.
 *      2) Write a class that extends one of the classes from the previous step. Override the methods in
 *          the parent class.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle interface, that is advanced by a Tractor class and a Scooter class. Two of the methods could be
 *          turnOn() and brake().
 *       - A PersonalDevice interface that is implemented by an iPad class and a Computer class. Two of the methods could be
 *          playMusic() and turnOff().
 */

interface Vehicle {
    void turnOn();
    void brake();
    void turnOff();
}

class Tractor implements Vehicle {
    @Override
    public void turnOn() {
        System.out.println("Tractor turns on.");
    }

    @Override
    public void brake() {
        System.out.println("Tractor brakes.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tractor turns off.");
    }
}


class Scooter implements Vehicle {
    @Override
    public void turnOn() {
        System.out.println("Scooter turns on.");
    }

    @Override
    public void brake() {
        System.out.println("Scooter brakes.");
    }

    @Override
    public void turnOff() {
        System.out.println("Scooter turns off.");
    }
}


class  Bulldozer extends Tractor{
    // Can we Override?
//    @Override
}

public class InterfaceExercise_01 {
    public static void main(String[] args) {
        Tractor tractor = new Tractor();
        tractor.turnOn();
        tractor.brake();
        tractor.turnOff();

        Scooter scooter = new Scooter();
        scooter.turnOn();
        scooter.brake();
        scooter.turnOff();

    }
}
