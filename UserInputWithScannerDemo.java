package com.telusko;

//Demonstration of User input using Scanner class

import java.util.Scanner;

public class UserInputWithScannerDemo 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Output: " + n);
	}
}
