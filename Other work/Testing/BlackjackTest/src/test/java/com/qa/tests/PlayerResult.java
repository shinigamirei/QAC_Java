package com.qa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.main.BlackJackLogic;

public class PlayerResult {

	BlackJackLogic blackJack;
	
	@Before
	public void setUp() {
		blackJack = new BlackJackLogic();
	}
	
	@Test
	public void dealerBust() {
		assertEquals("didnt return player number because dealer is bust",12,blackJack.winLogic(12,22));
	}
	
	@Test
	public void playerWins() {
		assertEquals("didnt return player number",19,blackJack.winLogic(19,16));
	}
	
}
