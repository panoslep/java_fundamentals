package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    private String name;
    private Hand hand;
    private int potValue;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
}


