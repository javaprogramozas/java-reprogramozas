package v55;

import java.util.StringJoiner;

public class Drone implements Flying, Movable {

    private int x, y, z;

    @Override
    public String toString() {
        return new StringJoiner(", ", Drone.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .add("y=" + y)
                .add("z=" + z)
                .toString();
    }

    @Override
    public void takeOff(int height) {
        this.z = height;
    }

    @Override
    public void land() {
        this.z = 0;
    }

    @Override
    public void moveTo(int x, int y) {
        if (z > 0) {
            System.out.printf("Repülünk a (%d, %d) helyre%n", x, y);
            this.x = x;
            this.y = y;
        } else {
            System.out.println("A földön nem tudunk mozogni");
        }
    }
}
