package builder;

public class BuildACat {
	private static BuildACat instance;
	String weight;
	String lives;
	String name;
	
	private BuildACat() {
		
	}

	public static BuildACat getInstance() {
		if (instance == null)
			instance = new BuildACat();		
		return instance;	
	}
	
	public BuildACat weight(String weight) {
		this.weight = weight;
		return this;
	}
	public BuildACat lives(String lives) {
		this.lives = lives;
		return this;
	}
	public BuildACat name(String name) {
		this.name = name;
		return this;
	}	
	public Cat buildCat() {
		return new Cat(weight,lives,name);
	}
}
