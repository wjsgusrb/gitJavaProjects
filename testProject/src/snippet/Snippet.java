package snippet;
import java.util.Scanner;
public class Snippet{
	public static void main(String[] args) {
	                   System.out.println("HelloWorld");
	                   Scanner sc = new Scanner(System.in);
	       	        int num1, num2;
	               System.out.print("첫 번째 숫자를 차례대로 입력하세요: ");
	       	        num1 = sc.nextInt();       
	       	        if (num1<0) {
	       	        	System.out.print("다시적어");
	       	         num1 = sc.nextInt();
	       	        }
	       	     System.out.print("두 번째 숫자를 차례대로 입력하세요: ");
	       	        num2 = sc.nextInt();       
	       	        if (num2<0) {
	       	        	System.out.print("다시적어");
	       	         num2 = sc.nextInt();
	       	        }
	       //	    1234 4321
	       	       if (num1>num2) {
	       	    	   int j =num2;
	       	    	   num2  =num1;
	       	        	
	       	        }
	       	       int i=num1;
	       	       do {
	       	    	System.out.println(i);
	       	    	i++;
	       	       }while (i<num2);
	       	       
	       	    
}
}