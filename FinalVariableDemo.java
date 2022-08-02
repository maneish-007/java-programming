
class A3
{
	int i = 0;
	final double PI;
	public A3()
	{
		PI = 3.14;
//		PI = 3.142;//Not allowed as final variable cannot be modified
		i = 10; //Instance variable
	}
}
public class FinalVariableDemo 
{
	public static void main(String args[])
	{
		A3 obj = new A3();
		
	}
}
