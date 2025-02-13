package in.co.rays.super_this;

public class Account extends Person {

	private String number;
	private String accountType;
	private double balance;

	public Account() {

	}

	public Account(String number) {
		this.number = number;
	}

	public Account(String accountType, double balance) {
		this.accountType = accountType;
		this.balance = balance;
	}

	public Account(String dob, String address, String name) {
		super(dob, address, name);
	}

	public Account(String accountType, double balance, String number, String dob, String address, String name) {
		this(dob, address, name);
		this.accountType = accountType;
		this.balance = balance;
		this.number = number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setaccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getaccountType() {
		return accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance = deposit + balance;
		System.out.println("deposit amount:" + deposit);
		System.out.println("total balance:" + balance);
	}

	public void withdrawal(double withdrawal) {
		balance = balance - withdrawal;
		System.out.println("withdrawal amount:" + withdrawal);
		System.out.println("total balance:" + balance);
	}

	public void fundTransfer(double fundTransfer) {
		balance = balance - fundTransfer;
		System.out.println("transfered amount:" + fundTransfer);
		System.out.println("total balance:" + balance);
	}

	public void payBill(double payBill) {
		balance = balance - payBill;
		System.out.println("pay bill:" + payBill);
		System.out.println("total balance:" + balance);
	}

}
