package com.qa.main;

public class BlackJackLogic {

	public int winLogic(int i, int j) {
		if (i < 4 || j < 4 || i > 31 || j > 31)
		return -1;
		else if (i > 21 && j> 21)
			return 0;
		else if (i > 21)
			return j;
		else if (j > 21)
			return i;
		else 
			return Math.max(i, j);
		
	}
}
