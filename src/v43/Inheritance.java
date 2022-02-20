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

        Star sun = new Star("Sun", "main sequence");
        sun.setCoreTemperature(13600000);
        describeCelestialBody(sun);

        Planet earth = new Planet("Earth", sun);
        earth.setNumberOfMoons(1);
        earth.setLifePresent(true);
        describeCelestialBody(earth);

        GiantPlanet jupiter = new GiantPlanet("Jupiter", sun);
        jupiter.setType("gas giant");
        describeCelestialBody(jupiter);
    }

    private static void describeCelestialBody(CelestialBody body) {
        System.out.println(body.description());
        if (body instanceof Planet planet) {
            System.out.println(planet.getName() + " has life: " + planet.isLifePresent());
        }
        if (body.getClass() == SolarBody.class) {
            SolarBody solarBody = (SolarBody) body;
            System.out.println(solarBody.getName() + " has " + solarBody.getNumberOfMoons() + " moons");
        }
    }
}
