package main;

public class PointOfInterest extends WorldObject {
	private String interactText;	
	private Boolean interacted = true;
	private Boolean winPOI = false;

	public PointOfInterest(int x,int y,String info,String interactText,Boolean isWinPOI) {
		this.setxLoc(x);
		this.setyLoc(y);
		this.setFlavourText(info);
		this.setInteractText(interactText);
		this.interacted = false;
		this.winPOI = isWinPOI;
		
	}
	public float calcDist(WorldObject obj) {
		int xDist = Math.abs(Math.abs(this.getxLoc())- Math.abs(obj.getxLoc()));
		int yDist = Math.abs(Math.abs(this.getyLoc())- Math.abs(obj.getyLoc()));
		float totalDist = (float) Math.sqrt((xDist * xDist) + (yDist * yDist));	
		return totalDist;	
	}	
	
	@Override
	public void interractedWith() {
		System.out.println(this.getInteractText());
		this.setInteracted(true);
		if (this.getWinPOI() == true)
			GameLogic.setFinished(true);
	}
	
	public Boolean getInteracted() {
		return interacted;
	}
	public void setInteracted(Boolean interacted) {
		this.interacted = interacted;
	}
	public String getInteractText() {
		return interactText;
	}
	public void setInteractText(String interactText) {
		this.interactText = interactText;
	}
	public Boolean getWinPOI() {
		return winPOI;
	}
	public void setWinPOI(Boolean winPOI) {
		this.winPOI = winPOI;
	}
	@Override
	public void takeTurn(World world) {
		// TODO Auto-generated method stub
		
	}
}
