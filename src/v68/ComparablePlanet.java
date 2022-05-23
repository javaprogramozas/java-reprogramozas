package v68;

import v43.Planet;
import v43.Star;

import java.io.Serializable;

public class ComparablePlanet extends Planet implements Comparable<ComparablePlanet>, Serializable {

    public ComparablePlanet(String name, Star belongsTo) {
        super(name, belongsTo);
    }

    @Override
    public int compareTo(ComparablePlanet other) {
        return getName().compareTo(other.getName());
    }
}
