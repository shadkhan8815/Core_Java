package in.co.rays.exceptionhandling;

public class TestException {
	
	public static void main(String[] args) {
		
		int i = 10 ;
		int j = 0 ;
		
		try {
			int c = i / j ;
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
 		}
	}

}
