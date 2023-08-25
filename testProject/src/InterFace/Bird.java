package InterFace;
import java.util.*;
public class Bird extends Animal1 implements Animal {
	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	String food;
	Scanner sc = new Scanner(System.in);
//	@Override

	public void eat(String food) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void makeSound() {
		System.out.print("이름을 입력하시오.");
		String name =sc.next();
		System.out.print(name+"은 하늘에서 울고있습니다.\n");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		System.out.println("이름을 입력하시오.");
		String name =sc.next();
		System.out.print(name+"은 하늘을 날아다닌다\n");
		// TODO Auto-generated method stub
		
	}
	@Override
	  public void Swimmable() {
        System.out.println("이름을 입력하시오.");
        String name = sc.next();
        System.out.print(name + "은 물을 헤엄친다\n");
    }
	

}
