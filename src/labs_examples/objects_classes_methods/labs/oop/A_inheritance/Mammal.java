package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Mammal extends Animal {

    int gestation_period;
    int speed;

    public Mammal(int gestation_period) {
        this.gestation_period = gestation_period;
    }

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
}
