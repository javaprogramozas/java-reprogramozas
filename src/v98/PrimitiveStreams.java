package v98;

import v73.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveStreams {

    public static void main(String[] args) {
        // int, long, double
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        IntStream intStreamFromRange = IntStream.range(1, 6);
        IntStream intStreamFromClosedRange = IntStream.rangeClosed(1, 5);

        // hasonló metódusok mint a Stream esetében
        ArrayList<Integer> evenNumbers = intStream
                .filter(n -> n % 2 == 0)
                .collect(() -> new ArrayList<>(), (l, n) -> l.add(n), (l1, l2) -> l1.addAll(l2));
        System.out.println("Páros számok: " + evenNumbers);

        // min, max, sum, average
        int minimum = intStreamFromRange.min().getAsInt();
        int sum = intStreamFromClosedRange.sum();
        double average = IntStream.of(0).average().getAsDouble();
        System.out.printf("min=%d, sum=%d, avg=%.2f", minimum, sum, average);

        // primitív -> objektum (boxing)
        List<Integer> someNumbers = IntStream.iterate(1, n -> n <= 5, n -> n + 1)
                .boxed()
                .toList();
        System.out.println("Számok (1-5): " + someNumbers);

        // primitív -> objektum (mapToObj)
        Set<Person> allZolis = IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .mapToObj(n -> new Person("Zoli", n))
                .collect(Collectors.toSet());
        System.out.println("Zoltánok: " + allZolis);

        // objektum -> primitív (mapToInt)
        int sumOfAges = allZolis.stream().mapToInt(person -> person.getAge()).sum();
        System.out.println("Zoltánok összkora: " + sumOfAges);
    }

}
