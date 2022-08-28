package v95;

import java.util.List;

public class ShortcutTerminalOperators {

    public static void main(String[] args) {
        List<String> names = List.of("Béla", "Anna", "Enikő", "Adél", "Aranka", "Laci", "Máté", "Andor", "Mátyás", "András");

        // findAny
        String anyNameStartsWithAn = names.stream()
                .filter(name -> name.startsWith("An"))
                .findAny()
                .orElse("n/a");
        System.out.println("findAny() -> " + anyNameStartsWithAn);

        // findFirst
        String anyNameStartsWithAn2 = names.parallelStream()
                .filter(name -> name.startsWith("An"))
                .findAny()
                .orElse("n/a");
        System.out.println("parallel findAny() -> " + anyNameStartsWithAn2);

        String firstNameStartsWithAn = names.parallelStream()
                .filter(name -> name.startsWith("An"))
                .findFirst()
                .orElse("n/a");
        System.out.println("parallel findFirst() -> " + firstNameStartsWithAn);

        System.out.println(" ---- ");
        // anyMatch
        boolean hasNameWithDé = names.stream().anyMatch(name -> name.contains("dé"));
        System.out.println("Van név, amiben szerepel 'dé'? " + hasNameWithDé);

        // allMatch
        boolean allStartsWithA = names.stream().allMatch(name -> name.startsWith("A"));
        System.out.println("Mindegyik név A-val kezdődik? " + allStartsWithA);

        // noneMatch
        boolean noneHasX = names.stream().noneMatch(name -> name.contains("x"));
        System.out.println("Egyik névben sem szerepel 'x'? " + noneHasX);

    }

}
