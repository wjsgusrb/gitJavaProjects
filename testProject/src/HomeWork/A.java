package HomeWork;
import java.util.Scanner;
public class A {
	 public static void main(String[] args) {
//	        int intValue = 42;
//	        double doubleValue = 3.14159;
//	        String stringValue = "Hello, World!";
//	        Scanner scanner=new Scanner(System.in);
//	        System.out.printf("정수: %d%n", intValue);
//	        System.out.printf("부동소수점: %f%n", doubleValue);
//	        System.out.printf("문자열: %s%n", stringValue);
		 try {
			    int result = 1000000000/0;
			    
			    System.out.print(result);
			} catch (ArithmeticException e ) {
			    System.out.print(e.toString());
			    
			}
		
	
		 
	    }

}