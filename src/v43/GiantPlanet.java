package v43;

public class GiantPlanet extends SolarBody {

    private String type;

    public GiantPlanet(String name, Star belongsTo) {
        super(name, belongsTo);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
