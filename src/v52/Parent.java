package v52;

public class Parent {

    public static final int CONSTANT;
    public static int ANOTHER_CONSTANT;

    static {
        CONSTANT = 100;
        ANOTHER_CONSTANT = 200;
    }

    {
        System.out.println("Init block");
        parentValue = 100;
    }

    protected String name;

    protected int parentValue;

    public Parent(String name) {
        this(name, 0);
    }

    public Parent(String name, int parentValue) {
        this.name = name;
        this.parentValue = parentValue;
    }

    @Override
    public String toString() {
        return "Parent " + name + " with value " + parentValue;
    }

    public static int initValue(String variableName, int value) {
        System.out.println("Initializing static variable " + variableName);
        return value;
    }
}
