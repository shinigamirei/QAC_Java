package main;

public class Main {

	public static void main(String[] args) {
		StringChecker stringChecker = new StringChecker();
		stringChecker.checkHardcoded("try");
		stringChecker.checkHardcoded("test");
		stringChecker.checkStrings("test", "test");
	}
}
