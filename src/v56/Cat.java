package v56;

import java.util.StringJoiner;

public class Cat implements Feedable {
    
    private final String name;
    
    private double fullness;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void feed(String food, double amount) {
        double multiplier = switch (food) {
            case "catfood" -> 1;
            case "junk" -> 1.5;
            case "treats" -> 1.2;
            default -> 1;
        };
        fullness += amount * multiplier;
    }

    @Override
    public double fullness() {
        return fullness;
    }

    @Override
    public boolean isFull() {
        return fullness > 50;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("fullness=" + fullness)
                .toString();
    }

    public static void doSomething() {
        System.out.println("Something!");
    }
}
