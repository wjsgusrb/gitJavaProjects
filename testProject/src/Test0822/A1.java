package Test0822;
import java.util.Scanner;
public class A1 {
	//메인작성x
	//public static void main(String[] args)으로작성
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//false로해서

		while(true) {
			System.out.print("문자열을 입력해주세요.");
			String str = sc.nextLine();
			if(str.equals("exit")) {

				break;
			}else  {
				System.out.print(str.length()+"글자입니다.");
				break;
			}


		}
		System.out.print("프로그램을 종료합니다.");
	}
}
