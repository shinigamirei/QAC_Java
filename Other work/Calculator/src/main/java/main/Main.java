package main;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.calculate(5, 7, "+"));
		System.out.println(calculator.calculate(7, 2, "-"));
		System.out.println(calculator.calculate(3, 6, "*"));
		System.out.println(calculator.calculate(3, 4, "/"));
	}
}
