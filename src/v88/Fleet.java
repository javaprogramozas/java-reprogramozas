package v88;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fleet {

	private final Map<String, Truck> trucks = new HashMap<>();

	public void addTruck(Truck truck) {
		trucks.putIfAbsent(truck.getLicencePlate(), truck);
	}
	
	public Truck getTruck(String licensePlate) {
		return trucks.get(licensePlate);
	}
	
	public Set<Truck> allTrucks() {
		return Set.copyOf(trucks.values());
	}
	
	@Override
	public String toString() {
		return trucks.toString();
	}
}
