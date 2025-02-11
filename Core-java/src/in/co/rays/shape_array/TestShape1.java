package in.co.rays.shape_array;

public class TestShape1 {
	
	public static void main(String[] args) {

		Shape[] shape = new Shape[3];        

		shape[0] = new Rectangle();

		shape[1] = new Circle();

		shape[2] = new Triangle();

		Rectangle r = (Rectangle) shape[0];
		          r.setLength(40);
	          	  r.setWidth(90);

		Circle c = (Circle) shape[1];
	     	   c.setRadius(50);

		Triangle t = (Triangle) shape[2];
		         t.setBase(30);
		         t.setHeight(10);
		
		for (int i = 0; i < shape.length; i++) {
			   shape[i].area();
		}
	}

}
