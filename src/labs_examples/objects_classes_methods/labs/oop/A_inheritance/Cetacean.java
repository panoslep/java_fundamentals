package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

// aquatic mammals
public class Cetacean extends Mammal{

    private int diveTime;
    private int diveDepth;

    public Cetacean(){
    }


    public Cetacean(String name,  int weight, int length, int diveTime, int diveDepth) {
        super(name, 50, weight, length, "ocean", "protected", 210, 56);
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

    @Override
    public void printSpeed(){
        System.out.println("A " + getName() + " can swim as fast as " + getSpeed() + " km/h.");
    }

    @Override
    public void vocalize(){
        System.out.println("click click");
    }
}
