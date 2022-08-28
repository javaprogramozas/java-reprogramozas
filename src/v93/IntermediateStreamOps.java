package v93;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateStreamOps {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<String> words = List.of("egy", "kettő", "három", "négy", "öt", "egy");
        List<Person> people = List.of(
                new Person("Peti", Set.of("Zoli", "Juli", "Béla")),
                new Person("Anna", Set.of("Máté", "Kati")),
                new Person("Karcsi", Set.of())
        );

        // Szűrés
        System.out.print("Szűrés: ");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Átalakítás (map)
        System.out.print("Átalakítás: ");
        words.stream()
                .map(String::length)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Flat stream-ek  (flatMap)
        System.out.print("Átalakítás (flat): ");
        people.stream()
                .flatMap(person -> person.friends().stream())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // Betekintés
        System.out.print("Betekintés: ");
        List<String> collect = words.stream()
                .peek(word -> System.out.print(word + " "))
                .collect(Collectors.toList());
        System.out.println(collect);

        // Rendezés
        System.out.print("Rendezés: ");
        words.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(word -> System.out.print(word + " "));
        System.out.println();

        // Egyedi elemek
        System.out.print("Egyedi: ");
        words.stream()
                .distinct()
                .forEach(word -> System.out.print(word + " "));
        System.out.println();

        // Elemek átugrása
        System.out.print("Átugrás: ");
        numbers.stream()
                .skip(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Elemek korlátozása
        System.out.print("Limit: ");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Elemek feltételig
        System.out.print("Elemek feltételig: ");
        numbers.stream()
                .takeWhile(n -> n <= 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Elemek feltételig
        System.out.print("Elemek eldobása feltételig: ");
        numbers.stream()
                .dropWhile(n -> n <= 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

    }

    private record Person(String name, Set<String> friends) {
    }

}
