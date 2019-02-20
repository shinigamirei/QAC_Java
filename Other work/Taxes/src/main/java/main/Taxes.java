package main;

public class Taxes {

	public double taxPercent(double salary) {
		if (salary < 15000)
			return 0;
		else if (salary >= 15000 && salary < 20000)
			return 10;
		else if (salary >= 20000 && salary < 30000)
			return 15;
		else if (salary >= 30000 && salary < 45000)
			return 20;
		else
			return 25;
	}

	public double taxAmount(double salary) {

		double result = (salary / 100) * this.taxPercent(salary);
		return result;
	}

}
