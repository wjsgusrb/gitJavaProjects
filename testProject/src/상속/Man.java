package 상속;

public class Man {

	public Man() {
		System.out.print("man");
	}
	
	public Man(String name) {
		this.name=name;
	}
	
	
	String name;
	public void tellYourName() {
		System.out.print("나의이름은"+name);
	}
	
	
	
}
