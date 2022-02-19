package v43;

/**
 *      super class
 *        /   \
 *       /     \
 *  subclass   subclass
 *
 *  polymorphism: "is a" relationship
 */
public class Inheritance {

    public static void main(String[] args) {

        Star sun = new Star();
        sun.setName("Sun");
        sun.setPhase("main sequence");
        sun.setCoreTemperature(13600000);
        //System.out.println(sun.description());
        describeCelestialBody(sun);

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setBelongsTo(sun);
        earth.setNumberOfMoons(1);
        earth.setLifePresent(true);
        //System.out.println(earth.description());
        describeCelestialBody(earth);

        GiantPlanet jupiter = new GiantPlanet();
        jupiter.setName("Jupiter");
        jupiter.setType("gas giant");
        describeCelestialBody(jupiter);

        CelestialBody genericBody = earth;
        System.out.println(genericBody.description());
    }

    private static void describeCelestialBody(CelestialBody body) {
        System.out.println(body.description());
    }
}
