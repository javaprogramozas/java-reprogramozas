package v88;

import java.util.Optional;

/*
Defenzív technikák:
 - null ellenőrzés metódushivatkozások előtt
 - "guard" objektumok használata
 - null értékek kizárása példányváltozók esetén
 - statikus kódelemzők, futásidejű ellenőrzések
 - Optionals használata
 */
public class FleetControl {

	public static void main(String[] args) {
		Truck uaz = new Truck("ABC-123");
		Truck man = new Truck("DEF-456");
		
		Driver john = new Driver("John Doe");
		uaz.setDriver(john);
		
		Fleet fleet = new Fleet();
		fleet.addTruck(uaz);
		fleet.addTruck(man);
		
		whoIsDrivingWith(fleet, "ABC-123");
		whoIsDrivingWith(fleet, "DEF-456");
		whoIsDrivingWith(fleet, "XYZ-123");
		System.out.println("----");
		listDrivers(fleet);
	}
	
	public static void listDrivers(Fleet fleet) {
		for (Truck truck : fleet.allTrucks()) {
			if (truck.getDriver().isPresent()) {
				System.out.println(truck.getDriver().get().getName());
			}
		}
	}
	
	public static void whoIsDrivingWith(Fleet fleet, String licensePlate) {
		if (fleet.getTruck(licensePlate) != null) {
			String name = fleet.getTruck(licensePlate).getDriver()
					.map(driver -> driver.getName())
					.orElse("Nobody");
			System.out.println(name);
		} else {
			System.out.println("No truck with " + licensePlate);
		}
	}

}
