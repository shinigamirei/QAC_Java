package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DoggoShow {

	public static String returnPlace(int pos) {

		if (pos > 0 && pos < 101) {

			int[] numbs = new int[100];

			for (int i = 0; i < 100; i++) {

				numbs[i] = i + 1;
			}

			List<String> doggoPos = new ArrayList<>();

			for (int i = 0; i < 100; i++) {
				if ((i + 1) > 10 && (i + 1) < 14)
					doggoPos.add(numbs[i] + "th");
				else if ((i + 1) % 10 == 1)
					doggoPos.add(numbs[i] + "st");
				else if ((i + 1) % 10 == 2)
					doggoPos.add(numbs[i] + "nd");
				else if ((i + 1) % 10 == 3)
					doggoPos.add(numbs[i] + "rd");
				else
					doggoPos.add(numbs[i] + "th");
			}

			final String check = doggoPosAsString(pos);

			doggoPos = doggoPos.stream().filter(x -> !x.equals(check)).collect(Collectors.toList());
			String result = doggoPos.toString();
			
			return result.substring(1, result.length() - 1);
		}
		return "Placement out of range";
	}
	
	
	

	public static String doggoPosAsString(int pos) {

		String doggoPosToReturn;

		if (pos > 10 && pos < 14)
			doggoPosToReturn = (pos + "th");
		else if (pos % 10 == 1)
			doggoPosToReturn = (pos + "st");
		else if (pos % 10 == 2)
			doggoPosToReturn = (pos + "nd");
		else if (pos % 10 == 3)
			doggoPosToReturn = (pos + "rd");
		else
			doggoPosToReturn = (pos + "th");

		return doggoPosToReturn;

	}
}
