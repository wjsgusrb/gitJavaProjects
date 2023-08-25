package P1;

import java.util.Random;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		Scanner sc = new Scanner(System.in);
		
			
		 System.out.println("1,2,3,9번중하나를고르시오.");
			int num1=sc.nextInt();

			do {
				switch(num1) {

				case(1) :
					insertStudents();
					//학생저장
					break;
				case(2) :
					//학생삭제
					break;
				case(3) :
					B1();
					break;

				case(9) :
					//종료
				
					return;

				}
			}while(true);
	}

	private static void insertStudents() {
	
		    System.out.print("학생이름 : ");
		    String name = sc.nextLine();
		    System.out.print("성별 : ");
		    char gender = sc.next().charAt(0);
		    System.out.print("학년 : ");
		    int grade = sc.nextInt();
		    System.out.print("번호 : ");
		    int number = sc.nextInt();

		    for (int i = 0; i < Students.length; i++) {
		        if (Students[i] == null) {
		            Students[i] = new Students(name, gender, grade, number);
		            break;
		        }
		    }
		}
		// TODO Auto-generated method stub
		
	}

	private static void B1() {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"가위", "바위", "보"};

        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위(0), 바위(1), 보(2) 중 하나를 선택하세요.");

        int userChoice = sc.nextInt();
        int computerChoice = random.nextInt(3); // 0, 1, 2 중 하나 랜덤 선택

        System.out.println("사용자 선택: " + options[userChoice]);
        System.out.println("컴퓨터 선택: " + options[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("비겼습니다!");
        } else if ((userChoice == 0 && computerChoice == 2)
                || (userChoice == 1 && computerChoice == 0)
                || (userChoice == 2 && computerChoice == 1)) {
            System.out.println("사용자 승리!");
        } else {
            System.out.println("컴퓨터 승리!");
        }

        sc.close();
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	}
	public class A학생저장 {
		Scanner sc = new Scanner(System.in);
		private Students e=new Students();
		private Students ec = new Students();
		private Students[] Students = new Students[10]; // 객체 배열 생성

		public void add(String name,char gender,int grade,int number) {
			e=new Students(name,gender,grade,number);
			e.setname(name);
			e.setgender(gender);
			e.setgrade(grade);
			e.setnumber(number);

		}


		public Students getStudents() {
			return e;
		}
//		public void insertStudents() {
//		    System.out.print("학생이름 : ");
//		    String name = sc.nextLine();
//		    System.out.print("성별 : ");
//		    char gender = sc.next().charAt(0);
//		    System.out.print("학년 : ");
//		    int grade = sc.nextInt();
//		    System.out.print("번호 : ");
//		    int number = sc.nextInt();
//
//		    for (int i = 0; i < Students.length; i++) {
//		        if (Students[i] == null) {
//		            Students[i] = new Students(name, gender, grade, number);
//		            break;
//		        }
//		    }
//		}
	

		

		
		

}
}
