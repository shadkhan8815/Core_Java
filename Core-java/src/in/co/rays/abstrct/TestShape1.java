package in.co.rays.abstrct;

public class TestShape1 {
	
	public static void main(String[] args) {

		Shape s = new Rectangle(); //  parents k  refrence me child ko rakh kar call kar sakte hai
		      s.sum();
		      s.area();

		Rectangle r = new Rectangle();  // child ka obj bna kr call kar sakte hai
		          r.sum();
		          r.area();
		
		Circle c = new Circle();
		       c.sum();
		       c.area();
		       
		 Shape sp = new Circle();
		       sp.sum();
		       sp.area();
				 
		      Shape.sum(); // class k naam se call kar  sakte hai
		      
		      System.out.println("\t");
		      
		      A a = new B();
		      a.sum();
		      a.multi();
		      
		      B b = new B();
		      b.sum();
		      b.multi();
		      
		      A.multi();
	}

}
