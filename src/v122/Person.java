package v122;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringJoiner;

public abstract class Person {

    private String name;
    private LocalDate dateOfBirth;
    private String someRandomString;

    protected Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.someRandomString = MemoryLeakDemo.randomString(100);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getAge(LocalDate today) {
        return ChronoUnit.YEARS.between(dateOfBirth, today);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("dateOfBirth=" + dateOfBirth)
                .add("random=" + someRandomString)
                .toString();
    }
}
