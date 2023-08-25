package testProject;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Study0803 {
	 public static void main(String[] args) {

		 
		 
		 
		 
		 
		 
	 }
		 //double형 변수 num을 생성하고 3.75를대입해라
//		 double num;
//		 num=3.75;
//		 //int형 변수 num2를입력하고 숫자를 하나 입력받아라
//		 Scanner sc = new Scanner(System.in);
//		 
//		 int num2= sc.nextInt();
//		 
//		 //입력받은 num2의 길이를를 활용하여 1차원배열을 하나 만들고 몯ㄴ수를 5로 초기화한다
//		 int[] arr;
//		arr =new int[num2] ;
//		for(int i=0 ;i<arr.length;i++)
//			arr[i]=5;
//		
////		 for (int num = 0; num < arr.length; num++) {
//				arr[num][0]=0;
//				for(int num1 =0; num<arr[num].length;num1++) {
//					arr[num][num1]=0;
//					System.out.print(arr[num][num1]);

		 
		 
		 //arr 배열의 2 인덱스 값에 0을 넣어준다
		 
//		 arr[2]=0;              
//		 
//		for(int i=0 ;i<arr.length;i++) {
//			if(arr[i]==5)
//		}
//				arr[i]=5;
//		 
		 //arr배열을 처음부터 끝까지 아래와같은 방식으로 출력한다
		 //배열안에 값이 5일때 5출력
		 //배열안에 값이 0일떄 5가아닙니다.이거 다시풀어본다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		//		국어 영어 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//평균을 구하시오 그리고 각각의 점수가 50점이상이면서 평균점수가70점 이상일때 합격 아니라면불합격
//		int ko,eng,math;
//		double sum;
//		System.out.print("국어점수를 입력하시오:");
//		ko=sc.nextInt();
//		System.out.print("영어점수를 입력하시오:");
//		eng=sc.nextInt();
//		System.out.print("수학점수를 입력하시오:");
//		math=sc.nextInt();
//		sum=((ko+eng+math)/3);
//		(int)(Math.random)*10)
//		if(ko<50&&eng<50&&math<50) {
//			System.out.print("불합격입니다.");
//		}else if(sum<70){
//			System.out.print("불합격입니다.");
//		}else {
//			System.out.print("합격입니다.");
//		}
		//1미만의 숫자가 입력된다면 1이상의 숫자를 입력해주세요 가 출력되면서 다시 사요ㅗㅇ자가 값을 입력하도록하세요
		  Random random = new Random();

//			 char randomInt = random.nextInt(100); // 0 이상 100 미만의 난수 생성
//		        System.out.println("Random Integer: " + randomInt);
		
//		 arr[0][0]= 'T';
//		 arr[0][1]= 'P';
//		 arr[0][2]= 'M';
//		 arr[0][3]= 'B';
//		 arr[1][0]= 'U';
//		 arr[1][1]= 'I';
//		 arr[1][2]= 'H';
//		 arr[1][3]= 'S';
//		 arr[2][0]= 'Q';
//		 arr[2][1]= 'M';
//		 arr[2][2]= 'B';
//		 arr[2][3]= 'H';
//		 arr[3][0]= 'G';
//		 arr[3][1]= 'H';
//		 arr[3][2]= 'X';
//		 arr[3][3]= 'I';
//		 char[][] arr = new char[5][4];
//	       
//	        for (int i = 0; i < arr.length-1; i++) {
//	            for (int j = 0; j < arr[i].length-1; j++) {
//	                arr[i][j] = (char)(Math.random()*26+'A');
//	            }
//		 
//		 for ( i = 0; i < arr.length; i++) {
//	            for (int j = 0; j < arr[i].length; j++) {
//	                System.out.print(arr[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
//		 
		  
//	String[][] strArr =new String[][]
//			{{"이","까","왔","앞","힘",},
//			{"차","지","습","으","냅"},
//			{"원","열","니","로","시"},
//			{"배","심","다","좀","다"},
//			{"열","히","!","더","!!"}};
////		 
//		 for (int i = 0; i < strArr.length; i++) {
//        for (int j = 0; j < strArr[i].length; j++) {
//            System.out.print(strArr[i][j] + " ");
//        }
//        System.out.println();
		 
//        String[][] strArr =new String[][] {{"1","4","7"},{"2","5","8"},
//    		{"3","6","9"}};
//    		
//   		 for (int j = 0; j < strArr.length; j++) {
//          for (int i = 0; i < strArr[i].length; i++) {
//              System.out.print(strArr[i][j] + " ");
//          }
//          System.out.println();
	
		  
//		  int[][] arr=new int[4][] ;
//		  
//		
//
//	       
//		  arr[0] = new int[4]; // 두 번째 차원 배열 길이: 5
//		  arr[1] = new int[2]; // 두 번째 차원 배열 길이: 3
//		  arr[2] = new int[6]; // 두 번째 차원 배열 길이: 7
//		  arr[3] = new int[3];
//		arr[3] = new int[5];
//
//	        // 가변 배열의 값 설정
//	       arr[0][0] = 'a';
//	       arr[0][1] = 'b';
//	       arr[1][0] = 'c';
//	       arr[1][1] = 'd';
//	       arr[1][2] = 'e';
//	       arr[1][3] = 'f';
//	       arr[1][4] = 'g';
//	       arr[1][5] = 'h';
//	       arr[2][0] = 'i';
//	       arr[2][1] = 'j';
//	       arr[2][2] = 'k';
//	       arr[3][0] = 'l';
//	       arr[3][1] = 'm';
//	       arr[3][2] = 'n';
//	       arr[3][3] = 'o';
//	       arr[3][4] = 'p';
//	       for (int i = 0; i < arr.length; i++) {
//	            for (int j = 0; j < arr[i].length; j++) {
//	                System.out.print(arr[i][j] + " ");
//	            }
//	            System.out.println(); // 줄 바꿈
//	       
	       
	       
	        // 가변 배열 값 출력
//	        for (int i = 0; i < variableArray.length; i++) {
//	            for (int j = 0; j < variableArray[i].length; j++) {
//	                System.out.print(variableArray[i][j] + " ");
//	            }
//	            System.out.println(); // 줄 바꿈
//		  int[][] arr1=new int[3][2] ;
//		  int[][] arr2=new int[3][2] ;
//		  
//		  for (int i = 0; i < arr1.length-1; i++) {
//	            for (int j = 0; j < arr1[i].length-1; j++) {
//	                arr1[i][j] = i++;
//	            }
//		  
//		  for (i = 0; i < arr1.length; i++) {
//	        for (int j = 0; j < arr1[i].length; j++) {
//	        	
//	            System.out.print(arr1[i][j] + " ");
//	        }
//	        System.out.println();
//		  
//	        System.out.println("==1분단==");
//	        for (i = 0; i < arr1.length; i++) {
//		        for (int j = 0; j < arr1[i].length; j++) {
//		        	
//		            System.out.print(arr1[i][j] + " ");
//		        }
//		        System.out.println();
//		        System.out.println("==2분단==");
//		        for (i = 0; i < arr2.length; i++) {
//			        for (int j = 0; j < arr2[i].length; j++) {
//			        	
//			            System.out.print(arr2[i][j] + " ");
//			        }
//		        }
//	        }
//		 String[][] arr1=new String[3][2] ;
//		 String[][] arr2=new String[3][2] ;
//		  
//		  String[] students= {
//			"김나나","강건강",
//			"도대담","류라라",
//			"김바바","강건강",
//			"김러러","강건강",
//			"김하하","강건강",
//			"김셔나","강건강"
//			
//		  };
//		  
//		  System.out.println("==1분단==");
//		  int index=0;
//		  for (int i = 0; i < arr1.length; i++) {
//	            for (int j = 0; j < arr1[i].length; j++) {
//	            	arr1[i][j]= students[index];
//	            	index +=1;
//	                System.out.print(arr1[i][j] + " ");
//	            }
//	            System.out.println(); // 줄 바꿈
//		  } System.out.println("==2분단==");
//	            
//	            
//	            for ( int i = 0; i < arr2.length; i++) {
//		            for (int j = 0; j < arr2[i].length; j++) {
//		            	arr2[i][j]= students[index];
//		            	index +=1;
//		            	
//		                System.out.print(arr2[i][j] + " ");
//		            }
//		            System.out.println(); // 줄 바꿈
//	            }

//	            System.out.println("검색할 학생을 입력하세요");
//	            String s = sc.next();
//	            int bundan,line;
//	            
//	            
//	            
//	            for (int i = 0; i < arr1.length; i++) {
//		            for (int j = 0; j < arr1[i].length; j++) {
//		            	arr1[i][j]= students[index];
//		            	index +=1;
//		              
//		            }
//		           
//			  } 
//		            
//		            
//		            for ( int i = 0; i < arr2.length; i++) {
//			            for (int j = 0; j < arr2[i].length; j++) {
//			            	arr2[i][j]= students[index];
//			            	index +=1;
//			    
//			            }
//			          
//		            }
		          
	            
//	 }

	 

		
		
		
		

	
