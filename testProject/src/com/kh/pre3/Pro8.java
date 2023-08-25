package com.kh.pre3;
import java.util.Scanner;
public class Pro8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer[] customerArr = new Customer[10];
        
        int choice =pos.prinetMenu();
        
        boolean isLoop= true;
        while(isLoop) {
        	switch(pos.prinetMenu()) {
        		case 1:{//회원등록
        			
        		}break;
        		case 2:{//회원삭제
        			
        		}break;
        		case 3:{//회원목록 출력
	
        		}break;
        		case 4:{//로그인
        			
        		}break;
        		default:
        			isLoop=false;
        	
        	
        	}
        }
        
        //pos  메뉴를 나타내주는 매서드
        
        

        // 회원가입 기능
        System.out.println("회원가입을 진행합니다.");
        System.out.print("아이디를 입력하세요: ");
        String id = sc.next();

        System.out.print("비밀번호를 입력하세요: ");
        String password = sc.next();

        System.out.print("이름을 입력하세요: ");
        String name = sc.next();

        System.out.print("이메일을 입력하세요: ");
        String email = sc.next();

        Customer newCustomer = new Customer(name, id, password, email);

        for (int i = 0; i < customerArr.length; i++) {
            if (customerArr[i] == null) {
                customerArr[i] = newCustomer;
                System.out.println("회원정보가 정상적으로 등록되었습니다.");
                break;
            } else if (i == customerArr.length - 1) {
                System.out.println("더 이상 회원을 등록할 수 없습니다.");
            }
        }

        // 회원 검색 기능
        System.out.println("회원 검색을 진행합니다.");
        System.out.print("아이디를 입력하세요: ");
        String searchId = sc.next();

        Customer foundCustomer = null;
        for (Customer customer : customerArr) {
            if (customer != null && customer.getId().equals(searchId)) {
                foundCustomer = customer;
                break;
            }
        }

        if (foundCustomer != null) {
            System.out.println("회원 정보를 찾았습니다.");
            System.out.println(foundCustomer.toString());
        } else {
            System.out.println("등록된 회원 정보를 찾을 수 없습니다.");
        }
    }
}
