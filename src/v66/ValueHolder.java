package v66;

public class ValueHolder {

    private Object value;

    public ValueHolder() {
    }

    public ValueHolder(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean hasValue() {
        return value != null;
    }
}
