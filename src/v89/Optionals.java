package v89;

import v88.Driver;
import v88.Truck;

import java.util.Optional;
import java.util.function.Consumer;

public class Optionals {

    public static void main(String[] args) {

        Driver jane = new Driver("Jane Doe");
        Driver john = null;

        Optional<Driver> emptyDriver = Optional.empty();
        Optional<Driver> setDriver = Optional.of(jane); // ellenőrzésre kerül, hogy a paraméter nem null érték
        Optional<Driver> optionalDriver = Optional.ofNullable(john);

		if (optionalDriver.isPresent()) {
			System.out.println("Driver is present with name " + optionalDriver.get().getName());
		} else {
			System.out.println("There is not present");
		}

        if (optionalDriver.isEmpty()) {
            System.out.println("Driver optional is empty");
        } else {
            System.out.println("Driver optional is *not* empty, but contains: " + optionalDriver.get());
        }

        //emptyDriver.get(); // ne használjuk isPresent() hívás nélkül
        //setDriver.orElseThrow(); // felhívjuk az olvasó figyelmét, hogy tudjuk mit csinálunk
        //optionalDriver.orElseThrow(() -> new IllegalStateException("Driver must be set!"));

        Consumer<Driver> driverNameWriter = driver -> System.out.println("Driver's name: " + driver.getName());
        setDriver.ifPresent(driverNameWriter);
        emptyDriver.ifPresentOrElse(driverNameWriter, () -> System.out.println("No driver present"));

        System.out.println();
        Optional<Driver> orXXXDriver = setDriver;
        System.out.println("orElse() --> " + orXXXDriver.orElse(defaultDriver()));
        System.out.println("orElseGet() --> " + orXXXDriver.orElseGet(() -> defaultDriver()));
        Optional<Driver> eitherOrDriver = orXXXDriver.or(() -> Optional.ofNullable(defaultDriver()));
        System.out.println("or() --> " + eitherOrDriver);
        System.out.println();

        Optional<Driver> testDriver = emptyDriver;

        // Filter
        Optional<Driver> filtered = testDriver.filter(driver -> driver.getName().startsWith("J"));
        System.out.println("Contains driver with name J... -> " + filtered);

        // Map
        Optional<String> optionalName = testDriver.map(driver -> driver.getName());
        System.out.println("Optional(name) -> " + optionalName);

        // Flatmap
        String name = someTruck()
                .flatMap(truck -> truck.getDriver())
                .map(driver -> driver.getName())
                .orElse("Nobody");

        // Stream
        long itemsInStream = emptyDriver.stream().count();
        System.out.println("Item count: " + itemsInStream);

        // Hol használhatunk Optional típust?
        // - lokális változó
        // - metódus visszatérési típusa
        useLikeThis(john);
    }

    public static Driver defaultDriver() {
        System.out.println(" *** default driver called ***");
        return new Driver("default");
    }

    public static Optional<Truck> someTruck() {
        Truck truck = new Truck("ABC-123");
        truck.setDriver(new Driver("Tony"));
        return Optional.of(truck);
    }

    public static void useLikeThis(Driver driver) {
        Optional.ofNullable(driver).ifPresent(d -> System.out.println(d.getName()));
    }
}
