package in.co.rays.exceptionhandling;

public class TryWithMultipleCatch {

	public static void main(String[] args) {

		int a = 30;
		int b = 5;
		String name = "abcd";
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = "khan";
		String number = "123";

		try {
			int c = a / b;
			System.out.println(c);
			System.out.println(name.charAt(2));
			System.out.println(arr[6]);
			System.out.println(str.length());
			int i = Integer.parseInt(number);
			System.out.println(i);

		} 
		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
 		}
		catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
 		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
