
interface Demo3
{
	void abc();
	static void show()
	{
		System.out.println("Hi!");
	}
}
public class InterfaceStaticMethodDemo 
{
	public static void main(String args[])
	{
		Demo3.show(); 
		//Using interface name to call static method of an interface
	}
}
