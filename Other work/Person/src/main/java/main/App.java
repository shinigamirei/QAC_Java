package main;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static Person findPerson(String name, List<Person> list) {
		for (Person person : list) {
			if (person.getName().equals(name)) {
				return person;
			}				
		}
		return null;
	}
	public static void main(String[] args) {
		List <Person> people = new ArrayList<Person>();
		Person dave = new Person("Dave",21,"Floor manager at CHS Fabrics");
		Person jonathan = new Person("Jonathan",21,"Head of HR");
		Person johnny = new Person("Johnny",21,"CTO of Bespoke Software Soulitions");
		Person kyle = new Person("Kyle",27,"Technical advisor at Bespoke Software Solutions");
		Person dan = new Person("Dan",21,"CEO at Bespoke Software Solutioins");
		people.add(dave);
		people.add(jonathan);
		people.add(johnny);
		people.add(kyle);
		people.add(dan);
		
		people.stream().forEach(x ->System.out.println(x.toString()));
		System.out.println(findPerson("Dave",people).toString());
	}
}
