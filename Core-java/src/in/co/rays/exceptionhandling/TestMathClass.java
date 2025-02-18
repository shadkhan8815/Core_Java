package in.co.rays.exceptionhandling;

public class TestMathClass {

	public static void main(String[] args) {

		try {
			MathClass m = new MathClass(80, 0);
			System.out.println(m.divison());
		} catch (OverAllException e) {
			e.printStackTrace();
		}
	}

}
