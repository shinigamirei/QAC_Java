package main;

public class Main {

	public static void main(String[] args) {
		StringManipulator stringManip = new StringManipulator();
		String testString = ("Test Test G ASF a fsa a sfasf asasd asdf adg fas fasdherh wrg wef fqeethw r");
		System.out.println(stringManip.wordCount(testString));
		stringManip.verticalPrint(testString);
		stringManip.reverseVerticalPrint(testString);
		System.out.println(stringManip.searchString(testString, "test"));
	}

}
