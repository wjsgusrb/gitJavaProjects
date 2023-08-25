package snippet;
import java.util.Scanner;


public class F실습문제1 {
	public static void main(String[] args) {
//		5박수박수박수 4박수박수 0 양수가 아닙니다.
		 Scanner sc = new Scanner(System.in);
		 int num1,num2,num3;
		 System.out.print("정수를입력하세요.");
		 num1 =sc.nextInt();
		 
		 int i=0;
 if(num1<=0) {
	 System.out.print("양수가아닙니다.");
	 return;
 }
// for (i = 1; i <= num1; i++) {
//     if (i % 2 == 1) {
//         System.out.print("박");
//     } else {
//         System.out.print("수");
//     }
 
	 for(i=1;i<=num1;i++)
	 if(i%2==1) {
		 System.out.print("박");
	 } else {
     System.out.print("수");
	 }
	 }
	}

 
		 
		 
	

		 

