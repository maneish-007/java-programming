@FunctionalInterface
interface Demo2
{
	void abc();
	default void show() //Can be Overridden in subclasses if needed
	{
		System.out.println("in Demo show");
	}
}

interface MyDemo
{
	default void show() //Can be Overridden in subclasses if needed
	{
		System.out.println("in MyDemo show");
	}
}
class DemoImpl2 implements Demo2, MyDemo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	
	@Override
	public void show()
	{
		Demo2.super.show(); 
		//Will call Demo2 or MyDemo2 show() depending on the interface name that is specified
		
	}
}
public class InterfaceDemo7
{
	public static void main(String args[])
	{
		Demo2 obj = new DemoImpl2();
		obj.abc();
		obj.show();
	}
}