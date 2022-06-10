package v78;

import java.util.Objects;

public class Id {

    private final String value;

    private Id(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id id = (Id) o;
        return value.equals(id.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public static Id id(String value) {
        return new Id(value);
    }
}
