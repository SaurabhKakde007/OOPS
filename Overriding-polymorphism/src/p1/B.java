package p1;

public class B extends A {
	public void test() {
		System.out.println(600);
	}
	public static void main(String[] args) {
		B b1=new B();
		b1.test();
	}

}
  //in overriding we can modify the 
//logic of inheritance method by 
//onces again creates method in
//child class with same signature 
//of parents class.