package main;

public class Person {
	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		String formattedString = (name + " is " + age + " years old and their job is " + jobTitle);
		return formattedString;
	}
	
	public String getName() {
		return this.name;
	}
}
