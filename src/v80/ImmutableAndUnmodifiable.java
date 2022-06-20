package v80;

import v73.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

public class ImmutableAndUnmodifiable {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("macska");
        animals.add("kutya");
        animals.add("csirke");
        animals.add("galamb");

        System.out.println(animals);
        animals.add("delfin");

        List<String> unmodifiableAnimals = Collections.unmodifiableList(animals);

        System.out.println(unmodifiableAnimals);
        animals.add("bálna");
        System.out.println(unmodifiableAnimals);

        List<String> strings = Collections.emptyList();

        List<String> immutableAnimals = List.of("macska", "kutya", "csirke", "galamb");
        List<String> emptyList = List.of();
        System.out.println(immutableAnimals.getClass());

        List<String> copyOfAnimals = List.copyOf(animals);
        animals.add("zebra");
        System.out.println(copyOfAnimals);

        Map<String, Person> peopleMap = Map.of("A1", Person.person("Zoli", 38));

        System.out.println(peopleMap);
        peopleMap.get("A1").setAge(100);
        System.out.println(peopleMap);


        Map.Entry<String, Person> entry = Map.entry("B2", Person.person("Juli", 23));

        Map<String, Person> anotherPeopleMap = Map.ofEntries(entry);

    }
}
