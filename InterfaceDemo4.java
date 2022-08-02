//Creating an object of interface using Anonymous Class

interface Abc2
{
	void show(); //PUBLIC ABSTRACT by default implicitly
}

public class InterfaceDemo4 
{
	public static void main(String args[])
	{
		Abc2 obj = new Abc2()
					{
						public void show()
		 				{
							System.out.println("I am the Best");
						}
					};
					obj.show();
	}
}
