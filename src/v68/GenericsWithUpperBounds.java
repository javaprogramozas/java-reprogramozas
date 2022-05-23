package v68;

import v43.GiantPlanet;
import v43.Planet;
import v43.SolarBody;
import v43.Star;

public class GenericsWithUpperBounds {

    public static void main(String[] args) {

        Star sun = new Star("Nap", "fő sorozati");
        SolarBody solarBody = new SolarBody("<solar body>", null);
        Planet earth = new Planet("Föld", sun);
        ComparablePlanet mars = new ComparablePlanet("Mars", sun);
        GiantPlanet jupiter = new GiantPlanet("Jupiter", sun);

        //Box<Star> starBox = new Box<>(sun);
        //Box<SolarBody> solarBodyBox = new Box<>(solarBody);
        //Box<Planet> planetBox = new Box<>(earth);
        //Box<GiantPlanet> giantPlanetBox = new Box<>(jupiter);
        Box<ComparablePlanet> comparablePlanetBox = new Box<>(mars);

        //System.out.println(starBox);
        //System.out.println(solarBodyBox);
        //System.out.println(planetBox);
        //System.out.println(giantPlanetBox);
        System.out.println(comparablePlanetBox);
    }

}
