package in.co.rays.oop;

public class PesronCal {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("shad");
		System.out.println(p.getName());
		
		p.setDob("10/01/2002");
		System.out.println(p.getDob());
		
		p.setAddress("indore");
		System.out.println(p.getAddress());
		
		System.out.println(p.getAvgAge());
				
		
	}
}
