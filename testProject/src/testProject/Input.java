package testProject;

import java.util.*//*은 시스템? 을표기함* ,1 인폴트 해야된다 2, 객체를 생성해야된다.
;

public class Input {
	 public static void main(String[] args) {
//		 System.out.println("하고싶은말을 적으시오.");
//		 int num;
//		 String str1,str2,str3;
//		 Scanner sc = new Scanner(System.in);
//	      str1 =sc.nextLine();
//	      str2 =sc.next();
//	      str3 =sc.next();
//	      
//	      System.out.println(str2);
//	      System.out.println(str1);
//	      System.out.println(str3);
//		 System.out.println("성명,성별,나이를 순서대로 작성하시오.");
//		 int str1,str2,str3;
//		 Scanner sc = new Scanner(System.in);
//		 str1 =sc.nextLine(str1);
//		 str2 =sc.nextLine(str2);
//		 str3 =sc.nextLine(str3);
//		    System.out.println("성명, 성별, 나이를 작성하시오.");
//
//	        Scanner sc = new Scanner(System.in);
//
//	        System.out.print("성명: ");
//	        String name = sc.nextLine(); // 성명을 문자열로 입력받음
//
//	        System.out.print("성별: ");
//	        String gender = sc.nextLine(); // 성별을 문자열로 입력받음
//
//	        System.out.print("나이: ");
//	        String age = sc.nextLine(); // 나이를 문자열로 입력받음
//
//	        // 입력 받은 데이터를 출력하여 확인
//	        System.out.println("성명: " + name);
//	        System.out.println("성별: " + gender);
//	        System.out.println("나이: " + age); 
	      System.out.println("성명, 성별, 나이를 순서대로 작성하시오.");

	        Scanner sc = new Scanner(System.in);
	        
	        String name, gender,age;
	     
	        Float height;    
        
	        System.out.println("성명: ");
	        name =sc.nextLine(); 
	        System.out.println("성별: ");
	        gender =sc.nextLine(); 
	        System.out.println("나이: ");
	        age =sc.nextLine(); 
	        System.out.println("키: ");
	        height =sc.nextFloat();
	        
	        System.out.println( "키가"+height+"이고 나이가"+age+"살인 "+ name+"님"+" 반갑습니다.");
	        
		 
	 }
	       
	     


}
