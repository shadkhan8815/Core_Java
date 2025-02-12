package in.co.rays.super_this;

public class Rectangle extends Shape{
	
	private int length ;
	private int width ;
	
	public Rectangle() {
		System.out.println("default cnstrctr");
		
	}
	
	public Rectangle( int length) {
		System.out.println("one parametere  cnstrctr");
	    this.length = length;
	}
	 public Rectangle(int width, int length) {
		 System.out.println("two prmtr cntr");
		 this.width = width;
		 
	 }
	 
	 public Rectangle(String color, int borderWidth) {
		 super(color,borderWidth);  // super keyword ka use ham dusri class ya parent class k variable ko child  
	 }                               // class me call krne k liye use karte hai
	 
	 public Rectangle(int width, int length,String color, int borderWidth) {
		 this(color,borderWidth); // this keyword ka use ham same class me variable ko call karne k liye karte hai
		 this.width = width;
		 this.length = length;
	 }
	 
	public void setLength(int length) {
		this.length = length ;
	}
	 public int getLength() {
		 return length ;
	 }
	 
	 public void setWidth(int width) {
		 this.width = width;
	 }
	  public int getWidth() {
		  return  width;
	  }
	   public void area() {
		   int Area = length * width ;
		   System.out.println("area of rectangle:" + Area);
	   }
		   

}
