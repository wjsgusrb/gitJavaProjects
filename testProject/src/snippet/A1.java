package snippet;

//public class A1 {
//	int[] ar = new int[3];
//	ar[0] =7;
//	a[1] =8;
//	ar[2] =9;
//	int num =ar[0]+ar[1]+ar[2];
//	System.out.print(num);
//
//}
//}
public class A1 {
    int[] ar = new int[3];

    public A1() {
        ar[0] = 7;
        ar[1] = 8;
        ar[2] = 9;
        int num = ar[0] + ar[1] + ar[2];
        System.out.print(num);
    }

    public static void main(String[] args) {
        new A1();
    }
}