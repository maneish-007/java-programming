


class Outer
{
	int a;
	public void show()
	{
		//todo
		System.out.println("Inside Outer class show()");
	}
	
	static class Inner
	{
		public void display()
		{
			System.out.println("Inside Inner class display()");
		}
	}
}

public class InnerClassDemo 
{	
	//Variables, methods, class
	
	public static void main(String args[])
	{
		Outer obj1 = new Outer();
		obj1.show();
		
//		Outer.Inner obj2 = obj1.new Inner();
		//If inner class is NON-STATIC
		
		Outer.Inner obj2 = new Outer.Inner();
		obj2.display();
	}
}
