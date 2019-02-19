package main;

import java.util.ArrayList;

public abstract class Item {

	private int id;
	public static ArrayList<Item> checkedIn = new ArrayList<Item>();
	
	public Item(int id) {
		this.setId(id);
		Item.checkedIn.add(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
