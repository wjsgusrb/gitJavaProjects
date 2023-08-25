package snippet;
import java.util.Scanner;
public class C1 {
	public static void main(String[] args) {
		 int num1,num2;
		//1 입력받는다 FOR문사용 입력받은NUM에 반복하는I를 구하자 (구구단)
		 Scanner sc = new Scanner(System.in);
//		 num1=0;
		 System.out.println("1이상의 수를 입력하시오");
         num1 = sc.nextInt();
		 if (num1>=10) {
			 do {
		            System.out.println("다시적어");
		            num1 = sc.nextInt();
			 } while (num1 > 10); 

		 }
		 
		 num2=1;
		 System.out.println("====="+num1+"단=====");
		 do {
	            System.out.println(num1+"*"+num2+"="+(num2*num1));
	            num2++;
	        } while (num2 <=9);
		 }
		
		
		
	}
	


