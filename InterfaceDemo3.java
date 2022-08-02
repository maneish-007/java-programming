//Application of Interface: Generalization
//Creating object of an interface using new child class
interface Abc
{
	void show();
}

//Creating an object of interface using a new class that implements the abstract 
//methods of the interface
class Implementor implements Abc
{
	public void show()
	{
		System.out.println("Anything");
	}
}
public class InterfaceDemo3 
{
	public static void main(String args[])
	{
//		Abc obj = new Abc();
//		Illegal as we cannot create object of an interface we can only create its reference
		Abc obj = new Implementor(); 
		//Power of an interface unleashed using Dynamic Method Dispatch
		obj.show();
	}
}
