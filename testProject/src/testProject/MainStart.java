package testProject;

public class MainStart {
	 public static void main(String[] args) {
		 BankAccoountPO jeon =new BankAccoountPO();//BankAccoountPO()이건 생성자!
	
		
		 BankAccount jeon1=new BankAccoountPO(300,"현규");
		
		 jeon1.deposit(5000);
	System.out.println("잔액:"+jeon1.balance);
	System.out.println(jeon1.name);
		 jeon.deposit(5000);
		 
		 jeon1.checkMyBalance();
		 
	 }
}
