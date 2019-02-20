package main;

public class Animal {
	
	int limbs;
	int eyes;
	String sound;
	String size;
	String name;
	String species;
	
	public String makeSound() {
		return(name + " goes " + sound);
	}
	
	public String howBig() {
		return size;
	}
	
	public String identifyAnimal() {
		return name;
		
	}
	
}
