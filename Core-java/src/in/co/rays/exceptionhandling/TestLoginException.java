package in.co.rays.exceptionhandling;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String login = "admin" ;
		String password = "adim" ;
		
		if (login.equals("admin") && password.equals("admin")) {
			
			System.out.println("login successfully:........!!.");
		}
		else {
			LoginException e = new LoginException("redable") ;
			
			try {
				throw e;
				
			} catch (LoginException e1) {
				System.out.println(e1);
				System.out.println(e1.getMessage());
				e1.printStackTrace();
 			}
	
		}
	}

}
