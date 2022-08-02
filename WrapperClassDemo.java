
public class WrapperClassDemo 
{
	public static void main(String args[])
	{
		int i = 5; //Primitive Data-Type
		Integer ii = new Integer(5); //Manual Wrapping
		
		int j = ii.intValue();  //Manual Unwrapping
		
		Integer value = i; //Auto-Boxing
		//This automatically does the Wrapping for us in backend.
		
		int k = value; //Auto-Unboxing
		//This automatically does the Unwrapping for us in backend.
		
		String str = "123";
		int n = Integer.parseInt(str);
		
		//parseInt(variable) is a STATIC method inside class Integer(Wrapper Class)
		//So to access it we must access it via its ClassName Integer.parseInt()
		//Remember the naming convention
		//Classes follow PascalCase and methods follow camelCase
		
		System.out.println("String: " + str);
		System.out.println("Integer: " + n);
	}
}
