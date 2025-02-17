package in.co.rays.exceptionhandling;

public class TestStringIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		
		String str = "abcd" ;
		
		try {
			System.out.println(str.charAt(5));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
 		}
	}

}
