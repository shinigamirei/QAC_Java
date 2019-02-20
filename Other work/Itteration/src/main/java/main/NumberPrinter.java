package main;

public class NumberPrinter {

	String toPrint;
	String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
			"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "eighteen", "Nineteen" };
	String[] tens = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	public void oneToTen() {
		for (int i = 0; i < 10; i++)
			System.out.println(i + 1);
	}

	public void hunderedToNineNineNine() {
		for (int i = 100; i < 1000; i++)
			System.out.println(i);
	}

	public void oneToTenWords() {
		this.bigDaddyWords(10);
	}

	public void oneToHundredWords() {
		this.bigDaddyWords(101);
	}

	public void oneToThousandWords() {
		this.bigDaddyWords(1001);
	}

	private void bigDaddyWords(int cap) {
		for (int i = 0; i < cap; i++) {
			if (i > 99 && i % 100 > 19) {// hundreds except teens
				System.out.println(units[i / 100] + " hundred" + tens[i / 10 % 10] + units[i % 10]);
			} else if (i > 99) {// hundreds with teens
				System.out.println(units[i / 100] + " hundred" + units[i % 10]);
			} else if (i < 20) {// teens
				System.out.println(units[i]);
			} else {// units between 20 and 100
				System.out.println(tens[i / 10] + " " + units[i % 10]);
			}
		}
	}
}
