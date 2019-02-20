
public class UsingExceptions {

	public int divide () {
		try {
			int num1 = 3;
			int num2 = 0;
			return num1/num2;
		} catch(ArithmeticException e) {
			e.printStackTrace(System.out);
			return 0;
		}finally {
			System.out.println("fish");
		}
	}
	public void okay() {
		int x = 5;
		int y = 0;
		if (y ==0 ) {
			throw new ArithmeticException();
		}		
	}
}
