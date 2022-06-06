package v76;

import v73.Person;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {
        Person kati = Person.person("Kati", 22);
        Person mari = Person.person("Mari", 22);
        Person peti = Person.person("Peti", 31);
        Person laci = Person.person("Laci", 33);

        Deque<Person> people = new LinkedList<>();

        people.add(kati);
        people.addFirst(peti);
        people.offer(laci);
        people.offerFirst(mari);

        System.out.println(people);

        for (int i = 0; i < 4; i++) {
            System.out.println(people.removeLast());
        }

        System.out.println("Üres? " + people.isEmpty());
        System.out.println(people.poll());

        people.push(kati);
        people.push(peti);
        people.push(laci);
        people.push(mari);

        System.out.println(people);

        for (int i = 0; i < 4; i++) {
            System.out.println(people.pop());
        }

        people.pop();
    }
}
