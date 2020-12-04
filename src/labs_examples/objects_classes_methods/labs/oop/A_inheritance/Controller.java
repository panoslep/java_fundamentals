package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Controller {
    public static void main(String[] args) {

        Animal tiger;
        tiger = new Mammal("tiger", 15, 300, 4, "rain forest", "endangered", 112, 65);
        tiger.animalInfo();
        System.out.println("--------------------------------------------------------------");
        Animal tiger2 = new Animal("tiger", 15, 300, 4, "rain forest", "endangered");
        tiger2.animalInfo();

    }
}
