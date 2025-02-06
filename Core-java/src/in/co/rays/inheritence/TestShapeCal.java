package in.co.rays.inheritence;

public class TestShapeCal {
	
	public static void main(String[] args) {
		
		Shape s = new Shape ();
		
		    s.setColor("white");
		    System.out.println("color:" + s.getColor());
		    s.setBorderWidth(10);
		    System.out.println("border width:" + s.getBorderWidth());
		
		Rectangle r = new Rectangle();
		
		         r.setLength(5);
		         System.out.println("length:" + r.getLength());
		         r.setWidth(8);
		         System.out.println("width:" + r.getWidth());
		         r.setColor("blue");
		         System.out.println("color:" + r.getColor());
		         r.setBorderWidth(15);
		         System.out.println("border width:" + r.getBorderWidth());
		         r.area();
		         
		 Circle c = new Circle();
		 
		         c.setRadius(9);
		         System.out.println("radius:" + c.getRadius());
		         c.setColor("green");
		         System.out.println("color:" + c.getColor());
		         c.setBorderWidth(20);
		         System.out.println("border width:" + c.getBorderWidth());
		         c.area();
		         
		  Triangle t = new Triangle();
		    
		           t.setHeight(10);
		           System.out.println("height:" + t.getHeight());
		           t.setBase(20);
		           System.out.println("base:" + t.getBase());
		           t.setColor("red");
		           System.out.println("color:" + t.getColor());
		           t.setBorderWidth(25);
		           System.out.println("border width:" + t.getBorderWidth());
		           t.area();
	}

}
