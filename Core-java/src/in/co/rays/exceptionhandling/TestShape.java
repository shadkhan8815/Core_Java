package in.co.rays.exceptionhandling;

public class TestShape {

	public static void main(String[] args) {

		try {
			Shape s = new Shape(null, -6);
			System.out.println(s.getColor());
			System.out.println(s.getBorderWidth());
		} catch (IllegalArgumentException e) {
			//System.out.println(e);
		 	//System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
