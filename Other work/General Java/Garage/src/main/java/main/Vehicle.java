package main;

public abstract class Vehicle {
	private int wheels;
	private String colour;
	private int doors;
	private boolean engineOn;
	private String name;
	private int initialValue;
	private VehicleType vehicleType;
	
	public Vehicle(String name, int wheels,String colour,int doors, int initialValue, VehicleType vehicleType) {
		this.name = name;
		this.wheels = wheels;
		this.doors = doors;
		this.colour = colour;
		this.setVehicleType(vehicleType);
		this.setInitialValue(initialValue);
		
	}
	
	public abstract void move();
	public abstract void start();
	public int calculateBill(DamageLevel damage) {
		if (damage == DamageLevel.TOTALLED) {
			System.out.println("Just buy a new one...");
			return this.getInitialValue();		
		} else if (damage == DamageLevel.UNDAMAGED) {
			System.out.println("its not damaged you nonce");
		} else {
			int total = (damage.ordinal() * 20 * (this.getInitialValue()/100)) + 25 * damage.ordinal();
			return total;
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [Name = " + name + ", wheels=" + wheels + ", colour=" + colour + ", doors=" + doors
				+ ", engineOn=" + engineOn + ", name=" + name + ", initialValue=" + initialValue + "]";
	}

	public boolean getEngineOn() {
		return engineOn;
	}
	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}
