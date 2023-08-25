package com.kh.javai;
//public class Student {
//	   //필드(데이터 집합)
//	   String name; //이름
//	   int age; //나이
//	   String gender; //성별
//	   int mathScore; //수학점수
//	   int enScore; // 영어점수
//	   int koScore; // 국어점수
//	  
//	   //생성자
//	   //인스턴스 객체를 생성할 떄 데이터를 초기화하기위해
//	   //자동으로 한번만 실행하는 특별한 메서드
//	   //메서드처럼 접근해서 실행할 수 없으며 class의 이름과 동일한 이름을 가진다.
//	   //초기화를 위한 메서드이기 때문에 반환값은 없다.
//	   /* 기본생성자
//	    * 생성자를 아무것도 작성하지 않았을 때
//	    * 컴파일러가 기본적으로 생성해주는 생성자
//	    * (아무 기능이 없다.)
//	    * public Student(){}
//	    */
//	   public Student(){
//	      System.out.println("student의 기본생성자");
//	   }
//	   //생성자는 여러개 생성이 가능하다.
//	   //생성자가 여러개일때는 매개변수를 통해서 식별한다.
//	   //에매한 생성자는 사용을 지양한다.
//	   public Student(String tName, int tAge, String tGender){
//	      name = tName;
//	      age = tAge;
//	      gender = tGender;
//	   }
//	   
//	   
//	   
//	   //메서드(기능 집합)
//	   //info메서드 생성
//	   //저는 oo살의 상oo ooo입니다. 출력기능
//	   public void info() {
//	      System.out.println("저는 "+age+"살의 상"+gender+" "+name+"입니다.");
//	   }
//	   
//	   //set메서드(setter) => 필드데이터에 값을 저장하기위한 메서드
//	   public void setEnScore(int tEnScore) {
//	      if (tEnScore < 0) {
//	         enScore = 0;
//	         return;
//	      }
//	      enScore = tEnScore;
//	   }
//	   
//	   public void setKoScore(int tKoScore) {
//	      if (tKoScore < 0) {
//	         koScore = 0;
//	         return;
//	      }
//	      koScore = tKoScore;
//	   }
//	   
//	   public void setMathScore(int tMathScore) {
//	      if (tMathScore < 0) {
//	         mathScore = 0;
//	         return;
//	      }
//	      mathScore = tMathScore;
//	   }
//	   
//	   //get메서드(getter) => 필드데이터에 값을 사용하기 위한 메서드
//	   public int getEnScore() {
//	      return enScore;
//	   }
//		public int getkorScore() {
//			return koScore;
//		}
//		public int getMathScore() {
//		return mathScore;
//		}
//		//기능을 담당하는 메서드
//		//토탈값을 반환하는 메서드
//		public int gettotal() {
//			return (mathScore+koScore+enScore);
//		}
//		public float getaverage() {
//			return ((mathScore+koScore+enScore)/3.0f);
//		}


///
public class Student {
// 필드(데이터 집합)
	// 이름,나이,성별,수학점수,영어점수,국어점수]
	static int count=0;
	String name;//이름
	int age;//나이
String gender;//성별
	int math;//수학점수
	int eng;//영어점수
	int kor;//국어점수
//	public static int count;
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public String getGender() {
		return this.gender;
	}
	
	
	
//생성자:인스턴스 객체를 생성할 때 데이터를 초기화하기위해 자동으로 한번만 실행하는 특별한 메서드
//메서드처럼 접근해서 실행할 수 없으며 class의 이름과 동일한 이름을 가진다.
//초기화를 위한 메서드이기 떄문에 반환값은 없다.
//*기본생성자 =   public Student(){} 이런모양
//*생성자를 아무것도 작성하지 않았을때 컴파일러가 기본적으로 생성해주는 생성자 (아무기능이없다)	
//	 public Student(String tname){
//		 System.out.println("Student 의 기본생성자");
//	 }
//	 public Student(String tname, int tAge){
//		 System.out.println("tName를 매게변수로 받는 생성자");
//	 }
	 public Student(String tname, int tAge,String tgender){
		count++;
		 name =tname;
		 age  =tAge;
	 gender=tgender;
	 System.out.println("이름 :"+name);
	 System.out.println("나이 :"+age);
	 System.out.println("성별 :"+gender);
	 System.out.println("학생이 추가되었습니다. ");
				 
//		 System.out.print(name+age+gender);
	 }
	 public Student(int tmathScore, int tengScore,int tkorScore) {
		 math=tmathScore;
		 eng=tengScore;
		kor=tkorScore;
	 }
	
//생성자는 여러개 생성이 가능하다	
//생성자가 여러개일떄는 매개변수를 통해서 식별한다.
//애매한 생성자는 사용을 지양한다.
	

//메서드(기능집합)
//info메서드 생성
//저는 00살에 00인 000입니다. 
	 public void info(){
//		 System.out.println("저는 "+age+"살에 "+gender +"인 "+name +"입니다." );
		 System.out.println("총합="+(math+eng+kor));
		 System.out.println("평균="+((math+eng+kor)/3));
		 if(math<40 && eng<40 &&kor<40 && ((math+eng+kor)/3)<60) {
			 System.out.println("불합격입니다.");
		 }else if (math>=40 && eng>=40 &&kor>=40 && ((math+eng+kor)/3)>=60) {
			 System.out.println("합격입니다.");
		 }else{
			 System.out.println("불합격입니다.");
		 }

		 
	 }
	 public void info2() {
		 System.out.print(count);
	 }
//	 set메서드() =>필드데이터에 값을 저장하기 위한 메서드
//	 
//	 get 메서드() =>필드데이터에 값을 사용하기 위한 메서드

	 int num1;
	 public void displatMyInfo(){
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println();
	 }
		 
		 public void info3(){
			 System.out.println(name+ "\t"+age+"\t"+gender);
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
}
