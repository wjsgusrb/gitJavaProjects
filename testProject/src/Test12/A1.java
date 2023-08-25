package Test12;
import java.io.Serializable;

import java.io.Serializable;

public class A1 implements Serializable {
//    private String name;
//    private int kcal;
//
//    public A1(String name, int kcal) {  // 생성자 이름 수정
//        this.name = name;
//        this.kcal = kcal;
//    }
//   
//
//    // Getter와 Setter
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getKcal() {
//        return kcal;
//    }
//
//    public void setKcal(int kcal) {
//        this.kcal = kcal;
//    }
//
//    @Override
//    public String toString() {
//        return "Food [name=" + name + ", kcal=" + kcal + "]";
//    }
	package Test0822;

	import java.io.FileWriter;
	import java.io.IOException;

	public class YourClass {
	    public void output() {
	        FileWriter fw = null;
	        try {
	            fw = new FileWriter("test.txt");
	            fw.write(97);
	            fw.write(65);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (fw != null) {
	                    fw.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        YourClass yourObject = new YourClass();
	        yourObject.output();
	    }
}
	



