package a0808;

class Product {
	//필드 :필요한 데이터의 변수를 나열
	private	String name;//상품명
	private	int price;//가격
	private	int count;//재고
	private String description;//상품설명
	
	private final int MAX_COUNT =50;
	
	//생성자: 접근제한자 클레스이름(매개변수)
		public Product(String name,int price,String description){
			this.name=name==null?"이름없음":name;
			this.price=price<0?0:price;
			this.description=description==null?"이름없음":description;
			this.count=this.MAX_COUNT;
	}
	//3가지기본메서드  	1. getter(필드에있는데이터반환)
	//	           	2. setter(필드에 있는 데이터에 값 대입)
	//	   			3. toString(모든 데이터 정보를 String로반환)
	
	
	public void setName(String name) {
	  this.name=name;
	}
	public void setDescription(String description) {
		  this.description=description;
	}
	public void setCount(int count) {
		if(count<0) {
			this.count=0;
		}else {
		 this.count=count;
		}
		}
	
	
	public void setPrice(int price) {
		if(price<0)
			this.price=0;
		else
			this.price=price;
		
				  
		}
	public String getName() {
		  return this.name=name==null?"이름없음":name;
		}
	public String getDescription() {
		  return this.description;
		}
	public int getCount() {
		  return this.count=count<0?0:count;
		}
	public int getPrice() {
		  return this.price=price<0?0:price;
		}
	public void productInfo() {
		System.out.println(getName()+"는"+getPrice()+"에 팝니다.");
	}
	
	
	//toString
	public String toString() {
		String str =this.name+"\t"+this.price+"\t "+this.description;
		return str;
	}
	
	//제품가격의 특정 값을  매개 변수로 넘겨 받아서 합한 값을 리턴해주는 매서드
	//totalPrice
	//접근제한자 반환자료형 매서드이름(매개변수){}
	public int addPrice(int plusPrice) {
	 return this.price+plusPrice;
	
	}
//	접근제한자 반환자료형 매서드이름(매개변수){}

	}
	
		
	

