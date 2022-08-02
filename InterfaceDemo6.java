
//Abstract Class: Define as well as declare methods
//Interface: Only declare methods(till Java 1.7 or lower)
//In Java 1.8 or above: Can DEFINE methods in Interface

//Functional Interface: must have ONLY 1 Abstract method
//Can have any number of default methods(methods with definition)

@FunctionalInterface
interface Demo
{
	void abc();
	default void show() //Can be Overridden in subclasses if needed
	{
		System.out.println("in interface Demo show");
	}
}

class DemoImpl implements Demo
{
	public void abc()
	{
		System.out.println("in abc");
	}
}
public class InterfaceDemo6
{
	public static void main(String args[])
	{
		Demo obj = new DemoImpl();
		obj.abc();
		obj.show();
	}
}
