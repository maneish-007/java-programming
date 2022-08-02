
/*
 *By default the first statement of every constructor in a child class
 *is super() i.e. call to the default constructor of its parent class.
 *We can override this behavior by changing it explicitly.
 */
/*
 *Due to this, whenever we create an object of child class
 *all the default constructors of parent classes in order 
 *are called. And at last the corresponding(default or parameterized)
 *constructor of class B is called depending on our object
 *instantiation of class B inside main()
 * */
class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
//		super(); 	//Present by default
		super(5);
		System.out.println("in B");
	}
	public B(int i)
	{
//		super();	//Present by default
		super(i);
		System.out.println("in B int");
	}
}

public class SuperMethodDemo 
{
	public static void main(String args[])
	{
//		B obj = new B(5);
		B obj = new B();
		//Special case to make the program call the default 
		//constructor of class B and the parameterized constructor
		//of class A
	}
}

//Its 1:33 now
//We will continue from here...





