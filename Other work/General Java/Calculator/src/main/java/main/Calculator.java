package main;

public class Calculator {

	public double calculate(double a, double b, String c) {

		double result;

		switch (c) {
		case "+":
			result = a + b;
			return result;

		case "-":
			result = a - b;
			return result;

		case "*":
			result = a * b;
			return result;

		case "/":
			if (a < b) {
				result = a / b;
				return result;
			} else
				System.out.println("division cannot be performed");
			return 0;
		}
		return 0;
	}
}
