package A0817;

import java.util.*;

public class A2 {
	public static void main(String[]args) {
		List<String>list =new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+'\t');
		System.out.println();
		
		list.remove(0);
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.size()+'\t');
//		System.out.println();
		
		
		
	}
}
