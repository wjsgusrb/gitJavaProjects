package InterFace;
//항상 모든메서드를 오버라이딩을 해야한다!
public interface Animal {
	   public static final String name = "동물";
	    
	    public abstract void eat(String food);
	    void makeSound();
	    final int age = 10;
	    public abstract void fly();
	    public abstract void Swimmable();
	
//	public static final String name ="동물";
//	
//	public abstract void eat(String food);
//	void makeSound();
//	final int age=10;
//	public abstract void fly();
//	public abstract void Swimmable();
//	

	
	
}
