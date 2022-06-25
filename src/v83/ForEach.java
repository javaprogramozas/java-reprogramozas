package v83;

import v73.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ForEach {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 12);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);
        Person dani = Person.person("Dani", 17);
        Person zoli = Person.person("Zoli", 38);

        Set<Person> people = Set.of(kati, peti, laci, dani, zoli);
        Set<Person> modifiablePeople = new HashSet<>(people);

//        Iterator<Person> iterator = people.iterator();
//        while (iterator.hasNext()) {
//            Person person = iterator.next();
//            System.out.println(person);
//        }

        for (Person person : modifiablePeople) {
            System.out.println(person);
        }

        String[] words = {"alma", "körte", "banán"};
        for (String word : words) {
            System.out.println(word);
        }

    }

}
