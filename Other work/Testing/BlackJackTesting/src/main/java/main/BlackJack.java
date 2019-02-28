package main;

public class BlackJack {

	public static int play(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		} else if (Math.max(a, b) > 21) {
			return Math.min(a, b);
		} else
			return Math.max(a, b);
	}
}
