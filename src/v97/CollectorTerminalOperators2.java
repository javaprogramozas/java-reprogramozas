package v97;

import v73.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTerminalOperators2 {

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

        Map<String, Person> peopleMap = people.stream()
                .filter(person -> person.getName().startsWith("A"))
                .collect(Collectors.toMap(Person::getName, Function.identity(), (p1, p2) -> p1));
        System.out.println("Map2: " + peopleMap);

        // collect groupingBy
        Map<String, List<Person>> peopleListMultimap = people.stream()
                .filter(person -> person.getName().startsWith("A"))
                .collect(Collectors.groupingBy(person -> person.getName()));
        System.out.println("List multimap: " + peopleListMultimap);

        Map<String, Set<Person>> peopleSetMultimap = people.stream()
                .filter(person -> person.getName().startsWith("A"))
                .collect(Collectors.groupingBy(person -> person.getName(), TreeMap::new, Collectors.toSet()));
        System.out.println("Set multimap: " + peopleSetMultimap);

        // reduce
        Optional<Integer> optionalSum = Stream.of(1, 2, 3, 4)
                .reduce((partialResult, current) -> partialResult + current);
        System.out.println("Optional sum: " + optionalSum);

        Integer sum = Stream.of(1, 2, 3, 4)
                .reduce(0, (partialResult, current) -> partialResult + current);
        System.out.println("Sum: " + sum);

        Integer sumOfAge = people.stream()
                .reduce(0, (partialResult, current) -> partialResult + current.getAge(), (a, b) -> a + b);
        System.out.println("Sum of age: " + sumOfAge);

        List<String> names = people.stream()
                .reduce(new ArrayList<>(),
                        (partialResult, current) -> {
                            partialResult.add(current.getName());
                            return partialResult;
                        },
                        (a, b) -> {
                            a.addAll(b);
                            return a;
                        }
                );
        System.out.println("Names: " + names);

        // joining
        String joinedNames = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining(", ", "-> ", " <-"));

        System.out.println("Joined: " + joinedNames);
    }
}
