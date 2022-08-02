//Demonstration of Method Overloading

class Casio
{
	public void add(int i, int j)
	{
		System.out.println("Sum: " + (i + j));
	}
	public void add(int i, int j, int k)
	{
		System.out.println("Sum: " + (i + j + k));
	}
	public void add(int i, double j)
	{
		System.out.println("Sum: " + (i + j));
	}
}

public class MethodOverloadingDemo 
{
	public static void main(String args[])
	{
		Casio obj1 = new Casio();
		obj1.add(10, 20);
		obj1.add(10, 20, 30);
		obj1.add(10, 5.5);
	}
}
