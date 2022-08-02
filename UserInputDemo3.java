package com.telusko;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputDemo3 
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = null;
		int n = 0; //Declared here to increase its scope
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		finally
		{
			br.close(); 
			System.out.println("Closed");
		}
		
		System.out.printf("Output: %d", n);
	}
}
