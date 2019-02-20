package doggoTests;

import static org.junit.Assert.*;

import javax.transaction.InvalidTransactionException;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import main.DoggoShow;

public class DoggoTests {

	@Test
	public void testStringReturn() {
		
		assertEquals(false, DoggoShow.returnPlace(2).isEmpty());
	}
	

	@Test 
	public void testSuffixs() {	
		assertEquals(true , DoggoShow.returnPlace(1).contains("st"));	
	}
	

	@Test
	public void testRemoval() {
		assertEquals(false, DoggoShow.returnPlace(5).contains(" 5th"));
	}
	
	@Test
	public void inputOutOfBounds() {
		assertEquals("Placement out of range", DoggoShow.returnPlace(1000));
	}
	
	@Test 
	public void testBrackets() {	
		assertEquals(false , DoggoShow.returnPlace(1).contains("["));	
	}
}
