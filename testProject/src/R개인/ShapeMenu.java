package R개인;
import java.util.Scanner;


public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	private SquareController scr;
	private TriangleController tc;
	

//	+inputMenu():void 삼각형과 사각형을 선택
//	하게 하는 메소드
//	+triangleMenu() : void 삼각형 메뉴 출력 메소드
//	+squareMenu():void 사각형 메뉴 출력 메소드
//	+inputSize(type:int,
//	menuNum:int):void
// 삼각형 사각형 종료 스위치
	public void inputMenu() {
		 System.out.println("===도형 프로그램===");
		 System.out.println("3. 삼각형");
		 System.out.println("4. 사각형");
		 System.out.println("9. 프로그램 종료");
		 
		
			int num=sc.nextInt();
			while(true) {
		switch (num) {
		
		
        case 3:
            System.out.println("3. 삼각형");
            triangleMenu();
            break;
        case 4:
            System.out.println("4. 사각형");
            squareMenu();
            break;
        case 9:
            System.out.println("프로그램을 종료합니다.");
            return;
        // ...
        default:
            System.out.println("잘못된 번호입니다. 다시 입력하세요.");
            break;
    }
		}
	}
		public void triangleMenu() {
			
			while(true) {
				 System.out.println("1. 삼각형 면적");
				  System.out.println("2. 삼각형 색칠");
				  System.out.println("3. 삼각형 정보");
				  System.out.println("9. 메인으로");
				  int num1=sc.nextInt();
				switch (num1) {


				case 1:
					System.out.println("삼각형 면적");
					System.out.print("높이: ");
	                double height = sc.nextDouble();
	                System.out.print("너비: ");
	                double width = sc.nextDouble();
	                double area = tc.calcArea(height, width);
	                System.out.println("삼각형 면적: " + 0.5*(height*width));

					break;
				case 2:
					System.out.println("삼각형 색칠");

					break;
				case 3:
					System.out.println(" 삼각형 정보");
					break;
					
				case 9:
					System.out.println(" 메인으로");
					inputMenu();
				default:
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");

				}
			}
			

			// triangleMenu() 메서드의 내용
		}
		public void squareMenu() {
			int num2=sc.nextInt();
			
			while(true) {
				 System.out.println("1. 삼각형 면적");
				  System.out.println("2. 삼각형 색칠");
				  System.out.println("3. 삼각형 정보");
				  System.out.println("9. 메인으로");
				switch (num2) {


				case 1:
					System.out.println("사각형 면적");

					break;
				case 2:
					System.out.println("사각형 색칠");

					break;
				case 3:
					System.out.println(" 사각형 정보");
					break;
					
				case 9:
					System.out.println(" 메인으로");
					return;
				default:
					System.out.println("잘못된 번호입니다. 다시 입력하세요.");
					
					break;


			}
			
		}
		}
		

		
		
		
		
	}
	
	
	

