
class A2
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B2 extends A2
{
	public void show()
	{
		System.out.println("in B");
	}
//	Demonstration of dynamic method dispatch
//	public void config()
//	{
//		System.out.println("Config");
//	}
}
class C2 extends A2
{
	public void show()
	{
		System.out.println("in C");
	}
}

public class OverridingDemo2 
{
	public static void main(String args[])
	{
		//RUNTIME Polymorphism
		A2 obj1 = new B2();	//Linked at RUNTIME
//		obj1.show();

//		Using super class reference to create object
//		of sub class, here we can only call those methods of
//		of child class which are also present in parent class
//		if we are using parent class reference
//		
		obj1 = new C2(); //Linked at RUNTIME
		obj1.show();
//		Which show() to call is decided at RUNTIME
//		obj3.config();
//		B2 obj4 = new A2(); Not allowed
		
	}
}
