package com.telusko;

//Multiple Exceptions inside 1 catch

public class ExceptionDemo3 {

	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[6];
			a[6] = 8;
			int i = 7;
			int j = 2;
			int k = i / j;
			System.out.println("Output is " + k);
		}
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error");
		}
		
		finally
		{
			System.out.println("Bye");
		}
	}
}
