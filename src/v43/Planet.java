package v43;

public class Planet extends SolarBody {

    private boolean lifePresent;

    public boolean isLifePresent() {
        return lifePresent;
    }

    public void setLifePresent(boolean lifePresent) {
        this.lifePresent = lifePresent;
    }

    public String description() {
        return "The " + getName() + " is a planet, belongs to " + getBelongsTo().getName();
    }
}
