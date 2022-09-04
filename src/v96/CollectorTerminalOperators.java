package v96;

import v73.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorTerminalOperators {

    public static void main(String[] args) {
        List<Person> people = List.of(
                Person.person("Béla", 24),
                Person.person("Anna", 2),
                Person.person("Enikő", 46),
                Person.person("Adél", 20),
                Person.person("Aranka", 52),
                Person.person("Laci", 22),
                Person.person("András", 20),
                Person.person("Anna", 3)
        );

        // toArray
        Object[] namesAsObjectArray = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.startsWith("A"))
                .toArray();
        System.out.println("Objects: " + Arrays.toString(namesAsObjectArray));

        String[] namesAsStringArray = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.startsWith("A"))
                .toArray(String[]::new);
        System.out.println("Strings: " + Arrays.toString(namesAsStringArray));

        // toList
        List<String> listOfNames = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.startsWith("A"))
                .toList();
        //listOfNames.add("valami");
        System.out.println("List: " + listOfNames + " " + (listOfNames.getClass().getName()));

        // collect toList
        List<String> listOfNames2 = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        listOfNames2.add("valami");
        System.out.println("List2: " + listOfNames2 + " " + (listOfNames2.getClass().getName()));

        // collect toSet
        Set<String> setOfNames = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println("Set: " + setOfNames);

        // collect toCollection
        TreeSet<String> treeSetOfNames = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet: " + treeSetOfNames);

        // collect toMap
        Map<String, Integer> nameAndAgeMap = people.stream()
                .filter(person -> person.getName().startsWith("A"))
                .collect(Collectors.toMap(Person::getName, Person::getAge, (age1, age2) -> age1 + age2, TreeMap::new));
        System.out.println("Map: " + nameAndAgeMap);

        Map<String, Person> peopleMap = people.stream()
                .filter(person -> person.getName().startsWith("A"))
                .collect(Collectors.toMap(Person::getName, Function.identity(), (p1, p2) -> p1));
        System.out.println("Map2: " + peopleMap);
    }
}
