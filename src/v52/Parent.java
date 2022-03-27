package v52;

public class Parent {

    static {
        System.out.println("Parent static init block #1");
        //System.out.println(CONSTANT);
        //ANOTHER_CONSTANT = 150;
    }

    public static final int CONSTANT = initValue("parent constant", 100);
    public static int ANOTHER_CONSTANT;// = initValue("parent another constant", 200);

    static {
        System.out.println("Parent static init block #2");
        System.out.println("parent constant = " + CONSTANT);
        System.out.println("parent another constant = " + ANOTHER_CONSTANT);
    }

    {
        System.out.println("Parent init block #1");
        //System.out.println(name);
        parentValue = 100;
    }

    protected String name;

    {
        System.out.println("Parent init block #2");
        System.out.println("name = " + name);
    }

    protected int parentValue;

    {
        System.out.println("Parent init block #3");
        System.out.println("name = " + name);
        System.out.println("parentValue = " + parentValue);
    }

    public Parent(String name) {
        System.out.println("Parent constructor (String)");
        this.name = name;
    }

    public Parent(String name, int parentValue) {
        System.out.println("Parent constructor (String, int)");
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
