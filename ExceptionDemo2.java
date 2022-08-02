package com.telusko;

public class ExceptionDemo2 {

	public static void main(String[] args) 
	{
		try
		{
			int a[] = null;
			//Throws a NullPointerException object which we haven't handled in our program
			//But we have a generalized catch block that will take care of it!
			
			a[6] = 8;
			int i = 7;
			int j = 0;
			int k = i / j;
			System.out.println("Output is " + k);
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in your limit..");
		}
		
		catch (Exception e)
		{
			System.out.println("Something wrong...");
		}
		finally
		{
			System.out.println("Bye");
		}
	}
}
