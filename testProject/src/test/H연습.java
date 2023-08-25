package test;
import java.util.Scanner;
public class H연습 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	Customer[] customerArr =new Customer[10];
//	//ID와PW를 입력받아라
//	System.out.println("id를 입력하세요");
//	String id = sc.next();
//	System.out.println("pw를 입력하세요");
//	String pw= sc.next();
//	
//	for(int i=0;i<customerArr.length;i++) {
//	
//	if (customerArr[i]==null) {
//		break;
//	}else if(customerArr[i].equals("myid","myPassword12")) {
//		loginCustomer =customerArr[i];
//		break;
//	}else {
//		System.out.println("패스워드가 틀렸습니다.");
//		break;
//	}
//	}
		//아이디 비밀번호 이름 이메일을 입력받아 Customer 객체를 추가해보자
		//1.아이디를 입력하세요
		//2비밀번호를 입력하세요
		//3이름을 입력하세요
		//4이메일을 입력하세요
		//이름 :000
		//이메일:000
		//ID:000
		//PW:000
		//회원정보가 정상적으로 등록되었습니다.
	Customer[] customerArr =new Customer[10];
	int index = 0;
	
		
		for(int i=0;i<customerArr.length;i++)
			
		if(customerArr[i]==null) {
			System.out.println("이름를 입력하세요.");
			String name=sc.next();
			System.out.println("아이디를 입력하세요.");
			String id=sc.next();
			System.out.println("비밀번호를 입력하세요.");
			String password=sc.next();
			System.out.println("이메일를 입력하세요.");
			String email=sc.next();
			customerArr[index] =	new	Customer(name,id,password,email);
			break;
		}
		else if (i == customerArr.length-1) {
			System.out.println("더이상 회원가입이 불가합니다.");
		}else {
			System.out.println("추가할 학생의 이름, 나이, 성별을 입력해 주세요.");
			System.out.println("이름를 입력하세요.");
			String name=sc.next();
			System.out.println("아이디를 입력하세요.");
			String id=sc.next();
			System.out.println("비밀번호를 입력하세요.");
			String password=sc.next();
			System.out.println("이메일를 입력하세요.");
			String email=sc.next();
			customerArr[index] =	new	Customer(name,id,password,email);
		}
		
		
		
		
		
		
	
	
}
}