package testProject;

public class BankAccoountPO {

	
	
	int balance;
	public BankAccoountPO(){
	balance = 0;
	String name;
	String jeon1,jeon2;
	}
	 public int deposit(int amount) {
		 balance += amount;
		 return balance;
	 }
	 public int withdraw(int amount) {
		 balance -= amount;
		 return balance;
	 }
	 public int checkMyBalance() {
		 System.out.println("잔액: "+ balance);
		 return balance;
	 }
}
