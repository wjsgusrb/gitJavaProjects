package testProject;
import java.util.Scanner;
public class Pra {
	public static void main(String[] args) {
		int month ;
		String season ;
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 정수를 입력하세요:");
		month = sc.nextInt();
//	    switch (month) {
//        case 1:
//        case 2:
//        case 12:
//            season = "겨울";
//            break;
//        case 3:
//        case 4:
//        case 5:
//            season = "봄";
//            break;
//        case 6:
//        case 7:
//        case 8:
//            season = "여름";
//            break;
//        case 9:
//        case 10:
//        case 11:
//            season = "가을";
//            break;
//        default:
//            season = "해당하는 계절이 없습니다.";
//            break;
//    }
//
//    System.out.println("입력한 월은 " + season + "입니다.");
    
		switch (month) {
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season ="봄";
			break;

		case 6:
			
			season ="여름";
			break;

			default :
			season ="해당하는 계절이없습니다.";
			
			
		}
		System.out.println(season+"입니다.");
		
	}
}

//if( month == 1 || month == 2 || month ==12) {
//season = "겨울";
//}else if ( month == 1 || month == 2 || month ==12) {
//season ="봄";
//}else if ( month == 3 || month == 4|| month ==5){
//season ="여름";
//}else if ( month == 6 || month == 7 || month ==8 ){
//season ="가을";
//} else {
//season = "해당하는 계절이없습니다."
//}
//
