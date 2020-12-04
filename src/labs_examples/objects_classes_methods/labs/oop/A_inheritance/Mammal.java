package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Mammal extends Animal {

    int gestation_period;
    int speed;


    public Mammal(String name, int lifespan, int weight, int length, String habitat, String conservationStatus, int gestation_period, int speed) {
        super(name, lifespan, weight, length, habitat, conservationStatus);
        this.gestation_period = gestation_period;
        this.speed = speed;
    }

    public int getGestation_period() {
        return gestation_period;
    }

    public void setGestation_period(int gestation_period) {
        this.gestation_period = gestation_period;
    }


    @Override
    // prints information about the animal , including mammal characteristics
    public void animalInfo(){
        System.out.println("A " + name + " is an animal that lives up to " + lifespan + " years. It weighs " + weight + " kg and can reach a length of " + length + " m ");
        printSpeed();
        System.out.println("Its gestation period is " + gestation_period + " days");
        System.out.println(name + "s can be found in the " + habitat);
        System.out.println("According to its conservation status, it's classified as: " + conservationStatus);
    }
    public void printSpeed(){
        System.out.println("A " + name + " can run as fast as " + speed + " km/h.");
    }

}
