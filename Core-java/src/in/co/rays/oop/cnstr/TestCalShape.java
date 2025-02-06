package in.co.rays.oop.cnstr;

public class TestCalShape {
	
	public static void main(String[] args) {
		
		
		Shape s = new Shape() ;
		
		Shape s1 = new Shape(5);                          // cal by  constructor ;
		System.out.println(s1.getBorderWidth());
		s1.setBorderWidth(10);                           // cal by get & set method;
		System.out.println(s1.getBorderWidth());
		
		Shape s2 = new Shape("white" , 10);             // cal through constructors ;
		System.out.println(s2.getColor() +" "+ s2.getBorderWidth());
		s2.setColor("black");                          // cal through getter && setter method ;
		System.out.println(s2.getColor());
		
	} 

}
