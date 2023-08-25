package snippet;
import java.util.Scanner;
public class D1 {
	public static void main(String[] args) {
		 int num1,num2,i;
		//1 10번반복해라 2반복할때마다입력값을 더한다
		 Scanner sc = new Scanner(System.in);
		 num1=1;
		 num2=1;
		
		 System.out.println("시작숫자값을 입력하시오:");
		  num1 = sc.nextInt();
		  System.out.println("공차값을 입력하시오:");
		  num2 = sc.nextInt();
//		    do {
//	    
//	            System.out.println(num1+(i*num2));
//	            i++;
//	           
//	        } while (i <=9);
		  for( i=0;i<=9;i++) {
			  System.out.println(num1+(i*num2));
		  }
		 }
	}

