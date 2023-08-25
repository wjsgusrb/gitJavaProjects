package test;
import java.util.Scanner;

public class H실습5번 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String id;
//		int pw;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요 : ");
//		id= sc.next();
//		System.out.println("비밀번호를 입력하세요 : ");
//		pw=sc.nextInt();
//		
//		if()
		 User user = new User("myusername", "mypassword");

	        String inputUsername = "myusername";
	        String inputPassword = "mypassword";

	        if (user.authenticate(inputUsername, inputPassword)) {
	            System.out.println("로그인 성공");
	        } else {
	            System.out.println("로그인 실패");
	        }
	        
	        Customer[] customerArr=new Customer[10];
	        
	        String id,pw;
	        System.out.println("아이디");
	        id=sc.next();
	
	        if (id.equals(mtId)(inputUsername, inputPassword)) {
	            System.out.println("로그인 성공");
	        } else {
	            System.out.println("로그인 실패");
	        }
		


	
	

	}
	
	
	
	
	
	
	
}

