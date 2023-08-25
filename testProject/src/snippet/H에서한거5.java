package snippet;
import java.util.Scanner;
public class H에서한거5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   System.out.print("문자 하나를 입력하세요: ");
//   다음과 같은 실행 예제를 구현하세요.
//
//   ex.
//   정수 입력 : 4
//   *
//   **
//   ***
//   ****
   int num1 =sc.nextInt();
   	if(num1<0) {
   	 System.out.print("0보다 큰수를 입력하세요 ");
   	}
   	 int j=1;
   	 int i=1;
   	 
//   	 for (int i = 1; i <= num1; i++) {
//         for (j = 1; j <= i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
   	 
   	 for(;j>num1;j++) {
   		 for(;j>i;i++) {
   		 System.out.print("*");
   		 }
   		System.out.println();
   	 }
   	
   	}
}

