package in.co.rays.date;

public class TestStringToPremitive {
	
	
	public static void main(String[] args) {
		
     int i = Integer.parseInt("2");
       System.out.println(i);
 
	  short s = Short.parseShort("5");
	    System.out.println(s);
	    
	    byte b = Byte.parseByte("8");
	    System.out.println(b);
	    
	    long l = Long.parseLong("2");
	    System.out.println(l);
	    
	    boolean bl = Boolean.parseBoolean("true");
	    System.out.println(bl);
	    
	    float f = Float.parseFloat("10.8f");
	    System.out.println(f);
	    
	    double d = Double.parseDouble("8.1d");
	    System.out.println(d);
	    
	    char c = "c".charAt(0);
	    System.out.println(c);
	}

}
