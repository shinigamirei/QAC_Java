package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.BlackJack;


public class BlackJackTest {
	BlackJack bj;
	
	@Before
	public void init() {
		bj = new BlackJack();
	}
	@Test
	public void doubleBustTest()
	{
		assertEquals("double bust not returning 0",0, BlackJack.play(23, 25));
	}
	
	@Test
	public void highestWins() {
		assertEquals("Not returning the highest non bust",19,BlackJack.play(19, 12));
	}
	
	@Test
	public void nonBustWins() {
		assertEquals("bust still won",12, BlackJack.play(12, 25));
	}
}
