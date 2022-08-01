package v88;

import java.util.Objects;
import java.util.Optional;

public class Truck {

	private final String licencePlate;
	
	private Driver driver;

	public Truck(String licencePlate) {
		this.licencePlate = Objects.requireNonNull(licencePlate, "Licence plate is mandatory for a truck!");
	}

	public Optional<Driver> getDriver() {
		return Optional.ofNullable(driver);
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getLicencePlate() {
		return licencePlate;
	}
	
	@Override
	public String toString() {
		String driverName = driver != null ? "(" + driver.getName() + ")" : "";
		return "Truck [" + licencePlate + "] " + driverName;
	}
	
}
