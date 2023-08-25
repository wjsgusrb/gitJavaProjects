package iclass;
import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
		//메뉴 생성, 삭제, 수정, 조회, 전체출력
		
		while(pos.getIsRun()) {
			int number = pos.printMenu();
			switch(number) {
				case 1:{ // 생성
					pos.insertMenu();
				}break;
				case 2:{//수정
					pos.updateDrinkUnit();
				}break;
				case 3:{//조회
					pos.searchDrinkUnit();
				}break;
				case 4:{//삭제
					pos.deleteDrinkUnit();
				}break;
				case 5:{//전체메뉴확인
					pos.printDrinkArr();
				}break;
				default:
					pos.setIsRun(false);
			}
		}
	}
}