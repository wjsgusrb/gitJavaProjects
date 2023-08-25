package testProject;

public class Study0802 {
	 public static void main(String[] args) {
//		 System.out.println("프로그램의 시작");
//		 hiEveryone(12);//이건 함수다
//		 hiEveryone(13);//함수인걸 표현할려고 뒤에()가붙은거임
//		 System.out.println("프로그램의 끝");
//	 }
//	 public static void hiEveryone(int age) {//(int age)=매개변수
//		 System.out.println("좋은아침입니다.");
//		 System.out.println("제나이는"+age+"세입니다.");
//	 }
//	 public static void main(String[] args) {
//		 double myHeight =175.9;
//		 hiEveryone(12,120.5);
//		 byEveryone();
//		 hiEveryone(13,myHeight);
//		 byEveryone();
//	 }
//		 public static void hiEveryone(int age,double height) {
//			 System.out.println("제나이는"+age+"세입니다.");
//			 System.out.println("저의키는"+height+"cm 입니다.");
//			 
//		 }
//		 public static void byEveryone() {
//			 System.out.println("다음에뵙겠습니다");
//		 }
//		 
//	 public static void main(String[] args) {
//		 int result;
//		 result = adder(4,5); 
//		 System.out.println("4+5="+result);
//		 System.out.println("3.5*3.5="+square(3.5));
//	 }
//		 public static int adder(int num1, int num2) {
//			 int addResult =num1+num2;
//			 return addResult ;
//		 }
//		 public static double square(double num) {
//			 return num*num;
//		 }
//		 
		 
		 
		 

	 
		 //문자형 변수str을 생성하고 안녕하세요로 초기화한다
		 //만약 str의 있는 값이 hi;라면 hi hi가아니라면 str의 들어있는 값을 출력한다
		 //정수형 1차원배열 arr을 생성하고 값을 전부 5로 초기화한다
		 //arr에 들어있는 데이터를 전부출력한다
		 //3행 2열의 char형 2차원 배열 arr2를 생성하고 a~f를 순차적으로 대입한다
		 //arr2를 전부 출력한다
//		String str;
//		str="안녕하세요";
//		if (str!="hi") {
//			System.out.print(str);
//			}
//		
//		int[] arr = new int[8];
//		for(int i=0;i<arr.length;i++)
//			arr[i]=5;
		 
		
//		char[][] arr2 = new char[3][2];
//		arr2[0][0]='a';
//		arr2[0][1]='b';
//		arr2[1][0]='c';
//		arr2[1][1]='d';
//		arr2[2][0]='e';
//		arr2[2][1]='f';
//			char ch='a';
//		char[][] arr = new char[3][2];
//	     
//	        for (int i = 0; i < arr.length; i++) {
//	            for (int j = 0; j < arr[i].length; j++) {
//	                arr[i][j] = ch++;
//	                System.out.print(arr[i][j] + " ");
//	            } 
//	            System.out.println();
//	        }

//	        for (int i = 0; i < arr.length; i++) {
//	            for (int j = 0; j < arr[i].length; j++) {
//	                System.out.print(arr[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
//	 public static void main(String[] args) {
//		
//	 System.out.println( factorial(3));
//	}
//	public static int factorial(int n) {
//			 if(n==1)
//				 return 1;
//			 else
//				 return n* factorial(n-1);
//		 }
		 //
//	BankAccount yoon =new BankAccount();
//	BankAccount park =new BankAccount();
//	BankAccount tmp;
		 BankAccount yoon=new BankAccount(300,"현규");
		 yoon.deposit(5000);
	System.out.println("잔액:"+yoon.balance);
	System.out.println(yoon.name);
//	System.out.println(park.balance);
//	
//	yoon.deposit(1000);
//	park.deposit(2000);	 
//	yoon.withdraw(50000);
//	yoon.deposit(200000);
//	
//	yoon.checkMyBalance();
//	tmp=yoon;
//	yoon=park;
//	park=yoon;
//	tmp=null;
//	park.checkMyBalance();
	//메소드 강의18번 써보기	 
		 
	 }
		   
		

		 
	 }
class BankAccount{
//	 BankAccount yoon=new BankAccount(300,"현규");
//	 yoon.deposit(5000);
//System.out.println("잔액:"+yoon.balance);
//System.out.println(yoon.name);
	
	int balance =0;
	String name;
	public BankAccount(int b, String n) {
		 balance = b;
		name = n;
	}
	 public int deposit(int amount) {
		 balance += amount;
		 return balance;
	 }
	 public int withdraw(int amount) {
		 balance -= amount;
		 return balance;
	 }
	 public int checkMyBalance() {
		 System.out.println("잔액: "+ balance);
		 return balance;
	 }
		
	
}
