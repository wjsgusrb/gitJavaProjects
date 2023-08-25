package com.kh.pre3;

import java.util.Scanner;
import java.util.Scanner;
public class Customer {
	   Scanner sc = new Scanner(System.in);
	public int prinetMenu() {
   	 System.out.println("---------.");
   	 System.out.println("1. 회원등록");
   	 System.out.println("2. 회원삭제.");
   	 System.out.println("3. 회원목록출력.");
   	 System.out.println("4. 로그인.");
   	 System.out.println("------------");
   	 System.out.println("원하시는 번호를 입력해 주세요");
   	 return sc.nextInt();
	}
	
	public void deleteLastCustomer() {
		for(int i =this.CUSTOMER_List.length-1;i>0;i--) {
			
		}
	}
	
	    private String name;
	    private String id;
	    private String password;
	    private String email;
	    
	    public Customer(String name, String id, String password, String email) {
	        this.name = name;
	        this.id = id;
	        this.password = password;
	        this.email = email;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    public String getId() {
	        return id;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public String getEmail() {
	        return email;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    @Override
	    public String toString() {
	       String str = "이름\tID\tPassword\tEmail" + 
	                this.name + "\t" + this.id + "\t" + 
	                 this.password+ "\t" + this.email; 
	        return str;
	    }
	}
;';'
