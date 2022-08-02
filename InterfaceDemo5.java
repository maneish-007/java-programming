//Demonstration of Lambda Expressions using Functional Interface

//Types of Interfaces
/*
 * 1. Normal Interfaces: (Have more then 1 method)
 * 2. Single Abstract Method Interface aka Functional Interface (Have 1 method)
 * 3. Marker Interface (Have no methods eg: Serializable interface - Will study soon)
 * */

@FunctionalInterface  
//Ensures that Abc3 remains a functional interface and produces error if not
interface Abc3
{
	void show();
}

public class InterfaceDemo5 
{
	public static void main(String args[])
	{
//		Abc3 obj = new Abc3()
//				{
//					public void show()
//					{
//						System.out.println("I am the best!");
//					}
//				};
		//Power of Lambda Expressions
		
		Abc3 obj = () -> 
					{
						System.out.println("I am the best!");
					};
		obj.show();
	}
}

//Its 1:35 now...
//We will continue from here...








