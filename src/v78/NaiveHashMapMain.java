package v78;

import v73.Person;

public class NaiveHashMapMain {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 22);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);
        Person dani = Person.person("Dani", 42);

        NaiveHashMap<Id, Person> people = new NaiveHashMap<>();

        people.put(Id.id("A"), kati);
        people.put(Id.id("B"), peti);
        people.put(Id.id("C"), laci);
        people.put(Id.id("D"), dani);

        System.out.println(people);

        people.put(Id.id("A"), Person.person("Kálmán", 32));
        System.out.println(people);

        System.out.println("A -> " + people.get(Id.id("A")));
        System.out.println("X -> " + people.get(Id.id("X")));
    }
}
