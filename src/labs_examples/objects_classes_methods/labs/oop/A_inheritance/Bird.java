package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Bird extends Animal {

    int wingSpan;
    boolean flies;

    public Bird(String name, int lifespan, int weight, int length, String habitat, String conservationStatus, int wingSpan, boolean flies){
        super(name, lifespan, weight, length, habitat, conservationStatus);
        wingSpan = this.wingSpan;
        flies = this.flies;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isFlies() {
        return flies;
    }

    public void setFlies(boolean flies) {
        this.flies = flies;
    }
}
