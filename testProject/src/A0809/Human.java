package A0809;
import java.util.Scanner;


public class Human {
	Scanner sc=new Scanner(System.in);

//필드 이름 성별 나이 몸무게(소수점포함)
	
//전체 데이터 초기화하는 생성자
	//생성자: 객체의 데이터들을 전부 초기화하기 위한 특수목적의 매서드
	//리턴값을 가지고 있지않고 객체 생성시 1번만 호출된다
	//오버로딩 가능 이름은 클레스와 동일하다
	
	
//getter
//setter
//toString 만들자.	
	private	String name;//이름
	private	int age;//나이
	private	char gender;//성별
	private double weigth;//몸무게
	private String residentNumber;
	private	int num;
	public Human(String name,	int age,String residentNumber,char gender) {
		this.name=name;
		this.age=age;
		this.residentNumber=residentNumber;
		this.gender=gender;

	}
	
//
	public Human(String name,int age,char gender,double wdight){
		this.name=name==null?"이름없음":name;
		this.age=age<0?0:age;
		this.gender=gender;
			
		this.weigth=wdight<0?0:wdight;
	}
	//=================set
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setWeigth(double weigth) {
		this.weigth=weigth;
	}
	//===============get
	public String getName() {
		  return this.name=name==null?"이름없음":name;
		  }
	public int getAge() {
		return this.age=age<0?age=0:age;
	}
	public char getGender() {
		return this.gender;
	}
	public double getWeigth() {
		return this.weigth==0?weigth=0:weigth;
	}
	//==================//toString
	
	public String toString() {
		String str =this.name+"\t"+this.age+"\t "+this.gender+"\t "+this.weigth;
		return str;
	}
	//입력을 받자
//	public Human(String name,int age,String gender,double weigth){
//		this.name=name;
//		this.age=age;
//		this.gender=gender;
//		this.weigth=weigth;
//	}
	public Human[] humanArr =new Human[10];
	public String num() {
		return "제 10년후 나이는"+(this.age+10)+"입니다.";
	}
	
//	humanArr[0]=new Human("최지원",20,"남자",80.5);
	
	public void inserHuman() {
		 System.out.println("추가하실 인적사항를 이름, 나이, 성별,몸무게 순으로 입력하시오");
		 
		 String name;
         char gender;
		 double weigth;
		 int age;
		 System.out.println("이름을 입력하시오");
		 name=sc.next();
		 System.out.println("나이을 입력하시오");
		 age=sc.nextInt();
		 System.out.println("성별을 입력하시오");
		 gender=sc.next().charAt(0);
		 System.out.println("몸무게을 입력하시오");
		 weigth=sc.nextDouble();
		 
		 for(int i=0;i<humanArr.length;i++) {
			 	if(humanArr[i]==null) {
			 		humanArr[i]=new Human( name,age,gender, weigth);
			 		
			System.out.println(humanArr[i].getName()+" 인적이 추가되었습니다" );
			break;
			 	}	
		 }
			  
		 }
		 //맨뒤에 있는 객체삭제
		 public void deleteHuman() {
		 for(int i=0;i<humanArr.length;i++) {
			 if(humanArr[0]==null) {
				 System.out.println("삭제할테이터가 없습니다.");
				 break;
			 }
		 else if (humanArr[i]==null) {
				 humanArr[i-1]=null;
			 }
		 }
		 }
		 

		 
		 
		 
		 
		 
	
	}
	
	
	

