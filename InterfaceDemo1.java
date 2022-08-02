
class Writer1
{
	public void write()
	{
		
	}
}
class Pen1 extends Writer1
{
	public void write()
	{
		System.out.println("I am a Pen");
	}
}

class Pencil1 extends Writer1
{
	public void write()
	{
		System.out.println("I am a Pencil");
	}
}

class Kit
{
	public void doSomething(Writer1 p)
	{
		p.write();
	}
}
public class InterfaceDemo1 
{
	public static void main(String args[])
	{
		Kit obj = new Kit();
		
		Pen1 pen_obj = new Pen1();
		obj.doSomething(pen_obj);
		
		Pencil1 pencil_obj = new Pencil1();
		obj.doSomething(pencil_obj);
	}
}











