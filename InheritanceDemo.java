
//IS-A Dog IS-A Animal
//HAS-A  Bathroom HAS-A Tub
//->Refer Notes of 8th December 2021

class Calculator	//Super class
{
	public int add(int i, int j)
	{
		return i + j;
	}
}

class CalcAdv extends Calculator	//Sub class
{
	public int subtract(int i, int j)
	{
		return i - j;
	}
}

class CalcVeryAdv extends CalcAdv
{
	public int multi(int i, int j)
	{
		return i * j;
	}
}

public class InheritanceDemo
{
	public static void main(String args[])
	{
		Calculator c1 = new Calculator();
		int result = c1.add(4, 5);
		System.out.println("Addition: " + result);
		
		CalcAdv c2 = new CalcAdv();
		result = c2.subtract(5, 1);
		System.out.println("Subtraction: " + result);
		
		CalcVeryAdv c3 = new CalcVeryAdv();
		result = c3.multi(10, 4);
		System.out.println("Multiplication: " + result);
	}
}
