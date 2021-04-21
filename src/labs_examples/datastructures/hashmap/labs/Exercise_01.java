package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

public class Exercise_01{
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John L.", 35);
        people.put("Mary V.", 61);
        people.put("Andrew S.", 21);
        people.put("Liam W.", 48);

        System.out.println(people.get("John L."));

        HashMap<String, Integer> people2 = new HashMap<String, Integer>();
        people2.putAll(people);
        System.out.println(people2.get("John L."));

        System.out.println(people.size());

        System.out.println(people.containsValue(35));
        System.out.println(people.containsKey("Helen J."));

        for (String x : people.keySet()) {
            System.out.println(x);
        }

        for (Map.Entry<String, Integer> x : people.entrySet())
            System.out.println(x);
        System.out.println("------------------------------------------");
        people.putIfAbsent("Helen J." , 33);
        people.putIfAbsent("John L." , 25);
        people.putIfAbsent("John L.", 35);
        for (Map.Entry<String, Integer> x : people.entrySet())
            System.out.println(x);

        people.remove("John L.");
        people.remove("someone not there");
        people.replace("Mary V.", 61, 16);
        System.out.println("------------------------------------------");
        for (Map.Entry<String, Integer> x : people.entrySet())
            System.out.println(x);

        people.forEach((k, v) -> System.out.println("key: "+ k +" value:" + v));

        System.out.println("Is people2 empty? " + people2.isEmpty());
        people2.clear();
        System.out.println("Is people2 empty? " + people2.isEmpty());
    }
}
