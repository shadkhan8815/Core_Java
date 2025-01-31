package in.co.rays.oop;

public class ShapeCal {
	
	public static void main(String[] args) {
		
		
		Shape s = new Shape();
		
		s.setColor("yellow");
		System.out.println(s.getColor());
		
		s.setBorderWidth(20);
		System.out.println(s.getBorderWidth());
	}

}
