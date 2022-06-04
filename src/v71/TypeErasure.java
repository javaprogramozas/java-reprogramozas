package v71;

import v43.Planet;
import v43.SolarBody;
import v43.Star;
import v67.Box;

public class TypeErasure {

    public static void main(String[] args) {
        Star sun = new Star("Nap", "fő sorozati");
        SolarBody solarBody = new SolarBody("<solar body>", null);
        Planet earth = new Planet("Föld", sun);

        Box<SolarBody> solarBodyBox = new Box<>(solarBody);
        Box<Planet> planetBox = new Box<>(earth);
        Box box = new Box();

        SolarBody unbox = unbox(solarBodyBox);
        Planet unbox1 = unbox(planetBox);
        SolarBody solarBody1 = unboxSolarBody(solarBodyBox);
        SolarBody solarBody2 = unboxSolarBody(planetBox);

        Box<String> stringBox = createBox();
        bridgeMethod();
    }

    private static <X extends SolarBody> X unbox(Box<X> box) {
        X body = box.getValue();
        System.out.printf("A %s bolygó körül %d hold kering%n", body.getName(), body.getNumberOfMoons());
        return body;
    }

    private static SolarBody unboxSolarBody(Box<? extends SolarBody> box) {
        SolarBody body = box.getValue();
        System.out.printf("A %s bolygó körül %d hold kering%n", body.getName(), body.getNumberOfMoons());
        return body;
    }

    private static <T> Box<T> createBox() {
        return new Box<>();
    }

    private static void bridgeMethod() {
        IntBox intBox = new IntBox();
        Box box = intBox;
        box.setValue("halló");

        Integer value = intBox.getValue();
        System.out.println(value);
    }

}
