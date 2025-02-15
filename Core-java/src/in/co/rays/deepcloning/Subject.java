package in.co.rays.deepcloning;

public class Subject implements Cloneable {
	
	public String name ;
	public Student student = null ;
	
	public Subject(String name , Student student) {
		this.name = name ;
		this.student = student ;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
 		Subject s = (Subject)super.clone();
		s.student = (Student)s.student.clone();
		return s;
 		
	}

}
