package in.co.rays.oop.cnstr;

public class TestCalCircle {
	
	public static void main(String[] args) {
		
		// constructor cal;
		
		Circle c = new Circle();
		
		Circle c1 = new Circle(5);
		System.out.println("circle radius:" + c1.getRadius());
		
		// getter setter method cal;
		
		Circle cl = new Circle();
		
		cl.setRadius(5);
		System.out.println("circle radius:" + cl.getRadius());
		
		cl.area();
		
		
	}

}
