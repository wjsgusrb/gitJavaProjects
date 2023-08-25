package com.kh.pre3;
import java.util.*;
public class Home1 {
	public static void main(String[] args) {
//		1.
		/* 정수하나를 입력받아 5이상의 숫자를 입력하였는지 확인하고
		* 5이상을 입력하였다면 1부터 해당수까지 순차적으로 출력하는 프로그램을 만들어라
		*/
//		2.
		/* 정수 n을 입력받아 길이가 n인 1차원배열을 만들어라 
		* 해당배열에 1~n까지의 수를 차례대로 할당하고 이를 출력하는 프로그램을 작성해라
		*/
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		do { 
//			System.out.print("1이상의 정수를 입력하시오");
//            num = sc.nextInt();
//        } while (num < 1);
////
////			for(int i=1;i<=num;i++) {
////				System.out.print(i);
////				
////			}
//		int[] arr1=new int[num] ;
//		int j=1;
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i]=j++;
//		    System.out.print(arr1[i]+" ");
//		}
//		  클래스를 이용하여 객체 생성
		
//        Person person1 = new Person("John", 30);
//        Person person2 = new Person("Alice", 25);
//
//        // 객체의 메서드 호출
//        person1.introduce();
//        person2.introduce();
        Menu popcorn = new Menu("팝콘", 5000, 10);
        Menu coke = new Menu("콜라", 3000, 20);
        Menu nachos = new Menu("나쵸", 4500, 15);

        // 메뉴 정보 출력
        System.out.println("=== 메뉴 정보 ===");
        popcorn.printMenuInfo();
        System.out.println();
        coke.printMenuInfo();
        System.out.println();
        nachos.printMenuInfo();
        System.out.println();

        // 주문 처리
        Scanner sc = new Scanner(System.in);
        System.out.println("주문하실 메뉴를 선택하세요.");
        System.out.println("1. 팝콘");
        System.out.println("2. 콜라");
        System.out.println("3. 나쵸");
        int choice = sc.nextInt();

        System.out.println("수량을 입력하세요.");
        int quantity = sc.nextInt();

        switch (choice) {
            case 1:
                popcorn.updateStock(quantity);
                break;
            case 2:
                coke.updateStock(quantity);
                break;
            case 3:
                nachos.updateStock(quantity);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
		
	}
}
