package 그냥해보는거;
import java.util.Scanner;
public class Student extends Human implements sleepable {
	Scanner scanner = new Scanner(System.in);


	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sleep() {
		 System.out.println("이름을 입력하시오.");
	        String name = scanner.next();
	        System.out.print(name + "은 잠을 잡니다\n");

		// TODO Auto-generated method stub
//	        public void Swim() {
//	        	
//	        }
//		
	}

}
