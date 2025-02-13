package in.co.rays.super_this;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(40, 20, "white", 60);

		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("color: " + r.getColor());
		System.out.println("borderwidth: " + r.getBorderWidth());

		Account a = new Account("savin", 2000, "SBI1443", "2008", "indore", "sonu");

		System.out.println(a.getaccountType());
		System.out.println(a.getBalance());
		System.out.println(a.getNumber());
		System.out.println(a.getDob());
		System.out.println(a.getAddress());
		System.out.println(a.getName());
	}

}
