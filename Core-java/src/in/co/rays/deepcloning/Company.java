package in.co.rays.deepcloning;

public class Company implements Cloneable {
	
	public String name;
	public double salary;
	
  public Company(String name , double salary) {
	  this.name = name ;
	  this.salary = salary;
	  
  }
  
  @Override
protected Object clone() throws CloneNotSupportedException {
 	return super.clone();
}
	
}
