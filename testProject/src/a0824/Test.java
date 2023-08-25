package a0824;
import java.util.ArrayList;

public class Test {
    public void test() {
        ArrayList<Test> list = new ArrayList<>();
        list.add(new Test("자바", 93.5));
        list.add(new Test("디비", 93.5));
        list.add(new Test("서버", 93.5));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
    public Test(String subject, double score) {
        this.subject = subject;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Subject: " + subject + ", Score: " + score;
    }
}
이 코드에서 ArrayList<Test> list = new ArrayList<>(); 부분에서 ArrayList의 초기 용량을 따로 지정하지 않고 생성하였습니다. 이렇게 하면 자동으로 용량이 조절되며, list.add()로 요소를 추가한 후 list.get(i)로 요소를 얻어 출력할 수 있습니다.




Was this response better or worse?
Better
Worse
Same




//
//public class Test {
//	public void test() {
//		int num;
//		ArrayList <Test> list =new ArrayList<Test>(num);
//		list.add(new Test("자바",93.5));
//		list.add(new Test("디비",93.5));
//		list.add(new Test("서버",93.5));
//	
//	
//	for(int i=0;i <list.size();i++) {
//		System.out.println(list.get(i));
//	}
//}
	

//public class Test {
//    public static void main(String[] args) {
//        int num = 3;
//        ArrayList<Test> list = new ArrayList<Test>(num);
//        
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }
//}
//여기서 list.add(new Test("자바",93.5));
