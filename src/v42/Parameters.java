package v42;

import v39.Animal;

public class Parameters {

    public static void main(String[] args) {
        int apple = 5;
        int cherry = 10;

        printSum(apple, cherry);
        System.out.println("apple = " + apple + ", cherry = " + cherry);

        Animal rex = new Animal("Rex", 5);
        introduce(rex);
        System.out.println(rex.getName() + " weighs " + rex.getWeight());

        Animal zeus = createAnimal("Zeus", 50);
        System.out.println(zeus.getName() + " weighs " + zeus.getWeight());

        int sum = add(apple, cherry);
        System.out.println(sum);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        a = 100;
        System.out.println(a + " + " + b + " = " + sum);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void introduce(Animal animal) {
        //animal = new Animal("Pluto", 100);
        System.out.println("Hello " + animal.getName() + ", your weight is " + animal.getWeight());
        animal.setWeight(100);
    }

    public static Animal createAnimal(String name, int weight) {
        Animal animal = new Animal(name, weight);
        System.out.println("Created a new animal: " + animal.getName() + ", weight " + animal.getWeight());
        return animal;
    }

}
