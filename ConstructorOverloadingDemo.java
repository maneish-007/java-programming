//Demonstration of Constructor Overloading

class Casio1
{
	int num1;
	int num2;
	String operation;
	
	public Casio1()
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}
	public Casio1(int i)
	{
		num1 = i;
		num2 = 0;
		operation = "Nothing";
	}
	public Casio1(int i, int j, String input)
	{
		num1 = i;
		num2 = j;
		operation = input;
	}
	
}

public class ConstructorOverloadingDemo 
{
	public static void main(String args[])
	{
		Casio1 obj1 = new Casio1();
		
	}
}
