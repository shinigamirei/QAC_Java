package main;

import java.util.Scanner;

public class PlayerInput {

	public static Actions TakeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("What you doin son?");
		String input = s.nextLine();
		Actions output = null;
		if (input.toUpperCase().equals("N") || input.toUpperCase().equals("NORTH") || input.toUpperCase().equals("UP")
				|| input.toUpperCase().equals("W")) {
			output = Actions.NORTH;
		} else if (input.toUpperCase().equals("S") || input.toUpperCase().equals("SOUTH")
				|| input.toUpperCase().equals("DOWN")) {
			output = Actions.SOUTH;
		} else if (input.toUpperCase().equals("E") || input.toUpperCase().equals("EAST")
				|| input.toUpperCase().equals("RIGHT") || input.toUpperCase().equals("D")) {
			output = Actions.EAST;
		} else if (input.toUpperCase().equals("A") || input.toUpperCase().equals("WEST")
				|| input.toUpperCase().equals("LEFT")) {
			output = Actions.WEST;
		} else if (input.toUpperCase().equals("INTERRACT") || input.toUpperCase().equals("F")
				|| input.toUpperCase().equals("POKE")) {
			output = Actions.INTERRACT;
		} else if (input.toUpperCase().equals("QUIT") || input.toUpperCase().equals("EXIT")
				|| input.toUpperCase().equals("FINISH")) {
			output = Actions.QUIT;
		} else
			return Actions.INVALID;
		return output;

	}

}
