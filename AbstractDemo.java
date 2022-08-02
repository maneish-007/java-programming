
//Abstract class type 1
abstract class Human 
{
	public abstract void eat();
	//Abstract methods must not have a definition
//	{
//		System.out.println("Definition");
//	}
	public void walk() //walk() is defined hence its a non-abstract method.
	{
		
	}
}

//abstract class Men extends Human
class Men extends Human
{
	public void eat()
	{
		
	}
}
//{
//	public void eat()
//	{
//		
//	}
//}

public class AbstractDemo 
{
	public static void main(String args[])
	{
		//Human obj = new Human();
		//Cannot instantiate an abstract class.
		
		Human obj = new Men();
		//Now I can use obj to call those methods of child class (Men) which are known to
		//parent class (Human) as well
		
	}
}
