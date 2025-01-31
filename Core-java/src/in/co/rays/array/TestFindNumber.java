package in.co.rays.array;


public class TestFindNumber {

	
	public static void main(String[] args) {
		
		
		
		int array[] = { 6, 12, 18, 24, 45, 60, 80};
		
		
		int number = 24;
		
		
		int count = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			
			
			
			if (array[i] == number ) {
			
				
				count++ ;
				
				
			}
			
		}
		
	
		
		if (count == 0) {
			
			System.out.println(" not exist number");
		}
		
		
	    else {
	    	
	    	System.out.println("exist number");
	    }
		
		
		
	}


}

