package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Fish extends Animal {

    public Fish() {
    }

    public Fish(String name, int lifespan, int weight, int length, String habitat, String conservationStatus) {
        super(name, lifespan, weight, length, habitat, conservationStatus);
    }
}
