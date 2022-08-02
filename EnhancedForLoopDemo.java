
public class EnhancedForLoopDemo 
{
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3, 4, 5};
		
		//Normal for loop
		for (int i = 0; i < 5; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//Enhanced for loop
		for (int k: arr)
		{
			System.out.print(k + " ");
		}
		System.out.println();
		
		
	}
}
