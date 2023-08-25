package Test12;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class A2 {
    public static void main(String[] args) {
        A1 food = new A1("사과", 20); // 올바른 A1 클래스 사용
        fileSave("food.dat", food);
    }

    public static void fileSave(String fileName, A1 food) { // 올바른 A1 클래스 사용
        try (
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(food);
            System.out.println("Food 객체가 파일에 저장되었습니다: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


