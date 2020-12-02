package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Animal {
    int lifespan;
    int weight;
    int length;
    String habitat;
    String conservationStatus;

    public  Animal(){
        lifespan = weight = length = 1;
        habitat = "nowhere";
        conservationStatus = "extinct";

    }
    public Animal(int lifespan, int weight, int length, String habitat, String conservationStatus) {
        this.lifespan = lifespan;
        this.weight = weight;
        this.length = length;
        this.habitat = habitat;
        this.conservationStatus = conservationStatus;
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
}
