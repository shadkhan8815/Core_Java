package string;


public class TestCharCheck {

	
public static void main(String[] args) {
	
	
	String name = "what is your name" ;
	
	
	char ch = 'a' ; 
	
	
	 int  count = 0 ;
	
	 
	for (int i = 0; i < name.length(); i++) {
	
		
		if (name.charAt(i)==ch) {
		
			
			count++;
			
		}
		
	}
	
	  System.out.println("count = " + count);
   }	
}
