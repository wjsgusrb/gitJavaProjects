package 그냥해보는거;
import java.util.Scanner;
public class Pre1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("이름을 입력하세요: ");
	        String inputName = scanner.nextLine();
	        
	        Person person = new Person();
	        person.setName(inputName);
	        
	        System.out.println("Name: " + person.getName());
	        
	        scanner.close();
	    }
	}
//public static void main(String[]args) {
//	Scanner sc = new Scanner(System.in);
//	int num;
//	num=sc.nextInt();
//	if (num%2==1) {
//		System.out.print("홀수입니다");
//	}else {
//		System.out.print("짝수입니다");
//	}
//	int[] num1 = new int[num-1];
//	System.out.print(num1);
//	
//	
//	
	

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


   

