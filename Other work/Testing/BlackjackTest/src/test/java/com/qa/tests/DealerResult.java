package com.qa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.main.BlackJackLogic;

public class DealerResult {

	BlackJackLogic blackJack;
	
	@Before
	public void setUp() {
		blackJack = new BlackJackLogic();
	}
	
	@Test
	public void dealerWins() {
		assertEquals("didnt return dealer number",16,blackJack.winLogic(10,16));
	}
	
	@Test
	public void playerBust() {
		assertEquals("didnt return dealer number because player is bust",12,blackJack.winLogic(22,12));
	}
	
}
