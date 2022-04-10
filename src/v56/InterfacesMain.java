package v56;

public class InterfacesMain {

    public static void main(String[] args) {
        Cat cat = new Cat("Sziamiaú");
        cat.feed(Feedable.TREATS_NAME, 35);
        System.out.println(cat);
        System.out.println("Full? " + cat.isFull());
        Feedable.begForFood(cat);

        cat.doSomething();
    }

}
