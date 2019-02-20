package moarTDD;

import static org.junit.Assert.*;
import org.junit.Test;

import main.Author;

public class AuthorTesting {
	
	@Test 
	public void testAuthor() {
		Author testing = new Author();
		assertNull(testing.getName());
	}
	
	@Test 
	public void testAuthorString() {
		Author testing = new Author("a");
		assertNotNull(testing.getName());
	}
	
	@Test
	public void testSetName() {
		Author testing = new Author();
		testing.setName("a");
		assertEquals("a", testing.getName());
	}
	
	@Test
	public void doTheFail() {
		Author testing = new Author();
		testing.setName("o bby");
		if (testing.getName() != "o bby")
			fail("you fail boi");
	}
}
