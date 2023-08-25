package testProject;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Study0801 {
	public static void main(String[] args) {
		/**
		 * 1배열형식의 참조변수 선언
		 * 2배열객체 할당
		 * 3배열데이터 초기화
		 * 4배열 데이터 활용
		 */
//		int[] ref;
//		ref =new int[6];
////		ref =new int[]{1,2,3,4,5,6}; 위엣것과 동일하다
//		ref[0] =1;
//		ref[1] =2;
//		ref[2] =3;
//		ref[3] =4;
//		ref[4] =5;
//		ref[5] =6;
////
//		 for(int i =0; i<ref.length ; i++)
//			ref[i] =i+1;
//		
//		 for (int i=0 ;i<ref.length;i++)
//		 System.out.print(ref[i]);
		//int형 변수 num을 생성하고 값을 10으로 초기화
		//string형 변수str을 생성하고 값을 "hi"초기화
		//num과 str을 출력
		//만약 num이 5보다 크다면 num은 5보다 큰수입니다.를 출력
		//만약 numdl 5보다 작다면 5부다작은수입니다를 출력
		//5라면 num5입니다를 출력
		//반복문을 활용하여 1~num 3일때123출력
		//FOR WHILE 각각작성
		//길이가 20인 INT형 배열생성후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
//		int[] ref;
//		ref =new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//		for (int i=0 ;i<ref.length;i++);
		
//		 String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
//		 for(int i =0;i<fruits.length;i++) {
//			 System.out.print(fruits[i]);
//		 }
		
//		실습문제 14번 지피티버전

//	     int numberOfNumbers = 6; // 생성할 로또 번호 개수
//	        Set<Integer> lottoNumbers = generateLottoNumbers(numberOfNumbers);
//
//	        System.out.println("로또 번호:");
//	        for (int number : lottoNumbers) {
//	            System.out.print(number + " ");
//	        }
//	    }
//
//	    public static Set<Integer> generateLottoNumbers(int numberOfNumbers) {
//	        if (numberOfNumbers > 45) {
//	            throw new IllegalArgumentException("로또 번호는 1부터 45까지만 가능합니다.");
//	        }
//
//	        Random random = new Random();
//	        Set<Integer> uniqueNumbers = new HashSet<>();
//
//	        while (uniqueNumbers.size() < numberOfNumbers) {
//	            int randomNumber = random.nextInt(45) + 1;
//	            uniqueNumbers.add(randomNumber);
//	        }
//
//	        // TreeSet을 사용하여 오름차순으로 정렬
//	        Set<Integer> sortedNumbers = new TreeSet<>(uniqueNumbers);
//
//	        return sortedNumbers;
		
//	       내가한거
//		Random random = new Random();
//		int computerChoice = random.nextInt(45);
//		System.out.print(computerChoice);
//		Scanner sc = new Scanner(System.in);
//		
//        char[] strArray;
//
//	    System.out.print("문자열을 입력하세요: ");
//	    	String str ;
//
//	   
//	 
//	        str= sc.next();
//	  
//	        strArray= new char[str.length()];
//	        for (int i=0;i<strArray.length;i++) {
//	        	
//	        }
	        
	   
	      

//	        int count = 0;
//	        StringBuilder indexPositions = new StringBuilder();
//
//	        for (int i = 0; i < inputString.length(); i++) {
//	            if (inputString.charAt(i) == searchChar) {
//	                count++;
//	                indexPositions.append(i).append(" ");
//	               
//	}
//
//}
//	      
//	        System.out.println(inputString + "에 " + searchChar + "가 존재하는 위치(인덱스) : " + indexPositions.toString());
//	        System.out.println(searchChar + " 개수 : " + count);
//		
		
//		실습문제 16 꼭 다시해보기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		메소드 명 : public void practice16(){}
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
//
//		[출력 예시 다음 장]
//		ex.
//		배열의 크기를 입력하세요 : 3
//		1번째 문자열 : 자바의 정석
//		2번째 문자열 : 알고리즘
//		3번째 문자열 : C프로그래밍
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 2
//		4번째 문자열 : 인간관계
//		5번째 문자열 : 자기계발
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 1
//		6번째 문자열 : 영단어600
//		더 값을 입력하시겠습니까?(Y/N) : n
//		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]

//	        Scanner sc = new Scanner(System.in);
//			 System.out.println("배열의 크기를 입력하세요");
//			
//			 int num;
//			 String[] strArray;
//			 num= sc.nextInt();
//			 strArray = new String[num] ;
//		for (int i=0; i<strArray.length;i++) {
//			System.out.print(i+"번재문자열:");
//			strArray[i] =sc.next();
//		
//		System.out.print("더값을 입력하겠습니까?(/y/n))");
//		if('y' ==sc.next().charAt(0)) {
//		}else { 
//
//		}
//		break;
//		}
		
//		크기가 4인 1차원배열 3개를 담고있는 2차원배열을 만들어라(자료형 ;int) 
//		int[][] arr=new int[4][4];

//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=3;
//		arr[0][3]=4;
//		arr[1][0]=3;
//		arr[1][1]=3;
//		arr[1][2]=3;
//		arr[1][3]=3;
//		arr[2][0]=5;
//		arr[2][1]=5;
//		arr[2][2]=5;
//		arr[2][3]=5;
//		
		//2차원 배열 전체 초기화
//		for (int num = 0; num < arr.length; num++) {
//			arr[num][0]=0;
//			for(int num1 =0; num<arr[num].length;num1++) {
//				arr[num][num1]=0;
//				System.out.print(arr[num][num1]);
//			}
//		
//		}
//	
	
		
//		for (int num = 0; num < 3; num++) {
//		    for (int num2 = 0; num2 < 4; num2++) {
//		        arr[num][num2] = num * 4 + num2; // 임의로 값을 초기화하거나, 사용자로부터 입력받을 수도 있습니다.
//		    }
//		}
//
//		// 배열 arr 출력
//		for (int num = 0; num < 3; num++) {
//		    for (int num2 = 0; num2 < 4; num2++) {
//		        System.out.print(arr[num][num2] + " ");
//		    }
		  
		    //크기가 각가 4,3,5,2,인 1차우너 배열들로 이루어진 2차원 배열을만들고 값을 전부 10으로 초기화
		int arr[][]= {{1,2,3,4},{5,6,7},{8,9,10,10,10},{10,10}};
	   System.out.print(arr[1][2]);
		
		
	
	//   int[][] arr=new int[4][4];인 구조를 만들고 맨마지막열에는 앞에있는 열들에 값을 모두 더할수있게하는 코딩을짜줄수있어?
}
}
