package in.co.rays.deepcloning;

public class Employe implements Cloneable {
	
	public String employeName;
	public int id ;
	public Company company;
	
	public Employe( String employeName , int id , Company company) {
		this.employeName = employeName ;
		this.id = id ;
		this.company = company ;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
 		 Employe e = (Employe)super.clone();
		    e.company = (Company)e.company.clone();
		    return e ;
 		 
	} 

}
