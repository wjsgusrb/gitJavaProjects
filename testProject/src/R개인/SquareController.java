package R개인;

//public class SquareController {
//    private Shape s;
//
//    public SquareController() {
//        s = new Shape(4, 0, 0); // 초기값으로 높이와 너비를 0으로 설정
//    }


//public class SquareController {
//	private Shape s;
//
//	public SquareController() {
//		 s = new Shape(3, 0, 0); // 초기값으로 높이와 너비를 0으로 설정
//    }
////	+calcPerimeter(height:double,
////			width:double) : double
////	모양 타입 번호와 받은 매개변수를 매개변수 있
////	는 생성자로 초기화 시킨후 둘레 반환 둘레: 너비*2 + 높이*2
//	 public double calcPerimeter(double height, double width) {
//	        s = new Shape(4, height, width); // 4는 사각형
//	        return s.getWidth() * 2 + s.getHeight() * 2;
//	    }
//
//
////
////	+calcArea(height:double,
////			width:double) : double
////	모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨
////	후 넓이 반환 넓이 : 너비 * 높이
//	   public double calcArea(double height, double width) {
//	        s = new Shape(4, height, width); // 4는 사각형
//	        return s.getWidth() * s.getHeight();
//	    }
//
////	
////	+paintColor(color:String)
////	: void
////	setter를 이용해 받아온 매개변수로 값 변경
//	   public void paintColor(String color) {
//	        s.setColor(color);
//	    }
//
////	+print():String
////	어떤 모양인지와 Shape의 information()메소드의반환 값 합쳐 함께 반환
//	   public String print() {
//	        return "사각형\n" + s.information();
//	    }
//}







public class SquareController {
	private Shape s;

	public SquareController() {
        s = new Shape(4, 0, 0);
    }

    public double calcPerimeter(double height, double width) {
        s = new Shape(4, height, width); // 4는 사각형
        return s.getWidth() * 2 + s.getHeight() * 2;
    }

    public double calcArea(double height, double width) {
        s = new Shape(4, height, width); // 4는 사각형
        return s.getWidth() * s.getHeight();
    }

    public void paintColor(String color) {
        s.setColor(color);
    }

    public String print() {
        return "사각형\n" + s.infomation();
    }
}
