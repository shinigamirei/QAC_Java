package main;

public class Player extends WorldObject implements EntityActions {

	public Player() {
		this.setxLoc(0);
		this.setyLoc(0);
		this.setObjectID("player");
	}

	public void Move(Actions direct) {
		if (direct == Actions.NORTH) {
			this.setyLoc(this.getyLoc() + (int) 1);
		} else if (direct == Actions.SOUTH) {
			this.setyLoc(this.getyLoc() - (int) 1);
		} else if (direct == Actions.EAST) {
			this.setxLoc(this.getxLoc() + (int) 1);
		} else if (direct == Actions.WEST) {
			this.setxLoc(this.getxLoc() - (int) 1);
		}
	}
	
	public void interract(WorldObject target) {
		// TODO Auto-generated method stub
			target.interractedWith();
				
	}
	@Override
	public float calcDist(WorldObject obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void interractedWith() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeTurn(World world) {
		// TODO Auto-generated method stub
		
	}
}
