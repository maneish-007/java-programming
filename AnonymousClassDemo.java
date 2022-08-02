//Demonstration of Anonymous class

class A6
{
	public void show()
	{
		System.out.println("in A show");
	}
}

/*
 * Aim: To print "I am the best" using show method without changing the definition of show
 * Solution1: Override the show method and modify its definition
 * Solution2: Use an ANONYMOUS CLASS
 * */

//Creating a new class
class B6 extends A6
{
	public void show()
	{
		System.out.println("I am the Best");
	}
}
public class AnonymousClassDemo 
{
	public static void main(String args[])
	{
		A6 obj1 = new B6();//Implementing Solution1
		obj1.show();
		
		//Anonymous Class
		A6 obj2 = new A6() //Implementing Solution2 
					{
						public void show()
						{
							System.out.println("I am the Best!");
						}
					};			
		obj2.show();
		
	}
}










