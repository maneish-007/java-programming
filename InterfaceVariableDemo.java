
interface Demo4
{
	int num = 0;	//FINAL by default
	//Variables declared inside an interface are final by default
	void abc();  //public abstract by default
}

class Demo4Impl implements Demo4
{
	public void abc()
	{
//		num = 20; num is FINAL hence cannot be modified!
	}
}

public class InterfaceVariableDemo 
{
	public static void main(String args[])
	{
		
	}
}
