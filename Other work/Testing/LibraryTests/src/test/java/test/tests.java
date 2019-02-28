package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Book;
import main.Dissertation;
import main.Item;
import main.Map;

public class tests {
	@Before
	public void clear() {
		Item.burnDown();
	}

	@Test
	public void uniqueTitle() {
		Book book = new Book(0, "book");
		assertEquals("book", book.getTitle());
	}

	@Test
	public void uniqueQuestion() {
		Dissertation diss = new Dissertation(0, "How Floof?");
		assertEquals("How Floof?", diss.getQuestion());
	}

	@Test
	public void uniqueLocation() {
		Map map = new Map(0, "yes");
		assertEquals("yes", map.getLocation());
	}

	@Test
	public void correctAccess() {
		Book book = new Book(0, "a book");
		book.setTitle("better book");
		assertNotEquals("a book", book.getTitle());
	}

	@Test
	public void checkInTest() {
		Book book = new Book(0, "oh baby");
		book.checkIn(book);
		assertEquals(Book.class, Item.checkedIn.get(0).getClass());
	}

	@Test
	public void checkOutTest() {
		Map map = new Map(0, "a place");
		assertEquals("Item has been successfuly checked out", map.checkOut(map));

	}

	@Test
	public void addItemTest() {
		Map map = new Map(0,"yes");
		assertEquals(map,Item.checkedIn.get(0));
	}

}
