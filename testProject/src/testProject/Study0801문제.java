package testProject;

public class Study0801문제 {
	 public static void main(String[] args) {
//	String arr[][]= {{"(0,0)","(0,1)","(0,2)"},{"(1,0)","(1,1)","(1,2)"},{"(2,0)","(2,1)","(2,2)"}};
//	   
//	System.out.print(arr[0][0]);
//	System.out.print(arr[0][1]);
//	System.out.println(arr[0][2]);
//	System.out.print(arr[1][0]);
//	System.out.print(arr[1][1]);
//	System.out.println(arr[1][2]);
//	System.out.print(arr[2][0]);
//	System.out.print(arr[2][1]);
//	System.out.print(arr[2][2]);
	
//	String[][] arr=new String[3][3];
//	int i,j;
//	i=0;
//	for(;i<arr[0].length;i++) {
//		
//		arr[0][i] =스샷에저장완료
//	}
	char ch= 'a';
// char arr[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}}; 
//	System.out.print(arr[0][0]);
//	System.out.print(arr[0][1]);
//	System.out.println(arr[0][2]);
//	System.out.print(arr[1][0]);
//	System.out.print(arr[1][1]);
//	System.out.println(arr[1][2]);
//	System.out.print(arr[2][0]);
//	System.out.print(arr[2][1]);
//	System.out.print(arr[2][2]);
		 
	
//	for(int i=0;i<arr.length;i++){
//		   for(int j=0;j<arr[j].length;j++){
//		           arr[i][j]=ch++;   
//		   }
//	}		 
//	for(int j=0;j<arr.length;j++){
//		   for(int j=0;j<arr[j].length;j++){
//		      
//		   }
//		   System.out.print(arr[i][j]);  
//	char[][] arr=new char[3][3];   
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr[i].length; j++) {
//			arr[i][j] = i;
//		}
//	}
//
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr[i].length; j++) {
//			System.out.print(arr[i][j]);
//		}
//		System.out.println(); 
		
//		int num=1;
//		int[][] arr=new int[4][4];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][i] =num++;
//			}
//		}
//		for(int i=0 ;i<arr.length; i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[j][j]=num++;
//			}
//			System.out.print(arr[i][j]);
//		}
//	     int num = 1;
//	        int[][] arr = new int[4][4];
//
//	        for (int i = 0; i < arr.length; i++) {
//	            for (int j = 0; j < arr[i].length; j++) {
//	                arr[i][j] = num++;   
//	                System.out.print(arr[i][j] + " ");
//	            }  
//	            System.out.println();
//	        }
//
//	     
	        // 배열 초기화
	  int[][] arr = new int[4][4];
	        int num = 1;
	        for (int i = 0; i < arr.length-1; i++) {
	            for (int j = 0; j < arr[i].length-1; j++) {
	                arr[i][j] = num++;
	            }
	        }

	        // 맨 마지막 열에 앞에 있는 열들의 값을 더하기
	        for (int i = 0; i < arr.length-1; i++) {
	            int sum = 0;
	            for (int j = 0; j < arr[i].length - 1; j++) {
	                sum += arr[i][j];
	            }
	            arr[i][arr[i].length -1] = sum;
	           
	        }
	        //맨 마지막 행에 위에있는 행들의 값을 더하기
	        for (int i = 0; i < arr.length-1; i++) {
	            int sum = 0;
	            for (int j = 0; j < arr[i].length - 1; j++) {
	                sum += arr[j][i];
	            }
	            arr[arr[i].length -1][i] = sum;
	           
	        }
//	        for (int i = 0; i < arr.length; i++) {
//	            int sum = 0;
//	            for (int j = 0; j < arr[i].length ; j++) {
//	                sum += arr[j][i];
//	            }
//	            arr[arr[i].length][i] = sum;
//	           
//	        }
	        
	    
	        arr[3][3]=arr[0][3]+arr[1][3]+arr[2][3]+arr[3][0]+arr[3][1]+arr[3][2];
     
	        // 배열 출력
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
		   
}
}
