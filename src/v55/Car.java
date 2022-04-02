package v55;

import java.util.StringJoiner;

public class Car implements Movable {
    private int x, y;

    private boolean engineOn;

    public void start() {
        engineOn = true;
    }

    public void stop() {
        engineOn = false;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .add("engineOn=" + engineOn)
                .toString();
    }

    @Override
    public void moveTo(int x, int y) {
        if (engineOn) {
            System.out.printf("Megyünk a (%d, %d) helyre%n", x, y);
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Álló motorral nem lehet mozogni");
        }
    }
}
