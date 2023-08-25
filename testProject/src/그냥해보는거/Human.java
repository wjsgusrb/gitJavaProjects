package 그냥해보는거;
//추상클레스는 추상메서드를 가질수있다.
public abstract class Human {
	protected String name;
	protected int age;
	
	public Human(String name,int age) {
		this.age=age;
		this.name=name;//this는 내class에있는 name 을 매개변수name로 받는거다
//		abstract void makeSound();

	}


}
