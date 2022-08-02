
class Calc
{
	int num1;
	int num2;
	int result;
	
	//Default Constructor (Invisible)
	
	//Custom Constructor
	public Calc()
	{
		num1 = 5;
		num2 = 5;
		System.out.println("Inside the Default Constructor");
	}
	
	public Calc(int n)
	{
		num1 = n;
		num2 = n;
		System.out.println("Inside the Custom Constructor");
	}	
	
	public Calc(double d)
	{
		num1 = (int)d; //Explicit Casting  
		//Implicit Casting not possible from high to low
		num2 = (int)d; //Explicit Casting
	}
	
	public Calc(float f, int n)
	{
		num1 = (int)f;
		num2 = n;
	}
}

public class ConstructorDemo 
{
	public static void main(String args[])
	{
		Calc obj1 = new Calc(); //Default Constructor
		Calc obj2 = new Calc(10); //Custom Constructor 1
		Calc obj3 = new Calc(7.5); //Custom Constructor 2
		Calc obj4 = new Calc(7.5f, 10);
		
		System.out.println(obj4.num1 + " " + obj4.num2);
		
//		System.out.println(obj1.num1);
//		System.out.println(obj2.num1);
//		System.out.println(obj3.num1);
//		System.out.println(obj4.num1);
	}
}
