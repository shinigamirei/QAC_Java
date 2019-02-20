package main;

public class Main {
	public static void main(String[] args) {
		
		BoolLogic boolLogic = new BoolLogic();
		System.out.println(boolLogic.truthDetector(1, 2, true));
		System.out.println(boolLogic.truthDetector(3, 3, false));
		
		System.out.println(boolLogic.blackJack(10, 21));
		System.out.println(boolLogic.blackJack(20, 18));
		System.out.println(boolLogic.blackJack(1, 22));
		System.out.println(boolLogic.blackJack(22, 23));
		
		System.out.println(boolLogic.uniqueSum(1, 2, 3));
		System.out.println(boolLogic.uniqueSum(3, 3, 3));
		System.out.println(boolLogic.uniqueSum(1, 1, 2));
		
	}
}
