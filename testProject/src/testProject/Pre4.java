package testProject;
import java.util.Scanner;
public class Pre4 {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	        int num1, num2;
        System.out.print("첫 번째 숫자를 차례대로 입력하세요: ");
	        num1 = sc.nextInt();       
	        if (num1 < 1) {
	            System.out.println("1 이상의 수를 입력하세요."); 
	            num1 = sc.nextInt();
	        }
	        System.out.print("두 번째 숫자를 차례대로 입력하세요: ");
	        num2 = sc.nextInt();
	        if (num2 < 1) {
	            System.out.println("1 이상의 수를 입력하세요.");        
	            num2 = sc.nextInt();
	        }
	        if (num2 < num1) {
	            int j = num1;
	            num1 = num2;
	            num2 = j;
	        }
//	        for (int i = num1; i <= num2; i++) {
//	            System.out.println(i);
//	        }
	        int i = num1;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= num2);
	 

	        
	 }


	        
	        
	        
	        
//	        int j = (num2 < num1) ? (num1 = num2) : num2;
//	        int temp = (num2 < num1) ? (num1 = num2) : num2;
//	        int temp = (num2 < num1) ? (num1 = num2) : (num2 = num1);
//	        for (int i = (num1 < num2) ? num1 : num2; i <= (num1 < num2) ? num2 : num1; i++) {
//	            System.out.println(i);
	        // 두 숫자 사이의 숫자를 출력하는 반복문
//	        for (int i = num1; i <= num2; i++) {
//	            System.out.println(i);
	        }
//	            if (num2 < num1) { // <--- 화살표 표식
//	                int temp = num1;
//	                num1 = num2;
//	                num2 = temp;
//	            }
//	            // 두 숫자 사이의 숫자를 출력하는 반복문
//	            for (int i = num1; i <= num2; i++) {
//	                System.out.println(i);
//	            }
//	        }
	        // 두 숫자 사이의 숫자를 출력하는 반복문
//	        if(num2>num1) {
//	        for (int i = num1; i <= num2; i++) {
//	            System.out.println(i);
//	        }
//	         for (int i = num1>num2?num1:num2 ; i <=0; i++) {
//	            System.out.println(i);

	 
	 

//조건식 ? 표현식1 : 표현식2

//	         }
//	           
//	         }else{
//	        for (int i = num1; i <= num2; i++) {
//	            System.out.println(i);
//	        }
//	         }
//	 }
//}

//		   Scanner sc = new Scanner(System.in);
//	int num1,num2;
//	
//	 
//	 System.out.print("첫번째 숫자를 차례대로 입력하세요: ");
//	 num1 = sc.nextInt();
//	 if(num1<1)
//    	 System.out.println("1이상의수를입력하세요");
//	 System.out.print("두번쨰 숫자를 차례대로 입력하세요: ");
//	 num2 = sc.nextInt();
//	 if(num2<1)
//    	 System.out.println("1이상의수를입력하세요");
//	 for (int i = num1;num2==i; i++) {
//     System.out.println(i );
//	 }
	 
		   
		   
		   
		   
		   
		   
		   
//	        int num,sum;
//	        num=1;
//	        sum=0;
////	        do {
//	            System.out.print("숫자를 입력하세요: ");
//	            num = sc.nextInt();
////
////	            if (num <= 1) {
////	                System.out.println("1 이상의 숫자를 입력하세요.");
////	            }
////	        } while (num <= 1);
//	            int i;
//	        for ( i = num; i <=num; i++) {
//	        	sum =(sum+i); 
//	        	if (num ==i) {
//		                System.out.println(i+"=");
//	        	 }else {
//		                     System.out.println(i+"+");
//		                		 
//	            System.out.print(i+"+");
//	            sum += num;
//	        }
//	        System.out.print(sum);
//	        
//	        Scanner sc = new Scanner(System.in);
//	        int num;
//
//	        for (;;) {
//	            System.out.print("숫자를 입력하세요: ");
//	            num = sc.nextInt();
//
//	            if (num <= 1) {
//	                System.out.println("1 이상의 숫자를 입력하세요.\n");
//	            } else {
//	                break;
//	            }
//	        }
//
//	        for (int i = num; i >= 1; i--) {
//	            System.out.println(i);
//	        }
//		 Scanner sc = new Scanner(System.in);
//		 int i,num;
//		 num  =sc.nextInt();
//		 for(i=100;num>i;i--);
//		 System.out.println(i);
//		  Scanner sc = new Scanner(System.in);
//	     
//	
//		   int  num;
//		   num=1;
//	       while(num<0)
//	        System.out.println("1이상 숫자를 입력하세요");
//	        num = sc.nextInt();
//	        //입력받은 값부터 1까지 반복해라
//	  	if(num>0) {
//	  		for (int i = num; i >= 1; i--) {
//	            System.out.println(i + "");
//	  	  System.out.println("1이상의 숫자를 입력하세요");
//	  	
//	        num = sc.nextInt();
	  	 
	  	
	  		
	 
//	        for (int i=num; i >= 1; i--){
//
//	        System.out.println(i+"");
//	        }
//		    Scanner sc = new Scanner(System.in);
//	        int num;
//	        num = sc.nextInt();
//
//	        // 입력받은 값부터 1까지 반복
//	        for (int i = num; i >= 1; i--) {
//	            System.out.println(i + "");
//	        }
	        
//		 int j,num;
//		 do {
//			 System.out.println("1이상의 수를입력하세요")};
//	 }
//			 Scanner sc = new Scanner(System.in);
//		
//			num  =sc.nextInt();
//			 System.out.println("1이상의 수를입력하세요");
//			 
//			 for (int i=0;num<i;i++);
//	 int num =0;
//     int i = 1;
//     do {
//         System.out.println("1이상의수를입력하세요");
//         num  =sc.nextInt();
//         if(num<1)
//        	 System.out.println("1이상의수를입력하세요");
//         else {
//          i=1;
//          
//          while (i <=num) {
//        	  System.out.println("1이상의수를입력하세요");
//          }
//        	  
//          }
//          
//     } while (i <1);
	 



			
			
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 

