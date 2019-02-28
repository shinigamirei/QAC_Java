package main;

public class Book extends Item {
	private String title;

	public Book(int id, String title) {
		super(id);
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
