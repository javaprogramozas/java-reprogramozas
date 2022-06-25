package v81;

import v73.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterators {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 12);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);
        Person dani = Person.person("Dani", 17);
        Person zoli = Person.person("Zoli", 38);

        Set<Person> people = Set.of(kati, peti, laci, dani, zoli);
        Set<Person> modifiablePeople = new HashSet<>(people);

        Iterator<Person> iterator = modifiablePeople.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() >= 18) {
                iterator.remove();
            }
        }

        System.out.println(modifiablePeople);

        iterator = people.iterator();
        double sumOfAge = 0;
        while (iterator.hasNext()) {
            Person person = iterator.next();
            sumOfAge += person.getAge();
        }
        System.out.println("Average age: " + (sumOfAge / people.size()));

        Map<String, Integer> wordsAndNumbers = Map.of(
                "one", 1,
                "two", 2,
                "three", 3
        );

        Iterator<Integer> valueIterator = wordsAndNumbers.values().iterator();
        Iterator<Map.Entry<String, Integer>> entryIterator = wordsAndNumbers.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println("Key=" + entry.getKey() + ", value=" + entry.getValue());
        }
    }

}
