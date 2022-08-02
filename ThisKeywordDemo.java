
class Calc2
{
	int num1;
	int num2;
	
	public Calc2(int num1, int num2)
	{//number1 and number2 are LOCAL VARIABLES
		this.num1 = num1; 
		//this represents current object or current instance
		//Used to refer to CLASS variable of current object
		this.num2 = num2;
	}
}

public class ThisKeywordDemo 
{
	public static void main(String args[])
	{
		Calc2 obj1 = new Calc2(4, 5);
		
		System.out.print("num1: "+obj1.num1+"\n");
		System.out.print("num2: "+obj1.num2+"\n");
	}
}
