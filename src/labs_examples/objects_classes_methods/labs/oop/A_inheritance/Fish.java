package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Fish extends Animal {

    public Fish() {
    }

    public Fish(int lifespan, int weight, int length, String habitat, String conservationStatus) {
        super(lifespan, weight, length, habitat, conservationStatus);
    }
}
