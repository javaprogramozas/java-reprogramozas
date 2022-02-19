package v43;

public class Star extends CelestialBody {

    private String phase;

    private double coreTemperature;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public double getCoreTemperature() {
        return coreTemperature;
    }

    public void setCoreTemperature(double coreTemperature) {
        this.coreTemperature = coreTemperature;
    }

    @Override
    public String description() {
        return super.description() + " is a " + phase + " star";
    }
}
