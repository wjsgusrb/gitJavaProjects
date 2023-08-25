package com.kh.javai;
//main메서드를 실행해주기위한 class
import java.util.Scanner;
public class MainStart {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//인스턴스 객체생성 방법은 아랫줄에
		//클레스 객체이름=new 생성자(클레스와 이름이 동일한 메서드);
//		Student jeon =new Student("전현규",20,"남자");//
//		Student jon =new Student("존");
//		Student park =new Student("박지원",200,"남자");
		//아래 두 코드를 실행되면 각기 다른 결과값이 나타난다
		//이를 통해 각기 다른 메모리 공간을 확보하고 사용한다는 것을 알수있다
//		jeon.info();
//		park.info();
// 영어점수 수학점수 국어점수를 입력받아 각 과목이 40점이상이고 평균이 60점 이상일때
//조건을 충족하지 못하면 불합격을 나타내주는 프로그램작성	
		 int num1,num2,num3;
		 System.out.println("수학점수를 입력하시오");
		 num1=sc.nextInt();
		 System.out.println("영어점수를 입력하시오");
		 num2=sc.nextInt();
		 System.out.println("국어점수를 입력하시오");
		 num3=sc.nextInt();
		
		
		Student park =new Student(num1,num2,num3);
		Student kim =new Student("소망",25,"사랑");
		
		park.info();
	//
		//displatMyInfo 메서드를 작성해보자
		//매게변수는 없고
		//리턴값도 존재하지않는다
		//실행해 결과로
		//저는 00살의 000입니다.
		//국어:00점
		//영어:00점
		//수학:00점
		//합계:00점
		//평균:00점
		//으로 시험에 합격하였습니다.
		
	}
}
