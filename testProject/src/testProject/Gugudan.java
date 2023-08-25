package testProject;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단을 출력할 숫자를 입력하세요: ");
        int num = scanner.nextInt();

        if (num < 2 || num > 9) {
            System.out.println("2에서 9 사이의 숫자를 입력해주세요.");
            return;
        }

        System.out.println(num + "단을 출력합니다.");

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}

