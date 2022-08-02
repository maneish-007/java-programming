package com.telusko;

public class UserDefinedExceptionDemo 
{
	public static void main(String args[])
	{
		int i, j;
		i = 8;
		j = 2;
		
		try
		{
			int k = i / j;
			throw new UserDefinedException("My custom Error message!");
		}
		
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
