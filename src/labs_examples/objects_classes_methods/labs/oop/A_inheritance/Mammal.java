package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Mammal extends Animal {

    private int gestation_period;
    private final boolean WARM_BLOODED = true;


    public Mammal(){}

    public Mammal(String name, int lifespan, int weight, int length, String habitat, String conservationStatus, int gestation_period, int speed) {
        super(name, lifespan, weight, length, habitat, conservationStatus, speed);
        this.gestation_period = gestation_period;
    }


    public int getGestation_period() {
        return gestation_period;
    }

    public void setGestation_period(int gestation_period) {
        this.gestation_period = gestation_period;
    }

    public boolean isWARM_BLOODED() {
        return WARM_BLOODED;
    }

    @Override
    // prints information about the animal , including mammal characteristics
    public void animalInfo(){
        System.out.println("A " + getName() + " is an animal that lives up to " + getLifespan() + " years. It weighs "
                + getWeight() + " kg and can reach a length of " + getLength() + " m ");
        printSpeed();
        System.out.println("Its gestation period is " + gestation_period + " days");
        System.out.println(getName() + "s can be found in the " + getHabitat());
        System.out.println("According to its conservation status, it's classified as: " + getConservationStatus());
    }
    public void printSpeed(){
        System.out.println("A " + getName() + " can run as fast as " + getSpeed() + " km/h.");
    }

    @Override
    public void vocalize(){
        System.out.println("birp birp");
    }
}
