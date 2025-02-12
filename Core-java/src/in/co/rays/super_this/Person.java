package in.co.rays.super_this;

public class Person {

	private String name;
	private String dob;
	private String address;
	public static final int AVG_AGE = 15;

	public Person() {
		System.out.println("default cnst");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("one prm cnst");
	}

	public Person(String dob, String address, String name) {
		this.dob = dob;
		this.address = address;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDob() {
		return dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public int getAvgAge() {
		return AVG_AGE;
	}

}
