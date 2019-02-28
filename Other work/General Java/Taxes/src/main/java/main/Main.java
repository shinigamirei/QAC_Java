package main;

public class Main {

	public static void main(String[] args) {
		Taxes taxManager = new Taxes();
		
		System.out.println(taxManager.taxAmount(30000));
		System.out.println(taxManager.taxAmount(23500));

	}

}
