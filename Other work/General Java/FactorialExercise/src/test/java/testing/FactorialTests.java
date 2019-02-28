package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Factorial;


public class FactorialTests {
	
	@Test
	public void initialTest() {
		assertEquals(5, Factorial.reverse(120));
	}
	
	@Test
	public void incorrectIntegerTest() {
		assertEquals("Didn't identify incorrect integer",0, Factorial.reverse(150));
	}
	
	@Test 
	public void challengeOne() {
		assertEquals(10, Factorial.reverse(3628800));
	}
	
	@Test
	public void challengeTwo() {
		assertEquals(12, Factorial.reverse(479001600));
	}
	
	@Test
	public void challengeThree() {
		assertEquals(3, Factorial.reverse(6));
	}
	
	@Test
	public void challengeFour() {
		assertEquals(0, Factorial.reverse(18));
	}
}
