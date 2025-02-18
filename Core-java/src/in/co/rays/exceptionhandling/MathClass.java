package in.co.rays.exceptionhandling;

public class MathClass {
	
	public int a ;
	public int b ;
	
	public MathClass(int a , int b) throws OverAllException {
		if (a > b || b == 0 ) {
			OverAllException o = new OverAllException("arithmetic exception occour");

			throw o ;
		}
		this.a = a ;
		this.b = b ;
	}
     public double divison() {
    	 return a / b ;
     }
}
