package main;

import java.util.ArrayList;
import java.util.List;

public class World {
	private List<WorldObject> entities = new ArrayList<WorldObject>();
	
	public World(){
		entities.add(0, new Player());//first entity is always player
		entities.add(new PointOfInterest(5, 0, "o baby a stump","oh ye, it's a stump", false));
		entities.add(new PointOfInterest(6, 12, "thats a Goddamn Chest!!","o baby it opened!", true));
		entities.add(new Enemy(10, 10, true));
	}
	public Player retPlayer() {
		return (Player) entities.get(0);//returns player entity from the list for other objects to use
	
	}
		
	public List<WorldObject> getEntities() {
		return entities;
	}
	public void setEntities(List<WorldObject> entities) {
		this.entities = entities;
	}
}
