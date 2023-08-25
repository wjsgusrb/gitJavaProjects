package testProject;

import java.util.Scanner;

public class Switch {
	public static void main(String []args) {
//		System.out.println("아이디를 입력하세요");
//		System.out.println("비밀번호를 입력하세요");
		
	
//	            Scanner sc = new Scanner(System.in);
//	            String id = sc.next(); // <--- 아이디는 문자열(String)로 입력받아야 합니다.
//	            String pw = sc.next(); // <--- 비밀번호도 문자열(String)로 입력받아야 합니다.
//
//	            if (id.equals("myid") && pw.equals("myPassword")){ // <--- 문자열 비교는 equals() 메소드를 사용해야 합니다.
//	                System.out.println("로그인 성공");
//	            }else if  {
//	                System.out.println("아이디가 틀렸습니다");
//	            } else {
//	                System.out.println("비밀번호가 틀렸습니다");
//	                
	                Scanner sc = new Scanner(System.in);

	                // 미리 정해진 아이디와 비밀번호
	                
	                final String correctId,  correctPw  ;
	                 correctId = "myid";
	                 correctPw = "myPassword";
	                 
	              

	                System.out.println("아이디:");
	                String id = sc.next();

	                System.out.println("비밀번호:");
	                String pw = sc.next();

	                if (correctId.equals(id) && pw.equals(correctPw)) {
	                    System.out.println("로그인 성공");
	                } else if(!correctId.equals(id)) {
	                	
	                    System.out.println("아이디가 틀렸습니다.");
	                } else {
	                	
	                		              
	              
                 } 
//	                	else{
//	                	if(pw.equals(correctPw))
//		                    System.out.println("비밀번호가 틀렸습니다.");

	                
	            }
	        
	            
		
		
		
		
//		System.out.println("국어점수:");
//		System.out.println("수학점수:");
//		System.out.println("영어점수:");
//		
//		Scanner sc = new Scanner(System.in);
//		int ko = sc.nextInt();
//		int eng = sc.nextInt();
//		int math = sc.nextInt();
//		
//		int total;
//		total =(ko+eng+math)/3;
//		float avg;
//		
//		if (ko>=40 &&eng>=40 &&math>=40&& total>60);{
//			System.out.println("합격입니다:");
//		} else{
//			System.out.println("불합격입니다.");
//		}
//		  System.out.println("국어점수:");
//	        System.out.println("수학점수:");
//	        System.out.println("영어점수:");
//
//	        Scanner sc = new Scanner(System.in);
//	        int ko = sc.nextInt();
//	        int eng = sc.nextInt();
//	        int math = sc.nextInt();
//
//	        int total;
//	        total = (ko + eng + math) / 3; // <--- 세 과목의 평균을 구하기 위해서 괄호로 묶어줘야 합니다.
//
//	        // 여기서 오류가 있습니다. total이 60 이상이 아닐 때도 합격으로 출력됩니다.
//	        // if 문에서의 조건식에서 세 과목의 점수가 모두 40 이상인지와 평균이 60 이상인지를 확인해야 합니다.
//	        if (ko >= 40 && eng >= 40 && math >= 40 && total > 60){ // <--- 여기에 있는 세미콜론(;)을 제거해야 합니다.
//	            System.out.println("합격입니다:");
//	        } else {
//	            System.out.println("불합격입니다.");
//	        }
}

	
		

		
		
		
		//이건 gpt
//		System.out.println("국어점수:");
//		System.out.println("수학점수:");
//		System.out.println("영어점수:");
//
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//
//		// 각 과목별로 40점 이상인지 확인
//		boolean isKoreanPass = num1 >= 40;
//		boolean isMathPass = num2 >= 40;
//		boolean isEnglishPass = num3 >= 40;
//
//		// 세 과목이 모두 40점 이상이고, 평균이 60점 이상인지 확인
//		boolean isAveragePass = (num1 + num2 + num3) / 3.0 >= 60;
//
//		// 합격 여부 판별
//		String result = isKoreanPass && isMathPass && isEnglishPass && isAveragePass ? "합격입니다." : "불합격입니다.";
//		System.out.println("결과: " + result);

		
		
//		System.out.println("국어점수:");
//		System.out.println("수학점수:");
//		System.out.println("영어점수:");
//		
//		// 각 과목별로 40점 이상인지 확인
//		boolean isKoreanPass = num1 >= 40;
//		boolean isMathPass = num2 >= 40;
//		boolean isEnglishPass = num3 >= 40;
//
//		// 세 과목이 모두 40점 이상이고, 평균이 60점 이상인지 확인
//		boolean isAveragePass = (num1 + num2 + num3) / 3.0 >= 60;
//
//		// 합격 여부 판별
//		String result = isKoreanPass && isMathPass && isEnglishPass && isAveragePass ? "합격입니다." : "불합격입니다.";
//		System.out.println("결과: " + result);
		
		
//		Scanner sc =new Scanner(System.in);
//		 int num1 =sc.nextInt();
//		 int num2 =sc.nextInt();
//		 int num3 =sc.nextInt();
//		 
//		 String result = (num1,num2,num3) < 40 ? "불합격입니다." : ((num1*num2*num3)/3) >= 60 ? "합격입니다." : "불합격입니다.";
//	     System.out.println("결과: " + result);
//		 
		 
		
//		 합격 불합격
 
		
		
		
		
		
		
		
		
		
		
		

		
//		키보드로 정수를 입력 받은 정수가 양수이면서 짝수 일때만 짝수다를 출력하고 
//		짝수가 아니면 홀수다를 출력하세요
//		양수가 아니면 양수만 입력해주세요를 출력하세요
//		System.out.print("숫자를 한 개 입력하세요");
//		Scanner sc =new Scanner(System.in);
//		 int num =sc.nextInt();
//	    
//	     if (num <=0) {
//	    	 System.out.print("양수만 입력해주세요");
//	     }else if(num %2 !=1) {
//	    	 System.out.print("짝수다");
//	     }else if (num %2 ==1) {
//	    	 System.out.print("홀수다");
//	     }
//	
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	아래예시오;ㅏ 같이 메뉴를 출력하고 메뉴 번호를 누르면 00메뉴입니다. 를
//	종료 번호를 누르면 프로그램이 종료도비니다. 를 출력하세요
//	1.입력
//	2.수정
//	3.조회
//	4.삭제
//	7.종료
//	메뉴 번호를 입력하세요:3
//	메뉴 조회입니다


//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		System.out.println("메뉴번호를 입력하세요:");
//		
//		
//	Scanner sc =new Scanner(System.in);
//	String num= sc.next();
//	
//	switch (num) {
//	case "1" :
//		System.out.println("입력 메뉴입니다.");
//		break;
//	case "2" :
//		System.out.println("수정 메뉴입니다.");
//		break;
//	case "3" :
//		System.out.println("조회 메뉴입니다.");
//		break;
//	case "4" :
//		System.out.println("삭제 메뉴입니다.");
//		break;
//	case "7" :
//		System.out.println("입력을 종료합니다.");
//		default:
//			System.out.println("잘못 입력하셨습니다.");
		
		
	
	
	

//		Scanner sc =new Scanner(System.in);
//		String num= sc.next();
//		switch (num) {
//		case "1":
//			System.out.println("1입니다.");
//			
//		case "2":
//			System.out.println("2입니다.");
//			
//		case "3":
//			System.out.println("3입니다.");
//			
//			default :
//			System.out.println("값이없습니다.");
//			
//		}
		
		
	
	
	
	
//	if() {
//		//수행될문장
//	}else if {
////수행될문장
//	}else if
//}


