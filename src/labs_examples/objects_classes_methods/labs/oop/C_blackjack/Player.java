package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    String name;
    Hand hand;
    int potValue;

    public Player(){
        name = "default Player";
        hand = new Hand();
        potValue = 100;
    }
}
