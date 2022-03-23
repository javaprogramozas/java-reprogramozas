package v50;

import v39.Animal;
import v43.Star;
import v47.Person;

import java.util.Optional;

public class TheNullValue {

    public static final Person EMPTY = new Person("", "", 0);

    public static void main(String[] args) {
        Star sun = null;
        if (sun != null) {
            System.out.println(sun.description());
        }

        int year = 1930;
        String name = null;
        Person other = null;
        Optional<Person> neil = createAstronaut(null, year);
        if (neil.isPresent()) {
            System.out.println("Name: " + neil.get().getName());
            System.out.println("Length: " + neil.get().getName().length());
        }
        Object o = other;
        if (o instanceof Person p) {
            System.out.println(p.getName());
        }
        Animal dog = null;

    }

    public static Optional<Person> createAstronaut(String name, int year) {
        return Optional.empty();
    }
}
