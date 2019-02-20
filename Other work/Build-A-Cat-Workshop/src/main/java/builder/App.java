package builder;

public class App {
	public static void main(String[] args) {
		BuildACat builder = BuildACat.getInstance();
		Cat pip = builder.name("pippa").weight("500").buildCat();
		System.out.println(pip.weight);
		System.out.println(pip.lives);
		System.out.println(pip.name);	
	}
}
