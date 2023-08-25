package testProject;
import java.util.Scanner;
public class Pr {
    public static void main(String[] args) {
    	
//    	/**
//    	 * ㅓ키보듸로 두개의 정수와 연산 기호를 잉ㅂ력받아 연산 기호에 맞춰 연산결과를 출력하세요 
//    	 * 단 두개의정수가 모두 양수일떄만 작동하며 연산 기호를 입력 했을시 잘못입력하셨습니다.를출력)
//    	 * 피연산자1 입력 15
//    	 * 피연산자2 입력 4
//    	 * (연산자 입력 (+-*/
//         15/4=3.750000000
//    	 */
    	/**
    	 * switch(i);
    	 * case'+':
    	 * break;
    	 *  default:
    	 *  
    	 */
    	
    	
    	
    	Scanner sc = new Scanner(System.in);
    	int num1,num2;
    	double re;
    	char i;//또는 String i;사용가능

    	    System.out.println("첫 번째 정수를 입력하시오");
            num1 = sc.nextInt();

            System.out.println("연산기호를 입력하시오(+-*/)");
            i = sc.next().charAt(0); 
            System.out.println("두 번째 정수를 입력하시오");
            num2 = sc.nextInt();
            /**
             *  if (i == '+') {
                System.out.println("num1+"+"+num2"="(num1+num2).")
            } else if (i == '-') {
               System.out.println("num1+"-"num2"="(num1-num2).")
            } else if (i == '*') {
                System.out.println("num1+"*"num2"="(num1*num2).")
            } else if (i == '/') {
                System.out.println("num1+"/"num2"="(num1/num2).")
            } else {
                System.out.println("잘못된 연산기호를 입력하였습니다.");
             */
             if (i == '+') {
                System.out.println(num1+"+"+num2+"="+(num1+num2));
            } else if (i == '-') {
               System.out.println(num1+"-"+num2+"="+(num1-num2));
            } else if (i == '*') {
                System.out.println(num1+"*"+num2+"="+(num1*num2));
            } else if (i == '/') {
//                System.out.println(num1+"/"+num2+"="+((double)num1/num2));
                System.out.printf("%d %c %d %f.6f/n",num1,i,num2,(double)num1/num2);//바로 위에꺼와 동일하다f는 float
            } else {
                System.out.println("잘못된 연산기호를 입력하였습니다.");
            }
    }
}
         

            // 연산 기호에 따라 다른 계산 수행
//            if (i == '+') {
//                re = num1 + num2;
//            } else if (i == '-') {
//                re = num1 - num2;
//            } else if (i == '*') {
//                re = num1 * num2;
//            } else if (i == '/') {
//                re = (double) num1 / num2; 
//            } else {
//                System.out.println("잘못된 연산기호를 입력하였습니다.");
//                return; 
//            }
//
//            System.out.println("결과값은 " + re);
        
    
    	 
    	 
    
    
   
         
//    	/**
//    	 * 키 몸무게 를 더블로 입력받고 bml지수를 계산하여 계산 결과에 따라 저체중 정상 과체중 비만을 출력하세요
//    	 * bmi = 몸무게/키*키(m)
//    	 * 18.5미만 저체중
//    	 * 23<정상
//    	 * 23~25과체줒ㅇ
//    	 * 30<비만
//    	 */
//    	Scanner sc = new Scanner(System.in);
//    	double hi,wi,bmi;
//    	 System.out.println("키를 입력하세요");
//     	hi = sc.nextInt();
//     	 System.out.println("몸무게를 입력하세요");
//     	wi = sc.nextInt();
//       	bmi = wi/((hi*0.0001)*hi);
//       	System.out.println(bmi);
//          
//          if (bmi<18.5) {
//            System.out.println("저체중");
//        } else if (bmi<23 && bmi>18.5) {
//            System.out.println("정상");
//        } else {
//            System.out.println("비만");
        
    
//    	if (관리자) {
//          System.out.println("회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성");
//      } else if (num == 0) {
//          System.out.println("게시글 작성 게시글 조회 댓글 작성");
//      } else {
//          System.out.println("게시글 조회");
//      }
    	
    	
    	
    	
    	
    	
//    	1번 사용자에게 관리자,회우너 비회원중 하나를 입력 받아 각 등급이 행할수있느느 권한을 출력하세요
//    	단 관리자는 회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성이 가능하고
//    	   회원은 게시글 작성 게시글 조회 댓글작성이가능하고
//    	   비회원은 게시글 조회만 가능합니다.
//    	Scanner sc = new Scanner(System.in);
//          String jurisdiction;
//          jurisdiction = sc.nextInt();
//          System.out.println("회원등급을작성하시오:");
//          if (관리자) {
//            System.out.println("회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성");
//        } else if (num == 0) {
//            System.out.println("게시글 작성 게시글 조회 댓글 작성");
//        } else {
//            System.out.println("게시글 조회");
//        }
    	
    	
//    	 이프와 스위치
//          int num;
//          Scanner sc = new Scanner(System.in);
//          System.out.println("회원등급을 작성하시오:");
//          String grade;
//          grade = sc.next();
//          System.out.println("입력한 회원등급은 " + grade + "입니다.");
//
//          	if (grade.equals("관리자")) {
//              System.out.println("회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성");
//          		} else if (grade.equals("회원")) {
//              System.out.println("게시글 작성 게시글 조회 댓글 작성");
//          		}  else if (grade.equals("비회원")) {
//                  System.out.println("게시글 조회");
//          		} else {
//              System.out.println("잘못 입력하셨습니다.");
//         	}
//    		
//         switch(grade) {
//         case "관리자":
//        	  System.out.println("회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성");
//        	   break;
//         case "회원":
//       	  System.out.println("회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성");
//       	   break;
//         case "비회원":
//       	  System.out.println("회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성");
//       	   break;
//        	   default:
//        	   System.out.println("회원 관리 게시글 관리 게시글 작성 게시글 조회 댓글 작성");
//        	   
//        	 
//         }
    	
    	

//        Scanner sc = new Scanner(System.in);
//        int num;
//
//        System.out.println("하나의 정수를 입력하세요:");
//        num = sc.nextInt();
//
//        if (num > 0) {
//            System.out.println("양수다");
//        } else if (num == 0) {
//            System.out.println("0이다");
//        } else {
//            System.out.println("음수다");
//        }
//    }



