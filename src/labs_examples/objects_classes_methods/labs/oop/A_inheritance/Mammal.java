package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Mammal extends Animal {

    int gestation_period;

    public Mammal(int gestation_period) {
        this.gestation_period = gestation_period;
    }

    public Mammal(int lifespan, int weight, int length, String habitat, String conservationStatus, int gestation_period) {
        super(lifespan, weight, length, habitat, conservationStatus);
        this.gestation_period = gestation_period;
    }

    public int getGestation_period() {
        return gestation_period;
    }

    public void setGestation_period(int gestation_period) {
        this.gestation_period = gestation_period;
    }
}
