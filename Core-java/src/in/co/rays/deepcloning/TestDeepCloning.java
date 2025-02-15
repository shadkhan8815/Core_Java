package in.co.rays.deepcloning;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account a = new Account(2000);

		Customer c = new Customer("abcd", a);

		Customer c1 = (Customer) c.clone();

		c1.name = "ABCD";
		c1.account.balance = 800;

		System.out.println(c.name);
		System.out.println(a.balance);
		System.out.println(c1.name);
		System.out.println(c1.account.balance);

		System.out.println("\t");

		Student s = new Student(80, 123);

		Subject sj = new Subject("science", s);

		Subject s1 = (Subject) sj.clone();

		s1.name = "maths";
		s1.student.marks = 70;
		s1.student.rollNumber = 466;

		System.out.println(sj.name);
		System.out.println(s.marks + "/" + s.rollNumber);
		System.out.println(s1.name);
		System.out.println(s1.student.marks);
		System.out.println(s1.student.rollNumber);

		System.out.println("\t");

		Company cp = new Company("tcs", 99000);

		Employe e = new Employe("rahul", 112, cp);

		Employe ep = (Employe) e.clone();

		ep.employeName = "abhishek";
		ep.id = 130;
		ep.company.name = "ncs";
		ep.company.salary = 200000;

		System.out.println(cp.name + "/" + cp.salary);
		System.out.println(e.employeName + "/" + e.id);
		System.out.println(ep.employeName);
		System.out.println(ep.id);
		System.out.println(ep.company.name);
		System.out.println(ep.company.salary);
	}

}
