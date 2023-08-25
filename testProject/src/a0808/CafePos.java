package a0808;
import java.util.Scanner;
public class CafePos {
	private static CafePos instance;
	
	private final int MAX_COUNT=10;
	
	private final Product[] menuArr=new Product[MAX_COUNT];
	
	private Scanner sc=new Scanner(System.in);
	
	private boolean isRun=true;
	
	
	//외부에서 객체를 생성하지 못하도록 생성자의 접근제한자를 private로 설정
	private CafePos() {
		
	}
	
	public static CafePos getInstance() {
		if (instance==null)
			instance =new CafePos();
		return instance;
	}
	
	public boolean getIsRun() {
		return this.isRun;
	}
	
	public void setIsRun(boolean isRun) {
		this.isRun=isRun;
	}
	
	
	public int printMenu() {
		//메뉴 생성 ,삭제	,수정,조회,전체출력
		
		System.out.println("-------------------------");
		System.out.println("1.메뉴생성");
		System.out.println("2.메뉴수정");
		System.out.println("3.메뉴조회");
		System.out.println("4.메뉴삭제");
		System.out.println("5.전체 메뉴확인");
		System.out.println("-------------------------");
		System.out.println("원하시는 메뉴를 선택해 주세요");
		int num= sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public void updateDrunkunit() {
		printDrinkArr();
	 	Product selectMenu;
	 	int num;
	 	System.out.print("수정할 메뉴의 번호을 입력하세요:");
	 	num =sc.nextInt();
	 	selectMenu=menuArr[num];
	 	if (selectMenu==null) {
	 		System.out.print("해당번호의 메뉴가 존재하지않습니다.:");
	 	}else {
	 		System.out.print("수정할것을을 입력하세요:");
	 		switch(sc.next()) {
	 		case("이름"):
	 			
	 			 System.out.println("상품명을 입력하시오");
	 		
	 		sc.nextLine();
			selectMenu.setName(sc.nextLine());
			break;
	 		case("가격"):
	 			 System.out.println("가격을 입력하시오");
	 		sc.nextInt();
	 		selectMenu.setPrice(sc.nextInt());	
	 		break;
	 		case("설명"):	
	 			 System.out.println("설명을 입력하시오");
	 		sc.nextLine();
	 		selectMenu.setDescription(sc.nextLine());
	 		break;
	 			default:
	 				System.out.print("잘못입력하셨습니다.");
	 		

	 		}
	 	}
	}
	
	
	
	public void insertMenu() {
		 System.out.println("추가하실 메뉴를 상품명, 금액, 설명순으로 입력하시오");
		 
				 String name,description;
				 int price;
				 System.out.println("상품명을 입력하시오");
				 name=sc.next();
				 System.out.println("금액을 입력하시오");
				 price=sc.nextInt();
				 System.out.println("설명을 입력하시오");
				 description=sc.next();
				 
				 for(int i=0;i<menuArr.length;i++) {
					 	if(menuArr[i]==null) {
					 	menuArr[i]=new Product(name,price,description);
					System.out.println(menuArr[i].getName()+" 메뉴에 추가되었습니다" );
						break;
					 } else if(menuArr[i].getName().equals(name)) {
						 System.out.println(name+" 메뉴는 이미 있습니다." );
						 break;
					 }else if(i==menuArr.length-1) {
					  System.out.println("더이상 메뉴가 추가될수없습니다." );
					 }
				 }
		
		return;
		
		
	}
	
	public void deletDrunkunit() {
		//가장 최신으로 저장된 목록 1개 삭제
	 	for(int i=0;i<menuArr.length;i++) {
	 		 
	 	if(menuArr[i]==null) {
	 		  System.out.println(i+"\t-\t-\t-" );
	 		menuArr[i-1]=null;
	 	}else {
	 		 System.out.println(i+"\t-\t-\t-" );
	 	}
	}
	}
	
	public void searchDrinkUnit() {
		for(int i=0;i<menuArr.length;i++) {
			 System.out.println("조회할 메뉴를 입력하세요:" );
				
			String name=sc.next();
	 
		 if(menuArr[i].getName().equals(name)) {
			
			 System.out.println(i+1+"번"+menuArr[i].toString() );
			 break;
		 } else if(!menuArr[i].getName().equals(name)) {
			 System.out.println("해당 메뉴는  없습니다." );
			break;
		 }else if(i==(menuArr.length-1)) {
			 System.out.println("해당 메뉴는  없습니다." );
			 return;
			 
		 }	 
		 }
	}
	
	public void printDrinkArr() {
//		for(int i=0;i<menuArr.length;i++) {
//	 		 
//	 	if(menuArr[i]==null) {
//	 		 
//	 		System.out.println("\t" );
//	 		break;
//	 	}else {
//	 		System.out.println(menuArr[i].toString() );
//	 		break;
//	}
		for(int i=0;i<menuArr.length;i++) {
	 		 
	 	if(menuArr[i]==null) {
	 		 
	 		System.out.println("\t" );
	 		break;
	 	}else {
	 		System.out.println(menuArr[i].toString() );
	 	}
	
}
	}
}
