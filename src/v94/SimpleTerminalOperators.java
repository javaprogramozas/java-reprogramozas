package v94;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class SimpleTerminalOperators {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>(Set.of("Béla", "Anna", "Enikő", "Adél", "Aranka", "Laci", "Máté", "Andor", "Mátyás", "Zoli"));

        // forEach
        names.stream()
                .filter(name -> name.length() == 4)
                .forEach(name -> System.out.print(name + " "));

        System.out.println();

        // forEachOrdered
        names.parallelStream()
                .filter(name -> name.length() == 4)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        names.parallelStream()
                .filter(name -> name.length() == 4)
                .forEachOrdered(name -> System.out.print(name + " "));
        System.out.println();

        // min, max, count

        Optional<String> min = names.stream().min(Comparator.naturalOrder());
        Optional<String> max = names.stream().max(Comparator.naturalOrder());
        long count = names.stream()
                .filter(name -> name.length() == 4)
                .count();

        System.out.println("Legkisebb elem: " + min.orElse("n/a"));
        System.out.println("Legnagyobb elem: " + max.orElse("n/a"));
        System.out.println("Elemek száma: " + count);

    }

}
