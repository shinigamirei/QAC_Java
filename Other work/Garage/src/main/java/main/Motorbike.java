package main;

public class Motorbike extends Vehicle {

	public Motorbike(String name, String colour, int initialValue) {
		super(name, 2, colour, 0, initialValue,VehicleType.MOTORBIKE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {

	}

	@Override
	public void start() {
		System.out.println("you do the thing that starts motorbikes ");
		this.setEngineOn(true);
	}

}
