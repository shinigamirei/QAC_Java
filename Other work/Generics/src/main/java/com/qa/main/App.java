package com.qa.main;

public class App {
	public static void main(String[] args) {
		Animal cow = new Animal("Cow");
		Cage<Animal> cage1 = new Cage<Animal>();
		cage1.insert(cow);
		System.out.println(cage1.get().type);
		
		Fruit apple = new Fruit("apple");
		Cage<Fruit> cage2 = new Cage<Fruit>();
		cage2.insert(apple);
		System.out.println(cage2.get().type);
	}
}
