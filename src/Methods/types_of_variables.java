package Methods;

// Local variable & Global variables

public class types_of_variables 
{
//1. Local Variable
	public void m5()
	{
		int num2= 50;
		System.out.println(num2);
	}
	
//2. Global variables
	int num4=56;
	public void m6()
	{
	int num5=30;
	
	System.out.println("This is global varialble" + num5);
	System.out.println("This is global varialble" + num4);
	}
	
	public static void main (String[]args)
	{
		types_of_variables lv1= new types_of_variables();
		lv1.m5();
		
		types_of_variables lv2= new types_of_variables();
		lv2.m6();
	}


}
