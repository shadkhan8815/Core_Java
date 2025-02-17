package in.co.rays.exceptionhandling;

public class TestNullPointerException {
	
	public static void main(String[] args) {
		
		String name = null ;
		
		try {
			System.out.println(name.length());
			
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
 		}
	}

}
