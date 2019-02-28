package main;

public class Factorial {
	public static int reverse(int a) {
		int current = a;
		int checker;

		for (int i = 2; i < current; i++) {
			current = current / i;

			if (current < i) {
				return 0;
			}
		}
		for(int i = current; i > 0; i--) {
			
		}
		return current;

	}

}
