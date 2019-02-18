package main;

public class GameLogic {
	private static Boolean finished = false;
	World gameWorld = new World();

	public GameLogic getInstance() {
		return this;
	}

	public void start() {
		System.out.println("Grey foggy clouds float oppressively close to you,");
		System.out.println("reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		System.out.println("there is a slight ripple, as if something is moving");
		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time.");
		this.gameLoop();
	}

	private void gameLoop() {
		while (!finished) {

			Actions input = PlayerInput.TakeInput();
			if (input.equals(Actions.NORTH)) {
				gameWorld.retPlayer().Move(Actions.NORTH);
				this.findClosest();
			} else if (input.equals(Actions.SOUTH)) {
				gameWorld.retPlayer().Move(Actions.SOUTH);
				this.findClosest();
			} else if (input.equals(Actions.EAST)) {
				gameWorld.retPlayer().Move(Actions.EAST);
				this.findClosest();
			} else if (input.equals(Actions.WEST)) {
				gameWorld.retPlayer().Move(Actions.WEST);
				this.findClosest();
			} else if (input.equals(Actions.QUIT)) {
				finished = !finished;
			} else if (input.equals(Actions.INTERRACT)) {
				for (int i = 1; i < gameWorld.getEntities().size(); i++) {
					if (gameWorld.getEntities().get(i).calcDist(gameWorld.retPlayer()) == 0)

						gameWorld.retPlayer().interract(gameWorld.getEntities().get(i));
				}
			} else
				System.out.println("invalid input fool");

			for (int i = 1; i < gameWorld.getEntities().size(); i++) {
				gameWorld.getEntities().get(i).takeTurn(gameWorld);
			}
		}
	}

	public void findClosest() {
		float closestDist = 1000;// will almost always be the highest value
		for (int i = 1; i < gameWorld.getEntities().size(); i++) {// start from 1 as 0 is player
			float dist = gameWorld.getEntities().get(i).calcDist(gameWorld.retPlayer());
			if (gameWorld.getEntities().get(i).getInteracted() == false) {
				if (dist < closestDist) {
					closestDist = dist;

				}
			}
			if (dist == 0)
				System.out.println(gameWorld.getEntities().get(i).getFlavourText());
		}

		System.out.println("The Dial reads " + closestDist);
	}

	public static Boolean getFinished() {
		return finished;
	}

	public static void setFinished(Boolean finished) {
		GameLogic.finished = finished;
		System.out.println("Congrats m9!");
		System.out.println("you won!");
	}
}
