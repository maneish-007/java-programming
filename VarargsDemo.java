
class Calc3
{
	public int add(int ...array) //Variable length Arguments as input 
	{
		int sum = 0;
		//Accessing the variable length arguments using
		//Enhanced for loop
		for (int item: array)
		{
			sum += item;
		}
		return sum;
	}
}

public class VarargsDemo 
{
	public static void main(String args[])
	{
		Calc3 obj = new Calc3();
		int sum = obj.add(1, 2, 3, 4, 5, 6, 7, 8);
		
		System.out.println("Sum: " + sum);
	}
}
