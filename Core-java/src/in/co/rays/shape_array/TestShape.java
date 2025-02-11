package in.co.rays.shape_array;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s1 = new Rectangle();
		Rectangle r = (Rectangle) s1;   // with override && typecasting
		          r.setLength(30);
		          r.setWidth(15);
		          s1.area();
		
		
		Shape s2 = new Circle();
        Circle c = (Circle) s2;
		       c.setRadius(20);
		       s2.area();

		       
		Shape s3 = new Triangle();
        Triangle t = (Triangle) s3;
		         t.setBase(50);
	        	 t.setHeight(10);
		         s3.area();
	}

}
