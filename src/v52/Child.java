package v52;

public class Child extends Parent {

    public static final int CHILD_CONSTANT = initValue("CHILD CONSTANT", 100);

    static {
        System.out.println("Child static init block");
        System.out.println("Constant = " + CHILD_CONSTANT);
        System.out.println("Parent constant = " + CONSTANT);
    }

    private int childValue;

    {
        System.out.println("Child init block");
        System.out.println("childValue = " + childValue);
        parentValue = 200;
        childValue = 300;
    }

    public Child(String name) {
        super(name);
    }

    public Child(String name, int parentValue) {
        super(name, parentValue);
        // init block execute
        System.out.println("Child constructor (String, int)");
    }

    @Override
    public String toString() {
        return "Child " + name + " with value " + childValue + " and parent value " + parentValue;
    }
}
