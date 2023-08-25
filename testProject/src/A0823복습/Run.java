package A0823복습;


public class Run {
	public static void main(String[] args) {
		
		Human jeon =new Human("jeon",20);
		Book[] jeonBookList =jeon.getbooklist();
		 jeonBookList[0]=new Book("ekjr");
		 String jeonName =jeon.getName();
	}

}
