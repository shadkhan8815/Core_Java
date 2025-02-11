package in.co.rays.abs;

public class TestShape1 {
	
	public static void main(String[] args) {

		Shape shape = new Rectangle();

		shape.sum();
		shape.area();

		Rectangle rectangle = new Rectangle();

		rectangle.sum();
		rectangle.area();
		
		Shape.sum();
	}

}
