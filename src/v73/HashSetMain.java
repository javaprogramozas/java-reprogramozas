package v73;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 22);
        Person kati2 = Person.person("Kati", 22);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);

        Set<Person> people = new HashSet<>();

        System.out.println("Méret: " + people.size() + ", üres? " + people.isEmpty());

        people.add(kati);
        people.add(kati2);
        people.add(peti);
        System.out.println(people);
        System.out.println("Méret: " + people.size() + ", üres? " + people.isEmpty());

        System.out.println("Peti benne van? " + people.contains(Person.person("Peti", 31)));
        System.out.println("Laci benne van? " + people.contains(laci));

        people.remove(peti);
        people.remove(laci);
        System.out.println(people);
        System.out.println("Méret: " + people.size() + ", üres? " + people.isEmpty());

        Person[] p = new Person[10];
        Person[] peopleArray = people.toArray(p);
        System.out.println(p);
        System.out.println(peopleArray);
        System.out.println(Arrays.toString(peopleArray));
    }
}
