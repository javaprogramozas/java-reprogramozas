package v68;

import v43.SolarBody;

import java.io.Serializable;

public class Box<T extends SolarBody & Serializable & Comparable<T>> {

    private T value;

    public Box() {
    }

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean hasValue() {
        return value != null;
    }

    @Override
    public String toString() {
        return hasValue() ? value.description() : "null";
    }
}
