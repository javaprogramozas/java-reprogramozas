package v43;

import java.io.IOException;

public class CelestialBody {

    private String name;

    public CelestialBody(String name) {
        this.name = name;
        init();
    }

    private void init() {
        System.out.println("Celestial body initialized!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String description() {
        return name;
    }

    protected CelestialBody calculateVelocity() throws IOException {
        return null;
    }
}
