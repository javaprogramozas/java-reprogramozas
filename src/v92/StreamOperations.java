package v92;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // közbülső operációk - intermediate operations
        Stream<Integer> integerStream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .peek(n -> System.out.println(n));

        // terminális operáció - terminal operation
        long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                //.peek(n -> System.out.println(n))
                .count();
        System.out.println("Count = " + count);

        // közbenső operációk opcionálisak
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Max = " + max);

        // állapottal rendelkező közbülső operációk - stateful intermediate operations
        List<Number> sortedNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted(Comparator.reverseOrder())
                //.peek(n -> System.out.println(n))
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // rövidzár operációk - short-circuit operations
        Optional<Integer> first = numbers.stream()
                //.peek(n -> System.out.println(n))
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .findFirst();
        System.out.println("First = " + first);

        // rövidzár és állapottal rendelkező operációk keverése
        numbers.stream()
                .peek(n -> System.out.println(n))
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .findFirst();
    }

}
