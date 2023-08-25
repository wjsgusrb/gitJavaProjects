package a0824;



public class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
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

	    public void setAge(int age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Person{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }

	    public static void main(String[] args) {
	        Person[] people = new Person[2];

	        people[0] = new Person("Alice", 25);
	        people[1] = new Person("Bob", 30);

	        for (Person person : people) {
	            System.out.println(person);
	        }
	    }
	
	    

}
