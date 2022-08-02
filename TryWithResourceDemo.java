package com.telusko;

//Implementing a try block without using a catch or finally
//Using try to close our Resource

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class TryWithResourceDemo 
{
	public static void main(String args[]) throws Exception
	{
		int n = 0;
		System.out.println("Integer: ");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			n = Integer.parseInt(br.readLine());
		}
		//Resource br is closed as soon as try is closed
		System.out.printf("Output: %d", n);
	}
}
