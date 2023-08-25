package snippet;
import java.util.Scanner;
public class H에서연습한거3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("문자 하나를 입력하세요: ");
        char inputChar = sc.next().charAt(0);

        int unicodeValue = (int) inputChar;
        System.out.println("입력한 문자의 유니코드 값: " + unicodeValue);
//		 Scanner sc = new Scanner(System.in);
//		int num1;
//		char num2;
//		System.out.print("-포함 주민번호를 작성하시오:");
//		num2 =sc.next().charAt(7);
//		System.out.print(num2);
//		
//	if(num2==1) {
//		System.out.print("남자");
//	}else if(num2==2) {
//		System.out.print("여자");
//	}else if(num2==4) {
//		System.out.print("여자");
//	}else if(num2==3) {
//			System.out.print("남자");
//			return;
//	}
//	 Scanner sc = new Scanner(System.in);
//     int num1;
//     String num2;
//
//     System.out.print("-포함 주민번호를 작성하시오:");
//     num2 = sc.next();
//     char genderChar = num2.charAt(6);
//
//     System.out.print(genderChar);
//
//     if (genderChar==1) {
//         System.out.print("남자");
//     } else if (genderChar == '2') {
//         System.out.print("여자");
//     } else if (genderChar == '4') {
//         System.out.print("여자");
//     } else if (genderChar == '3') {
//         System.out.print("남자");
//         return;
//	}
}	
}

