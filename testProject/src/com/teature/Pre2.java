package com.teature;
import java.util.Scanner;

public class Pre2 {
	 public static void main(String[] args) {
	
	

	// main메서드를 실행해주기위한 class

	      Scanner sc = new Scanner(System.in);
	      // 인스턴스 객체생성 방법
	      // 클레스 객체이름 = new 생성자(클레스와 이름이 동일한 메서드);
//	      Student choi = new Student("최지원", 48, "여자");
//	      Student kim = new Student("김라라", 12, "남자");
//	      아래 두 코드를 실행되면 각기 다른 결과값이 나타난다
//	      이를통해 각기 다른 메모리공간을 확보하고 사용한다는 것을 알 수 있다.
//	      choi.info();
//	      kim.info();
	      
	      
	      
//	      영어점수 수학점수 국어점수를 입력받아
//	      각과목이 40점이상이고 평균이 60점 이상일 때 합격
//	      조건을 충족하지 못하면 불합격을 나타내주는 프로그램작성
//	      ex) 영어점수 : 40
//	          국어점수 : 70
//	          수학점수 : 70
//	         총 합 : 180
//	         평 균 : 60.0
//	          합격입니다.      
	      String Student;
	      
	      Student choi = new Student("최지원", 65, "남자");
	      
	      System.out.print("영어점수 : ");
	      choi.setEnScore(sc.nextInt());
	      
	      System.out.print("국어점수 : ");
	      choi.setKoScore(sc.nextInt());
	      
	      System.out.print("수학점수 : ");
	      choi.setMathScore(sc.nextInt());
	      
	      System.out.println("총 합 : " + choi.getTotal());
	      System.out.println("평 균 : " + choi.getAvg());   
	      System.out.println("영어점수 : " + choi.getEnScore());
	      System.out.println("수학점수 : " + choi.getMathScore());
	      System.out.println("국어점수 : " + choi.getKoScroe());
	      
	      choi.checkPass();

	   }
	 
}

