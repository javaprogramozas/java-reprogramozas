package v122;

import java.time.LocalDate;
import java.util.Objects;

public class ProperPerson extends Person {
    public ProperPerson(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
