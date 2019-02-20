package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private List<Vehicle> storedVehicles;

	public Garage() {
		storedVehicles = new ArrayList<Vehicle>();
	}

	public void addVehicle(Vehicle veh) {
		storedVehicles.add(veh);
	}

	public void removeVehicle(String name) {
		storedVehicles = storedVehicles.stream().filter(x -> x.getName() != name).collect(Collectors.toList());
	}
	
	public void removeVehicle(VehicleType vehicleType) {
		storedVehicles = storedVehicles.stream().filter(x -> x.getVehicleType() != vehicleType).collect(Collectors.toList());
	}


	public void emptyGarage() {
		storedVehicles.clear();
	}

	public void printContents() {
		for (Vehicle vehicle : storedVehicles) {
			System.out.println(vehicle.toString());
		}
	}
}
