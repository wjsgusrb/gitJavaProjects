package Test0822;

public class Circle {
	public static final double PI =3.14;
	public double radius;
	//1번 문제 이거 작성
	   public  Circle(){
	    	
	    }
	
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius){
		//2번 문제 this로 변경
		this.radius =radius;
	}
	public static double getPi() {
		return PI;
	}
	public void draw() {
		System.out.print("반지름"+radius+"cm인 원을 그립니다.");
	}
	


}
