package com.kh.pre3;
import java.util.*;
//pos의 전체적인 관리를 위한 class
public class POSSSystem {
	//외부에서 점근이 불가능한 pos객체생성
	Scanner sc = new Scanner(System.in);
	private final static Customer[] CUSTOMER_List =new Customer[10];
	private static POSSSystem posInstance= new POSSSystem();
	
	private POSSSystem() {
		
	}
	
	public static POSSSystem getposstance() {
		return posInstance;
	}
	
	//회원가입 정보입력을 위한 메서드
	public Customer insertCustomer() {
		String name,ps, id,email;
		System.out.print
		
		
	}
	
	//회우너을 실제로 배열에 저장하는 매서드
	public void saveCustomer(Customer user) {
		for (int i=0;i<this.CUSTOMER_List.length;i++) {
			if(this.CUSTOMER_List[i]==null) {
				this.CUSTOMER_List[i]=user;
			System.out.println()
			}
		}
		
	}
	
}
