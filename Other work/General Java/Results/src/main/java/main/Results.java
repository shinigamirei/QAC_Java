package main;

import java.util.ArrayList;

public class Results {
	double physics;
	double chemistry;
	double biology;
	double total;
	double percentage;
	ArrayList <String> failPrint = new ArrayList<String>();

	public Results(double a, double b, double c) {
		this.physics = a;
		this.chemistry = b;
		this.biology = c;
		this.total = this.physics + this.chemistry + this.biology;
	}

	public void displayResults() {

		System.out.println("Your Physics mark is: " + this.physics);
		System.out.println("Your Chemistry mark is: " + this.chemistry);
		System.out.println("Your biology mark is: " + this.biology);
		System.out.println("Your Total mark is: " + this.total);
	}

	public void percentDisplay() {

		this.percentage = percentCalc(total, 450);
		System.out.println("Your overall percentage is : " + this.percentage);
		
		if (percentCalc(this.biology, 150) < 60) {
			if (this.failPrint.isEmpty())
				failPrint.add("You have failed:");
			this.failPrint.add(" biology,");
		}

		if (percentCalc(this.physics, 150) < 60) {
			if (this.failPrint.isEmpty())
				failPrint.add("You have failed:");
			this.failPrint.add(" physics,");
		}

		if (percentCalc(this.chemistry, 150) < 60) {
			if (this.failPrint.isEmpty())
				failPrint.add("You have failed:");
			this.failPrint.add(" chemistry,");
		}
		
		if (this.percentage < 60.0) {
			if (this.failPrint.isEmpty())
				failPrint.add("You have failed:");
			this.failPrint.add(" overall");
		}
		
		if (this.failPrint.isEmpty()) {//no fails so this executes
			this.failPrint.add("Congrats on the pass!");
		}
		for (String a : failPrint)
			System.out.printf(a);
	}

	private double percentCalc(double mark, double available) {
		double result = (mark / available) * 100;
		return result;
	}
}
