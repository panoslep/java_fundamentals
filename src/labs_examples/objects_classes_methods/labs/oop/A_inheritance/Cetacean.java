package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

// aquatic mammals
public class Cetacean extends Mammal{

    int diveTime;
    int diveDepth;
    int swimSpeed; //to override speed

    public Cetacean(int gestation_period) {
        super(gestation_period);
    }

    public Cetacean(int lifespan, int weight, int length, String habitat, String conservationStatus, int gestation_period, int speed, int diveTime, int diveDepth) {
        super(lifespan, weight, length, habitat, conservationStatus, gestation_period, speed);
        this.diveDepth = diveDepth;
        this.diveTime = diveTime;
    }

    public int getDiveTime() {
        return diveTime;
    }

    public void setDiveTime(int diveTime) {
        this.diveTime = diveTime;
    }

    public int getDiveDepth() {
        return diveDepth;
    }

    public void setDiveDepth(int diveDepth) {
        this.diveDepth = diveDepth;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
