package InterFace;
import java.util.*;
public class Fish  implements Animal {
	  Scanner sc = new Scanner(System.in);

	    @Override
	    public void eat(String food) {
	        // TODO Auto-generated method stub
	    }

	    @Override
	    public void makeSound() {
	        // TODO Auto-generated method stub
	    }

	    @Override
	    public void fly() {
	        // TODO Auto-generated method stub
	    }

	    @Override
	    public void Swimmable() {
	        System.out.print("이름을 입력하시오.");
	        String name = sc.next();
	        System.out.print(name + "은 물을 헤엄친다");
	    }
//	Scanner sc = new Scanner(System.in);
//
//	@Override
//	public void eat(String food) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void makeSound() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void fly() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void Swimmable() {
//		System.out.print("이름을 입력하시오.");
//		String name =sc.next();
//		System.out.print(name+"은 물을 헤엄친다");
//		// TODO Auto-generated method stub
//		// TODO Auto-generated method stub
//		
//	}

}
