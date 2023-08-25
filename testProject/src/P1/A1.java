package P1;
import java.util.Random;
import java.util.Scanner;
public class A1 {
	Scanner sc = new Scanner(System.in);
	public void menu() {
		

		int num1=sc.nextInt();

		do {
			switch(num1) {

			case(1) :
//				 insertStudents();
				//학생저장
				break;
			case(2) :
				//학생삭제
				break;
			case(3) :
				//학생출력
				break;

			case(9) :
				//종료
				B1();
				return;

			}
		}while(true);
	}
	private void B1() {
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
		
	}
}


		
	
		
		
	





