package in.co.rays.multiinherit;

public class Test_A_B_C {
	
	public static void main(String[] args) {
		
		B b = new B ();
		b.sum(5, 6);
		b.multiply(8, 4);
		
		C c = new C();
		c.sum(3, 4);
		c.multiply(5, 4);
		c.division(8, 2);
		
	}

}
