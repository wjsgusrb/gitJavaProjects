package HomeWork;
import java.util.Scanner;
public class pre1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//numbur이라는 변수에 int형 값을 하나 입력받아
		//출력해라 
		//	int number =100;
		//	
		//	 System.out.println(number);
		//	 System.out.print("숫자하나를 입력하시오 ");
		//		int num=sc.nextInt();
		//		
		//	 
		////	 if(num==100) {
		////		 System.out.print(num+" :100입니다.");
		////	 }else if(num<100){
		////		 System.out.print(num+"는 :100보다 작습니다.");
		////	 }else {
		////		 System.out.print(num+"는 :100보다 큽니다.");
		////		 return;
		////	 }
		//		int sum = 0,sum1=0;
		//		
		//		String num1="";
		//	
		////	 for(int i=1;i<=num;i++) {
		////	sum=sum+i;
		////	 }
		////	
		////	System.out.print(num+""+sum);
		//		for (int i = 1; i <= num; i++) {
		//            sum = sum + i; // 1부터 num까지의 값을 누적하여 sum에 저장
		//            num1 += i;
		//            if (i < num) {
		//               num1 += "+";
		//               
		//            }
		//        }
		//	

		//        System.out.println(" " + num + "까지의 합: " + num1 + "=" + sum);







		//입력받은 값 num이 100보다 작은 정수이면 "100이하" 출력
		//100이면 "100" 100이상이면 "100을 초과하였습니다. 다시 입력해주세요"를 출력한 후
		//100이하가 입력될때 까지 반복한다.
		//1부터 입력받은 num값까지의 전부를 더한 값을 구해라
		// ex) num = 5일 때 1+2+3+4+5인 15출력      

		//길이가 100인 int형 1차원배열 arr을 생성하고
		//1~num까지의 수를 순서대로 배열에 저장하고 출력해라
		//  int[] arr = new int[100];
		//for(int i=0;i<=arr.length;i++) {
		//	System.out.print(arr[i+1]);
		//}
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
		//Book클레스를 작성해라
		//code(숫자), title(문자열), author(문자열)
		//모든 필드데이터를 초기화하는 생성자를 만들어라
		// getter,setter를 작성해라
		//toString메서드를 장성해라

		//메인메서드에서 Book객체를 10개 담을 수 있는 Book형 배열 BookList를 만들고
		//10개의 Book을 생성해서 저장해라
		//BookList의 모든 Book의 toString 메서드를 호출하여 저장이 잘 되었는지 확인해보자
		Book[] bookList = new Book[10]; // Book 객체를 10개 담을 수 있는 배열 생성


		bookList[0] = new Book(1, "Title 1", "Author 1");
		bookList[1] = new Book(2, "Title 2", "Author 2");
		bookList[2] = new Book(3, "Title 2", "Author 2");
		bookList[3] = new Book(4, "Title 2", "Author 2");
		bookList[4] = new Book(5, "Title 2", "Author 2");
		bookList[5] = new Book(6, "Title 2", "Author 2");
		bookList[6] = new Book(7, "Title 2", "Author 2");
		bookList[7] = new Book(8, "Title 2", "Author 2");
		bookList[8] = new Book(9, "Title 2", "Author 2");
		bookList[9] = new Book(10, "Title 2", "Author 2");

		for (Book book : bookList) {
			if (book !=null) { 
				System.out.println(book.toString());
			}
		}


	}
}