package com.qa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.main.BlackJackLogic;

public class MiscResult {
	BlackJackLogic blackJack;
	
	@Before
	public void setUp() {
		blackJack = new BlackJackLogic();
	}
	
	@Test
	public void bothBust() {
		assertEquals("didnt return 0 for both bust",0,blackJack.winLogic(22,22));
	}
	
	
	@Test
	public void invalidInput() {
		assertEquals("didnt return -1",-1,blackJack.winLogic(2,16));
	}
}
