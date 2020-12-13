package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    private String name;
    private Hand hand;
    private int potValue;
    private int handsPlayed;

    public Player(){
        name = "default Player";
        hand = new Hand();
        potValue = 100;
        handsPlayed = 0;
    }

    public  Player(String name, int potValue){
        this.name = name;
        this.potValue = potValue;
        hand = new Hand();
    }

    //computer player stops at 16, return true if they want another card
    public boolean computerAI(){
        return (hand.returnScore() < 17);
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

    // a method to help with the printing length - only aesthetic use
    public String nameSize(){
        String name_size = "-";
        for (int i = 0; i < getName().length(); i++) {
            name_size = name_size + "-";
        }
        return name_size;
    }

    public int getHandsPlayed() {
        return handsPlayed;
    }

    public void setHandsPlayed(int handsPlayed) {
        this.handsPlayed = handsPlayed;
    }
}


