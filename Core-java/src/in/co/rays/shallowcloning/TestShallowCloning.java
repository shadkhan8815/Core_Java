package in.co.rays.shallowcloning;

public class TestShallowCloning { 
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
	Account a = new Account(500);
	        
	Account a1 = (Account)a.clone();
	
	a1.balance = 200 ;
	
	System.out.println(a.balance);
	System.out.println(a1.balance);
	
	System.out.println("\t");
	
	Person p = new Person("rahul");
	Person ps = new Person(2010, 1213);
	
	Person p1 = (Person)p.clone();
	Person p2 = (Person)ps.clone();
	
	p1.name = "amit" ;
	p2.dob = 2008 ;
	p2.rollNumber = 3243 ;
	
	System.out.println(p.name);
	System.out.println(ps.dob +"/"+ ps.rollNumber);
	System.out.println(p1.name);
	System.out.println(p2.dob);
	System.out.println(p2.rollNumber);
	
	
	}
}
