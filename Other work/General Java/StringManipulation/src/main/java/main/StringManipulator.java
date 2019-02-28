package main;

public class StringManipulator {

	public int wordCount(String a) {
		String[] splitString = this.stringSplit(a);
		return splitString.length;
	}

	public void verticalPrint(String a) {
		String[] toPrint = this.stringSplit(a);
		for (int i = 0; i < toPrint.length; i++) {
			System.out.println(toPrint[i]);
		}
	}

	public void reverseVerticalPrint(String a) {
		String[] toPrint = this.stringSplit(a);
		int length = toPrint.length;
		for (int i = length; i > 0; i--) {
			System.out.println(toPrint[i - 1]);
		}
	}
	
	public boolean searchString(String longString, String toFind) {
		String[] splitString = this.stringSplit(longString);
		for (int i = 0; i < splitString.length; i++) {
			if (toFind.equals(splitString[i]))
				return true;
		}
		return false;
	}

	public String[] stringSplit(String a) {
		String[] splitString = a.split(" ");
		return splitString;
	}
}
