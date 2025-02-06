package in.co.rays.oop;

public class AccountCal {
	
	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.setNumber("abc4321");
		System.out.println(ac.getNumber());
		
		ac.setaccountType("saving");
		System.out.println(ac.getaccountType());
		
		ac.setBalance(1000);
		System.out.println(ac.getBalance());
		
		ac.deposit(500);
		ac.withdrawal(200);
		ac.fundTransfer(100);
		ac.payBill(50);
		
	}

}
