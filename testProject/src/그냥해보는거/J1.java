package 그냥해보는거;

public class J1 {
	public static void main(String[] args) {

		Runnable task1 = () -> { // 20 미만 짝수 출력
			try {
				for(int i = 0; i < 20; i++) {
					if(i % 2 == 0)
						System.out.print(i + " ");
					Thread.sleep(100); // 0.1초간 잠을 잔다.
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable task2 = () -> { // 20 미만 홀수 출력
			try {
				for(int i = 0; i < 20; i++) {
					if(i % 2 == 1)
						System.out.print(i + " ");
					Thread.sleep(100); // 0.1초간 잠을 잔다.
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};


		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();



	}

	
//	public static void main(String[] args) {
//		  int n1 = 10;
//	      int n2 = 20;
//		
////		Thread ct = Thread.currentThread();
////		String name = ct.getName();    // 쓰레드의 이름을 반환
////		System.out.println(name);
////	}
//	   Runnable task = () -> { // 쓰레드가 실행하게 할 내용//->이건 람다식
//		    
//		      String name = Thread.currentThread().getName();
//		      System.out.println(name + ": " + (n1 + n2));
//		   };
//		   
//		   Thread t = new Thread(task);
//		   t.start(); // 쓰레드 생성 및 실행
//		   System.out.println("End " + Thread.currentThread().getName()
//				   
//				   
//				   );
//		}    
		// Runnable         void run()


		
		
		//제네릭!@!
//	}
//		   Box<Apple> aBox = new Box<Apple>();    // T를 Apple로 결정
//		   Box<Orange> oBox = new Box<Orange>();    // T를 Orange로 결정
//
//		   aBox.set(new Apple());   // 사과를 상자에 담는다.
//		   oBox.set(new Orange());   // 오렌지를 상자에 담는다.
//		   
//		   Apple ap = aBox.get();   // 사과를 꺼내는데 형 변환 하지 않는다.
//		   Orange og = oBox.get();   // 오렌지를 꺼내는데 형 변환 하지 않는다.
//
//		   System.out.println(ap);
//		   System.out.println(og);
//		  
//		   Integer num1 = 42;
//		   int num2 = 42;
//
//		   if (num1 == num2) {
//		       System.out.println("Equal"); // 박싱과 언박싱으로 인해 값 비교 가능
//		   } else {
//		       System.out.println("Not Equal");
//		   }
//		}


//}
//class Box<T> {
//	   private T ob;
//	   public void set(T o) {
//	      ob = o;
//	   }
//	   public T get() {
//	      return ob;
//	   }
//	}
//class Apple{
//	public String toString() {
//		return "I am an apple";
//	}
//}
//class Orange{
//	public String toString() {
//		return "I am an Orange";
//	}
}
