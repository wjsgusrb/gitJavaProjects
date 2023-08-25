package A0817;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
public class A해쉬맵 {
	public static void main(String[]args) {
		
		HashMap<Integer,String>map=new HashMap<>();
		//key -value기반 데이터 저장
		map.put(45,"Brown");
		map.put(37,"James");
		map.put(23,"Martin");
		//데이터 탐색
		System.out.println("23번:"+map.get(23));
		System.out.println("37번:"+map.get(37));
		System.out.println("45번:"+map.get(45));
		System.out.println();
		//데이터 삭제
//		map.remove(37);
//		
//		//데이터 삭제 확인
//		System.out.println("37번:"+map.get(37));
		
		   // 전체 Key 출력 (for-each문 기반)
		Set<Integer> ks=map.keySet();
		   for(Integer n : ks)
		      System.out.print(n.toString() + '\t');
		   System.out.println();

		   // 전체 Value 출력 (for-each문 기반)
		   for(Integer n : ks)
		      System.out.print(map.get(n)+ '\t');
		   System.out.println();

		   // 전체 Value 출력 (반복자 기반)
		   for(Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
		      System.out.print(map.get(itr.next()) + '\t');
		   System.out.println();

		
		
		
		
		
	}
}
