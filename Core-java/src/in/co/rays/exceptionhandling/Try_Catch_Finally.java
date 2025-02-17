package in.co.rays.exceptionhandling;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
		
		int a = 50 ;
		int b = 0; 
		String name = null ;
		
		try {

			int c = a / b;
			System.out.println(c);

			System.out.println(name.length());

		} catch (ArithmeticException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (NullPointerException e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {

			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {

			System.out.println("finally block");
		}
	}
}

