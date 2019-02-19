package main;

public class Map extends Item {
	
	public Map(int id,String location) {
		super(id);
		this.setLocation(location);
	}

	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
