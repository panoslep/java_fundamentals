package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import com.sun.deploy.security.CertType;

public class Controller {
    public static void main(String[] args) {

        Animal tiger;
        tiger = new Mammal("tiger", 15, 300, 4, "rain forest",
                "endangered", 112, 65);
        tiger.animalInfo();
        System.out.println("--------------------------------------------------------------");
        Animal tiger2 = new Animal("tiger", 15, 300, 4, "rain forest",
                "endangered", 65);
        tiger2.animalInfo();

        Cetacean dolphin = new Cetacean("dolphin", 80, 2, 60, 200);
        System.out.println(dolphin.getHabitat());

        test(tiger);
        test(tiger2);
        test(dolphin);

        Animal animal1= new Animal();
        Mammal mammal1 = new Mammal();
        Cetacean cetacean1 = new Cetacean();
        Bird bird1 = new Bird();
        Fish fish1 = new Fish();
        Animal fish2 = new Fish();

        System.out.println("----------------------------");
        animal1.vocalize();
        mammal1.vocalize();
        cetacean1.vocalize();
        bird1.vocalize();
        fish1.vocalize();
        fish2.vocalize();
    }

    public static void test(Animal animal){
        System.out.println(animal.getHabitat());
    }
}
