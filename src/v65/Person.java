package v65;

import java.time.LocalDate;
import java.util.Objects;

public record Person(String name, int age) implements Comparable<Person> {

    public static final int ADULT_AGE = 18;

    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative");
        }
    }

    public Person(String name) {
        this(name, 0);
    }

    public int yearOfBirth() {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(age, other.age);
    }

    public static int getCount() {
        return 0;
    }
}
