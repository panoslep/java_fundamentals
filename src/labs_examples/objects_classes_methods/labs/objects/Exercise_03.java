package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_03 {
    public static void main(String[] args) {

        Country country1 = new Country("Greece", "Europe", 10000000);
        Country country2 = new Country("USA");
        Country county3 = new Country();
    }
}

class Country{
    String countryName;
    String continent;
    int population;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryName, String continent, int population) {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
    }


    public Country() {
    }
}