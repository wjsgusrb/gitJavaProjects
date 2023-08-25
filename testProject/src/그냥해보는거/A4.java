//package 그냥해보는거;
//
//public class A4 {
//	  public static void main(String[] args) {
//	        Human<String> jiwon = new Human<>("지원", 20);
//	        String name = jiwon.getName();
//	        int age = jiwon.getAge();
//
//	        System.out.println("Name: " + name);
//	        System.out.println("Age: " + age);
//	    }
//	
//}
//class Human<T> {
//    private T name;
//    private int age;
//
//    public Human(T name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public T getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
package 그냥해보는거;

public class A4 {
    public static void main(String[] args) {
        Human1<String> jiwon = new Human1<>("지원", 20);
        String name = jiwon.getName();
        int age = jiwon.getAge();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Human1<T> {
    private T name;
    private int age;

    public Human1(T name, int age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

