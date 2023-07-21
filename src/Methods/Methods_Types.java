package Methods;

public class Methods_Types {
	public static void main(String[] args) 
	{
		m1();
		
		Methods_Types mt=new Methods_Types();
		mt.m2();
		
		m3(5, 50);
		
		Methods_Types mtnp= new Methods_Types();
		mtnp.m4 (null, null);
		
		mul(5,6);
		
		Methods_Types mtwna=new Methods_Types();
		mtwna.sub(52,38);
		
	}
	
	public static void m1()
	{
		System.out.println("Ststic with no parameter m1");
	}
	
	public void m2()
	{
		System.out.println("non static with no argument m2");
	}
	
	public static void m3 (int a, int b)
	{
		System.out.println("Static method with parameter m3");
	}

	public  void m4 (String a, String b)
	{
		System.out.println("Static method with no parameter m4");
	}
	
	//Static Method with Result types
	
	public static void mul(int num1 , int num2)
	{
		System.out.println(num1 * num2);
	}
	
	// Non static with return type
	
	public void sub(int num1, int num2)
	{
		System.out.println(num1-num2);
	}
}
