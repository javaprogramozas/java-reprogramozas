package v56;

public interface Feedable {

    String TREATS_NAME = "treats";

    void feed(String food, double amount);

    double fullness();

    default boolean isFull() {
        return fullness() > 100.0;
    }

    static void begForFood(Feedable feedable) {
        if (!feedable.isFull()) {
            System.out.println("Give me more food!");
        }
    }
}
