package v79;

import v73.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 22);
        Person kati2 = Person.person("Kati", 22);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);
        Person dani = Person.person("Dani", 42);

        SortedMap<String, Person> people = new TreeMap<>();

        System.out.println("Méret: " + people.size() + ", üres? " + people.isEmpty());

        people.put("A", kati);
        people.put("B", kati2);
        people.put("C", laci);
        people.put("N", null);

        System.out.println(people);
        people.put("C", peti);

        people.putIfAbsent("H", Person.person("Hugó", 33));
        people.putIfAbsent("C", Person.person("Csilla", 28));
        System.out.println(people);

        System.out.println("'A' kulcs létezik? " + people.containsKey("A"));
        System.out.println("'X' kulcs létezik? " + people.containsKey("X"));
        System.out.println("'N' kulcs létezik? " + people.containsKey("N"));
        System.out.println();

        System.out.println("Peti benne van? " + people.containsValue(Person.person("Peti", 31)));
        System.out.println("Kálmán benne van? " + people.containsValue(Person.person("Kálmán", 31)));
        System.out.println("'null' benne van? " + people.containsValue(null));
        System.out.println("'???' benne van? " + people.containsValue("???"));
        System.out.println();

        System.out.println(people);
        System.out.println("'A' kulcs értéke: " + people.get("A"));
        System.out.println("'X' kulcs értéke: " + people.get("X"));
        System.out.println("'N' kulcs értéke: " + people.get("N"));
        System.out.println();

        System.out.println("'A' = " + people.getOrDefault("A", dani));
        System.out.println("'X' = " + people.getOrDefault("X", dani));
        System.out.println("'N' = " + people.getOrDefault("N", dani));
        System.out.println(people);

        people.remove("H");
        people.remove("X");

        people.remove("A", kati);
        people.remove("C", dani);

        System.out.println(people);

        //people.replace("C", kati, dani);

        Map.Entry<Integer, String> entry = Map.entry(1, "egy");
        System.out.println(entry);

        List<Map.Entry<String, Person>> entries = new ArrayList<>(people.entrySet());
        for (int i = 0; i < entries.size(); i++) {
            System.out.println(i + ". -> " + entries.get(i));
        }

        System.out.println("Keys = " + people.keySet());
        System.out.println("Values = " + people.values());
    }
}
