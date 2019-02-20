package main;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Item {

	private int id;
	public static HashMap<Integer,Item> checkedIn = new HashMap<Integer,Item>();
	public static HashMap<Integer,Item> checkedOut = new HashMap<Integer,Item>();

	public Item(int id) {
		this.setId(id);
		Item.checkedIn.put(this.id,this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String checkIn(Item item) {
		for (int i = 0; i < checkedIn.size(); i++) {
			if (checkedIn.get(i).getId() == item.id) {
				return "Item is already checked in";
			}
		}
		checkedIn.put(item.id,item);
		for (int j = 0; j < checkedIn.size(); j++) {
			if (checkedOut.get(j).getId() == item.id) {
				checkedOut.remove(j);
			}
		}
		return "Item was checked in";
	}
	
	public String checkOut(Item item) {
		for (int i = 0; i < checkedOut.size(); i++) {
			if (checkedIn.get(i).getId() == item.id) {
				return "Item is already checked out";
			}
		}
		checkedOut.put(item.id,item);
		for (int j = 0; j < checkedIn.size(); j++) {
			if (checkedIn.get(j).getId() == item.id) {
				checkedIn.remove(j);
			}
		}	
		return "Item has been successfuly checked out";
	}
	public static void removeItem(Item item) {
		 
	}
	
	public static void burnDown() {
		checkedIn.clear();
		checkedOut.clear();
	}
}
