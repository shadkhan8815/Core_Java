package in.co.rays.deepcloning;

public class Student implements Cloneable{
	
	public int marks;
	public double rollNumber ;
	
	public Student(int marks , double rollNubmer) {
		this.marks = marks ;
		this.rollNumber = rollNubmer ;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
