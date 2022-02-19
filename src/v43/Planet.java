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
        return super.description() + " is a planet, belongs to " + getBelongsTo().getName();
    }
}
