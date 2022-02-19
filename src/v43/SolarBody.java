package v43;

public class SolarBody extends CelestialBody {

    private Star belongsTo;

    private int numberOfMoons;

    public Star getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(Star belongsTo) {
        this.belongsTo = belongsTo;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }
}
