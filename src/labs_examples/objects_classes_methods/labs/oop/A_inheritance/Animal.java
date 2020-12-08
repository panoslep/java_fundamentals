package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Animal {
    private String name;
    private int lifespan;
    private int weight;
    private int length;
    private String habitat;
    private String conservationStatus;
    private int speed;

    public  Animal(){
        lifespan = weight = length = 1;
        habitat = "nowhere";
        conservationStatus = "extinct";

    }
    public Animal(String name,int lifespan, int weight, int length, String habitat, String conservationStatus, int speed) {
        this.name =name;
        this.lifespan = lifespan;
        this.weight = weight;
        this.length = length;
        this.habitat = habitat;
        this.conservationStatus = conservationStatus;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // prints information about the animal
    public void animalInfo(){
        System.out.println("A " + name + " is an animal that lives up to " + lifespan + " years. It weighs " + weight + " kg and can reach a length of " + length + " m ");
        System.out.println("A " + name + " can be found in the " + habitat);
        System.out.println("According to its conservation status, it's classified as: " + conservationStatus);
    }

    public void vocalize(){
        System.out.println("Animal noise");

    }



}
