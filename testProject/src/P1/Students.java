package P1;

public class Students {
	//String name,char gender,int grade,int number
	private String name;
	private char gender;
	private int grade;
	private int number;

	public Students() {
		
	}
	public Students(String name,char gender,int grade,int number) {
		this.name = name;
		this.gender = gender;
		this.grade = grade;
		this.number =number;
	}
	//getter
	  public String getname() {
		  return this.name;
	    }
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+this.gender+this.number+this.number();
	}
	public char gender() {
	        return this.gender;
	    }
	  public int grade() {
	        return  this.grade;
	    }
	  public int number() {
	        return  this.number;
	    }
	  //setter
	  public void setname(String name) {
		  this.name=name;
	  }
	  public void setgender(char gender) {
		  this.gender=gender;
	  }
	  public void setgrade(int grade) {
		  this.grade=grade;
	  }
	  public void setnumber(int number) {
		  this.number=number;
	  }
	  
	  public String printStudent() {
		  return  gender+"학년 "+grade+"반 "+number+"번 "+name+"학생입니다.";
	  }
	  
	  
	
	
	
	
}
