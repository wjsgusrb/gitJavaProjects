package snippet;
import java.util.Scanner;
public class G실습문제2 {
	public static void main(String[] args) {
		 int num1,num2,i;
		 Scanner sc = new Scanner(System.in);
		 //1. 1~100사이의 수를 입력
		 //2. 두번째 정수를 입력
		 //3. 1>2 일떄 2>1일때
		 //4. 
		 System.out.print("난수를 입력하세요");
		 num1 =sc.nextInt();
		 while(true) {
		 System.out.print("임의의 난수를 입력하세요");
		 num2 =sc.nextInt();	
		 i=1;
		 i++;
		 if(num1==num2) {
	
			 	System.out.print("정답입니다."+i+"회만에 마추셨습니다.");
			 			break;
		 }else if(num1<num2) {
			 	System.out.print("따운.");
		 }else if(num1>num2) {
		 } 		System.out.print("업.");
	}

//		 if(num1==num2) {
//			 System.out.print("정답");
//		 }
//		 for(;num1!=num2;) {
//		 if(num1==num2) {
//			 System.out.print("정답");
//		break;
//		 }else if(num1<num2) {
//			do { System.out.print("광동따운");
//			   num2 =sc.nextInt();
//			   }while(num1==num2);
//			 System.out.print("정답");
//			   
//		 }else if(num1>num2) {
//			 do { System.out.print("업");
//		   num2 =sc.nextInt();
//		   }while(num1==num2);
//			 System.out.print("정답");
//		 
//		  
//		   num2 =sc.nextInt();
//		 }	
//		 }
	

}
}
