package v75;

import v73.Person;
import v74.PersonComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 22);
        Person kati2 = Person.person("Kati", 22);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);

        List<Person> people = new ArrayList<>();

        System.out.println("Méret: " + people.size() + ", üres? " + people.isEmpty());

        people.add(kati);
        people.add(kati2);
        people.add(peti);
        people.add(kati);
        people.add(4, laci);
        people.add(null);

        System.out.println(people);

        people.set(1, Person.person("Anna", 1));
        System.out.println(people);

        System.out.println("Peti benne van? " + people.contains(Person.person("Peti", 31)));
        System.out.println("Kálmán benne van? " + people.contains(Person.person("Kálmán", 31)));
        System.out.println("'null' benne van? " + people.contains(null));

        System.out.println("Peti indexe: " + people.indexOf(Person.person("Peti", 31)));
        System.out.println("Kálmán indexe: " + people.indexOf(Person.person("Kálmán", 31)));
        System.out.println("Kati (első) indexe: " + people.indexOf(kati));
        System.out.println("Kati (utolsó) indexe: " + people.lastIndexOf(kati2));

        people.remove(peti);
        people.remove(Person.person("Kálmán", 31));
        people.remove(4);
        System.out.println(people);

        Person[] peopleArray = people.toArray(new Person[0]);
        System.out.println(Arrays.toString(peopleArray));

        people.sort(new PersonComparator());
        System.out.println(people);

        List<Person> subList = people.subList(1, 3);
        System.out.println(subList);
        subList.add(2, Person.person("Máté", 1));
        System.out.println(subList);
        System.out.println(people);
    }

}
