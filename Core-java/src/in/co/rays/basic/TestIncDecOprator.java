package in.co.rays.basic;



public class TestIncDecOprator {
	
	

public static void main(String[] args) {
	
	
	
	    int i= 1;
	    
	
	  //  int sum = (i++ + --i + i-- + i++ + i);
         //      1  +  1  + 1   +  0  + 1  = 4;
	    
	    
	    
	      int sum = ++i + --i + i-- + ++i + i + i-- + ++i ;
	           //    2  +  1  +  1  +  1  + 1 + 1   + 1  = 8 ;
	      
	      
	 
	   System.out.println("sum:" + sum);
	   
	   
	   
      }	
}
