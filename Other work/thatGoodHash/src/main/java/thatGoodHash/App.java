package thatGoodHash;

import java.util.HashMap;

public class App {
	public static void main(String[] args) {

		HashMap<Integer, String> brownies = new HashMap<Integer, String>();
		brownies.put(34, "yup, you're already high");
		brownies.put(69, "stop...");
		brownies.put(12,"Drizzt");
		System.out.println(brownies.get(69));
	}
}
