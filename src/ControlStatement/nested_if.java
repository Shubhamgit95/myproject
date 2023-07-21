package ControlStatement;

public class nested_if {
	
	public static void main(String[] args) {
		
		int PSI=60;
		int STI=35;
		
		if (PSI>=60)
		{
			System.out.println("Eligible for PSI Mains");
			
		if (STI>=65)
		{
			System.out.println("Eligible for STI Mains");
		}
		else 
		{
			System.out.println("You are not eliglible for PSI & STI");
		}
		}
		else
		{
			System.out.println("Sorry... Better Luck Next Time");
		}
	}

}
