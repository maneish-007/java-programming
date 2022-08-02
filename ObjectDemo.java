
class Calc1
{
	//Object knows something (DATA) -> Variables
	int num1;
	int num2;
	int result;
	
	//Object does something (BEHAVIOUR) -> Methods
	public void perform()
	{
		result = num1 + num2;
	}
}


public class ObjectDemo 
{
	public static void main(String args[])
	{
		Calc1 obj;  //obj is a reference not an object now
		obj = new Calc1(); //Object is created and its reference is passed to obj
		
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform();
		
		System.out.print(obj.result);
	}

}
