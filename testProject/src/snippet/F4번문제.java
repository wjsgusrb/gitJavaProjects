package snippet;
import java.util.Scanner;
public class F4번문제 {
	public static void main(String[] args) {
//		정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀수/짝수를 나눠서
//		홀수면 ‘박’, 짝수면 ‘수’를 출력하도록 하세요.
//		단, 입력 받은 수가 양수가 아니면 “양수가 아닙니다”를 출력하세요. 
		Scanner sc = new Scanner(System.in);
		int num1,num2,i;
		System.out.print("숫자를 입력하세요: ");
		num1=sc.nextInt();
		if(num1<=0) {
			System.out.print("0이상의 수를 입력하시오: ");
			num1=sc.nextInt();
		}
		if(num1%2==0) {
			System.out.print("짝수입니다. ");
		}else {
			System.out.print("홀수입니다 ");
		}
		i=0;
		for(;num1>i;i++) {
			if(i%2==0) {
				System.out.print("박");
			}else {
					System.out.print("수");	
				}
		
			}
		}
		
//		 int num1,num2,i;

		 
		 
		 
//	num1=sc.nextInt();
//	i=1;
//	for(;i<=num1;i++) {
		
//		System.out.println();
//		
//	}
//	/**
//	 * *
//	 * **
//	 * ***
//	 * ****
//	 * 이런식으로 만들기 2번반복해야된다 첫번쨰는 
//	 */
//for(;num1==4;) {
//	System.out.println("*\n**\n***\n****");
//		break;
//	}
		//for(;num1==4;) {
//			System.out.println("*\n**\n***\n****");
//				break;
//
//System.out.print("숫자를 입력하세요: ");
//		 System.out.print("정수:");
//int num = sc.nextInt();
//
//for (int i = 1; i <= num; i++) {
//    for (int j = 1; j <= i; j++) {
//        System.out.print("*");
//    }
//    System.out.println();
//}
}
