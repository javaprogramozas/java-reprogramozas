package v39;

import java.io.Serializable;

public class Animal implements Serializable {

    private String name;

    private int weight;

    private double velocity;

    private boolean full;

    public Animal() {
    }

    public Animal(String name) {
        this(name, 0);
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void introduceSelf() {
        System.out.println("My name is " + this.getName());
    }

    public static void calculateSomething() {
        // HIBÁS!
        // this.weight = 5;
        System.out.println("Animal calculates something");
    }
}
