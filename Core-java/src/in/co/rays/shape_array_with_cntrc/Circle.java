package in.co.rays.shape_array_with_cntrc;

public class Circle extends Shape {
	
	
	private int radius ;
	public static final double PI = 3.14 ;
	
	public Circle() {
		//System.out.println("default cnstrctr");
	}
	
	public Circle(int radius) {
		//System.out.println("one perametere cnstrctr");
		this.radius = radius;
	}
	
	public void setRadius(int radius ) {
		this.radius = radius ;
		
	}
     public int getRadius() {
    	 return radius;
     }
     public void area () {
    	double Area = PI*radius * radius ;
    	System.out.println("area of circle:" + Area);
     }
}
