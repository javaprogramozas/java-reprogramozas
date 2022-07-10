package v84;

import v73.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousExamples {

    public static void main(String[] args) {

        List<Person> people = createPeople();

        Comparator<? super Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        people.sort(ageComparator);
        System.out.println(people);

        String prefix = "Hello "; // effective final
        Person myPerson = new Person("Anonymous", 0) {

            @Override
            public String toString() {
                return prefix + getName().toUpperCase();
            }
        };

        System.out.println(myPerson);
    }

    public static List<Person> createPeople() {
        Person kati = Person.person("Kati", 12);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);
        Person dani = Person.person("Dani", 17);
        Person zoli = Person.person("Zoli", 38);

        List<Person> people = new ArrayList<>();

        people.add(kati);
        people.add(peti);
        people.add(laci);
        people.add(dani);
        people.add(zoli);

        return people;
    }
}
