package a0808;
import java.util.Scanner;
public class MainStart {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		CafePos pos=CafePos.getInstance();
	
		int num =pos.printMenu();
		
		
//		while(pos.getIsRun()) {
//		switch(num) {
		while (pos.getIsRun()) {
		    num = pos.printMenu();  // 이 부분에서 메뉴를 다시 선택하도록 수정
		    switch (num) {
		
		case 1:{
			pos.insertMenu();	
		}break;
		case 2:{
			pos.updateDrunkunit();	
		}break;
		case 3:{
			pos.printDrinkArr();
		}	break;
		case 4:{
			pos.deletDrunkunit();
		}break;
		case 5:{
			pos.searchDrinkUnit();
		}break;
		default:{
			pos.setIsRun(false);
		}
		
		}
		}
		
	}
}
		
		
		
//		final int MAX=20;
//		
//		Product[] menuArr=new Product[MAX];
//		//음료명,금액,설명을 입력받아 drinkArr에 추가해보아라
//		//000음료가 메뉴에 추가되었습니다
//		//또는 000은 이미 등록되어있습니다.
//		 System.out.println("추가하실 메뉴를 상품명, 금액, 설명순으로 입력하시오");
// 
//		 String name,description;
//		 int price;
//		 System.out.println("상품명을 입력하시오");
//		 name=sc.next();
//		 System.out.println("금액을 입력하시오");
//		 price=sc.nextInt();
//		 System.out.println("설명을 입력하시오");
//		 description=sc.next();
//		 
//		 for(int i=0;i<menuArr.length;i++) {
//			 	if(menuArr[i]==null) {
//			 	menuArr[i]=new Product(name,price,description);
//			System.out.println(menuArr[i].getName()+"가 메뉴에 추가되었습니다" );
//				break;
//			 } else if(menuArr[i].getName().equals(name)) {
//				 System.out.println(name+" 메뉴는 이미 있습니다." );
//				 break;
//			 }else if(i==menuArr.length-1) {
//			  System.out.println("더이상 메뉴가 추가될수없습니다." );
//			 }
//		 }
			//음료목록을 출력해주세요
			//메뉴명 가격 설명
//			 	for(int i=0;menuArr[i]!=null &&i<menuArr.length;i++) {
//			 		 System.out.println(i+1+"번 "+menuArr[i].toString()+"." );
//			 		
//			 	}
			 	//=========================================================
			 	//가장 최신으로 저장된 목록 1개 삭제
//			 	for(int i=0;i<menuArr.length;i++) {
//			 		 
//			 	if(menuArr[i]==null) {
//			 		  System.out.println(i+"\t-\t-\t-" );
////			 		menuArr[i-1]=null;
//			 	}else {
//			 		 System.out.println(i+"\t-\t-\t-" );
//			 	}
//			 	}
//			
			 	//가장 최신것 삭제
//			 	for(int i=0;i<menuArr.length;i++) {
//			 		 
//				 	if(menuArr[i]==null) {
//				 		 
//				 		menuArr[i-1]=null;
//				 		 System.out.println(i+"번째메뉴가 삭제되었습니다." );
//				 		break;
//				 	}else if(i==0) {
//				 		System.out.println("삭제할메뉴가 없습니다." );
//				 	}
//				}
			 	//조회할 메뉴의 이름을 입력하세요: 아메리카노
			 	//0 아메리카노 1000 시원해요
			 	//해당메뉴가 목록에존재하지 않습니다.
		//=========================조회=================================
//			 for(int i=0;i<menuArr.length;i++) {
//				 System.out.println("조회할 메뉴를 입력하세요:" );
//					
//				 name=sc.next();
//		 
//			 if(menuArr[i].getName().equals(name)) {
//				
//				 System.out.println(i+1+"번"+menuArr[i].toString() );
//				 break;
//			 } else if(!menuArr[i].getName().equals(name)) {
//				 System.out.println("해당 메뉴는  없습니다." );
//				break;
//			 }else if(i==(menuArr.length-1)) {
//				 System.out.println("해당 메뉴는  없습니다." );
//				 return;
//				 
//			 }	 
//			 }
			 //수정할 메뉴의 이름를 입력하세요
			 //수정할 정보를 입력하세요: (이름,가격,설명)
			 //새로운 이름을 입력하세요: 
			 //새로운 가격을 입력하세요:
			 //00 아메리카노 1000 시원해요
//			 	for(int i=0;i<menuArr.length;i++) {
//					 System.out.println("수정할 메뉴의 이름을 입력하세요:" );
//						
//					 name=sc.next();
//					 if(menuArr[i].getName().equals(name)) {
//						 System.out.println("상품명을 입력하시오");
//						 name=sc.next();
//						 System.out.println("금액을 입력하시오");
//						 price=sc.nextInt();
//						 System.out.println("설명을 입력하시오");
//						 description=sc.next();
//						 menuArr[i]=new Product(name,price,description);
//						 System.out.println(i+1+"번 "+menuArr[i].toString() );
//						 return;
//					 }else {
//						 System.out.println("그런매뉴는 없습니다." );
//					 }
//						 
//					 }
			 	//선생님버전
//			 	Product selectMenu;
//			 	int num;
//			 	System.out.print("수정할 메뉴의 번호을 입력하세요:");
//			 	num =sc.nextInt();
//			 	selectMenu=menuArr[num];
//			 	if (selectMenu==null) {
//			 		System.out.print("해당번호의 메뉴가 존재하지않습니다.:");
//			 	}else {
//			 		System.out.print("수정할것을을 입력하세요:");
//			 		switch(sc.next()) {
//			 		case("이름"):
//			 			
//			 			 System.out.println("상품명을 입력하시오");
//			 		
//			 		sc.nextLine();
//					selectMenu.setName(sc.nextLine());
//					break;
//			 		case("가격"):
//			 			 System.out.println("가격을 입력하시오");
//			 		sc.nextInt();
//			 		selectMenu.setPrice(sc.nextInt());	
//			 		break;
//			 		case("설명"):	
//			 			 System.out.println("설명을 입력하시오");
//			 		sc.nextLine();
//			 		selectMenu.setDescription(sc.nextLine());
//			 		break;
//			 			default:
//			 				System.out.print("잘못입력하셨습니다.");
//			 		
//
//			 		}
//			 
//			 		for(int i=0;i<menuArr.length;i++) {
//				 		 
//				 	if(menuArr[i]==null) {
//				 		 
//				 		menuArr[i-1]=null;
//				 		break;
//				 	}else {
//				 		System.out.println(menuArr[i].toString() );
//				 	}
//				 	}
//	}
//}
//}

			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	
		
		
		//==========================================================
		
//		Product[] drinkArr=new Product[3];
//	
//		 drinkArr[0]=new Product("아메리카노",2000,"아이스");
//		 drinkArr[1]=new Product("핫초코",2000,"핫");
//		 drinkArr[2]=new Product("라때",2000,"핫");
//		 System.out.println(drinkArr[2].toString());
//		 for(int i=0;i<drinkArr.length;i++) {
//			 System.out.println(drinkArr[i].toString());
//		 }
//		 System.out.println(drinkArr[0]);
		 

		 
		 
		//=========================================================
		
		//class사용해서 객체배열 만드는 방법
		//1)class이름[] 객체배열이름 =new class이름[크기(길이)]
		//→위처럼 작성시 객체배열이 생성은 되지만 비어있는 상태
		
//		Product[] drinkList=new Product[2];//2개짜리 객체배열생성
//		//실제 객체를 만드는 방법
//		//2)객체배열이름[index] =new class이름(매개변수);
//		drinkList[0]=new Product("아메리카노",1000,10);
//		drinkList[1]=new Product("카페라때",2000,10);
//		
//		drinkList[0].productInfo();
//		drinkList[1].productInfo();
//		
		
//		int k;
//		double j;
//		String name;
//		int age;
//		int count;
//		int price;
//		
//		//3번.class이름 객체이름 =new 클레스이름();
//		Product iceAme;// 참조변수만 만들어진 상태
//		iceAme= new Product("아메리카노",1000,10);//참조변수가  메모리 공간의 주소값을 가지고 있는상태
////		iceAme.name="아메리카노";//필드에있는 name에 아메리카노?
////		iceAme.count=10;
////		iceAme.price=1000;
//		
//		
//		Product ame;
//		ame= new Product("아메리카노",2000,"아이스");
//		Product hotchoco;
//		hotchoco= new Product("핫초코",2000,"핫");
//		Product latte;
//		latte= new Product("라때",2000,"핫");
		
//		System.out.println(ame.toString());
//		System.out.println(hotchoco.toString());
//		System.out.println(latte.toString());
		
//		
//		iceAme.setPrice(500);
//		iceLatte.setPrice(1000);
//		iceLatte.setName("맛있는거");
		
		
//		iceLatte.name="아이스라떄";
//		iceLatte.count=10;	
//		iceLatte.price=2000;
//		System.out.println(iceAme.getName()+"는"+iceAme.getPrice()+"에 팝니다.");
//		System.out.println(iceLatte.getName()+"는"+iceLatte.getPrice()+"에 팝니다.");
//		
//		iceAme.productInfo();
//		iceLatte.productInfo();
		
		//int num= iceAme.totalPrice(500,1000);
//		System.out.print(iceAme.addPrice(iceLatte.getPrice()));
		//1번
//		System.out.print("상품명을 입력하세요:");
//		name = sc.next();
//		System.out.print("상품의 가격을 입력하세요:");
//		price =sc.nextInt();
//		System.out.print("상품의 재고를 입력하세요:");
//		count =sc.nextInt();
   
		
	

//2번 접근지정자 class 클레스이름{}
//class Product{
//	//필드  (데이터영역)
//	//변수를 필요한만큼 생성한다.
//	
//	String name;
//	int price;
//	int count;
	
	
	//매세드 (기능영역)
	//매서드 작성방법
	//접근제한자 반환자료형 매서드이름(매개변수){}  :매서드 기본형
	//메서드 기능영역 아래에 생성자가들어간다
	//생성자=>데이터 필드를 초기화 시키기 위해서 생성시에 한번만 호출 되는 특수한 매서드
	
	//개발자가 직접 만들어 주지 않으면 기본생성자는 내부적으로 컴파일러가 만들어 준다.
	//piblic Product(){    //기본생성자
	//}이렇게 만들어준다
	
	//네임값을 세팅하는 기능
	//매개변수에 개수나 타입에 따라서 여러개를 생성할숭있다.
	//단 생성자를 직접 적어주면 기본생성자는 
	
	
