package in.co.rays.inheritence;

public class Circle extends Shape {
	
	private int radius;

	public static final double PI = 3.14f;
	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void area() {
		double Area = PI * radius * radius;
		System.out.println("Circle Area: " + Area);
	}
}


