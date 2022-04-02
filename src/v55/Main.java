package v55;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Drone drone = new Drone();
        drone.takeOff(5);

        move(car);
        move(drone);

        System.out.println(car);
        System.out.println(drone);
    }

    private static void move(Movable movable) {
        movable.moveTo(10, 10);
    }
}
