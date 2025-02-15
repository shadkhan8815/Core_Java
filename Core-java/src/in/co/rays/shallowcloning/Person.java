package in.co.rays.shallowcloning;

public class Person implements Cloneable{
	
	public String name ;
	public double dob ;
	public int rollNumber ;
	
	public Person(String name) {
		this.name = name ;
	}
	
	public Person(double dob ,int rollNumber) {
		this.dob = dob ;
		this.rollNumber = rollNumber ;
	}
  
	@Override
	protected Object clone() throws CloneNotSupportedException {
 		return super.clone();
	}
}
