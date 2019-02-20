
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		System.out.println("You up?");
		System.out.println(main.stringMethod());
		main.stringOut("Hello World");
	}
	

	public String stringMethod() {
		String word = "Hello World!";
		return word;
	}
	
	public void stringOut(String s)
	{
		System.out.println(s);
	}
}