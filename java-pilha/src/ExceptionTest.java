
public class ExceptionTest {

	public static void main(String[] args) {

		try {
			int a = 1;
			int b = a / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
