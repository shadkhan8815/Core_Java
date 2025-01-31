package in.co.rays.array;

public class TestArrayMax  {
	

 public static void main(String[] args) {
	
	//public void name() {  
	
	int array[] = { 10, 8, 15, 25, 9, 68, 65, };
	
	
	
	int max = 0;
	
	
	
	 for (int i = 0; i < array.length; i++) {
		 
		 
	
		 
		 if( array[i] > max ) {
			 
			 
			 
			  max = array[i];
			  
			 
		 }
		 
	}
	 
	 
	   System.out.println("maximum:" + max);
	   
	   
     }	
}
