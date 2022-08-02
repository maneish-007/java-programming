
public class StaticDemo2 
{
//	int i = 0; NON-STATIC i
	static int i;
	public static void main(String args[])
	{
//		i += 1;  
//		Cannot access NON-STATIC variables inside static block
//		Solution: 1.Make i as static
		
		System.out.println("i: " + i);
	}
}
