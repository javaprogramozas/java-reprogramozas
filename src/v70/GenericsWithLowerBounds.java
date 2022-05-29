package v70;

import v43.CelestialBody;
import v43.Planet;
import v43.SolarBody;
import v43.Star;
import v67.Box;

public class GenericsWithLowerBounds {

    public static void main(String[] args) {

        Star sun = new Star("Nap", "fő sorozati");
        SolarBody solarBody = new SolarBody("<solar body>", null);
        Planet earth = new Planet("Föld", sun);

        Box<Object> objectBox = new Box<>();
        Box<CelestialBody> celestialBodyBox = new Box<>();
        Box<SolarBody> solarBodyBox = new Box<>(solarBody);
        Box<Planet> planetBox = new Box<>(earth);

        boxSolarBody(objectBox);
        boxSolarBody(celestialBodyBox);
        boxSolarBody(solarBodyBox);
        //boxSolarBody(planetBox);

        CelestialBody value = celestialBodyBox.getValue();
        System.out.println(value.getClass().getName() + ": " + value.description());
    }

    private static void boxSolarBody(Box<? super SolarBody> box) {
        SolarBody body = newSolarBody("unnamed");
        //Planet planet = newPlanet("planet");
        box.setValue(body);
    }

    private static SolarBody newSolarBody(String name) {
        Star star = new Star("star", "n/a");
        return new SolarBody(name, star);
    }

    private static Planet newPlanet(String name) {
        Star star = new Star("planet star", "n/a");
        return new Planet(name, star);
    }

}
