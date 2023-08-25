package R개인;



public class TriangleController {
	private Shape s;

	public TriangleController() {
        s = new Shape();
    }
//	+calcArea(height:double,
//			width:double) : double
//			모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨
//			후 넓이 반환넓이 : 너비 * 높이
	public double calcArea(double height,double width) {
		s= new Shape(3,height,width);
		return s.getHeight()*s.getWidth();	
	}
	
//			+paintColor(color:String)
//			: void
//			setter를 이용해 받아온
//			매개변수로 값 변경
	public void paintColor(String color) {
		s.setColor(color);
	}
	
//			+print():String
//	어떤 모양인지와 Shape의 information()메소드의 반환 값 합쳐 함께 반환
	public String print() {
		return s.infomation();
	}

}
