package main;

public abstract class WorldObject {
	private int xLoc;
	private int yLoc;
	private Boolean interacted = true;//for dial purposes
	private String flavourText;
	private String objectID;
	
	public abstract void takeTurn(World world);
	
	public abstract float calcDist(WorldObject obj);
	
	public abstract void interractedWith();
	
	public int getxLoc() {
		return xLoc;
	}
	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}
	public int getyLoc() {
		return yLoc;
	}
	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}
	public Boolean getInteracted() {
		return interacted;
	}
	public void setInteracted(Boolean interacted) {
		this.interacted = interacted;
	}
	public String getFlavourText() {
		return flavourText;
	}
	public void setFlavourText(String flavourText) {
		this.flavourText = flavourText;
	}

	public String getObjectID() {
		return objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}
}
