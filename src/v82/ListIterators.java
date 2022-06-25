package v82;

import v73.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 12);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);
        Person dani = Person.person("Dani", 17);
        Person zoli = Person.person("Zoli", 38);

        List<Person> people = List.of(kati, peti, laci, dani, zoli);
        List<Person> modifiablePeople = new ArrayList<>(people);

        ListIterator<Person> iterator = modifiablePeople.listIterator(people.size());

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals("Laci")) {
                iterator.set(Person.person("Anna", 1));
            }
            System.out.println(person.getName());
        }
        System.out.println(modifiablePeople);
        System.out.println("---");
        while (iterator.hasPrevious()) {
            Person person = iterator.previous();
            System.out.println(person.getName());
        }
    }
}
