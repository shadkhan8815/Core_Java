package in.co.rays.oop;

public class Account {
	
	private String number;
	private String accountType;
	private double balance;
	private double deposit;
	private double withdrawal;
	private double fundTransfer;
	private double payBill;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getaccountType() {
		return accountType;
	}
	public void setaccountType(String accountType) {
		this.accountType = accountType;
		
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double deposit ) {
		this.deposit = deposit;
		balance = deposit+ balance;
		System.out.println("deposit amount:" + deposit);
		System.out.println("total balance:" + balance);
	}
	
	public void withdrawal(double withdrawal) {
		this.withdrawal = withdrawal;
		balance = balance - withdrawal;
		System.out.println("withdrawal amount:" + withdrawal);
		System.out.println("total balance:" + balance);
	}
	
	public void fundTransfer(double fundTransfer) {
		this.fundTransfer = fundTransfer ;
		balance = balance - fundTransfer ;
		System.out.println("transfered amount:" + fundTransfer);
		System.out.println("total balance:" + balance);
	}
	
	public void payBill(double payBill) {
		this.payBill = payBill;
		balance = balance - payBill;
		System.out.println("pay bill:" + payBill);
		System.out.println("total balance:" + balance);
	}
	
}	
