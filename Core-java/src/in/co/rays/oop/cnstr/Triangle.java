package in.co.rays.oop.cnstr;

public class Triangle {
	
	private int base;
	private int hight;
	
	public Triangle() {
		System.out.println("default cnstrctr");
	}
	
	public Triangle(int base) {
		System.out.println("one perameter cnstctr");
		this.base = base;
	}
	
	public Triangle(int hight,int base ) {
		System.out.println("two perameter cnstrctr");
		this.hight = hight;
	}
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getHight() {
		return hight;
	}
	
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public void area() {
	int	Area = (base*hight)/2; 
	System.out.println("Triangle area:" + Area);
	}
	

}
