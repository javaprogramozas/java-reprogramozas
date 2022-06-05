package v74;

import v73.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMain {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 22);
        Person kati2 = Person.person("Kati", 24);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(kati2);
        people.add(kati);
        people.add(peti);
        people.add(laci);

        System.out.println(people);
        System.out.println("Első: " + people.first());
        System.out.println("Utolsó: " + people.last());

        SortedSet<Person> beforeKalman = people.headSet(Person.person("Kálmán", 33));
        SortedSet<Person> beforeAlma = people.headSet(Person.person("Alma", 33));

        System.out.println("Alma előtt: " + beforeAlma);
        System.out.println("Kálmán előtt: " + beforeKalman);

        SortedSet<Person> afterKalman = people.tailSet(Person.person("Kálmán", 33));
        SortedSet<Person> afterLaci = people.tailSet(laci);

        System.out.println("Kálmán után: " + afterKalman);
        System.out.println("Laci után: " + afterLaci);

        people.add(Person.person("AAA", 0));
        people.add(Person.person("Zoli", 38));

        System.out.println("-----------------");
        System.out.println(people);
        System.out.println("Alma előtt: " + beforeAlma);
        System.out.println("Kálmán előtt: " + beforeKalman);
        System.out.println("Kálmán után: " + afterKalman);
        System.out.println("Laci után: " + afterLaci);
    }
}
