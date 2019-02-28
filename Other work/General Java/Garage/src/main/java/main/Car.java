package main;

public class Car extends Vehicle {

	public Car(String name, String colour, int initialValue) {
		super(name, 4, colour, 4, initialValue,VehicleType.CAR);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		System.out.println("you turn the key and the car starts");
		this.setEngineOn(true);
	}
}
