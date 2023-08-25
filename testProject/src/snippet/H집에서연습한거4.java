package snippet;
import java.util.Random;
import java.util.Scanner;
public class H집에서연습한거4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int userWins = 0;
        int draws = 0;
        int computerWins = 0;

        while (true) {
            System.out.println("가위바위보를 입력하세요 (가위: 0, 바위: 1, 보: 2, 종료: exit):");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (!input.equals("0") && !input.equals("1") && !input.equals("2")) {
                System.out.println("잘못된 입력입니다. 가위(0), 바위(1), 보(2) 중에서 선택하세요.");
                continue;
            }

            int userChoice = Integer.parseInt(input);
            int computerChoice = random.nextInt(3);

            System.out.println("사용자 선택: " + choiceToString(userChoice));
            System.out.println("컴퓨터 선택: " + choiceToString(computerChoice));

            int result = checkResult(userChoice, computerChoice);
            if (result == 0) {
                draws++;
                System.out.println("비겼습니다!");
            } else if (result == 1) {
                userWins++;
                System.out.println("사용자가 이겼습니다!");
            } else {
                computerWins++;
                System.out.println("컴퓨터가 이겼습니다!");
            }

            System.out.println("--------------------------");
        }

        System.out.println("게임이 종료되었습니다.");
        System.out.println("이긴 횟수: " + userWins);
        System.out.println("비긴 횟수: " + draws);
        System.out.println("진 횟수: " + computerWins);
    }

    public static String choiceToString(int choice) {
        if (choice == 0) {
            return "가위";
        } else if (choice == 1) {
            return "바위";
        } else if (choice == 2) {
            return "보";
        } else {
            return "알 수 없음";
        }
    }

    public static int checkResult(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return 0; // 비김
        } else if ((userChoice == 0 && computerChoice == 2)
                || (userChoice == 1 && computerChoice == 0)
                || (userChoice == 2 && computerChoice == 1)) {
            return 1; // 사용자 승리
        } else {
            return -1; // 컴퓨터 승리
        }
}
}
