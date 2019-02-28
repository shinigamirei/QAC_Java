package main;

public class StringChecker {
	private String hardcoded = "test";

	public boolean checkHardcoded(String check) {
		if (check.equals(hardcoded))
			System.out.println("your sting matched the hardcoded one");
		else
			System.out.println("lol no");
		return false;
	}

	public boolean checkStrings(String a, String b) {

		if (a.equals(b)) {
			System.out.println("yup they're the same");
		}
		else 
			System.out.println("LolNo");
		return false;
	}
}
