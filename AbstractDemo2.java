
class Printer
{
	public void show(Integer i) 
	//Integer: Wrapper class and here the concept of Autoboxing is being implemented
	//Integer i = 10; //Wraps primitive data 10 to Integer class object
	{
		System.out.println(i);
	}
	
	public void show(Double i) //Method overloading
	//'i' is local variable of the method and its scope is limited to the closest {}
	{
		System.out.println(i);
	}
}
public class AbstractDemo2 
{
	public static void main(String args[])
	{
		Printer obj = new Printer();
		obj.show(5.5);
	}
}
