
class A4
{
	public final void show() //Final method CANNOT BE OVERRIDDEN
	{
		System.out.println("show() of A");
	}
	
	public void show(Integer i)
	{
		System.out.println("Final method can be overloaded but not overridden");
	}
}

//class B4 extends A4
//{
//	public void show() //Illegal to override a final method
//	{
//		System.out.println("show() of B");
//	}
//}
public class FinalMethodDemo 
{
	public static void main(String args[])
	{
		A4 obj = new A4();
	}
}
