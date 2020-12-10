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

    public  Player(String name, int potValue){
        this.name = name;
        this.potValue = potValue;
        hand = new Hand();
    }

    //computer player stops at 16, return true if they want another card
    public boolean computerAI(){
        return (hand.returnScore()<16);
    }
}


