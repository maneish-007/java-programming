package com.telusko;

import com.telusko.test.Student;

public class Engineer extends Student
{
	public void show()
	{
		marks = 100; //Protected field hence accessible in subclass in another package
//		age = 30; //Default field hence only accessible to same package and not outside
	}
}
