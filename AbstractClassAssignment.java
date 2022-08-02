
abstract class Writer
{
	public abstract void write();
}

class Pen extends Writer
{
	public void write()
	{
		System.out.println("I am a PEN");
	}
}

class Pencil extends Writer
{
	public void write()
	{
		System.out.println("I am a PENCIL");
	}
}

public class AbstractClassAssignment 
{
	public static void main(String args[])
	{
		//Wonderful concept
		Writer obj1 = new Pen();
		//Creating an abstract Parent class REFERENCE for SUB-CLASS OBJECT
		obj1.write();
		Writer obj2 = new Pencil();
		obj2.write();
	}
}












