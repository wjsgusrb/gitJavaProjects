package 그냥해보는거;

import java.util.Scanner;

public class Pre2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1000에서 1부터 num까지 순서대로 전부 뺸값을출력
		int num,num2;
		System.out.print("숫자하나를입력하시오");
		num=scanner.nextInt();
		scanner.nextLine();
	
		for(int i=1;i<=num;i++) {
			num2=1000-i;
			System.out.println(num2);
		}
		
		int[] num1 = new int[num];
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		//Human추상클레스 작성
		//필드값 : String name ,int age
		//필드를 초기화하는 생성자 작성
		//추상메서드 makeSound
		
		
		
		
		
	}
}

