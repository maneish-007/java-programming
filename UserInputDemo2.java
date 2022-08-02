package com.telusko;

//User input using BufferedReader class

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputDemo2 
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader object = new InputStreamReader(System.in);	
		BufferedReader br = null;
		int number = 0; //Declared here to increase its scope
		try
		{ 
			br = new BufferedReader(object);
			System.out.print("Enter integer: ");	
			//To read a String
			String num_string = br.readLine();
			number = Integer.parseInt(num_string);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		finally
		{
			br.close();
			//BufferedReader object is a Resource i.e. it must be closed after using it
		}
	
		System.out.printf("Output: %d", number);	
	}
}
