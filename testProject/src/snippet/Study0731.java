package snippet;
import java.util.Scanner;
import java.math.*;

public class Study0731 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		if (조건값) {
//			
//		} else if () {
//				 
//		} else {
//			
//		}
//		
//		switch(1) {
//			case 1:
//				
//				break;
//			case 2:	
//				
//			default:	
//		}
//		
//		int num = (조건값) ? 값1 : 값2;
		
		//초기식 :  1번으로 1번만 실행된다.
		//조건식 : 2번으로 실행할 코드전에 항상 실행된다.
		// 실행코드 : 3번으로 반복실행되는 부분
		// 증감식 : 4번실행코드가 끝날때마다 한번실행된다.
//		for (초기식; 조건식; 증감식){
//			//실행할 코드
//		}//몇~몇까지 + 규칙성을 가진 반복
//		while(조건) {
//			증감식 도는 break;
//		}
//		
//		do {
//			
//		}while();
		
//		배열, 객체, 객체배열
		
		
		
//		//길이가 5인 int형 1차원 배열 생성
//		int[] ar1 = new int[5];
//		
//		//길이가 7인 double형 1차원배열 ar2생성
//		double[] ar2 = new double[7];
//		
//		// 배열의 변수선언과 메모리할당을 분리하여 길이가 9인 float형 배열 ar3생성
//		float[] ar3;
//		ar3 = new float[9];
//		
//		//배열의 길이를 구하는 방법
//		System.out.println("ar1의 길이 : " + ar1.length);
//		System.out.println("ar2의 길이 : " + ar2.length);
//		System.out.println("ar3의 길이 : " + ar3.length);
//		
//		String str = "jiwon";
//		System.out.println("str의 길이 : " + str.length());
		
//		String str[] = new String[5];
//		str[0] = "jiwon";
//		str[1] = new String("cafe");
//		str[2] = "tree";
//		str[3] = "choi";
//		str[4] = "hi";
//		
//		int count = 0;
//		
//		for (int i = 0; i < str.length; i++) {
//			count += str[i].length();
//		}
//		
//		String st = "sdjalksd";
//		st.length();
		
				
//		System.out.println("총 문자의 수는 " + count);
		
		
		
		//얕은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.print(arr1[2]);
		
////		//완전한 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
////		
////		
////		for(int i = 0; i < arr1.length; i++) {
////			arr2[i] = arr1[i];
////		}
////		//반복문을 통해서 arr2에있는 모든 요소 출력	
////		for(int i = 0; i < arr2.length; i++) {
////			System.out.println("arr2[" + i + "] :" + arr2[i]);
////		}
//		
//		//보편적인 배열 복사방법
//		arr2 = arr1.clone();
//		
//		//배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7);
		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		1 2 3 4 5 6 7 8 9 10 

//		int[] arr = new int[10];
//		for (int i = 0; i < 10; i++) {
//			arr[i] = i + 1; // arr[3] = 4;
//			System.out.print(arr[i] + " ");
//		}
		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//
//		ex.
//		10 9 8 7 6 5 4 3 2 1 

//		int[] arr = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//			arr[i] = (10 - i); //
//			System.out.print(arr[i] + " ");
//		}
//		
//		int j = 10;
//		for (int i = 0; i < 10; i++,j--) {
//			arr[i] = j;
//		}
		
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		ex.
//		양의 정수 : 5
//		1 2 3 4 5 
		
//		int num;
//		int arr[];
//		
//		System.out.print("양의 정수 : ");
//		num = sc.nextInt();
//		
//		arr = new int[num];
//		
//		// 배열의 1~n까지의 값 초기화
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//		
//		// 배열의 1~n까지의 값 출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//
//		ex.
//		귤

//		String[] str = new String[5]; 
//		str[0] = "사과";
//		str[1] = "귤";
//		str[2] = "포도";
//		str[3] = "복숭아";
//		str[4] = "참외";
		
//		String[] str = {"사과", "굴", "포도", "복숭아", "참외"};
//		System.out.print(str[1]);
		
		
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8 
//		i 개수 : 2
		
//		String str;//검색할 문자열
//		char ch; //찾을 문자하나
//		int[] strLoc; //위치값(인덱스) 저장
//		char[] chrLoc;
//		int count = 0;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		
//		System.out.print("문자 : ");
//		ch = sc.next().charAt(0);
//		
//		//ch가 존재하는 위치 구하기
//		System.out.print("application에 i가 존재하는 위치(인덱스) :");
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == ch) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		
//		System.out.print(ch + " 개수 : " + count);

//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
//
//		ex.
//		0 ~ 6 사이 숫자 입력 : 4			0 ~ 6 사이 숫자 입력 : 7
//		금요일						잘못 입력하셨습니다.

//		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
//		int num;
//		
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		num = sc.nextInt();
//		
//		switch(num) {
//			case 0:
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//			case 6:
//				System.out.print(days[num] + "요일");
//				break;
//			default:
//				System.out.print("잘못 입력하셨습니다.");
//		}
		
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2 
//		총 합 : 2
		
//		int len, sum = 0;
//		int[] arr;
//		
//		System.out.print("정수 : ");
//		len = sc.nextInt();
//		arr = new int[len];
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
//			arr[i] = sc.nextInt(); // 배열요소에 값을 입력받는다.
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i]; // 값을 다 더해준다
//			System.out.print(arr[i] + " "); // 배열의 값을 출력
//		}
//		
//		System.out.print("\n총 합 : " + sum);
		
		
//		int num, count = 0;
//		int[] arr;
//		
//		while(true) {
//			System.out.print("정수 : ");
//			num = sc.nextInt();
//			
//			if (num % 2 == 0 || num < 3) {
//				System.out.println("다시 입력하세요.");
//			} else {
//				arr = new int[num];
//				
//				// 0 ~ (n - 1)까지 단 반복중간값까지는 1부터 1씩늘려저장 중간이후는 1씩빼서저장 
//				for (int i = 0; i < arr.length; i++) {
//					if ((arr.length / 2) < i) {
//						count--;
//					} else {
//						count++;
//					}
//					arr[i] = count;
//				}
//				
//				for (int i = 0; i < arr.length; i++) {
//					System.out.print(arr[i] + " ");
//				}
//				break;
//			}
//		}
		
//		사용자가 입력한 값이 배열에 있는지 검색하여
//		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//
//		ex.
//		치킨 이름을 입력하세요 : 양념			치킨 이름을 입력하세요 : 불닭
//		양념치킨 배달 가능				불닭치킨은 없는 메뉴입니다.

		//String 변수 str
//		String str, res = null;
//		// "양념" "간장" "갈릭" "후라이드" 로 구성된 배열하나 생성 이름은 arr
//		String[] arr = {"앙념", "간장", "갈릭", "후라이드"};
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		str = sc.next();
//		res = str + "치킨은 없는 메뉴입니다.";
//		
//		// 배열의 0번째부터 끝까지 하나씩 비교해보아야한다.
//		for (int i = 0; i < arr.length ; i++) {
//			if (str.equals(arr[i])) {
//				res = str + "치킨 배달 가능";
//				break;
//			}
//		}
//		
//		System.out.print(res);
		
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//
//		char[] str = new char[14];
//		str = sc.next().toCharArray();
//
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******

		
//		String str;
//		char[] str;
//		str = sc.next().toCharArray();
//		char[] st;
//		
//		System.out.print("주민등록번호(-포함) : ");
//		str = sc.next().toCharArray();
//		st = new char[str.length];
//		
//		for (int i = 0; i < st.length; i++) {
//			if (i >= 8) {
//				st[i] = '*';
//				continue;
//			} 
//			st[i] = str[i;	
//		}
//		
//		for (int i = 0; i < st.length; i++) {
//			System.out.print(st[i]);
//		}
		
	
//		import java.math.*;
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//
//		//Math.random() : 0보다 크고 1보다 작은 난수 발생
//		// 값을 곱하고 int형으로 변환해서 정수형 난수를 발생시킬 수 있다.
//		(int)(Math.random() * 10 + 1);
//
//		ex.
//		9 7 6 2 5 10 7 2 9 6 
		
		
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 10 + 1);
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}

//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//		ex.
//		5 3 2 7 4 8 6 10 9 10 
//		최대값 : 10
//		최소값 : 2

//		int min = 9999, max = 0;
//		int[] arr = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 10 + 1);
//			max = (arr[i] > max) ? arr[i] : max;
//			min = (arr[i] < min) ? arr[i] : min;
//		}
		
//		for (int i = 0; i < arr.length; i++) {
//			max = (arr[i] > max) ? arr[i] : max;
//			min = (arr[i] < min) ? arr[i] : min;
////			if (arr[i] > max) {
////				max = arr[i];
////			}  
//			
////			if (arr[i] < min) {
////				min = arr[i];
////			}
//		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//		System.out.println();
//		System.out.println("최대값 : " + max);
//		System.out.print("최소값 : " + min);
		
		
////		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
////		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
////
////		ex.
////		4 1 3 6 9 5 8 10 7 2 
//
////		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		int[] arr = new int[10];
//		
//		
//		//[0,0,0,0,0,0,0,0,0,0]
//		int i = 0;
//		while (i < arr.length) {
//			//난수 입력받기
//			int nan = (int)(Math.random() * 10 + 1);
//			
//			//난수 검사
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			
//			if (nan == 0)
//				continue;
//			else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		
//		for (i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		int num = 4;
		
		//문자형 배열 10개자리 생성

		//문자형 배열 10개에 "가"의 숫자를 직접넣으세요.
//		String[] str = new String[10];
//		str[0] = "가";
//		String[] str = {"가","나","다"};
		//반복문을 활용하여 1~10의 숫자를 넣어보세요.

		
	}
}
