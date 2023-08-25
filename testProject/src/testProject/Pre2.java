package testProject;
import java.util.Scanner;
public class Pre2 {
	public static void main(String[] args) {
		
		/**
		 * 실행할 기능을 선택하세요.
		 * 1 권한 확인
		 * 2 bmi
		 * 3rPtlrsk
		 * 4 pf
		 */
		Scanner sc = new Scanner(System.in);
			int num;
			System.out.println("실행할 기능을 선택하시오:");
			System.out.println("1:권한 확인");
			System.out.println("2:bmi");
			System.out.println("3:계산기");
			System.out.println("4:점수확인");
			num = sc.nextInt();
			
		switch(num) {
		case 1:
			//복붙
			break;
		case 2:
			//복붙
			break;
		case 3:
			//복붙
			break;
		case 4:
			
			
	    	int num1,num2,num3,num4;
	    	double re;
	    	System.out.println("중간고사 점수를입력하시오:");
	    	 num1 = sc.nextInt();
	    	 System.out.println("기말고사 점수를입력하시오:");
	    	 num2 = sc.nextInt();
	    	 System.out.println("과제고사 점수를입력하시오:");
	    	 num3 = sc.nextInt();
	    	 System.out.println("출석횟수를 입력하시오:");
	    	 num4 = sc.nextInt();
	    	 
	    	 re =(num1*0.2+num2*0.3+num3*0.3+num4);
	    	
	    	 System.out.println("중간환산점수:"+num1*0.2);
	    	 System.out.println("기말환산점수:"+num2*0.3);
	    	 System.out.println("과제환산점수:"+num3*0.3);
	    	 System.out.println("출석점수:"+(float)num4);
	    	 System.out.println("=======결과=========");
	    	 System.out.println("총점:"+((num1*0.2)+(num2*0.3)+(num3*0.3)+(num4)));
	    	 	if((num1*0.2)+(num2*0.3)+(num3*0.3)+(num4)>70 && num4>(20*0.7)) {
	    	 			System.out.println("결과:"+"합격");
	    	 }		else if((num1*0.2)+(num2*0.3)+(num3*0.3)+(num4)>70){
	    			 System.out.println("결과:"+"출석미달불합격");
	    	 }		else {
	    		 		System.out.println("결과:"+"점수미달불합격");
	    	 }
		           
			default:
				
			
		}
		
		
		
//		/**
//		 * 중간 기말 과제점수 출석횟수를 입력하고 pass또는 fail를 출력하세요
//		 * 평가 비율은 중간20 기말30 과제 30 출럭20 으로이루어져있고
//		 * 출석비율은출석회수의일수로만 계산한다 70점 이상일경우탈락
//		 * 중간:
//		 * 기말:
//		 * 과제:
//		 * 출석횟수:
//		 * =======결과=========
//		 * 중간환산점수:
//		 * 기말환산점수:
//		 * 과제환산점수:
//		 * 출석점수:
//		 * 총점:
//		 * 결과:
//		 */
//		Scanner sc = new Scanner(System.in);
//    	int num1,num2,num3,num4;
//    	double re;
//    	System.out.println("중간고사 점수를입력하시오:");
//    	 num1 = sc.nextInt();
//    	 System.out.println("기말고사 점수를입력하시오:");
//    	 num2 = sc.nextInt();
//    	 System.out.println("과제고사 점수를입력하시오:");
//    	 num3 = sc.nextInt();
//    	 System.out.println("출석횟수를 입력하시오:");
//    	 num4 = sc.nextInt();
//    	 
//    	 re =(num1*0.2+num2*0.3+num3*0.3+num4);
//    	
//    	 System.out.println("중간환산점수:"+num1*0.2);
//    	 System.out.println("기말환산점수:"+num2*0.3);
//    	 System.out.println("과제환산점수:"+num3*0.3);
//    	 System.out.println("출석점수:"+(float)num4);
//    	 System.out.println("=======결과=========");
//    	 System.out.println("총점:"+((num1*0.2)+(num2*0.3)+(num3*0.3)+(num4)));
//    	 	if((num1*0.2)+(num2*0.3)+(num3*0.3)+(num4)>70 && num4>(20*0.7)) {
//    	 			System.out.println("결과:"+"합격");
//    	 }		else if((num1*0.2)+(num2*0.3)+(num3*0.3)+(num4)>70){
//    			 System.out.println("결과:"+"출석미달불합격");
//    	 }		else {
//    		 		System.out.println("결과:"+"점수미달불합격");
    	 }
    	 }
    	
		
		
		
		
		
		
		
		
		
		
	


