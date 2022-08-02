
interface Writer2   
//Gives us the ability to achieve Multiple Inheritance in future 
//if we want to implement multiple interfaces
{
	void write();  //By default PUBLIC ABSTRACT
}

class Pen2 implements Writer2
{
	public void write()
	{
		System.out.println("I am a Pen");
	}
}

class Pencil2 implements Writer2
{
	public void write()
	{
		System.out.println("I am a Pencil");
	}
}

class Kit2
{
	public void doSomething(Writer2 p)
	{
		p.write();
	}
}

public class InterfaceDemo2
{
	public static void main(String args[])
	{
		Kit2 obj = new Kit2();
		
		Pen2 pen_obj = new Pen2();
		obj.doSomething(pen_obj);
		
		Pencil2 pencil_obj = new Pencil2();
		obj.doSomething(pencil_obj);
	}
}











