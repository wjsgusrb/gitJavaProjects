package Test0822;
import java.util.ArrayList;
import Test0822.B2_1 ;

public class B2 {
    public static void main(String[] args) {
        ArrayList<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit("사과", "빨강"));
        list.add(new Fruit("메론", "초록"));
        list.add(new Fruit("포도", "보라"));
        // list.add("맛있는과일"); // This line causes a type mismatch

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
          
        }
    }

    static class Fruit {
        String name;
        String color;

        public Fruit(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Fruit [name=" + name + ", color=" + color + "]";
        }
    }
}

