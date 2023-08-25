package A0823복습;

public class Human {
	public String name;
	public int age;
	public Book[] bookList;
	
	public Human(String j, int i) {
		
	}
	public void Human(String name,int age) {
		this.age=age;
		this.name=name;
		bookList =new Book[10];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setName(int name) {
		this.age = age;
	}
	public Book[] getbooklist() {
		return this.bookList;
	}
	

	

}


