package in.co.rays.withoutcnstrctr;

public class TestShape {
	
	public static void main(String[] args) {

		Shape shapeRectangle = new Rectangle();
		Rectangle r = (Rectangle) shapeRectangle;
		          r.setLength(10);
		          r.setWidth(15);
              shapeRectangle.area();
              

		Shape shapeCircle = new Circle();
		Circle c = (Circle) shapeCircle;
		       c.setRadius(40);
              shapeCircle.area();
              

		Shape shapeTriangle = new Triangle();
		Triangle t = (Triangle) shapeTriangle;
		         t.setBase(20);
	             t.setHeight(30);
              shapeTriangle.area();

	}

}
