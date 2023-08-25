package A0817;

import java.util.Set;
import java.util.Objects;
import java.util.HashSet;
import java.util.Iterator;

public class A3 {
	public static void main(String[]args) {
		Set<String>set =new HashSet<>();
		set.add("Tom");
		set.add("Box");
		set.add("Robot");
		System.out.println("인스턴스 수:"+set.size());

		for(Iterator<String> itr=set.iterator();itr.hasNext();)
			System.out.print(itr.next()+"\t");
		System.out.println();
		//for-each문을 이용한 전체 출력
		for(String s:set)
			System.out.print(s+"\t");
		System.out.println();




	}

}
