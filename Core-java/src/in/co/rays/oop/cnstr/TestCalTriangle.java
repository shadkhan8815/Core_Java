package in.co.rays.oop.cnstr;

public class TestCalTriangle {

	public static void main(String[] args) {
		
		// constructor cal;
		
		Triangle t = new Triangle();
		
		Triangle t1 = new Triangle(4);
		System.out.println("triangle base:" + t1.getBase());
		
		Triangle t2= new Triangle(8,4);
		System.out.println("triangle hight:" + t2.getHight());
		
		// getter settter cal;
		
		Triangle tl = new Triangle();
		
		tl.setBase(4);
		System.out.println("base:" +  tl.getBase());
		
		tl.setHight(8);
		System.out.println("hight:" + tl.getHight());
		
		tl.area();
		
	}
}
