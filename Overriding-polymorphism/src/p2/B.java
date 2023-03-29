package p2;

public class B extends A {
	public void test3() {
		System.out.println(8);
	}
	public static void main(String[] args) {
		B b1=new B();
		
		b1.test1();
		b1.test2();
		b1.test3();
	}

}
