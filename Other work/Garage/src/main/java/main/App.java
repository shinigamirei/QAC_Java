package main;

public class App {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Car pergeot = new Car("the 106","red",5000);
		pergeot.calculateBill(DamageLevel.UNDAMAGED);
		pergeot.calculateBill(DamageLevel.TOTALLED);
		System.out.println(pergeot.calculateBill(DamageLevel.HEAVY));
		garage.addVehicle(pergeot);
		Motorbike kawasaki = new Motorbike("Kawasaki","Green", 4000);
		garage.addVehicle(kawasaki);
		Car myCar = new Car("MY CAR!","Silver", 7500);
		garage.addVehicle(myCar);
		
		myCar.start();
		garage.printContents();
		garage.removeVehicle(VehicleType.CAR);
		garage.printContents();
	}

}
