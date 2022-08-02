package com.telusko;

public class ExceptionDemo1 {

	public static void main(String[] args) 
	{
		try
		{
			//int i = 9 / 0; //throws an object of Exception
			int i = 7;
			int j = 2;
			int k = i / j;
			System.out.println("Output is " + k);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.println("Bye");
		}
		
//		//Generalized Exception
//		catch (Exception e) //Accepts an object of Exception
//		{
//			System.out.println("Error ");
//		}
		
//		System.out.println("Bye!");
	}
}
