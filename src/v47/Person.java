package v47;

import java.util.Objects;
import java.util.StringJoiner;

public class Person {

    private String name;

    private String profession;

    private int yearOfBirth;

    public Person(String name, String profession, int yearOfBirth) {
        this.name = name;
        this.profession = profession;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("profession='" + profession + "'")
                .add("yearOfBirth=" + yearOfBirth)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }
}
