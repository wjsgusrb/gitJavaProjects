package com.kh.javai;

public class Car {
//색상,제조회사,타입,제조날짜
	String color;//색상
	String company;//제조회사
	String type;//가솔린,디젤,하이브리드,전기
	double zero100;//제로백
	int maxSpeed;//최대속도
	int speed;//현제속도
	int l;//현제 주유량
	int maxl;//최대주유량

	//axel을 메서드로 호출하면 speed+5 하고 속도리턴 단 최대속도일때는 고정
	//
  public int onaxel() {
	  if((speed +5)>=maxSpeed) {
		  speed=maxSpeed;
	  }else {
		  speed+=5;
	  }
	  return speed;
	  
  }
  public int onBreak() {
	  if((speed -5)<=0) {
		  speed=maxSpeed;
	  }else {
		  speed-=5;
	  }return speed;
	  
  }
  public int insertl(int plusl) {
	  if(l+plusl>maxl) {
		  int tmpl =(l +plusl-maxl);
		  l=maxl;
		 return (tmpl);
	  }else {
		  l+=plusl;
		  return 0;
	  }
  }
  	public Car() {}
	public Car(String color,
			String company,
		String type,
		double zero100,
		int maxSpeed,
		int speed,
		int l,
		int maxl
		) {
		
		this.color=color;
		this.company=company;
		this.l=l;
		this.maxl=maxl;
		this.maxSpeed=maxSpeed;
		this.speed=0;
		this.type=type;
		this.zero100=zero100;
		//statusDisplay 차량상태 확인
		
	}
	public void statusDisliay(int type) {
		switch(type) {
		 case 1:{
			 System.out.print("제차는"+this.company+"에서만든차입니다.");
				
		 }
		 case 2:{
		System.out.print("속도:"+this.speed);
		System.out.print("잔여기름:"+this.l);
		}
	}
	
}
}
