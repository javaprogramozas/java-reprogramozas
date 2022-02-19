package v43;

/**
 *      super class
 *        /   \
 *       /     \
 *  subclass   subclass
 *
 */
public class Inheritance {

    public static void main(String[] args) {

        Star sun = new Star();
        sun.setName("Sun");
        sun.setPhase("main sequence");
        sun.setCoreTemperature(13600000);
        System.out.println(sun.description());

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setBelongsTo(sun);
        earth.setNumberOfMoons(1);
        earth.setLifePresent(true);
        System.out.println(earth.description());

        GiantPlanet jupiter = new GiantPlanet();
        jupiter.setType("gas giant");

    }
}
