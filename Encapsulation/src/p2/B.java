package p2;

public class B {
	public static void main(String[] args) {
		A a1=new A();
		a1.setId(400);
		a1.setName("Saurabh");
		
		int x=a1.getId();
		String y=a1.getName();
		
		System.out.println(x);
		System.out.println(y);
	}

}
