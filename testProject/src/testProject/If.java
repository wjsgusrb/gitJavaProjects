package testProject;

import java.util.Scanner;

public class If {
	 public static void main(String[] args) {
//		 abc 사원의 연봉을 각각 입력 받고 각 사원의 영봉과 인센티브를 포함한 연봉을 계산하여 출력하고 
//		 인센티브 포함 급여가 3000만원 이상이면 3000 이상 미만이면 3000미안을 출력하시오
		 
//		 Scanner sc = new Scanner(System.in);
//		
//        System.out.println("A사원 연봉");
//        int num1 = sc.nextInt();
//        System.out.println("B사원 연봉");
//        int num2 = sc.nextInt();
//        System.out.println("C사원 연봉");
//        int num3 = sc.nextInt();
//        
//        double A = num1 + (num1 * 0.4);
//        double B = num2 + (num2 * 0.0);
//        double C = num3 + (num3 * 0.15);
//
//        
//        String resultA = (A < 3000) ? "미만" : "이상";
//        String resultB = (B < 3000) ? "미만" : "이상";
//        String resultC = (C < 3000) ? "미만" : "이상";
//
//        System.out.println( resultA);
//        System.out.println(resultB);
//        System.out.println( resultC);
        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("A사원 연봉");
//        int num1 =sc.nextInt();
//        System.out.println("B사원 연봉");
//        int num2 =sc.nextInt();
//        System.out.println("C사원 연봉");
//        int num3 =sc.nextInt();
//        
//        double a = (num1+num1*0.4);
//        double b = (num2+num2*0);
//        double c = (num3*1.15);
//        
//        String A =((a <3000) ? "미만" : "이상");
//        String B ;
//        		if (b <3000)
//        			B ="미만";
//        			else 
//        				B ="이상";
//        String C =((c <3000 )? "미만" : "이상");
//        
//        System.out.println(num1+","+a+","+A);
//        System.out.println(num2+","+b+","+B);
//        System.out.println(num3+","+c+","+C);
//        

       
        
        
        
      
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//		 Scanner sc = new Scanner(System.in);
//		 String num;
//		 
//		 System.out.println("주민번호를 -를 vhgka하고 작성하시오 " );
//		 num =sc.next();
//		 if (num.charAt(8) =='1'&& num.charAt(8) == '3');
//		 System.out.println("남자" );
//		 else 
//			 System.out.println("여자" );
		 
//  이거문제 다시복습
		
//	        System.out.println("주민번호를 -를 포함하여 작성하시오 ");
//	        num = sc.next();
//
//	        // 주민번호의 8번째 문자가 '1'이면 남자, 아니면 여자로 판별
//	        if (num.charAt(7) == '1') { // 수정: 주민번호의 8번째 문자는 charAt(7)이어야 합니다.
//	            System.out.println("남자");
//	        } else {
//	            System.out.println("여자");
//	        }
//			 
//		 

		 
		 
		 
		 
		 
//		 국어 ㅡ영어 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고 
//		 세과목에 대한 합계 (국+영+수)와 평균 을 구하세요 
//		 세과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		 세과목 점수가 각각 40점 이상이면서 평균이 60점 이상일떄 합격 아니라면 불합격을 출력하세요
		 Scanner sc = new Scanner(System.in);
		 System.out.println("qkqh");
		 System.out.println("qkqh");
		 System.out.println("qkqh");
		 int korean =sc.nextInt();
		 int english =sc.nextInt();
		 int math =sc.nextInt();
		 
		 // 세과목 점수의 합계와 평균 계산
	        int total = korean + english + math;
	        double average =(korean + english + math)/3;
	        

	        // 합격 여부 판별
	        if (korean >= 40 && english >= 40 && math >= 40 && average >= 60) {
	            System.out.println("합격");
	        } else {
	            System.out.println("불합격");
	        }

	        
		 
//		 Scanner sc = new Scanner(System.in);
//	        System.out.println("국어 점수를 입력하시오");
//	        int num1 = sc.nextInt();
//	        System.out.println("영어 점수를 입력하시오");
//	        int num2 = sc.nextInt();
//	        System.out.println("수학 점수를 입력하시오");
//	        int num3 = sc.nextInt();
//	      
//			 String result = (num1,num2,num3) < 40 ? "불합격입니다." : ((num1*num2*num3)/3) >= 60 ? "합격입니다." : "불합격입니다.";
//		     System.out.println("결과: " + result);		
//		     System.out.println("국어 점수를 입력하시오");
//		        int num1 = sc.nextInt();
//		        System.out.println("영어 점수를 입력하시오");
//		        int num2 = sc.nextInt();
//		        System.out.println("수학 점수를 입력하시오");
//		        int num3 = sc.nextInt();
//		        
//		        String result = (num1 >= 40 && num2 >= 40 && num3 >= 40) ? "합격입니다." : "불합격입니다.";
//		        
//
//		        System.out.println("결과: " + result);
		        
		     // 각 과목별로 40점 이상인지 확인
//		        boolean isKoreanPass = num1 >= 40;
//		        boolean isEnglishPass = num2 >= 40;
//		        boolean isMathPass = num3 >= 40;
//
//		        // 합격 여부 판별
//		        String result;
//		        if (isKoreanPass && isEnglishPass && isMathPass) {
//		            result = "합격입니다.";
//		        } else {
//		            result = "불합격입니다.";
//		        }
//
//		        System.out.println("결과: " + result);

		      
		     


	     
		 
		 
		 
//		 Scanner sc =new Scanner(System.in);
////	 int num =sc.nextInt();
////	 if(num>0) {
////		 System.out.println("양수입니다.");
////		 else if (num)
////	 
////	 
////		 if(num>0) {
////			 System.out.println("양수입니다.");
////		 }else {
////			 if (num ==0) {
////				 System.out.println("0입니다.");
////			 }
////			 else {
////			 System.out.println("음수입니다.");
//		 
////}	 		 
////}
//		 int month =sc.nextInt();

//		 Scanner sc =new Scanner(System.in);
//			 if(month ==1|| month ==2|| month ==12);
//		 {
//
//		 season ="겨울";
//		 }else if(month >= 3 && month <=5){
//		 season ="봄";
//		 }else if(month >= 6 && month <=8){
//		 season ="여름";
//		 }else if(month >= 9 && month <=11){
//		 season ="가을";
//		 }else {
//		 season ="해당하는 계절이 없습니다.";
//		 System.out.print(season);
//}
//}
//숫자를 하나 입력 받고 해당숫자가 100보다 크면 3자리 수 이상입니다.
    	//모든사람이 사탕을 골고루 나눠가지려고한다 인우너수와 사탕개소ㅜ를 키보드로 입력받고 1인당동일하게 나눠ㅈ가진 사탕개수와 나눠주고남은갯수
    	//num1 =나눠가진 사탕개수 남은개수는 num2 num =사탕개수 사람수 num4

//    	키보드로 입력 받은 값들을 변수에  기록하고 저장된 변수값을 화면에 출력하여 확인하세요 이때 성별이 m이면 남자f면 여자로 출력 처리하세요
//    	이름:박신우
//    	학년(숫자만):
//    	반
//    	변호
//    	성별
//    	성적(소수점아래 두자리까지)
//    	3학년4반 14번 박신우 여학생의 성적은 92.99이다.]
//    	 Scanner sc = new Scanner(System.in);
//         System.out.println("이름을 입력하시오");
//         String name = sc.next(); // <-- 입력받을 변수 num1의 데이터 타입을 String으로 수정
//         System.out.println("학년(숫자만) 입력하시오");
//         int num2 = sc.nextInt();
//         System.out.println("반을 입력하시오");
//         int num3 = sc.nextInt();
//         System.out.println("번호를 입력하시오");
//         int num4 = sc.nextInt();
//         /**
//          * 시스탬점아웃프린트M("성별()M/F:);
//          * if (gender =="남자)
//          * gender="남학생";
//          * else
//          * gender="여학생";
//          */
//         System.out.println("성별을(남자,여자)로 입력하시오");
//         String gender = sc.next(); // <-- 입력받을 변수 num5의 데이터 타입을 String으로 수정
//       
//         if (gender == "남자")
//        	    gender = "남학생";
//        	else
//        	    gender = "여학생";
////          if (gender =="남자");
////              gender="남학생";
////             else
////             gender="여학생";
////         if (gender.equals("남자")) // <-- if 문 구문 오류를 수정하고, 문자열 비교는 equals() 메소드로 해야합니다.
////             gender = "남학생";
////         else
////             gender = "여학생";
//         System.out.println("성적을 입력하시오");
//         float num6 = sc.nextFloat();
//
//         System.out.println(num2 + "학년 " + num3 + "반 " + num4 + "번 " + name + " " + gender + "은(는) " + num6 + "점을 받았습니다.");
//
//         sc.close();
//    			Scanner sc = new Scanner(System.in);
//    	        System.out.println("이름을 입력하시오");
//    	        int num1 = sc.nextInt();
//    	        System.out.println("학년(숫자만)입력하시오");
//    	        int num2 = sc.nextInt();
//    	        System.out.println("반 을 입력하시오");
//    	        int num3 = sc.nextInt();
//    	        System.out.println("번호을 입력하시오");
//    	        int num4 = sc.nextInt();
//    	        System.out.println("성별을(남자,여자)로 입력하시오");
//    	        int num5 = sc.nextInt();
//    	        if num5 (num5 =="남자")
//    	         num5 = "남학생";
//    	        else 
//    	        	num5 ="여학생";
//    	        System.out.println("성적을 입력하시오");
//    	        int num6 = sc.nextInt();
//    	        
//    	        System.out.println(num2+"학년"+num3+"반"+num4+"번"+ num1+num5+"학생은");
    	        
    	        //나이를 키보드로 입력 받아 어린이(13세이하)인지,청소년(13초과!19ㅅ세이하)
//인지 성인(19세)초과인지 출력하세요
//		 System.out.println("나이를 입력하시오");
//		 Scanner sc = new Scanner(System.in);
//		 int num1;
//  	 num1 = sc.nextInt();
//  	System.out.println("나이 : " + ( num1));
//  	result = num1 >= 18 ? "성인" : "미성년자";
//  	
//  	 System.out.println("나이를 입력하시오");
//     Scanner sc = new Scanner(System.in);
//     int num1;
//     num1 = sc.nextInt();
//     System.out.println("나이: " + num1);

     // 삼항 연산자를 사용하여 성인 또는 미성년자 판별
//     String result = num1 >= 18 ? "성인" : "미성년자";
//     System.out.println("결과: " + result);
//     
//     String result = num1 <= 13 ? "어린이" : num1 > 13 ? "청소년" : num1 > 18 ? "성인" : "미성년자";
//     System.out.println("결과: " + result);
//     
//     String result;
//     if (num1 <= 9) {
//         result = "유아기";
//     } else if (num1 <= 13) {
//         result = "청소년";
//     } else {
//         result = "성인";
//     }
//     System.out.println("결과: " + result);
     
//     String result = num1 <= 9 ? "유아기" : num1 <= 13 ? "청소년" : "성인";
//     System.out.println("결과: " + result);
//
//     sc.close();
  	 
      
    	        
    	        
    	        
    	        
    	        
    	
    	
    	
//        Scanner sc = new Scanner(System.in);
//        System.out.println("나눠가질 사탕 개수와 사람 수를 순서대로 입력하시오.");
//
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt(); // <-- num2 변수를 선언하고 입력값을 받아야 합니다.
//        
//        
//        System.out.println("사탕 개수 = " + ( num1));
//        System.out.println("1인당 나눠가질 사탕 개수 = " + (num1 / num2));
//        System.out.println("나누고 남은 사탕 개수 = " + (num2 % num1)); // <-- 세미콜론 추가
//
//        sc.close();
//    }

    	
    	
//    	 Scanner sc = new Scanner(System.in);
//    	 System.out.println ("나눠가질 사탕개수와 사람수를 순서대로 입력하시오.");
//    	 
//       	 int num1;
//       	 num1 = sc.nextInt();
//       	
//       		
//       		 System.out.println("사람수를입력하시오.");
//       	 }
//    Scanner sc = new Scanner(System.in);
//     int num2;
//     
//       	 
//       	System.out.println ("1인당 나눠가질 사탕개수="+(num2/num1));
//       	System.out.println("나누고 남은 사탕개수"+(num2%num1))
//    	
    	
       	
//   	 Scanner sc = new Scanner(System.in);
//   	 int num1;
//   	 num1 = sc.nextInt();
//   	 if (num1%2==0) {
//   		 System.out.println("짝수입니다.");
//   	 }
//   	 else if (num1%2!=0) 
//   		 System.out.println ("홀수입니다.");
   	 
   	
 
    	
    	
//    	 Scanner sc = new Scanner(System.in);
//    	 int num1;
//    	 num1 = sc.nextInt();
//    	 if (num1>0) {
//    		 System.out.println("양수입니다.");
//    	 }
//    	 else if (num1<0) {
//    		 System.out.println ("양수가 아닙니다.");
//    	 }
//    	 else if (num1==0) {
//    		 System.out.println ("0입니다.");
//    	 }
    	 
    
   
//    	 Scanner sc = new Scanner(System.in);
//    	 int num1;
//    	 num1 = sc.nextInt();
//    	 if (num1>100) {
//    		 System.out.println("3자리 숫자이상입니다.");
//    	 }
//    	 else if (num1<100) {
//    		 System.out.println ("3자리수 미만입니다.");
//    	 }
//    	 
//    	 System.out.println(num1);
//         sc.close();
         
         
    	
    	
    	
  
    	
    	
    	
    	
    	
    	
    	//    	int i =0;
//    	if(true){
//    	int j =1;
//    	System.out.println(j);
//    	}
//    	if (i>=0);
//    	System.out.print(i);
//    	if(true){
//    		int j =1;
//    		System.out.print(i);
//    		}
//    	
    	
    	
    	
    	
    	
    	
    	
   
//        Scanner sc = new Scanner(System.in);
//        
//        int month = sc.nextInt();
//        int temperature = sc.nextInt();
//        
//        String season;
//
//        if (month == 1 || month == 2 || month == 12) {
//            season = "겨울";
//            if (temperature <= -15) {
//                season += " 한파경고";
//            } else if (temperature <= -12) {
//                season += " 한파주의고";
//            }
//        } else if (month >= 3 && month <= 5) {
//            season = "봄";
//        } else if (month >= 6 && month <= 8) {
//            season = "여름";
//            if (temperature > 35) {
//                season += " 폭염경고";
//            } else if (temperature > 30) {
//                season += " 폭염주의고";
//            }
//        } else if (month >= 9 && month <= 11) {
//            season = "가을";
//        } else {
//            season = "해당하는 계절이 없습니다.";
//        }
//
//        System.out.println(season);
//        sc.close();
    }
}

