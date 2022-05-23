package v69;

import v43.CelestialBody;
import v43.GiantPlanet;
import v43.Planet;
import v43.SolarBody;
import v43.Star;
import v67.Box;

public class Wildcards {

    public static void main(String[] args) {

        Star sun = new Star("Nap", "fő sorozati");
        SolarBody solarBody = new SolarBody("<solar body>", null);
        Planet earth = new Planet("Föld", sun);
        GiantPlanet jupiter = new GiantPlanet("Jupiter", sun);

        Box<CelestialBody> celestialBodyBox = new Box<>();
        Box<SolarBody> solarBodyBox = new Box<>(solarBody);
        Box<Planet> planetBox = new Box<>(earth);
        Box<GiantPlanet> giantPlanetBox = new Box<>(jupiter);

        whatsInTheBox(celestialBodyBox);
        whatsInTheBox(planetBox);
        whatsInTheBox(new Box<>("valami"));

        unboxSolarBody(solarBodyBox);
        unboxSolarBody(planetBox);

        Box<? extends SolarBody> suprise = planetBox;
    }

    private static void whatsInTheBox(Box<?> box) {
        if (box.hasValue()) {
            Object value = box.getValue();
            System.out.println("Ebben a dobozban van valami: " + value.getClass().getSimpleName());
        } else {
            System.out.println("Ez a doboz üres");
        }
    }

    private static void unboxSolarBody(Box<? extends SolarBody> box) {
        SolarBody body = box.getValue();
        System.out.printf("A %s bolygó körül %d hold kering%n", body.getName(), body.getNumberOfMoons());
    }

}
