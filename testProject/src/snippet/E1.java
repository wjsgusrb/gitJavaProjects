/////이거꼭 다시해보기!!!!!!!!!


package snippet;
import java.util.Scanner;
public class E1 {
	public static void main(String[] args) {
		 int num1,num2,i;
		 char num3;
	//1스위치를 활용하여 표현해라 2 2개를 입력해서 연산자를 쓰자(ex)10/3=3)
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("첫째정수를 입력하시오:");
//		 num1 = sc.nextInt();
//		 System.out.println("두째정수를 입력하시오:");
//		 num2 = sc.nextInt();
//		 System.out.println("연산자를 입력하시오:");
//		 num3 = next().charAt(0);
//		 while (true) {
//	            System.out.println("연산자를 입력하시오 (프로그램 종료: exit): ");
//	            String input = sc.next();
//	            if (input.equalsIgnoreCase("exit")) {
//	                System.out.println("프로그램을 종료합니다.");
//	                break;
		 while(true) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("연산자를 입력하시오:  \n프로그램을 종료하고싶으면 exit를입력하시오");
	        
	        System.out.println("연산자를 입력하시오:");
	        num3 = sc.next().charAt(0);
	        System.out.println("첫 번째 정수를 입력하시오:");
	        num1 = sc.nextInt();
	        System.out.println("두 번째 정수를 입력하시오:");
	        num2 = sc.nextInt();
	        System.out.println("연산자를 입력하시오:");
	        num3 = sc.next().charAt(0);
		 
		 
//		 if(num3=='+') {
//			 System.out.println(num1+"+"+num2+"="+(num1+num2)); 
//		 }
//		 if(num3=='-') {
//			 System.out.println(num1+"-"+num2+"="+(num1-num2)); 
//		 }
//		 if(num3=='*') {
//			 System.out.println(num1+"*"+num2+"="+num1*num2); 
//		 }
//		 if(num3=='/') {
//			 System.out.println(num1+"/"+num2+"="+num1/num2); 
//		 }
		 switch(num3) {
		 case '+':
			 System.out.println(num1+"+"+num2+"="+(num1+num2)); 
			   break;
		 case '-':
			 System.out.println(num1+"-"+num2+"="+(num1-num2)); 
			   break;
		 case '*':
			
			 System.out.println(num1+"*"+num2+"="+num1*num2);
			   break;
		 case '/':
			 if(num2==0) {
				 System.out.println("0으로 나눌수가 없습니다.\n프로그램을 종료합니다."); 
				 return;
			 }
			 System.out.println(num1+"/"+num2+"="+num1/num2); 
			   break;
			   
			  
			   }
		
			   
		 }
		 
		 }
		 
		 
	}


