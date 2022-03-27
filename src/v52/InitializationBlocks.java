package v52;

public class InitializationBlocks {

    public static void main(String[] args) {
        //System.out.println("CONSTANT = " + Parent.CONSTANT);
        //System.out.println("Instantiate new parent");
        //Parent parent = new Parent("alpha", 200);
        //System.out.println(parent);

        Child child = new Child("beta", 150);
        System.out.println(child);
        System.out.println("---------------");
        Child child2 = new Child("gamma", 150);
        System.out.println(child2);
    }

}
