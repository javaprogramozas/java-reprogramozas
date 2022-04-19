package v51;

import v39.Animal;

public final class Cat extends Animal {

    private final String sound;

    public Cat(String name) {
        this(name, "Meow");
    }

    public Cat(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public final void makeSound() {
        System.out.println("Cat says: " + sound);
    }

    public static String callWord() {
        return "Pspspspsps";
    }

    @Override
    public String toString() {
        return getName();
    }
}
