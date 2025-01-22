package in.co.rays.basic;



public class TestReverseNumber {
	
	

 public static void main(String[] args) {
	 
	 
	
    int  number = 1234;
    
    
	
	int    r = 0;
	
	
	
	int    sum = 0;
	
	
	
    int 	n = number;  // n = 1234;
    
    
	
       while (n > 0) {
    	   
    	   
    	   r = n % 10;
    	   
    	   
    	  sum = (sum * 10) + r;
    	  
    	
    	//  n = n / 10;
    			 
    	  
       }
       
    
        System.out.println("ReverseNumber:" + sum);
        
        
    }
 
 
}
