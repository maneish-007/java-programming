package com.telusko;

//Underneath the hood implementation of Scanner and BufferedReader

public class UserInputDemo1 
{
	public static void main(String args[]) throws Exception
	{
		String str = "";
		char ch = ' ';
		System.out.print("Input: ");
		do 
		{
			ch = (char)System.in.read();
			str += ch;
		}
		while(ch != '\n');
		
		System.out.println("You entered: " + str);
		
	}
}
