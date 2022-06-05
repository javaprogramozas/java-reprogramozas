package v74;

import v73.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getName().equals(person2.getName())) {
            return Integer.compare(person1.getAge(), person2.getAge());
        }
        return person1.getName().compareTo(person2.getName());
    }
}
