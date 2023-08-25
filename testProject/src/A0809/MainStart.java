package A0809;

public class MainStart {

	public static void main(String[]args) {
//		final int MAX=20;
		Human kim =new Human("김소망",20, "200000",'f');
//		System.out.print(kim.num());

		//	Human[] humanArr =new Human[10];
		//	
		//	humanArr[0]=new Human("최지원",20,"남자",80.5);

		//humanArr[1]입력받아서 생성해라



		Human[]arr1=new Human[3];
		arr1[0]=new Human("김소망",20, "2000001",'m');
		arr1[1]=new Human("최지원",20,"2000002",'f');
arr1[0].setAge(10);
System.out.print(arr1[0]);

	}
}
