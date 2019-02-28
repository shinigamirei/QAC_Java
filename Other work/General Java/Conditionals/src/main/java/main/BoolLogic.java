package main;

public class BoolLogic {

	public int truthDetector(int a, int b, boolean c) {
		if (a % 2 == 0 || b % 2 == 0) {
			return 0;
		} else if (c == true) {
			int result = a + b;
			return result;
		} else {
			int result = a * b;
			return result;
		}
	}

	public int blackJack(int a, int b) {
		if (a == b)
			return a;
		else if (a < 22 && b < 22)
			return Math.max(a, b);
		else if (a > 21 && b < 22)
			return b;
		else if (b > 21 && a < 22)
			return a;
		else
			return 0;

	}

	public int uniqueSum(int a, int b, int c) {
		if (a != b && b != c && a != c)
			return a + b + c;
		else if (a == b && a != c)
			return c;
		else if (a == c && a != b)
			return b;
		else if (c == b && a != c)
			return a;
		else 
			return 0;
	}

}
