package ControlStatement;

public class else_if 
{

	public static void main(String[] args) 
	{
		int Marks=45;
		if(Marks>=65)
		{
			System.out.println("DISTINCTION");
		}
		else if (Marks>=60 & Marks<=64)
		{
			System.out.println("1nd CLASS");
		}
		else if (Marks>=50 & Marks<=59)
		{
			System.out.println("2rd CLASS");
		}
		else if (Marks>=36 & Marks<=49)
		{
			System.out.println("3rd CLASS");
		}
		else if (Marks<=35)
		{
			System.out.println("FAIL");
		}
		
	}
}
