package in.co.rays.inheritence;

public class DataTypes {
	
	public static void main(String[] args) {
		
		// chote data type ko bade data type me store ya hold kara sakte hai;
		
		byte b = 127 ;
		
		short s = b ;
		                            // widening
		int i = s ;
		
		long l = i ;
		
		float f = l ;
		
		double d = f ;
		
		// bade data type ko chote data type me hold krane k liye hame type casting karna padega 
		                                                
		double d1 = 100.100 ;
		
		float f1 = (float) d1 ;
		
		long l1 = (long) f1 ;
		
		int i1 = (int) l1 ;            //narrowing
		
		short s1 = (short) i1 ;
		
		byte b1 = (byte) s1 ;
	}

}
