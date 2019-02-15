package main;

public class Enemy extends WorldObject implements EntityActions {// i was finished with MVP, now for fun things

	private boolean active;

	public Enemy(int x, int y, boolean active) {
		this.setxLoc(x);
		this.setyLoc(y);
		this.setActive(false);
		this.setInteracted(true);
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

	public void takeTurn(World world) {
		if (active) {
			if (this.getxLoc() > world.retPlayer().getxLoc())
				this.Move(Actions.WEST);
			else if (this.getxLoc() < world.retPlayer().getxLoc())
				this.Move(Actions.EAST);
			else if (this.getyLoc() < world.retPlayer().getyLoc())
				this.Move(Actions.NORTH);
			else if (this.getyLoc() < world.retPlayer().getyLoc())
				this.Move(Actions.SOUTH);
			else
				System.out.println("O BABY ITS A BEAST FROM THE SWAMP");
		}
	}

	public void interract(WorldObject target) {
		// TODO Auto-generated method stub

	}

	@Override
	public float calcDist(WorldObject obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void interractedWith() {
		if (active) {
			System.out.println("you strike the beast with a hard prod");
			System.out.println("unamused with your rudeness, the beast decides to blink out of existence");
			this.setActive(false);
		}
	}

	private void setActive(boolean b) {
		this.active = b;

	}
}
