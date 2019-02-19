package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Book;
import main.Dissertation;
import main.Map;

public class tests {
	
	@Test
	public void uniqueTitle() {
		Book book = new Book(0, "book");
		assertEquals("book",book.getTitle());
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
	
}
