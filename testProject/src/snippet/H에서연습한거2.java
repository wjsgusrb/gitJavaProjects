package snippet;
import java.util.Scanner;
public class H에서연습한거2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String name;
	        int num2, num3, num4;
	        char num10; // <-----
	        String num9;

	        System.out.println("이름:");
	        name = sc.next();

	        System.out.println("학년(숫자만):");
	        num2 = sc.nextInt();

	        System.out.println("반(숫자만):");
	        num3 = sc.nextInt();

	        System.out.println("번호(숫자만):");
	        num4 = sc.nextInt();

	        System.out.println("성별(M/F):");
	        num10 = sc.next().charAt(0); // <-----

	        System.out.println("성적(소수점 아래 둘째자리까지):");
	        double num6 = sc.nextDouble(); // <-----

	        if (num10 == 'M') {
	            num9 = "남학생";
	        } else {
	            num9 = "여학생";
	        }

	        System.out.println(num2+"" +""+ num3+"" + num4 +""+ name+"" + num9+"" +""+ num6+name);
		
	
	
}
}
