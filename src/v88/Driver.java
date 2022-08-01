package v88;

import java.util.Objects;

public class Driver {

	public static final Driver NOBODY = new Driver("Nobody");
	
	private final String name;

	public Driver(String name) {
		this.name = Objects.requireNonNull(name, "Name is mandatory!");
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
