package Java;

public class method_SameClass {
	public static void main(String[] args) {
		
		// Static method
		m2();
		
		method_SameClass msc=new method_SameClass();
		msc.m1();
		
		
	}
	
	public  void m1() {
		System.out.println("this is non static method m1");
	}
	
	public static void m2() {
		System.out.println("this is static method m2");
	}

}
