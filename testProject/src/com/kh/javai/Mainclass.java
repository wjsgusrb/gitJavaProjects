package com.kh.javai;
import java.util.*;
public class Mainclass {
	public static void main(String[] args) {
//		System.out.print("hi");
//		class BankAccount{
//			int balance =0;
//			String name;
//			public BankAccount(int b, String n) {
//				 balance = b;
//				name = n;
//			}
//			 public int deposit(int amount) {
//				 balance += amount;
//				 return balance;
//			 }
//			 public int withdraw(int amount) {
//				 balance -= amount;
//				 return balance;
//			 }
//			 public int checkMyBalance() {
//				 System.out.println("잔액: "+ balance);
//				 return balance;
//			 }
//				
//			
//		}
		//1.생성자를 만들자
		//색상,제조회사,타입,엔진,제조날짜를 넘겨받아 초기화하는 생성자를 생성,zero100,maxl
		// 나머지 값들은 알맞은 방식으로 초기화
	int num;
	 Scanner sc = new Scanner(System.in);
			
		
//		 public int color() {
//		      return enScore;
//		   }

//		Car jeonCar=new Car("흰색","bmw","가솔린",5,150,0,0,100);
////		jeonCar.statusDisplay(1);
//		//행동을 입력받고 진행하는 프로그램을 작성하세요
//		//1.달린다 2.멈춘다 3.기름을 충천한다 4.속도와 잔여기름양을 확인한다.
//		System.out.print("1.달린다");
//		System.out.print("2.멈춘다");
//		System.out.print("3.기름을 충천한다");
//		System.out.print("4.속도와 잔여기름양을 확인한다.");
//		System.out.print("다른버튼을 누르면종료");
//		System.out.print("---------------");
//		num =sc.nextInt();
//		boolean isFinish =false;
//		while(!isFinish)
//		switch(num) {
//			case 1:
//				jeonCar.onaxel();
//				break;
//			case 2:
//				jeonCar.onBreak();
//				break;
//			case 3:
//				System.out.print("얼마나 충천하시겠습니까?");
//				int l =sc.nextInt();
//				jeonCar.insertl(l);
//					
//				break;
//			case 4:
//				jeonCar.statusDisliay(2);
//				break;
//				default:
//					isFinish =true;
//		}
//		Student jeon =new Student("지원",2,"남자");
//		jeon.gender="여자";
//		System.out.print(jeon.gender);
		
		char classRoom;
		
		
		//객체이름이yoon choi kimdlfksms student객체를 각각 생성해라
//		Student yoon =new Student("바보",20,"남자");
//		Student choi =new Student("지만",30,"남자");
//		Student kim =new Student("지원",25,"여자");
//		Student[] iban=new Student[3];
//		iban[0]=new Student("바보",20,"남자");
//		iban[1]=new Student("지만",30,"남자");
//		iban[2]=new Student("지원",25,"여자");
		/**
		 *최대 학생의 수가 30인 클레스를 3개(i,h,j) 만들어라
		 *1. 학생추가 
		 *2. 학생제거
		 *3. 학생목록 확인
		 */
		
		Student[] iban=new Student[30];
		Student[] hban=new Student[30];
		Student[] jban=new Student[30];
		Student[] selectBan;
		System.out.print("관리할클레스를 선택해주세요(i j h 반중 선택 다른키워드 입력시 종료)");
		classRoom=sc.next().charAt(0);
		while(true) {
		switch(classRoom) {
		
		case 'i':
			selectBan=iban;
			break;
		case 'j':
			selectBan=jban;
			break;
		case 'h':
			selectBan=hban;
			break;
		default:
			selectBan =null;
		}
		if (selectBan == null) 
			break;
		
		
		boolean isTrue =true;
		while(isTrue) {
			System.out.print("1.학생추가");
			System.out.print("2.학생제거");
			System.out.print("3.학생목록 확인");
			System.out.print("//기타입력시 뒤로");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				String name, gender;
				int age;
				System.out.println("추가할 학생의 이름,나이,성별 을 입력해주세요 .");
				System.out.println("이름:");
				name= sc.next();
				System.out.println("나이:");
				age= sc.nextInt();
				System.out.println("성별:");
				gender=sc.next();
				
				//seleckBan의 마지막 빈자리를 찾는다.
				int index =0;
				while(index<selectBan.length&&selectBan[index]!=null ){
					index++;
					
				}
				if(index==30) {
					System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
				}
				
				else {
					System.out.println("추가할 학생의 이름 나이 성별을 입력해주세요.");
	//				System.out.println("이름:");
	//				name= sc.next();
	//				System.out.println("나이:");
	//				age= sc.nextInt();
	//				System.out.println("성별:");
	//				gender=sc.next();
					selectBan[index]= new Student(name,age,gender);
					
				}
				break;
			case 2:{
				index =0;
				while(index<selectBan.length&&selectBan[index]!=null ) {
					index++;
				}
				if(index==0) {
					System.out.print("삭제할 학생이 없습니다.");
				}else {
					selectBan[index -1]= null;
					Student.count--;
				}
				break;
				
			}
			case 3:{
				System.out.println("---------------");
				System.out.println("이름\t나이\t성별");
				for(int i=0;i<selectBan.length;i++) {
					if(selectBan[i]==null)
						break;
					selectBan[i].info3();
				}
				System.out.println("---------------");
			}
			case 4:
				System.out.println("조회할 학생의 정보를 입력하세요.");
//				int inquiry;//조회
//				selectBan[inquiry]= new Student(name,age,gender);
				 name =sc.next();
				age =sc.nextInt();
				gender =sc.next();
				Student tmp =null;
				for(int i=0;i<selectBan.length;i++) {
					if(selectBan[i]==null) {
						break;
				}else if(selectBan[i].getAge() ==age &&selectBan[i].getName().equals(name)&&selectBan[i].getGender().equals(gender)) {
				break;	
				}
				//조회할 학생의 정보를 입력하세요(이름,나이,성별)
				//해당 학생은 이미 등록 완료되었습니다.
				//or해당학생을 찾을수 없습니다.
//				if(selectBan[inquiry]==for(int i=0;i<selectBan[i].length)) {
//					System.out.println("해당학생은 이미 등록 완료되었습니다");
//				}else {
//					System.out.println("해당 학생을 찾을 수 없습니다.");
//				}
		
		}
		//
		//
		//
		//기타 입력시 뒤로 그정까지 반ㄴ복
		break;
		}
		}
		
}
	}
}

