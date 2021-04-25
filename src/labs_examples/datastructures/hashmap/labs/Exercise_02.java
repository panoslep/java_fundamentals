package labs_examples.datastructures.hashmap.labs;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full
 *      4) triple the size of the underlying array on resize()
 *      5) instead of checking the number of keys to resize, check the number of values
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 *          -replace, size, putIfAbsent, isEmpty
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create the (custom) hashmap
        // the pointer (key) will be the name of the country (String)
        // the record (value) will be the county object
        MyHashMap<String, Country> countryMap = new MyHashMap();

        // create a few Country objects
        Country china = new Country("China", 1439323776, 9388211);
        Country india = new Country("India", 1380004385, 2973190);
        Country usa = new Country("USA", 331002651, 9147420);
        Country indonesia = new Country("Indonesia", 273523615, 1811570);
        Country pakistan = new Country("Pakistan", 220892340, 770880);

        // add the Country objects into the MyHashMap
        countryMap.add(china.getCountryName(), china);
        countryMap.add(india.getCountryName(), india);
        countryMap.add(usa.getCountryName(), usa);
        countryMap.add(indonesia.getCountryName(), indonesia);
        countryMap.add(pakistan.getCountryName(), pakistan);

        // demonstrate "getting" an element out of the MyHashMap
        Country example = countryMap.receive("USA");
        System.out.println(countryMap.hashSize());
        //System.out.println(example.getAreaInSq_km());


    }
}

class Country {
    private String countryName;
    private int population;
    private int areaInSq_km;

    public Country(String name, int population, int areaInSq_km) {
        this.countryName = name;
        this.population = population;
        this.areaInSq_km = areaInSq_km;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAreaInSq_km() {
        return areaInSq_km;
    }

    public void setAreaInSq_km(int areaInSq_km) {
        this.areaInSq_km = areaInSq_km;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", population=" + population +
                ", sizeInSq_km=" + areaInSq_km +
                '}';
    }
}
