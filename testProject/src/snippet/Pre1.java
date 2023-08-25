package snippet;
import java.util.Scanner;
public class Pre1 {
	public static void main(String[] args) {
		System.out.print("1보다큰 수를 입력하세요");
		 Scanner sc = new Scanner(System.in);
		 int num1,num2;
		 num1= sc.nextInt();
		 if (num1<=0) {
			 do {
				 System.out.println("다시적어");
		            num1 = sc.nextInt();
			 } while (num1 < 0);  	 
		 }
		 num2= sc.nextInt();
		 if (num2<=0) {
			 do {
				 System.out.println("다시적어");
		            num2 = sc.nextInt();
			 } while (num2 < 0);  	 
		 }
		 if (num2<num1) {
			 int i= num1;
			 num1 =num2;
			 num2 =i;
		 }
		 int i = num1;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= num2);
		 }
		 

	}


