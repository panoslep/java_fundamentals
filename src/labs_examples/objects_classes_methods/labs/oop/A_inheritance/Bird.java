package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Bird extends Animal {

    private int wingSpan;
    private boolean flies;

    public Bird(){}

    public Bird(String name, int lifespan, int weight, int length, String habitat, String conservationStatus,
                int speed, int wingSpan, boolean flies){
        super(name, lifespan, weight, length, habitat, conservationStatus, speed);
        this.wingSpan = wingSpan;
        this.flies = flies;
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

    @Override
    public void vocalize(){
        System.out.println("chirp chirp");
    }
}
