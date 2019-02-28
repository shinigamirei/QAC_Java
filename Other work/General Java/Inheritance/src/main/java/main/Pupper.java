package main;

public class Pupper extends Animal {

	public Pupper(String nam) {
		this.sound = "bork";
		this.eyes = 2;
		this.limbs = 4;
		this.size = "Teeny";
		this.name = nam;
		this.species = "lilDoggo";
	}
	 public void howFloof() {
		 System.out.println(name + " is verr floof");
	 }
}
