package v41;

import v39.Animal;

public class References {

    public static void main(String[] args) {
        int apple = 5;
        int cherry = 10;
        System.out.println("apple = " + apple + ", cherry = " + cherry);

        apple = cherry;
        System.out.println("apple = " + apple + ", cherry = " + cherry);

        cherry = 20;
        System.out.println("apple = " + apple + ", cherry = " + cherry);

        // ---------------
        System.out.println();

        Animal rex = new Animal("Rex", 5);
        Animal pluto = new Animal("Pluto", 10);
        System.out.println(rex.getName() + " weighs " + rex.getWeight() + ", "
                + pluto.getName() + " weighs " + pluto.getWeight());

        rex = pluto;
        System.out.println(rex.getName() + " weighs " + rex.getWeight() + ", "
                + pluto.getName() + " weighs " + pluto.getWeight());

        pluto.setWeight(20);
        System.out.println(rex.getName() + " weighs " + rex.getWeight() + ", "
                + pluto.getName() + " weighs " + pluto.getWeight());
    }

}
