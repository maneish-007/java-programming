
class A1
{
	int i;
	public void show()
	{
		System.out.println("in A");
	}
}
class B1 extends A1
{
	int i;
	@Override
	public void show()
	{
		i = 8;
		super.i = 20;
		super.show();
		System.out.println("in B");
		System.out.println("i of B: " + i);
		System.out.println("i of A: " + super.i);
	}
}
public class OverridingDemo 
{
	public static void main(String args[])
	{
		B1 obj = new B1();
		obj.show();
	}
}
