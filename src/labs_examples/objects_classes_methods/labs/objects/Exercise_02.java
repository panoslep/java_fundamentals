package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_02 {

    public static void main(String[]args){

        Player messi = new Player("Lionel Messi", "Argentine", 33,"SS");
        Team barcelona = new Team("Barcelona FC", "blue/red", "La Liga");

        System.out.println(messi.name + " is a " + messi.age + " yo "+ messi.nationality + " footballer who plays in "+barcelona.league+ " for "+ barcelona.teamName+".");
    }
}

class Player {
    String name;
    String nationality;
    int age;
    String position;

    public Player(String name, String nationality, int age, String position){

        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.position = position;
    }
}
class Team {
    String teamName;
    String jerseyColours;
    String league;

    public Team(String teamName, String jerseyColours, String league) {
        this.teamName = teamName;
        this.jerseyColours = jerseyColours;
        this.league = league;
    }

}